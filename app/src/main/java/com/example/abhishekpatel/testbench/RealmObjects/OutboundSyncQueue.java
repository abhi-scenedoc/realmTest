package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Milan on 2016-01-18.
 */
public class OutboundSyncQueue extends RealmObject {

    @PrimaryKey
    private int objectId;

    private int syncItemAuditObjectId;
    private int syncItemObjectId; //Used mostly to get progress
    private String thriftType;
    private String action;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<OutboundSyncQueue> lstOutboundQueue = realmDb.where(OutboundSyncQueue.class).findAll();
        return lstOutboundQueue.size() > 0 ? lstOutboundQueue.max("objectId").intValue() + 1 : 1;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getSyncItemAuditObjectId() {
        return syncItemAuditObjectId;
    }

    public void setSyncItemAuditObjectId(int syncItemAuditObjectId) {
        this.syncItemAuditObjectId = syncItemAuditObjectId;
    }

    public String getThriftType() {
        return thriftType;
    }

    public void setThriftType(String thriftType) {
        this.thriftType = thriftType;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getSyncItemObjectId() {
        return syncItemObjectId;
    }

    public void setSyncItemObjectId(int syncItemObjectId) {
        this.syncItemObjectId = syncItemObjectId;
    }
}
