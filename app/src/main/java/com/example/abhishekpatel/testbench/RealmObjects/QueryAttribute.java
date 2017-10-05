package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 16-09-23.
 */
public class QueryAttribute extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String queryAttributeType;
    private String queryAttributeValue;

    private Query query;
    private Date creationDate;
    private Date lastModifiedDate;


    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<QueryAttribute> realmResults = realmDb.where(QueryAttribute.class).findAll();
        return realmResults.size() > 0 ? realmResults.max("objectId").intValue() + 1 : 1;
    }

    public String getQueryAttributeType() {
        return queryAttributeType;
    }

    public void setQueryAttributeType(String queryAttributeType) {
        this.queryAttributeType = queryAttributeType;
    }

    public String getQueryAttributeValue() {
        return queryAttributeValue;
    }

    public void setQueryAttributeValue(String queryAttributeValue) {
        this.queryAttributeValue = queryAttributeValue;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }
}
