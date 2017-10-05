package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 16-11-03.
 */
public class QueryResponse extends RealmObject {

    @PrimaryKey
    private int objectId;
    private RealmList<QueryResult> queryResults;
    private boolean fullResultSetReturned;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<Query> realmResults = realmDb.where(Query.class).findAll();
        return realmResults.size() > 0 ? realmResults.max("objectId").intValue() + 1 : 1;
    }


    public List<QueryResult> getQueryResults() {
        return queryResults;
    }

    public void setQueryResults(RealmList<QueryResult> queryResults) {
        this.queryResults = queryResults;
    }

    public boolean isFullResultSetReturned() {
        return fullResultSetReturned;
    }

    public void setFullResultSetReturned(boolean fullResultSetReturned) {
        this.fullResultSetReturned = fullResultSetReturned;
    }
}
