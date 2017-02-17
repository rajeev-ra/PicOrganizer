package com.rajeev.nit.picorganizer;

/**
 * Created by ranjra on 2/17/2017.
 */
public class Settings {
    private static Settings mSetting = null;

    public static Settings Get(){
        if(null == mSetting){
            mSetting = new Settings();
        }
        return mSetting;
    }
}
