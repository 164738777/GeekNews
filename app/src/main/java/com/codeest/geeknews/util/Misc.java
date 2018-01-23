package com.codeest.geeknews.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.common.base.Strings;

/**
 * 作者:  lbqiang on 2018/1/23 23:29
 * 邮箱:  anworkmail_q@126.com
 * 作用:  杂工具库
 */
public class Misc {
    public static void startActivity(Context context, Class<? extends Activity> aty) {
        startActivity(context, aty, null);
    }

    public static void startActivity(Context context, Class<? extends Activity> aty, String key, String value) {
        if (!Strings.isNullOrEmpty(key)) {
            Bundle bundle = new Bundle();
            bundle.putString(key, value);
            startActivity(context, aty, bundle);
        } else {
            startActivity(context, aty, null);
        }
    }

    public static void startActivity(Context context, Class<? extends Activity> aty, Bundle bundle) {
        Intent intent = new Intent(context, aty);
        context.startActivity(intent, bundle);
    }
}
