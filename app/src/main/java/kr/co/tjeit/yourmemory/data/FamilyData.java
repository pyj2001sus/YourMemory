package kr.co.tjeit.yourmemory.data;

import java.io.Serializable;

/**
 * Created by the on 2017-12-04.
 */

public class FamilyData implements Serializable {

    private String name;
    private String profileURL;
    private String introduce;

    public FamilyData() {
    }

    public FamilyData(String name, String profileURL, String introduce) {
        this.name = name;
        this.profileURL = profileURL;
        this.introduce = introduce;
    }

    public FamilyData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public void setProfileURL(String profileURL) {
        this.profileURL = profileURL;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
