package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.UUID;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by abhishekpatel on 2017-08-18.
 */

public class RLMDriver extends RealmObject {

    @PrimaryKey
    private String objectId = UUID.randomUUID().toString();
    private String driverName;
    private int driverAge;
    private RealmList<RLMCar> carsOwned;
    private int wins;
    private int losses;
    private int ties;
    private float winRate;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }

    public RealmList<RLMCar> getCarsOwned() {
        return carsOwned;
    }

    public void setCarsOwned(RealmList<RLMCar> carsOwned) {
        this.carsOwned = carsOwned;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public float getWinRate() {
        return winRate;
    }

    public void setWinRate(float winRate) {
        this.winRate = winRate;
    }

}
