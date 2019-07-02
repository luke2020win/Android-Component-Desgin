package com.freebank.main.main.creditcard;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freebank.framework.base.BaseFragment;
import com.freebank.main.R;

public class CreditCardFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_creditcard, container, false);
    }

    @Override
    protected void initPresenter() {

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        mViewModel = ViewModelProviders.of(this).getRxBusInstance(MainViewModel.class);
        // TODO: Use the ViewModel
    }
}
