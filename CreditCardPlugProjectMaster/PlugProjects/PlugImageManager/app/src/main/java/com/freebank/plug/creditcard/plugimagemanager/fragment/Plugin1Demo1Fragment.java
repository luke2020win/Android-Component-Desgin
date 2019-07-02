package com.freebank.plug.creditcard.plugimagemanager.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.freebank.plug.creditcard.plugimagemanager.R;
import com.freebank.plug.creditcard.pluginutils.DLog;
import com.qihoo360.replugin.RePlugin;

public class Plugin1Demo1Fragment extends Fragment {
    private final String TAG = "Plugin1Demo1Fragment";

    public Plugin1Demo1Fragment() {
        DLog.i(TAG, "Plugin1Demo1Fragment()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DLog.i(TAG, "onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        Context context = RePlugin.getPluginContext();

        DLog.i(TAG, "onCreateView() inflater: " + inflater + ", container: " + container + ", plugin context: " + context);

        return LayoutInflater.from(context).inflate(R.layout.fragment_plugin1_demo1, container, false);
    }
}
