package com.longquan.utils;

public class TextUtils {

    public static boolean isEmpty(CharSequence str) {
        return str == null || str.length() == 0 || "null".equalsIgnoreCase(str.toString());
    }

}
