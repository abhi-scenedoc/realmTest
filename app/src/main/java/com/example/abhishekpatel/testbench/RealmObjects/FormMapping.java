package com.example.abhishekpatel.testbench.RealmObjects;

/**
 * Created by georgidimitrov on 2016-08-15.
 */

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-02-01.
 */
public class FormMapping extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String formMappingId;
    private String formMappingName;
    private RealmList<FormMappingPage> formMappingPages;
    private String formMappingPDF;
    private RealmList<Chunk> chunks;
    private boolean isDownloaded;
    private String fileName;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb) {
        RealmResults<FormMapping> lstFormMappings = realmDb.where(FormMapping.class).findAll();
        return lstFormMappings.size() > 0 ? lstFormMappings.max("objectId").intValue() + 1 : 0;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isDownloaded() {
        return isDownloaded;
    }

    public void setDownloaded(boolean downloaded) {
        isDownloaded = downloaded;
    }

    public RealmList<Chunk> getChunks() {
        return chunks;
    }

    public void setChunks(RealmList<Chunk> chunks) {
        this.chunks = chunks;
    }

    public RealmList<FormMappingPage> getFormMappingPages() {
        return formMappingPages;
    }

    public void setFormMappingPages(RealmList<FormMappingPage> formMappingPages) {
        this.formMappingPages = formMappingPages;
    }

    public String getFormMappingId() {
        return formMappingId;
    }

    public void setFormMappingId(String formMappingId) {
        this.formMappingId = formMappingId;
    }

    public String getFormMappingName() {
        return formMappingName;
    }

    public void setFormMappingName(String formMappingName) {
        this.formMappingName = formMappingName;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getFormMappingPDF() {
        return formMappingPDF;
    }

    public void setFormMappingPDF(String formMappingPDF) {
        this.formMappingPDF = formMappingPDF;
    }



}

