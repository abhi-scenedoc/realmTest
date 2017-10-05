package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 2017-07-14.
 */

public class RuleContainer extends RealmObject {

    @PrimaryKey
    private int objectId;
    private String id;
    private RuleGroup ruleGroup;
    private RealmList<RuleContainerAction> success;
    private RealmList<RuleContainerAction> fail;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb) {
        RealmResults<RuleContainer> ruleContainers = realmDb.where(RuleContainer.class).findAll();
        return ruleContainers.size() > 0 ? ruleContainers.max("objectId").intValue() + 1 : 1;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RuleGroup getRuleGroup() {
        return ruleGroup;
    }

    public void setRuleGroup(RuleGroup ruleGroup) {
        this.ruleGroup = ruleGroup;
    }

    public RealmList<RuleContainerAction> getSuccess() {
        return success;
    }

    public void setSuccess(RealmList<RuleContainerAction> success) {
        this.success = success;
    }

    public RealmList<RuleContainerAction> getFail() {
        return fail;
    }

    public void setFail(RealmList<RuleContainerAction> fail) {
        this.fail = fail;
    }
}
