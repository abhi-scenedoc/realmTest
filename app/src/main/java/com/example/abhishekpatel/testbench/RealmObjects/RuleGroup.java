package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 2017-07-14.
 */

public class RuleGroup extends RealmObject {

    @PrimaryKey
    private int objectId;
    private String id;
    private RealmList<Condition> conditions;
    private RealmList<RuleGroup> ruleGroups;
    private int logicGate;
//    private RuleGroupLogicGate logicGate;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb) {
        RealmResults<RuleGroup> ruleGroup = realmDb.where(RuleGroup.class).findAll();
        return ruleGroup.size() > 0 ? ruleGroup.max("objectId").intValue() + 1 : 1;
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

    public RealmList<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(RealmList<Condition> conditions) {
        this.conditions = conditions;
    }

    public RealmList<RuleGroup> getRuleGroups() {
        return ruleGroups;
    }

    public void setRuleGroups(RealmList<RuleGroup> ruleGroups) {
        this.ruleGroups = ruleGroups;
    }

    public int getLogicGate() {
        return logicGate;
    }

    public void setLogicGate(int logicGate) {
        this.logicGate = logicGate;
    }
}
