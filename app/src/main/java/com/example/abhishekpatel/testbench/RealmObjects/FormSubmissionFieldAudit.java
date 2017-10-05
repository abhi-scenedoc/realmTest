package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-02-01.
 */
public class FormSubmissionFieldAudit extends RealmObject {

    @PrimaryKey
    private int objectId;

    private int formSubmissionFieldId;
    private String value;
    private String formFieldType;

    private Date creationDate;
    private Date lastModifiedDate;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<FormSubmissionFieldAudit> lstFormSubmissionFieldAudit = realmDb.where(FormSubmissionFieldAudit.class).findAll();
        return lstFormSubmissionFieldAudit.size() > 0 ? lstFormSubmissionFieldAudit.max("objectId").intValue() + 1 : 1;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getFormSubmissionFieldId() {
        return formSubmissionFieldId;
    }

    public void setFormSubmissionFieldId(int formSubmissionFieldId) {
        this.formSubmissionFieldId = formSubmissionFieldId;
    }

    public String getFormFieldType() {
        return formFieldType;
    }

    public void setFormFieldType(String formFieldType) {
        this.formFieldType = formFieldType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
}
