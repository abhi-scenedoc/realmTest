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
public class FormSubmissionAudit extends RealmObject {

    @PrimaryKey
    private int objectId;

    private int formSubmissionId;
    private SceneFile scenefile;
    private String sceneFileFolder;
    private String sceneFileId;
    private String timelineEntryId;
    private int formTemplateId;
    private String clientGeneratedId;
    private String title;
    private int formTemplateVersion;
    private RealmList<FormSubmissionFieldAudit> submittedValuesAudit;
    private FormSubmission formSubmission;

    private Date creationDate;
    private Date lastModifiedDate;

    private int workFlowStatus;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<FormSubmissionAudit> lstFormSubmissionAudit = realmDb.where(FormSubmissionAudit.class).findAll();
        return lstFormSubmissionAudit.size() > 0 ? lstFormSubmissionAudit.max("objectId").intValue() + 1 : 1;
    }

    public int getWorkFlowStatus() {
        return workFlowStatus;
    }

    public void setWorkFlowStatus(int workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
    }

    public String getTimelineEntryId() {
        return timelineEntryId;
    }

    public void setTimelineEntryId(String timelineEntryId) {
        this.timelineEntryId = timelineEntryId;
    }

    public RealmList<FormSubmissionFieldAudit> getSubmittedValuesAudit() {
        return submittedValuesAudit;
    }

    public FormSubmission getFormSubmission() {
        return formSubmission;
    }

    public void setFormSubmission(FormSubmission formSubmission) {
        this.formSubmission = formSubmission;
    }

    public SceneFile getScenefile() {
        return scenefile;
    }

    public void setScenefile(SceneFile scenefile) {
        this.scenefile = scenefile;
    }

    public void setSubmittedValuesAudit(RealmList<FormSubmissionFieldAudit> submittedValuesAudit) {
        this.submittedValuesAudit = submittedValuesAudit;
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

    public int getFormSubmissionId() {
        return formSubmissionId;
    }

    public void setFormSubmissionId(int formSubmissionId) {
        this.formSubmissionId = formSubmissionId;
    }

    public String getSceneFileFolder() {
        return sceneFileFolder;
    }

    public void setSceneFileFolder(String sceneFileFolder) {
        this.sceneFileFolder = sceneFileFolder;
    }

    public String getSceneFileId() {
        return sceneFileId;
    }

    public void setSceneFileId(String sceneFileId) {
        this.sceneFileId = sceneFileId;
    }
}
