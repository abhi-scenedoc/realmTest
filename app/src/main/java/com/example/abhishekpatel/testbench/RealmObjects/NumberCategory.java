package com.example.abhishekpatel.testbench.RealmObjects;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by rahulmenezes on 2017-01-19.
 */

public class NumberCategory extends RealmObject{

    @PrimaryKey
    private int objectId;

    private String numberCategoryId;
    private RealmList<Number> numbers;
    private String name;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<NumberCategory> realmResults = realmDb.where(NumberCategory.class).findAll();
        return realmResults.size() > 0 ? realmResults.max("objectId").intValue() + 1 : 1;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getNumberCategoryId() {
        return numberCategoryId;
    }

    public void setNumberCategoryId(String numberCategoryId) {
        this.numberCategoryId = numberCategoryId;
    }

    public RealmList<Number> getNumbers() {
        return numbers;
    }

    public void setNumbers(RealmList<Number> numbers) {
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
