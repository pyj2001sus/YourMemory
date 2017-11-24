package kr.co.tjeit.yourmemory.data;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by the on 2017-11-24.
 */

public class UserData implements Serializable {

    private String email;
    private String name;
    private int gender;
    private Calendar birthDay;
    private String profile_url;

    public UserData() {
    }

    public UserData(String email, String name, int gender, Calendar birthDay, String profile_url) {
        this.email = email;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.profile_url = profile_url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Calendar getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Calendar birthDay) {
        this.birthDay = birthDay;
    }

    public String getProfile_url() {
        return profile_url;
    }

    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }
}
