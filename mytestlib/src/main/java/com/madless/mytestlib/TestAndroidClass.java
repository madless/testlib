package com.madless.mytestlib;

import android.content.Context;
import android.widget.Toast;

/**
 * 5/2/2018.
 */

public class TestAndroidClass {
    public static void showTestToast(Context context) {
        Toast.makeText(context, "TEST TOAST", Toast.LENGTH_SHORT).show();
    }
}
