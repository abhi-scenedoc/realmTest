package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by abhi on 2/14/17.
 */

public class AutoFillCategory extends RealmObject {

    public int autoFillType;
    public String id;
    public int count;
    @PrimaryKey
    private int objectId;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<AutoFillCategory> autoFillCategories = realmDb.where(AutoFillCategory.class).findAll();
        return autoFillCategories.size() > 0 ? autoFillCategories.max("objectId").intValue() + 1 : 1;
    }

    public int getAutoFillType() {
        return autoFillType;
    }

    public void setAutoFillType(int autoFillType) {
        this.autoFillType = autoFillType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
