package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 16-09-23.
 */
public class Query extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String queryType;
    private String queryName;
    private String queryDescription;
    private RealmList<QueryAttribute> querryAttributes;

    private Date creationDate;
    private Date lastModifiedDate;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<Query> realmResults = realmDb.where(Query.class).findAll();
        return realmResults.size() > 0 ? realmResults.max("objectId").intValue() + 1 : 1;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    public String getQueryDescription() {
        return queryDescription;
    }

    public void setQueryDescription(String queryDescription) {
        this.queryDescription = queryDescription;
    }

    public RealmList<QueryAttribute> getQuerryAttributes() {
        return querryAttributes;
    }

    public void setQuerryAttributes(RealmList<QueryAttribute> querryAttributes) {
        this.querryAttributes = querryAttributes;
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
