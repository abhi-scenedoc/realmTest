package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-02-22.
 */
public class SketchpadPathPoint extends RealmObject {

    @PrimaryKey
    private int objectId;

    private int layer;
    private int x;
    private int y;

    private Date creationDate;
    private Date lastModifiedDate;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<SketchpadPathPoint> sketchpadPathPoints = realmDb.where(SketchpadPathPoint.class).findAll();
        return sketchpadPathPoints.size() > 0 ? sketchpadPathPoints.max("objectId").intValue() + 1 : 1;
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

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
