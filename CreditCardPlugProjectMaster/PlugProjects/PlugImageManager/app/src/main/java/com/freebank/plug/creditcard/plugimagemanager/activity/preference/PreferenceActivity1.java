package com.freebank.plug.creditcard.plugimagemanager.activity.preference;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;

import com.freebank.plug.creditcard.plugimagemanager.R;

public class PreferenceActivity1 extends PreferenceActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.pref_headers);
    }
}
