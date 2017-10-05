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
public class Sketchpad extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String sketchpadId;
    private String timelineEntryId;
    private String title;
    private String clientGeneratedId;
    private String userId;
    private String official;
    private int resyncFlag;
    private long syncTimeStamp;
    private String osName;
    private String checksum;
    private int layersVersion;
    private String fileName;
    private int sketchpadHeight;
    private int sketchpadWidth;
    private byte[] thumbnail;
    private RealmList<Chunk> chunks;
    private boolean isUploaded;

    private SceneFile sceneFile;
    private RealmList<SketchpadImage> sketchpadImages;
    private RealmList<SketchpadTextField> sketchpadTextFields;
    private RealmList<SketchpadDrawing> sketchpadDrawings;

    private Date creationDate;
    private Date lastModifiedDate;

    //Timeline stuff
    private int priority;
    private Location location;
    private String description;
    private String weather;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<Sketchpad> sketchpads = realmDb.where(Sketchpad.class).findAll();
        return sketchpads.size() > 0 ? sketchpads.max("objectId").intValue() + 1 : 1;
    }

    public boolean isUploaded() {
        return isUploaded;
    }

    public void setIsUploaded(boolean isUploaded) {
        this.isUploaded = isUploaded;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public RealmList<Chunk> getChunks() {
        return chunks;
    }

    public void setChunks(RealmList<Chunk> chunks) {
        this.chunks = chunks;
    }

    public String getTimelineEntryId() {
        return timelineEntryId;
    }

    public void setTimelineEntryId(String timelineEntryId) {
        this.timelineEntryId = timelineEntryId;
    }

    public int getLayersVersion() {
        return layersVersion;
    }

    public void setLayersVersion(int layersVersion) {
        this.layersVersion = layersVersion;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
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

    public RealmList<SketchpadDrawing> getSketchpadDrawings() {
        return sketchpadDrawings;
    }

    public void setSketchpadDrawings(RealmList<SketchpadDrawing> sketchpadDrawings) {
        this.sketchpadDrawings = sketchpadDrawings;
    }

    public String getSketchpadId() {
        return sketchpadId;
    }

    public void setSketchpadId(String sketchpadId) {
        this.sketchpadId = sketchpadId;
    }

    public RealmList<SketchpadImage> getSketchpadImages() {
        return sketchpadImages;
    }

    public void setSketchpadImages(RealmList<SketchpadImage> sketchpadImages) {
        this.sketchpadImages = sketchpadImages;
    }

    public RealmList<SketchpadTextField> getSketchpadTextFields() {
        return sketchpadTextFields;
    }

    public void setSketchpadTextFields(RealmList<SketchpadTextField> sketchpadTextFields) {
        this.sketchpadTextFields = sketchpadTextFields;
    }

    public long getSyncTimeStamp() {
        return syncTimeStamp;
    }

    public void setSyncTimeStamp(long syncTimeStamp) {
        this.syncTimeStamp = syncTimeStamp;
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

    public int getSketchpadHeight() {
        return sketchpadHeight;
    }

    public void setSketchpadHeight(int sketchpadHeight) {
        this.sketchpadHeight = sketchpadHeight;
    }

    public int getSketchpadWidth() {
        return sketchpadWidth;
    }

    public void setSketchpadWidth(int sketchpadWidth) {
        this.sketchpadWidth = sketchpadWidth;
    }

    public byte[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
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
