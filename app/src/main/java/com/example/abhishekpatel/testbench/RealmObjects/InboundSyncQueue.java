package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Milan on 2016-02-01.
 */
public class InboundSyncQueue extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String thriftType;
    private int apiMethod;
    private int syncItemObjectId;
    private long currentChunkIndex;
    private long chunkOffset;
    private int totalChunks;
    private int version;
    private String clientSessionId;
    private String syncItemServerId;
    private String fileName;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<InboundSyncQueue> lstInboundQueue = realmDb.where(InboundSyncQueue.class).findAll();
        return lstInboundQueue.size() > 0 ? lstInboundQueue.max("objectId").intValue() + 1 : 1;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getThriftType() {
        return thriftType;
    }

    public void setThriftType(String thriftType) {
        this.thriftType = thriftType;
    }

    public int getApiMethod() {
        return apiMethod;
    }

    public void setApiMethod(int apiMethod) {
        this.apiMethod = apiMethod;
    }

    public int getSyncItemObjectId() {
        return syncItemObjectId;
    }

    public void setSyncItemObjectId(int syncItemObjectId) {
        this.syncItemObjectId = syncItemObjectId;
    }

    public long getCurrentChunkIndex() {
        return currentChunkIndex;
    }

    public void setCurrentChunkIndex(long currentChunkIndex) {
        this.currentChunkIndex = currentChunkIndex;
    }

    public int getTotalChunks() {
        return totalChunks;
    }

    public void setTotalChunks(int totalChunks) {
        this.totalChunks = totalChunks;
    }

    public String getClientSessionId() {
        return clientSessionId;
    }

    public void setClientSessionId(String clientSessionId) {
        this.clientSessionId = clientSessionId;
    }

    public long getChunkOffset() {
        return chunkOffset;
    }

    public void setChunkOffset(long chunkOffset) {
        this.chunkOffset = chunkOffset;
    }

    public String getSyncItemServerId() {
        return syncItemServerId;
    }

    public void setSyncItemServerId(String syncItemServerId) {
        this.syncItemServerId = syncItemServerId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
