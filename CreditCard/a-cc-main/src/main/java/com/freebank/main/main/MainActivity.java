package com.freebank.main.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.freebank.framework.base.BaseActivity;
import com.freebank.main.R;
import com.freebank.main.main.creditcard.CreditCardFragment;
import com.freebank.main.main.home.HomeFragment;
import com.freebank.main.main.me.MeFragment;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";
    private FragmentManager fragmentManager;
    private static int currIndex = 1;
    private ArrayList<String> fragmentTags = new ArrayList<>(Arrays.asList("HomeFragment", "CreditCardFragment", "MeFragment"));

    @Override
    protected int setContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        mPresenter.init(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fragmentManager = getSupportFragmentManager();
        showFragment();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {
                int i = item.getItemId();

                if (i == R.id.tab_home) {
                    currIndex = 0;

                } else if (i == R.id.tab_credit_card) {
                    currIndex = 1;

                } else if (i == R.id.tab_me) {
                    currIndex = 2;

                }

                showFragment();
                return true;
            };

    /**
     * 显示Fragment页面里面的内容
     */
    private void showFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = fragmentManager.findFragmentByTag(fragmentTags.get(currIndex));
        if (fragment == null) {
            fragment = instantFragment(currIndex);
        }

        for (int i = 0; fragmentTags.size() > i; i++) {
            Fragment f = fragmentManager.findFragmentByTag(fragmentTags.get(i));
            if (f != null && f.isAdded()) {
                fragmentTransaction.hide(f);
            }
        }

        if (fragment.isAdded()) {
            fragmentTransaction.show(fragment);
        } else {
            fragmentTransaction.add(R.id.fragment_container, fragment, fragmentTags.get(currIndex));
        }

        fragmentTransaction.setCustomAnimations(R.anim.anim_slide_in_from_right, R.anim.anim_slide_in_from_left);
        fragmentTransaction.commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
    }


    private Fragment instantFragment(int currIndex) {
        switch (currIndex) {
            case 0:
                return new HomeFragment();
            case 1:
                return new CreditCardFragment();
            case 2:
                return new MeFragment();
            default:
                return null;
        }
    }
}
