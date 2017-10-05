package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-02-01.
 */
public class FormSubmission extends RealmObject {

    @PrimaryKey
    private int objectId;

    private SceneFile sceneFile;
    private String formSubmissionId;
    private int formTemplateId;
    private String timelineEntryId;
    private String title;
    private int formTemplateVersion;
    private long syncTimeStamp;
    private String clientGeneratedId;
    private int userId;
    private String official;
    private RealmList<FormSubmissionField> submittedValues;
    private Date creationDate;
    private Date lastModifiedDate;
    //Timeline stuff
    private int priority;
    private Location location;
    private String description;
    private String weather;
    private boolean isAutoSave;
    private boolean isOnCloud;
    private int workFlowStatus;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<FormSubmission> lstFormSubmissions = realmDb.where(FormSubmission.class).findAll();
        return lstFormSubmissions.size() > 0 ? lstFormSubmissions.max("objectId").intValue() + 1 : 1;
    }

    public int getWorkFlowStatus() {
        return workFlowStatus;
    }

    public void setWorkFlowStatus(int workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
    }

    public boolean isOnCloud() {
        return isOnCloud;
    }

    public void setOnCloud(boolean onCloud) {
        isOnCloud = onCloud;
    }

    public boolean isAutoSave() {
        return isAutoSave;
    }

    public void setAutoSave(boolean autoSave) {
        isAutoSave = autoSave;
    }

    public String getTimelineEntryId() {
        return timelineEntryId;
    }

    public void setTimelineEntryId(String timelineEntryId) {
        this.timelineEntryId = timelineEntryId;
    }

    public SceneFile getSceneFile() {
        return sceneFile;
    }

    public void setSceneFile(SceneFile sceneFile) {
        this.sceneFile = sceneFile;
    }

    public RealmList<FormSubmissionField> getSubmittedValues() {
        return submittedValues;
    }

    public void setSubmittedValues(RealmList<FormSubmissionField> submittedValues) {
        this.submittedValues = submittedValues;
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

    public int getFormTemplateId() {
        return formTemplateId;
    }

    public void setFormTemplateId(int formTemplateId) {
        this.formTemplateId = formTemplateId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFormTemplateVersion() {
        return formTemplateVersion;
    }

    public void setFormTemplateVersion(int formTemplateVersion) {
        this.formTemplateVersion = formTemplateVersion;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFormSubmissionId() {
        return formSubmissionId;
    }

    public void setFormSubmissionId(String formSubmissionId) {
        this.formSubmissionId = formSubmissionId;
    }

    public long getSyncTimeStamp() {
        return syncTimeStamp;
    }

    public void setSyncTimeStamp(long syncTimeStamp) {
        this.syncTimeStamp = syncTimeStamp;
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
