package kr.co.tjeit.yourmemory.util;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Calendar;

import kr.co.tjeit.yourmemory.data.UserData;

/**
 * Created by the on 2017-09-06.
 */

public class ContextUtil {

    private static UserData loginUser = null;

    private final static String prefName = "familyTree";
    private final static String USER_EMAIL = "USER_EMAIL";
    private final static String USER_NAME = "USER_NAME";
    private final static String USER_PHONE = "USER_PHONE";

    public static void logout(Context context) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        pref.edit().putString(USER_EMAIL, "").commit();
        pref.edit().putString(USER_NAME, "").commit();
        pref.edit().putString(USER_PHONE, "").commit();

        loginUser = null;
    }

    public static void login(Context context, UserData loginUser) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
        pref.edit().putString(USER_EMAIL, loginUser.getEmail()).commit();
        pref.edit().putString(USER_NAME, loginUser.getGender()+"").commit();
        pref.edit().putString(USER_PHONE, loginUser.getBirthDay()+"").commit();

    }

//    public static UserData getLoginUser(Context context) {
//        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);
//
//        if (pref.getString(USER_EMAIL, "").equals("")) {
////            로그인이 안된 상태
//            loginUser = null;
//        }
//
//        else {
//            loginUser = new UserData();
//            loginUser.setEmail(pref.getString(USER_EMAIL, ""));
//            loginUser.setName(pref.getString(USER_NAME, ""));
//            loginUser.setGender(pref.getInt(USER_GENDER, ""));
//            loginUser.setBirthDay(pref.getInt(USER_BIRTHDAY, ""));
//            loginUser.setProfile_url(pref.getString(USER_PROFILE_URL, ""));
//
//        }
//        return loginUser;
//    }
}
