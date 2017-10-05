package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Milan on 2016-01-18.
 */
public class SceneFileAudit extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String sceneFileId;
    private String sceneFileNumber;
    private String official;
    private Location location;
    private String weather;
    private String comments;
    private Date arrivalDate;
    private Date departureDate;
    private String nickName;
    private int status;
    private boolean removed;
    private long syncTimestamp;
    private String clientGeneratedId;
    private String userId;
    private int accessType;
    private Date creationDate;
    private Date lastModifiedDate;
    private SceneFile sceneFile;

    private String workflowStatus;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<SceneFileAudit> lstSceneFileAudit = realmDb.where(SceneFileAudit.class).findAll();
        return lstSceneFileAudit.size() > 0 ? lstSceneFileAudit.max("objectId").intValue() + 1 : 1;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getSceneFileId() {
        return sceneFileId;
    }

    public void setSceneFileId(String sceneFileId) {
        this.sceneFileId = sceneFileId;
    }

    public String getSceneFileNumber() {
        return sceneFileNumber;
    }

    public void setSceneFileNumber(String sceneFileNumber) {
        this.sceneFileNumber = sceneFileNumber;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isRemoved() {
        return removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    public long getSyncTimestamp() {
        return syncTimestamp;
    }

    public void setSyncTimestamp(long syncTimestamp) {
        this.syncTimestamp = syncTimestamp;
    }

    public String getClientGeneratedId() {
        return clientGeneratedId;
    }

    public void setClientGeneratedId(String clientGeneratedId) {
        this.clientGeneratedId = clientGeneratedId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getAccessType() {
        return accessType;
    }

    public void setAccessType(int accessType) {
        this.accessType = accessType;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SceneFile getSceneFile() {
        return sceneFile;
    }

    public void setSceneFile(SceneFile sceneFile) {
        this.sceneFile = sceneFile;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getWorkflowStatus() {
        return workflowStatus;
    }

    public void setWorkflowStatus(String workflowStatus) {
        this.workflowStatus = workflowStatus;
    }
}
