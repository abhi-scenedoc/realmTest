package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-02-22.
 */
public class SketchpadAudit extends RealmObject{

    @PrimaryKey
    private int objectId;

    private String sketchpadId;
    private String title;
    private String clientGeneratedId;
    private String userId;
    private String official;
    private int resyncFlag;
    private String checksum;
    private long syncTimeStamp;
    private String timelineEntryId;
    private String osName;
    private int layersVersion;
    private String fileName;
    private int sketchpadHeight;
    private int sketchpadWidth;
    private byte[] thumbnail;
    private RealmList<Chunk> chunks;

    private Sketchpad sketchpad;
    private SceneFile sceneFile;
    private RealmList<SketchpadImageAudit> sketchpadImageAudits;
    private RealmList<SketchpadTextFieldAudit> sketchpadTextFieldAudits;
    private RealmList<SketchpadDrawingAudit> sketchpadDrawingAudits;

    private Date creationDate;
    private Date lastModifiedDate;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<SketchpadAudit> sketchpadAudits = realmDb.where(SketchpadAudit.class).findAll();
        return sketchpadAudits.size() > 0 ? sketchpadAudits.max("objectId").intValue() + 1 : 1;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getTimelineEntryId() {
        return timelineEntryId;
    }

    public void setTimelineEntryId(String timelineEntryId) {
        this.timelineEntryId = timelineEntryId;
    }

    public RealmList<Chunk> getChunks() {
        return chunks;
    }

    public void setChunks(RealmList<Chunk> chunks) {
        this.chunks = chunks;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getLayersVersion() {
        return layersVersion;
    }

    public void setLayersVersion(int layersVersion) {
        this.layersVersion = layersVersion;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public int getResyncFlag() {
        return resyncFlag;
    }

    public void setResyncFlag(int resyncFlag) {
        this.resyncFlag = resyncFlag;
    }

    public SceneFile getSceneFile() {
        return sceneFile;
    }

    public void setSceneFile(SceneFile sceneFile) {
        this.sceneFile = sceneFile;
    }

    public Sketchpad getSketchpad() {
        return sketchpad;
    }

    public void setSketchpad(Sketchpad sketchpad) {
        this.sketchpad = sketchpad;
    }

    public RealmList<SketchpadDrawingAudit> getSketchpadDrawingAudits() {
        return sketchpadDrawingAudits;
    }

    public void setSketchpadDrawingAudits(RealmList<SketchpadDrawingAudit> sketchpadDrawingAudits) {
        this.sketchpadDrawingAudits = sketchpadDrawingAudits;
    }

    public int getSketchpadHeight() {
        return sketchpadHeight;
    }

    public void setSketchpadHeight(int sketchpadHeight) {
        this.sketchpadHeight = sketchpadHeight;
    }

    public String getSketchpadId() {
        return sketchpadId;
    }

    public void setSketchpadId(String sketchpadId) {
        this.sketchpadId = sketchpadId;
    }

    public RealmList<SketchpadImageAudit> getSketchpadImageAudits() {
        return sketchpadImageAudits;
    }

    public void setSketchpadImageAudits(RealmList<SketchpadImageAudit> sketchpadImageAudits) {
        this.sketchpadImageAudits = sketchpadImageAudits;
    }

    public RealmList<SketchpadTextFieldAudit> getSketchpadTextFieldAudits() {
        return sketchpadTextFieldAudits;
    }

    public void setSketchpadTextFieldAudits(RealmList<SketchpadTextFieldAudit> sketchpadTextFieldAudits) {
        this.sketchpadTextFieldAudits = sketchpadTextFieldAudits;
    }

    public int getSketchpadWidth() {
        return sketchpadWidth;
    }

    public void setSketchpadWidth(int sketchpadWidth) {
        this.sketchpadWidth = sketchpadWidth;
    }

    public long getSyncTimeStamp() {
        return syncTimeStamp;
    }

    public void setSyncTimeStamp(long syncTimeStamp) {
        this.syncTimeStamp = syncTimeStamp;
    }

    public byte[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
