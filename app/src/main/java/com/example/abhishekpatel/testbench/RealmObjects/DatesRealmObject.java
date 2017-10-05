package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by abhi on 3/1/17.
 */

public class DatesRealmObject extends RealmObject {

    @PrimaryKey
    private int objectId;
    private String dateId;
    private Date value;
    private String dateCategoryId;
    private int sequence;
    private int state;
    private String readAbleDate;
    private String readAbleTime;
    private String courtName;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb) {
        RealmResults<DatesRealmObject> realmResults = realmDb.where(DatesRealmObject.class).findAll();
        return realmResults.size() > 0 ? realmResults.max("objectId").intValue() + 1 : 1;
    }

    public String getReadAbleTime() {
        return readAbleTime;
    }

    public void setReadAbleTime(String readAbleTime) {
        this.readAbleTime = readAbleTime;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public String getReadAbleDate() {
        return readAbleDate;
    }

    public void setReadAbleDate(String readAbleDate) {
        this.readAbleDate = readAbleDate;
    }

    public String getDateId() {
        return dateId;
    }

    public void setDateId(String dateId) {
        this.dateId = dateId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Date getValue() {
        return value;
    }

    public void setValue(Date value) {
        this.value = value;
    }

    public String getDateCategoryId() {
        return dateCategoryId;
    }

    public void setDateCategoryId(String dateCategoryId) {
        this.dateCategoryId = dateCategoryId;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


}
