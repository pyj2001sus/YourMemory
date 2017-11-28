package kr.co.tjeit.yourmemory.data;

import java.io.Serializable;

/**
 * Created by the on 2017-11-27.
 */

public class NoticeData implements Serializable {

    private int owner;
    private String ownerProfileURL;
    private int actor_id;
    private String actorProfileURL;
    private String action;

    public NoticeData(int owner, String ownerProfileURL, int actor_id, String actorProfileURL, String action) {
        this.owner = owner;
        this.ownerProfileURL = ownerProfileURL;
        this.actor_id = actor_id;
        this.actorProfileURL = actorProfileURL;
        this.action = action;
    }

    public NoticeData() {
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String getOwnerProfileURL() {
        return ownerProfileURL;
    }

    public void setOwnerProfileURL(String ownerProfileURL) {
        this.ownerProfileURL = ownerProfileURL;
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getActorProfileURL() {
        return actorProfileURL;
    }

    public void setActorProfileURL(String actorProfileURL) {
        this.actorProfileURL = actorProfileURL;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
