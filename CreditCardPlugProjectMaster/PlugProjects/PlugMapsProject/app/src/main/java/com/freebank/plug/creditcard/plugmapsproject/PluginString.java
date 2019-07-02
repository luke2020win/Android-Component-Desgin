package com.freebank.plug.creditcard.plugmapsproject;

public class PluginString {
    static {
        System.loadLibrary("native-lib");
    }

    /**
     * @param time
     * @return
     */
    public native static String getString(long time);
}
