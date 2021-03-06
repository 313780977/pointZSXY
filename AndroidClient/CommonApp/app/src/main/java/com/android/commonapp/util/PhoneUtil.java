package com.android.commonapp.util;

import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PhoneUtil {
    public static boolean isPhoneNumber(String phone) {
        if (TextUtils.isEmpty(phone)){
            return false;
        }
        String regx = "((\\d{11})|^((\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})|(\\d{4}|\\d{3})-(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1})|(\\d{7,8})-(\\d{4}|\\d{3}|\\d{2}|\\d{1}))$)";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
