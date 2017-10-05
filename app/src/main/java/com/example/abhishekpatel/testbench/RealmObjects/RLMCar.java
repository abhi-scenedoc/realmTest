package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.UUID;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by abhishekpatel on 2017-08-18.
 */

public class RLMCar extends RealmObject {

    @PrimaryKey
    private String objectId = UUID.randomUUID().toString();
    private String name;
    private RealmList<RLMColour> colours;
    private float topSpeed;
    private float acceleration;
    private int plateNum;

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

    public RealmList<RLMColour> getColours() {
        return colours;
    }

    public void setColours(RealmList<RLMColour> colours) {
        this.colours = colours;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public int getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(int plateNum) {
        this.plateNum = plateNum;
    }
}
