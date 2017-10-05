package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-02-22.
 */
public class SketchpadTextFieldAudit extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String text;
    private int height;
    private String textFieldId;
    private int backgroundColor;
    private int color;
    private int width;
    private int layer;
    private int fontSize;
    private int y;
    private int asPinStatus;
    private int x;
    private int top;
    private int left;
    private int bottom;
    private int right;
    private String fontName;
    private int foregroundColor;
    private Date creationDate;
    private Date lastModifiedDate;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<SketchpadTextFieldAudit> sketchpadTextFieldAudits = realmDb.where(SketchpadTextFieldAudit.class).findAll();
        return sketchpadTextFieldAudits.size() > 0 ? sketchpadTextFieldAudits.max("objectId").intValue() + 1 : 1;
    }

    public int getAsPinStatus() {
        return asPinStatus;
    }

    public void setAsPinStatus(int asPinStatus) {
        this.asPinStatus = asPinStatus;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
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

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(int foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
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

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextFieldId() {
        return textFieldId;
    }

    public void setTextFieldId(String textFieldId) {
        this.textFieldId = textFieldId;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
