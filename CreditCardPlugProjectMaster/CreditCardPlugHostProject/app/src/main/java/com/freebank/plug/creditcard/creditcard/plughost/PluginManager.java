package com.freebank.plug.creditcard.creditcard.plughost;

import java.util.HashMap;
import java.util.Map;

public class PluginManager {
    private static final String BASE_PATH = "/sdcard/plugins-mz/";

    public static final String PLUGIN1_NAME = "plugin1";

    public static final String PLUGIN2_NAME = "plugin2";

    public static final Map<String, PluginExtra> PLUGINS = new HashMap<>();

    static {
        PLUGINS.put(PLUGIN1_NAME, new PluginExtra(PLUGIN1_NAME, "plugin1.apk",
                new String[] {
                "com.freebank.plug.creditcard.plugimagemanager.MainActivity",
                "com.freebank.plug.creditcard.plugimagemanager.activity.InnerActivity",
                "com.freebank.plug.creditcard.plugimagemanager.activity.ForResultActivity",
                "com.freebank.plug.creditcard.plugimagemanager.provider.FileProviderActivity",},
                new String[] {"com.test.android.plugin1.service.Plugin1Service1"}));

        PLUGINS.put(PLUGIN2_NAME, new PluginExtra(PLUGIN2_NAME, "plugin2.apk", new String[] {}, new String[] {}));

    }

    public static class PluginExtra {
        public String pluginName;
        public String apkPath;
        public String[] activitys;
        public String[] services;

        public PluginExtra(String pluginName, String apkName, String[] activitys, String[] services) {
            this.pluginName = pluginName;
            this.apkPath = BASE_PATH + apkName;
            this.activitys = activitys;
            this.services = services;
        }
    }
}
