package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-03-10.
 */
public class CodeTypeItem extends RealmObject{

    @PrimaryKey
    private int objectId;

    private String id;
    private String codeTypeId;
    private String value;
    private String text;
    private String summary;
    private int sequence;
    private boolean active;
    private RealmList<CodeTypeItemAuxiliary> codeTypeItemAuxiliaryList;


    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<CodeTypeItem> lstCodeTypeItems = realmDb.where(CodeTypeItem.class).findAll();
        return lstCodeTypeItems.size() > 0 ? lstCodeTypeItems.max("objectId").intValue() + 1 : 1;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getCodeTypeId() {
        return codeTypeId;
    }

    public void setCodeTypeId(String codeTypeId) {
        this.codeTypeId = codeTypeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public RealmList<CodeTypeItemAuxiliary> getCodeTypeItemAuxiliaryList() {
        return codeTypeItemAuxiliaryList;
    }

    public void setCodeTypeItemAuxiliaryList(RealmList<CodeTypeItemAuxiliary> codeTypeItemAuxiliaryList) {
        this.codeTypeItemAuxiliaryList = codeTypeItemAuxiliaryList;
    }
}
