package com.freebank.plug.creditcard.creditcard.plugin2;

public class PluginString {
    static {
        System.loadLibrary("plugin-string");
    }

    public native static String getString(long time);
}
