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
public class PhotoAudit extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String fileName;
    private String clientGeneratedId;
    private String clientSessionId;
    private Date timestamp;
    private Date creationDate;
    private Date lastModifiedDate;
    private long syncTimestamp;
    private String photoId;
    private String title;
    private String official;
    private String userId;
    private String checksum;
    private byte[] thumbnail;
    private int createType;
    private RealmList<Chunk> chunks;
    private RealmList<PhotoLogAudit> photoLogs;
    private String sceneFileId;
    private String sceneFileFolder;
    private Photo photo;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<PhotoAudit> lstPhotoAudit = realmDb.where(PhotoAudit.class).findAll();
        return lstPhotoAudit.size() > 0 ? lstPhotoAudit.max("objectId").intValue() + 1 : 1;
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

    public RealmList<PhotoLogAudit> getPhotoLogs() {
        return photoLogs;
    }

    public void setPhotoLogs(RealmList<PhotoLogAudit> photoLogs) {
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

    public int getCreateType() {
        return createType;
    }

    public void setCreateType(int createType) {
        this.createType = createType;
    }

    public RealmList<Chunk> getChunks() {
        return chunks;
    }

    public void setChunks(RealmList<Chunk> chunks) {
        this.chunks = chunks;
    }

    public String getSceneFileId() {
        return sceneFileId;
    }

    public void setSceneFileId(String sceneFileId) {
        this.sceneFileId = sceneFileId;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getClientSessionId() {
        return clientSessionId;
    }

    public void setClientSessionId(String clientSessionId) {
        this.clientSessionId = clientSessionId;
    }

    public String getSceneFileFolder() {
        return sceneFileFolder;
    }

    public void setSceneFileFolder(String sceneFileFolder) {
        this.sceneFileFolder = sceneFileFolder;
    }
}
