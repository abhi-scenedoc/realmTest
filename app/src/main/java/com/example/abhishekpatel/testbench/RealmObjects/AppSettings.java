package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 *  App settings object. Contains a unique objectID that correlates to the configKey.
 *  The reason behind this is because the configKey needs to be an unique identifier and
 *  Realm does not support unique variables at this point.
 */
public class AppSettings extends RealmObject {

    @PrimaryKey
    private int objectId;

    private String configKey; // not null unique
    private String configValue; // not null
    private boolean userInteractionEnabled;

    private Date creationDate;
    private Date lastModifiedDate;

    public static int nextObjectId(Realm realmDb)
    {
        RealmResults<AppSettings> realmResults = realmDb.where(AppSettings.class).findAll();
        return realmResults.size() > 0 ? realmResults.max("objectId").intValue() + 1 : 1;
    }

    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey){
        this.configKey = configKey;
    }
//    /**
//     * Sets the config key and based on the config key, sets a unique objectID.
//     * @param configKey - the unique config key.
//     */
//    public void setConfigKey(String configKey) {
//
//        if(configKey.equals(Constant.REMEMBER_LAST_USERNAME))
//            objectId = 0;
//        else if (configKey.equals(Constant.SCENEFILE_NUMBER_ALL_CAPS))
//            objectId = 1;
//        else if (configKey.equals(Constant.AUDIO_RECORDING_ENABLED))
//            objectId = 2;
//        else if (configKey.equals(Constant.APP_MODULARIZATION_AUDIOENABLED))
//            objectId = 3;
//        else if (configKey.equals(Constant.APP_MODULARIZATION_FIELDRESOURCEENABLED))
//            objectId = 4;
//        else if (configKey.equals(Constant.APP_MODULARIZATION_FORMENABLED))
//            objectId = 5;
//        else if (configKey.equals(Constant.APP_MODULARIZATION_NOTEPADEENABLED))
//            objectId = 6;
//        else if (configKey.equals(Constant.APP_MODULARIZATION_PHOTOENABLED))
//            objectId = 7;
//        else if (configKey.equals(Constant.APP_MODULARIZATION_VIDEOENABLED))
//            objectId = 8;
//        else if (configKey.equals(Constant.ENABLE_PIN_CODE))
//            objectId = 9;
//        else if (configKey.equals(Constant.PIN_CODE))
//            objectId = 10;
//        else if (configKey.equals(Constant.CACHING_ENABLED))
//            objectId = 11;
//        else if (configKey.equals(Constant.APP_MODULARIZATION_NOTEENABLED))
//            objectId = 12;
//        else if (configKey.equals(Constant.APP_MODULARIZATION_CHECKINENABLED))
//            objectId = 13;
//        else if (configKey.equals(Constant.APP_MODULARIZATION_CITATIONENABLED))
//            objectId = 14;
//        else if (configKey.equals(Constant.APP_MODULARIZATION_SCENEFILEENABLED))
//            objectId = 15;
//        else if (configKey.equals(Constant.APP_MODULARIZATION_THEME))
//            objectId = 16;
//        else if (configKey.equals(Constant.APP_TIME_FORMAT))
//            objectId = 17;
//
//        this.configKey = configKey;
//    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public boolean isUserInteractionEnabled() {
        return userInteractionEnabled;
    }

    public void setUserInteractionEnabled(boolean userInteractionEnabled) {
        this.userInteractionEnabled = userInteractionEnabled;
    }

    @Override
    public String toString() {
        return "AppSettings{" +
                "objectId=" + objectId +
                ", configKey='" + configKey + '\'' +
                ", configValue='" + configValue + '\'' +
                ", userInteractionEnabled=" + userInteractionEnabled +
                ", creationDate=" + creationDate +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }
}
