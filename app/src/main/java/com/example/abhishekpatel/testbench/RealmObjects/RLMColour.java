package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.UUID;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by abhishekpatel on 2017-08-18.
 */

public class RLMColour extends RealmObject {

    @PrimaryKey
    private String objectId = UUID.randomUUID().toString();
    private String name;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
