package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 2017-07-14.
 */

public class RuleContainerAction extends RealmObject {

    @PrimaryKey
    private int objectId;
    private int attribute;
//    private RuleActionAttribute attribute;
    private String value;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb) {
        RealmResults<RuleContainerAction> ruleContainerAction = realmDb.where(RuleContainerAction.class).findAll();
        return ruleContainerAction.size() > 0 ? ruleContainerAction.max("objectId").intValue() + 1 : 1;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
