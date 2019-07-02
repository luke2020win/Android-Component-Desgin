package com.wyac.common.logmanager.bean;

/**
 * log的基类，管理每条日志的格式.
 */

public class LogBean {
    public float time;
    public String timeStr = "";
    public String msg = "";
    public String className = "";
    public int line;
    public int level = 0;
    public String func = "";
    public String tag = "";


    public String toString() {
        StringBuffer sb = new StringBuffer(this.timeStr);
        sb.append(' ').append('{').append(this.className).append('.').append(this.func).append('}').append('[').append(this.getLevel(this.level)).append(']').append('[').append(this.tag).append(']').append(' ').append(this.msg).append("\n");
        return sb.toString();
    }

    private String getLevel(int level) {
        String ret = "D";
        switch(level) {
            case 2:
                ret = "V";
                break;
            case 3:
                ret = "D";
                break;
            case 4:
                ret = "I";
                break;
            case 5:
                ret = "W";
                break;
            case 6:
                ret = "E";
                break;
            case 7:
                ret = "A";
                break;
            default:
                ret = "D";
        }

        return ret;
    }
}
