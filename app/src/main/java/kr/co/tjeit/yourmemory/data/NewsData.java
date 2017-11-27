package kr.co.tjeit.yourmemory.data;

import java.io.Serializable;

/**
 * Created by the on 2017-11-27.
 */

public class NewsData implements Serializable{

    private int user_id;
    private String userName;
    private String userProfileURL;
    private int minuteAgo;
    private String title;
    private String content;
    private String newsImageURL;
    private int likeCount;
    private int replyCount;
    private int shareCount;
    private int lookUpCount;

    public NewsData() {
    }

    public NewsData(int user_id, String userName, String userProfileURL, int minuteAgo, String title, String content, String newsImageURL, int likeCount, int replyCount, int shareCount, int lookUpCount) {
        this.user_id = user_id;
        this.userName = userName;
        this.userProfileURL = userProfileURL;
        this.minuteAgo = minuteAgo;
        this.title = title;
        this.content = content;
        this.newsImageURL = newsImageURL;
        this.likeCount = likeCount;
        this.replyCount = replyCount;
        this.shareCount = shareCount;
        this.lookUpCount = lookUpCount;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserProfileURL() {
        return userProfileURL;
    }

    public void setUserProfileURL(String userProfileURL) {
        this.userProfileURL = userProfileURL;
    }

    public int getMinuteAgo() {
        return minuteAgo;
    }

    public void setMinuteAgo(int minuteAgo) {
        this.minuteAgo = minuteAgo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNewsImageURL() {
        return newsImageURL;
    }

    public void setNewsImageURL(String newsImageURL) {
        this.newsImageURL = newsImageURL;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public int getLookUpCount() {
        return lookUpCount;
    }

    public void setLookUpCount(int lookUpCount) {
        this.lookUpCount = lookUpCount;
    }
}
