package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-01-28.\
 * This will be the codetypes table
 */
public class FormFieldValidValues extends RealmObject{

    @PrimaryKey
    private int objectId;

    private String fieldValidValue;

    //P1HH stuff
    private String formFieldOptionId;
    private String formFieldOptionName;
    private String formFieldOptionValue;

    private Date creationDate;
    private Date lastModifiedDate;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<FormFieldValidValues> lstFormFieldValidValues = realmDb.where(FormFieldValidValues.class).findAll();
        return lstFormFieldValidValues.size() > 0 ? lstFormFieldValidValues.max("objectId").intValue() + 1 : 1;
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

    public String getFieldValidValue() {
        return fieldValidValue;
    }

    public void setFieldValidValue(String fieldValidValue) {
        this.fieldValidValue = fieldValidValue;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getFormFieldOptionId() {
        return formFieldOptionId;
    }

    public void setFormFieldOptionId(String formFieldOptionId) {
        this.formFieldOptionId = formFieldOptionId;
    }

    public String getFormFieldOptionName() {
        return formFieldOptionName;
    }

    public void setFormFieldOptionName(String formFieldOptionName) {
        this.formFieldOptionName = formFieldOptionName;
    }

    public String getFormFieldOptionValue() {
        return formFieldOptionValue;
    }

    public void setFormFieldOptionValue(String formFieldOptionValue) {
        this.formFieldOptionValue = formFieldOptionValue;
    }
}
