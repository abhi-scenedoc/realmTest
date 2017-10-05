package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 2017-09-12.
 */

public class CodeTypeItemAuxiliary extends RealmObject {

    @PrimaryKey
    private int objectId;
    private String codeTypeItemId;
    private String formFieldAttribute;
    private String value;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<CodeTypeItemAuxiliary> lstCodeTypeItems = realmDb.where(CodeTypeItemAuxiliary.class).findAll();
        return lstCodeTypeItems.size() > 0 ? lstCodeTypeItems.max("objectId").intValue() + 1 : 1;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getCodeTypeItemId() {
        return codeTypeItemId;
    }

    public void setCodeTypeItemId(String codeTypeItemId) {
        this.codeTypeItemId = codeTypeItemId;
    }

    public String getFormFieldAttribute() {
        return formFieldAttribute;
    }

    public void setFormFieldAttribute(String formFieldAttribute) {
        this.formFieldAttribute = formFieldAttribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
