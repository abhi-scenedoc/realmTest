package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-04-08.
 */
public class TimelineMediaAudit extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String mimeType;
    private String checksum;
    private int fileSize;
    private String fileName;
    private byte[] thumbnailData;
    private String serializedData;
    private int duration;
    private int resyncFlag;
    private int createType;
    private Photo photo;
    private SketchpadAudit sketchpad;
    private Video video;
    private Audio audio;
    private Attachment attachment;
    private String clientSessionId;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<TimelineMediaAudit> lstTimelineMedia = realmDb.where(TimelineMediaAudit.class).findAll();
        return lstTimelineMedia.size() > 0 ? lstTimelineMedia.max("objectId").intValue() + 1 : 1;
    }

    public String getClientSessionId() {
        return clientSessionId;
    }

    public void setClientSessionId(String clientSessionId) {
        this.clientSessionId = clientSessionId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getThumbnailData() {
        return thumbnailData;
    }

    public void setThumbnailData(byte[] thumbnailData) {
        this.thumbnailData = thumbnailData;
    }

    public String getSerializedData() {
        return serializedData;
    }

    public void setSerializedData(String serializedData) {
        this.serializedData = serializedData;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getResyncFlag() {
        return resyncFlag;
    }

    public void setResyncFlag(int resyncFlag) {
        this.resyncFlag = resyncFlag;
    }

    public int getCreateType() {
        return createType;
    }

    public void setCreateType(int createType) {
        this.createType = createType;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public SketchpadAudit getSketchpad() {
        return sketchpad;
    }

    public void setSketchpad(SketchpadAudit sketchpad) {
        this.sketchpad = sketchpad;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
}
