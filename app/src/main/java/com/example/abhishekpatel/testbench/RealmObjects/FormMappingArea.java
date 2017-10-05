package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 2017-02-22.
 */
public class FormMappingArea extends RealmObject {

    @PrimaryKey
    private int objectId;

    private int formFieldId;
    private int rotation;
    private double width;
    private double height;
    private double x;
    private double y;
    private String formFieldAttribute;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<FormMappingArea> lstFormMappingArea = realmDb.where(FormMappingArea.class).findAll();
        return lstFormMappingArea.size() > 0 ? lstFormMappingArea.max("objectId").intValue() + 1 : 0;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getFormFieldId() {
        return formFieldId;
    }

    public void setFormFieldId(int formFieldId) {
        this.formFieldId = formFieldId;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getFormFieldAttribute() {
        return formFieldAttribute;
    }

    public void setFormFieldAttribute(String formFieldAttribute) {
        this.formFieldAttribute = formFieldAttribute;
    }
}
