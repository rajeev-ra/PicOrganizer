package com.rajeev.nit.picorganizer;

import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by ranjra on 2/17/2017.
 */
public class Settings {
    private static Settings mSetting = null;
    private static String mSettingsFile = "app_settings.dat";

    public static void Create(Context context){
        if(null == mSetting){
            mSetting = new Settings(context);
        }
    }

    public static Settings Get(){
        return mSetting;
    }

    private Settings(Context context){
        File file = context.getFileStreamPath(mSettingsFile);
        if(!file.exists()){

        }
    }
}
