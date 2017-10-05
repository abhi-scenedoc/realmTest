package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 16-11-03.
 */
public class QueryResult extends RealmObject {

    @PrimaryKey
    private int objectId;

private RealmList<QueryResultEntry> queryResultEntries;
private QueryResultSource queryResultSource;
    private String alert;
    private long timestamp;

    /**
     * @param realmDb˜
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<Query> realmResults = realmDb.where(Query.class).findAll();
        return realmResults.size() > 0 ? realmResults.max("objectId").intValue() + 1 : 1;
    }

    public RealmList<QueryResultEntry> getQueryResultEntries() {
        return queryResultEntries;
    }

    public void setQueryResultEntries(RealmList<QueryResultEntry> queryResultEntries) {
        this.queryResultEntries = queryResultEntries;
    }

    public QueryResultSource getQueryResultSource() {
        return queryResultSource;
    }

    public void setQueryResultSource(QueryResultSource queryResultSource) {
        this.queryResultSource = queryResultSource;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


}
