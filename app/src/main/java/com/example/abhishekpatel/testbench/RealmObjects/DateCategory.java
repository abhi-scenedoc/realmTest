package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by abhi on 3/1/17.
 */

public class DateCategory extends RealmObject {

    @PrimaryKey
    private int objectId;
    private String dateCategoryId;
    private RealmList<DatesRealmObject> datesRealmObjects;
    private String name;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<DateCategory> realmResults = realmDb.where(DateCategory.class).findAll();
        return realmResults.size() > 0 ? realmResults.max("objectId").intValue() + 1 : 1;
    }

    public String getDateCategoryId() {
        return dateCategoryId;
    }

    public void setDateCategoryId(String dateCategoryId) {
        this.dateCategoryId = dateCategoryId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public RealmList<DatesRealmObject> getDatesRealmObjects() {
        return datesRealmObjects;
    }

    public void setDatesRealmObjects(RealmList<DatesRealmObject> datesRealmObjects) {
        this.datesRealmObjects = datesRealmObjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
