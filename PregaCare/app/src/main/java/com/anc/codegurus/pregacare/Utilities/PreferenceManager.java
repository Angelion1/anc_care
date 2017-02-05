package com.anc.codegurus.pregacare.Utilities;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Anshul on 04-Feb-17.
 */

public class PreferenceManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name

    private static final String PREF_NAME = "PregaCare";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    private static final String ANC1 = "ANC1";
    private static final String ANC2 = "ANC2";
    private static final String ANC3 = "ANC3";
    private static final String ANC4 = "ANC4";

    public PreferenceManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setAnc1(boolean anc1){
        editor.putBoolean(ANC1, anc1);
        editor.commit();
    }

    public void setAnc2(boolean anc2){
        editor.putBoolean(ANC2, anc2);
        editor.commit();
    }

    public void setAnc3(boolean anc3){
        editor.putBoolean(ANC3, anc3);
        editor.commit();
    }

    public void setAnc4(boolean anc4){
        editor.putBoolean(ANC4, anc4);
        editor.commit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    public boolean isANC1() {
        return pref.getBoolean(ANC1, true);
    }
    public boolean isANC2() { return pref.getBoolean(ANC2, true); }
    public boolean isANC3() {
        return pref.getBoolean(ANC3, true);
    }
    public boolean isANC4() {
        return pref.getBoolean(ANC4, true);
    }

}
