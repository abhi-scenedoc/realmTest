package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-01-21.
 */
public class FormTemplate extends RealmObject {

    @PrimaryKey
    private int objectId;

    private int formTemplateId;
    private int version;

    private String name;
    private String formDescription;

    private RealmList<FormField> fields;

    private boolean singleSubmit;

    private long syncTimestamp;
    private String formKeyIn;

    private boolean formIsValid;
    private int canonicalId; // what is this
    private String path;

    private Date creationDate;
    private Date lastModifiedDate;
    private boolean idScannableForm;

    private int formTemplateType;
    private RealmList<FormMapping> formMappings;
    private RealmList<AutoFillCategory> autoFillCategories;
    private boolean isMigrated;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<FormTemplate> formTemplates = realmDb.where(FormTemplate.class).findAll();
        return formTemplates.size() > 0 ? formTemplates.max("objectId").intValue() + 1 : 1;
    }

    public boolean isMigrated() {
        return isMigrated;
    }

    public void setMigrated(boolean migrated) {
        isMigrated = migrated;
    }

    public RealmList<AutoFillCategory> getAutoFillCategories() {
        return autoFillCategories;
    }

    public void setAutoFillCategories(RealmList<AutoFillCategory> autoFillCategories) {
        this.autoFillCategories = autoFillCategories;
    }

    public RealmList<FormMapping> getFormMappings() {
        return formMappings;
    }

    public void setFormMappings(RealmList<FormMapping> formMappings) {
        this.formMappings = formMappings;
    }

    public int getFormTemplateType() {
        return formTemplateType;
    }

    public void setFormTemplateType(int formTemplateType) {
        this.formTemplateType = formTemplateType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

    public int getFormTemplateId() {
        return formTemplateId;
    }

    public void setFormTemplateId(int formTemplateId) {
        this.formTemplateId = formTemplateId;
    }

    public int getCanonicalId() {
        return canonicalId;
    }

    public void setCanonicalId(int canonicalId) {
        this.canonicalId = canonicalId;
    }

    public String getFormDescription() {
        return formDescription;
    }

    public void setFormDescription(String formDescription) {
        this.formDescription = formDescription;
    }

    public RealmList<FormField> getFields() {
        return fields;
    }

    public void setFields(RealmList<FormField> fields) {
        this.fields = fields;
    }

    public boolean isSingleSubmit() {
        return singleSubmit;
    }

    public void setSingleSubmit(boolean singleSubmit) {
        this.singleSubmit = singleSubmit;
    }

    public String getFormKeyIn() {
        return formKeyIn;
    }

    public void setFormKeyIn(String formKeyIn) {
        this.formKeyIn = formKeyIn;
    }

    public boolean isFormIsValid() {
        return formIsValid;
    }

    public void setFormIsValid(boolean formIsValid) {
        this.formIsValid = formIsValid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public long getSyncTimestamp() {
        return syncTimestamp;
    }

    public void setSyncTimestamp(long syncTimestamp) {
        this.syncTimestamp = syncTimestamp;
    }

    public boolean isIdScannableForm() {
        return idScannableForm;
    }

    public void setIdScannableForm(boolean idScannableForm) {
        this.idScannableForm = idScannableForm;
    }
}
