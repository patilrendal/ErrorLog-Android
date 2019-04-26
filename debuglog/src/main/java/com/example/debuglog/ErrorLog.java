package com.example.debuglog;

import android.util.Log;

public class ErrorLog {

    public static String TAG="ErrorLog";
    public static void  e(String message){
        Log.e(TAG,message);
    }
}
