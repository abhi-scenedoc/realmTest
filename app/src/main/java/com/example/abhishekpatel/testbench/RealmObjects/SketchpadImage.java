package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-02-22.
 */
public class SketchpadImage extends RealmObject{

    @PrimaryKey
    private int objectId;

    private float rotationAngle;
    private float width;
    private float height;
    private int layer;
    private String transform;
    private String title;
    private int source;
    private String fileName;
    private long longitude;
    private long latitude;
    private int userId;
    private String official;
    private String locationString;
    private String clientGeneratedId;
    private String photoId; //When sketchpad gets downloaded, this field gets populated, this is what's used to check if photo is downlaoded or needs to be downloaded.
    private int asPinStatus;
    private float scale;
    private float angle;
    private int top;
    private int left;
    private int bottom;
    private int right;
    private int asDrawingType;
    private int resId;

    private Photo photo;

    private Date creationDate;
    private Date lastModifiedDate;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<SketchpadImage> sketchpadImages = realmDb.where(SketchpadImage.class).findAll();
        return sketchpadImages.size() > 0 ? sketchpadImages.max("objectId").intValue() + 1 : 1;
    }

    public int getAsPinStatus() {
        return asPinStatus;
    }

    public void setAsPinStatus(int asPinStatus) {
        this.asPinStatus = asPinStatus;
    }

    public String getClientGeneratedId() {
        return clientGeneratedId;
    }

    public void setClientGeneratedId(String clientGeneratedId) {
        this.clientGeneratedId = clientGeneratedId;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public String getLocationString() {
        return locationString;
    }

    public void setLocationString(String locationString) {
        this.locationString = locationString;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
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

    public float getRotationAngle() {
        return rotationAngle;
    }

    public void setRotationAngle(float rotationAngle) {
        this.rotationAngle = rotationAngle;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public String getTransform() {
        return transform;
    }

    public void setTransform(String transform) {
        this.transform = transform;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
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

    public int getAsDrawingType() {
        return asDrawingType;
    }

    public void setAsDrawingType(int asDrawingType) {
        this.asDrawingType = asDrawingType;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }
}
