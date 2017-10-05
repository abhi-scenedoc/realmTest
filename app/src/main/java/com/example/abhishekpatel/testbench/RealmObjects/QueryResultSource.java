package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 16-11-03.
 */
public class QueryResultSource extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String resultSourceType;
    private String geography;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<Query> realmResults = realmDb.where(Query.class).findAll();
        return realmResults.size() > 0 ? realmResults.max("objectId").intValue() + 1 : 1;
    }

    public String getResultSourceType() {
        return resultSourceType;
    }

    public void setResultSourceType(String resultSourceType) {
        this.resultSourceType = resultSourceType;
    }

    public String getGeography() {
        return geography;
    }

    public void setGeography(String geography) {
        this.geography = geography;
    }
}
