package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Milan on 2016-01-27.
 */
public class Photo extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String fileName;
    private String clientGeneratedId;
    private Date timestamp;
    private Date creationDate;
    private Date lastModifiedDate;
    private long syncTimestamp;
    private String photoId;
    private String timelineEntryId;
    private String title;
    private String official;
    private String userId;
    private String checksum;
    private byte[] thumbnail;
    private int createType;
    private RealmList<PhotoLog> photoLogs;
    private RealmList<Chunk> chunks;
    private SceneFile sceneFile;
    //Timeline stuff
    private int priority;
    private Location location;
    private String description;
    private String weather;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<Photo> lstPhotos = realmDb.where(Photo.class).findAll();
        return lstPhotos.size() > 0 ? lstPhotos.max("objectId").intValue() + 1 : 1;
    }

    public String getTimelineEntryId() {
        return timelineEntryId;
    }

    public void setTimelineEntryId(String timelineEntryId) {
        this.timelineEntryId = timelineEntryId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getClientGeneratedId() {
        return clientGeneratedId;
    }

    public void setClientGeneratedId(String clientGeneratedId) {
        this.clientGeneratedId = clientGeneratedId;
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

    public long getSyncTimestamp() {
        return syncTimestamp;
    }

    public void setSyncTimestamp(long syncTimestamp) {
        this.syncTimestamp = syncTimestamp;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public RealmList<PhotoLog> getPhotoLogs() {
        return photoLogs;
    }

    public void setPhotoLogs(RealmList<PhotoLog> photoLogs) {
        this.photoLogs = photoLogs;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public byte[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }

    public RealmList<Chunk> getChunks() {
        return chunks;
    }

    public void setChunks(RealmList<Chunk> chunks) {
        this.chunks = chunks;
    }

    public int getCreateType() {
        return createType;
    }

    public void setCreateType(int createType) {
        this.createType = createType;
    }

    public SceneFile getSceneFile() {
        return sceneFile;
    }

    public void setSceneFile(SceneFile sceneFile) {
        this.sceneFile = sceneFile;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
