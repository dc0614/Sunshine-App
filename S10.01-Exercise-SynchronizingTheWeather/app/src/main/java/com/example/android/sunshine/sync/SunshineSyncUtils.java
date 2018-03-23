package com.example.android.sunshine.sync;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

// Completed (9) Create a class called SunshineSyncUtils
public class SunshineSyncUtils {
    //  Completed (10) Create a public static void method called startImmediateSync
    public static void startImmediateSync(@NonNull Context context){
        //  Completed (11) Within that method, start the SunshineSyncIntentService
        Intent startSyncIntent = new Intent(context, SunshineSyncIntentService.class);
        context.startService(startSyncIntent);
    }

}
