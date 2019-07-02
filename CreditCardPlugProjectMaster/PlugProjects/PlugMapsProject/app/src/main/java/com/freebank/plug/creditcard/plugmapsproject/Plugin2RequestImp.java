package com.freebank.plug.creditcard.plugmapsproject;

import android.os.RemoteException;
import android.widget.Toast;

import com.qihoo360.replugin.RePlugin;

public class Plugin2RequestImp extends IPlugin2Request.Stub {

    @Override
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble,
                           String aString) throws RemoteException {

    }

    @Override
    public boolean requestPluginName(String extra) throws RemoteException {

        final String name = "plugin2 -> version: " + RePlugin.getVersion() + ", sdkVersion" + RePlugin.getSDKVersion();

        Toast.makeText(RePlugin.getPluginContext(), name, Toast.LENGTH_SHORT).show();

        return true;
    }
}