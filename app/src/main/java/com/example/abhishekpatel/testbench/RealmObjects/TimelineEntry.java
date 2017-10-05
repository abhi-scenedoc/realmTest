package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-03-22.
 */
public class TimelineEntry extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String id;
    private int entryType;
    private String userId;
    private String official;
    private String title;
    private Location location;
    private String weather;
    private String timelineDescription;
    private int priority;
    private String parentTimelineEntryId;
    private TimelineMedia media;
    private FormSubmission formSubmission;
    private SceneFile sceneFile;
    private Date creationDate;
    private Date lastModifiedDate;
    private long timestamp;
    private int accessType;
    private boolean deleted;
    private boolean isDownloaded;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<TimelineEntry> lstTimelineEntries = realmDb.where(TimelineEntry.class).findAll();
        return lstTimelineEntries.size() > 0 ? lstTimelineEntries.max("objectId").intValue() + 1 : 1;
    }

    public int getAccessType() {
        return accessType;
    }

    public void setAccessType(int accessType) {
        this.accessType = accessType;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEntryType() {
        return entryType;
    }

    public void setEntryType(int entryType) {
        this.entryType = entryType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTimelineDescription() {
        return timelineDescription;
    }

    public void setTimelineDescription(String timelineDescription) {
        this.timelineDescription = timelineDescription;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getParentTimelineEntryId() {
        return parentTimelineEntryId;
    }

    public void setParentTimelineEntryId(String parentTimelineEntryId) {
        this.parentTimelineEntryId = parentTimelineEntryId;
    }

    public TimelineMedia getMedia() {
        return media;
    }

    public void setMedia(TimelineMedia media) {
        this.media = media;
    }

    public FormSubmission getFormSubmission() {
        return formSubmission;
    }

    public void setFormSubmission(FormSubmission formSubmission) {
        this.formSubmission = formSubmission;
    }

    public SceneFile getSceneFile() {
        return sceneFile;
    }

    public void setSceneFile(SceneFile sceneFile) {
        this.sceneFile = sceneFile;
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

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public boolean isDownloaded() {
        return isDownloaded;
    }

    public void setDownloaded(boolean downloaded) {
        isDownloaded = downloaded;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
