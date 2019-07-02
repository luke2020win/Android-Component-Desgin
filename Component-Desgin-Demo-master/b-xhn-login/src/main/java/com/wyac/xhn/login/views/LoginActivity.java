package com.wyac.xhn.login.views;

import android.content.Intent;
import android.os.Bundle;

import com.wyac.common.tools.base.AppActivity;
import com.wyac.xhn.login.R;

public class LoginActivity extends AppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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
}
