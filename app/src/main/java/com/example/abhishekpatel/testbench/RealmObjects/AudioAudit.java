package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Milan on 2016-02-08.
 */
public class AudioAudit extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String audioId;
    private String fileName;
    private String data;
    private String checksum;
    private boolean removed;
    private int duration;
    private String title;
    private long syncTimestamp;
    private Date creationDate;
    private Date lastModifiedDate;
    private String clientGeneratedId;
    private String clientSessionId;
    private String userId;
    private String official;
    private int resyncFlag;
    private String SceneFileId;
    private String sceneFileFolder;
    private RealmList<Chunk> chunks;
    private Audio audio;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<AudioAudit> lstAudioAudit = realmDb.where(AudioAudit.class).findAll();
        return lstAudioAudit.size() > 0 ? lstAudioAudit.max("objectId").intValue() + 1 : 1;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getAudioId() {
        return audioId;
    }

    public void setAudioId(String audioId) {
        this.audioId = audioId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public boolean isRemoved() {
        return removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getSyncTimestamp() {
        return syncTimestamp;
    }

    public void setSyncTimestamp(long syncTimestamp) {
        this.syncTimestamp = syncTimestamp;
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

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public int getResyncFlag() {
        return resyncFlag;
    }

    public void setResyncFlag(int resyncFlag) {
        this.resyncFlag = resyncFlag;
    }

    public String getSceneFileId() {
        return SceneFileId;
    }

    public void setSceneFileId(String sceneFileId) {
        SceneFileId = sceneFileId;
    }

    public String getSceneFileFolder() {
        return sceneFileFolder;
    }

    public void setSceneFileFolder(String sceneFileFolder) {
        this.sceneFileFolder = sceneFileFolder;
    }

    public RealmList<Chunk> getChunks() {
        return chunks;
    }

    public void setChunks(RealmList<Chunk> chunks) {
        this.chunks = chunks;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public String getClientSessionId() {
        return clientSessionId;
    }

    public void setClientSessionId(String clientSessionId) {
        this.clientSessionId = clientSessionId;
    }
}
