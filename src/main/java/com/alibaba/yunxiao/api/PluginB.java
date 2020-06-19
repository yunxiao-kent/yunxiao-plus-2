package com.alibaba.yunxiao.api;

import com.alibaba.yunxiao.common.Utils;

public class PluginB {
    public String lowerCase(String origin) {
        return origin.toLowerCase();
    }

    public int length(String origin) {
        return origin.length();
    }

    public String concat(String first, String second) {
        Utils utils = new Utils();
        return utils.concat(first, second);
    }
}
