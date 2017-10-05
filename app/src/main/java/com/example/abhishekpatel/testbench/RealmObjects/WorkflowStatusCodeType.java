package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 2016-11-25.
 */

public class WorkflowStatusCodeType extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String id;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<WorkflowStatusCodeType> lstCodeTypes = realmDb.where(WorkflowStatusCodeType.class).findAll();
        return lstCodeTypes.size() > 0 ? lstCodeTypes.max("objectId").intValue() + 1 : 1;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
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
}
