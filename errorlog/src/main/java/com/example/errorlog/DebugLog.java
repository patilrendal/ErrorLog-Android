package com.example.errorlog;

import android.util.Log;

public class DebugLog {


    public static String TAG="DebugLog";
    public static void  d(String message){
        Log.e(TAG,message);
    }

}
