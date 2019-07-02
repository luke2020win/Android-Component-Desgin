package com.freebank.login.net;

import com.freebank.framework.base.BasePresenter;
import com.freebank.framework.base.BaseView;
import com.freebank.network.http.retrofit.HttpManager;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public class RxPresenter<T extends BaseView> implements BasePresenter<T> {

    protected T mView;
    //后端网络接口api
    protected HttpApi mHttpApi;
    //销毁时退出异步任务
    protected CompositeSubscription mSubscriptions;

    @Override
    public void init(T view) {
        this.mView = view;
        this.mHttpApi = HttpManager.getmHttpManager().getApi(HttpApi.class);
    }

    @Override
    public void onDestroy() {
        clear();
        this.mSubscriptions = null;
        this.mView = null;
    }

    /**
     * 添加线程管理并订阅
     *
     * @param s
     */
    protected void addSubscribe(Subscription s) {
        if (mSubscriptions == null) {
            mSubscriptions = new CompositeSubscription();
        }
        mSubscriptions.add(s);
    }

    protected void clear(){
        if (mSubscriptions != null) {
            mSubscriptions.clear();
            mSubscriptions = null;
        }
    }
}
