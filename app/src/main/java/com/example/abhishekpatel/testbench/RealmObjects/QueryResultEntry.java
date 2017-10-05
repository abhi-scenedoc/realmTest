package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 16-11-03.
 */
public class QueryResultEntry extends RealmObject{


    @PrimaryKey
    private int objectId;

    private String resultEntryKey;
    private String resultEntryName;
    private String resultEntryValue;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<Query> realmResults = realmDb.where(Query.class).findAll();
        return realmResults.size() > 0 ? realmResults.max("objectId").intValue() + 1 : 1;
    }

    public String getResultEntryKey() {
        return resultEntryKey;
    }

    public void setResultEntryKey(String resultEntryKey) {
        this.resultEntryKey = resultEntryKey;
    }

    public String getResultEntryName() {
        return resultEntryName;
    }

    public void setResultEntryName(String resultEntryName) {
        this.resultEntryName = resultEntryName;
    }

    public String getResultEntryValue() {
        return resultEntryValue;
    }

    public void setResultEntryValue(String resultEntryValue) {
        this.resultEntryValue = resultEntryValue;
    }
}
