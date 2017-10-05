package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 2016-08-15.
 */

public class FormMappingPage extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String formMappingPageId;
    private int width;
    private int height;
    private int pageNumber;
    private RealmList<FormMappingArea> formMappingAreas;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<FormMappingPage> lstFormMappingPages = realmDb.where(FormMappingPage.class).findAll();
        return lstFormMappingPages.size() > 0 ? lstFormMappingPages.max("objectId").intValue() + 1 : 0;
    }

    public String getFormMappingPageId() {
        return formMappingPageId;
    }

    public void setFormMappingPageId(String formMappingPageId) {
        this.formMappingPageId = formMappingPageId;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public RealmList<FormMappingArea> getFormMappingAreas() {
        return formMappingAreas;
    }

    public void setFormMappingAreas(RealmList<FormMappingArea> formMappingAreas) {
        this.formMappingAreas = formMappingAreas;
    }
}
