package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-03-10.
 */
public class CodeType extends RealmObject{

    @PrimaryKey
    private int objectId;

    private String id;
    private long syncTimestamp;
    private RealmList<CodeTypeItem> codeTypeItems;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<CodeType> lstCodeTypes = realmDb.where(CodeType.class).findAll();
        return lstCodeTypes.size() > 0 ? lstCodeTypes.max("objectId").intValue() + 1 : 1;
    }

    public RealmList<CodeTypeItem> getCodeTypeItems() {
        return codeTypeItems;
    }

    public void setCodeTypeItems(RealmList<CodeTypeItem> codeTypeItems) {
        this.codeTypeItems = codeTypeItems;
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

    public long getSyncTimestamp() {
        return syncTimestamp;
    }

    public void setSyncTimestamp(long syncTimestamp) {
        this.syncTimestamp = syncTimestamp;
    }
}
