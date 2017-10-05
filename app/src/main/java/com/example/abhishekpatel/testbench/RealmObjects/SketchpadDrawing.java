package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-02-22.
 */
public class SketchpadDrawing extends RealmObject {

    @PrimaryKey
    private int objectId;

    private RealmList<SketchpadPathPoint> pathPoints;
    private int asDrawingType;
    private int asPinStatus;
    private int top;
    private int left;
    private int bottom;
    private int right;
    private int color;
    private int width;
    private int height;
    private String clientGeneratedId; // todo careful
    private int strokeWidth;
    private String drawingsId; //todo careful
    private int layer;
    private Date creationDate;
    private Date lastModifiedDate;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<SketchpadDrawing> sketchpadDrawings = realmDb.where(SketchpadDrawing.class).findAll();
        return sketchpadDrawings.size() > 0 ? sketchpadDrawings.max("objectId").intValue() + 1 : 1;
    }

    public String getClientGeneratedId() {
        return clientGeneratedId;
    }

    public void setClientGeneratedId(String clientGeneratedId) {
        this.clientGeneratedId = clientGeneratedId;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public int getAsDrawingType() {
        return asDrawingType;
    }

    public void setAsDrawingType(int asDrawingType) {
        this.asDrawingType = asDrawingType;
    }

    public int getAsPinStatus() {
        return asPinStatus;
    }

    public void setAsPinStatus(int asPinStatus) {
        this.asPinStatus = asPinStatus;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getDrawingsId() {
        return drawingsId;
    }

    public void setDrawingsId(String drawingsId) {
        this.drawingsId = drawingsId;
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

    public RealmList<SketchpadPathPoint> getPathPoints() {
        return pathPoints;
    }

    public void setPathPoints(RealmList<SketchpadPathPoint> pathPoints) {
        this.pathPoints = pathPoints;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }
}
