package com.example.abhishekpatel.testbench.RealmObjects;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by georgidimitrov on 16-01-27.
 */
public class FormField extends RealmObject {



    @PrimaryKey
    private int objectId;
    private int formFieldId;
    private String formFieldKeyIn;
    private String fieldName;
    private String fieldType;
    private int maxLength;
    private boolean isRequired;
    private int sequence;
    private String pattern;
    private String placeHolder = "";
    private double width = 0;
    private boolean newLine = false;
    private double leftPadding = 0;
    private String codeTypeId;
    private RealmList<FormFieldValidValues> formFieldValidValues;
    private Date creationDate;
    private Date lastModifiedDate;
    private boolean labelBold;
    private boolean readOnly;
    private int autoFillType;
    private String groupId;
    private RealmList<Query> formFieldKeysIn;
    private RealmList<Query> formFieldKeysOut;
    private String autoFillCategoryId;
    private int autoFillCategoryAction;
    private boolean collapsedState;
    private RealmList<RuleContainer> ruleContainers;
    private boolean visible;

    /**
     * @param realmDb
     * @return The next objectId for this realm object.
     */
    public static int nextObjectId(Realm realmDb) {
        RealmResults<FormField> lstFormFields = realmDb.where(FormField.class).findAll();
        return lstFormFields.size() > 0 ? lstFormFields.max("objectId").intValue() + 1 : 1;
    }

    public boolean isCollapsedState() {
        return collapsedState;
    }

    public void setCollapsedState(boolean collapsedState) {
        this.collapsedState = collapsedState;
    }

    public int getAutoFillCategoryAction() {
        return autoFillCategoryAction;
    }

    public void setAutoFillCategoryAction(int autoFillCategoryAction) {
        this.autoFillCategoryAction = autoFillCategoryAction;
    }

    public String getAutoFillCategoryId() {
        return autoFillCategoryId;
    }

    public void setAutoFillCategoryId(String autoFillCategoryId) {
        this.autoFillCategoryId = autoFillCategoryId;
    }

    public int getAutoFillType() {
        return autoFillType;
    }

    public void setAutoFillType(int autoFillType) {
        this.autoFillType = autoFillType;
    }

    public boolean isLabelBold() {
        return labelBold;
    }

    public void setLabelBold(boolean labelBold) {
        this.labelBold = labelBold;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getCodeTypeId() {
        return codeTypeId;
    }

    public void setCodeTypeId(String codeTypeId) {
        this.codeTypeId = codeTypeId;
    }

    public RealmList<FormFieldValidValues> getFormFieldValidValues() {
        return formFieldValidValues;
    }

    public void setFormFieldValidValues(RealmList<FormFieldValidValues> formFieldValidValues) {
        this.formFieldValidValues = formFieldValidValues;
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

    public boolean isNewLine() {
        return newLine;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public int getFormFieldId() {
        return formFieldId;
    }

    public void setFormFieldId(int formFieldId) {
        this.formFieldId = formFieldId;
    }

    public String getFormFieldKeyIn() {
        return formFieldKeyIn;
    }

    public void setFormFieldKeyIn(String formFieldKeyIn) {
        this.formFieldKeyIn = formFieldKeyIn;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public void setIsRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }

    public double getLeftPadding() {
        return leftPadding;
    }

    public void setLeftPadding(double leftPadding) {
        this.leftPadding = leftPadding;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public boolean getNewLine() {
        return newLine;
    }

    public void setNewLine(boolean newLine) {
        this.newLine = newLine;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public RealmList<Query> getFormFieldKeysIn() {
        return formFieldKeysIn;
    }

    public void setFormFieldKeysIn(RealmList<Query> formFieldKeysIn) {
        this.formFieldKeysIn = formFieldKeysIn;
    }

    public RealmList<Query> getFormFieldKeysOut() {
        return formFieldKeysOut;
    }

    public void setFormFieldKeysOut(RealmList<Query> formFieldKeysOut) {
        this.formFieldKeysOut = formFieldKeysOut;
    }

    public RealmList<RuleContainer> getRuleContainers() {
        return ruleContainers;
    }

    public void setRuleContainers(RealmList<RuleContainer> ruleContainers) {
        this.ruleContainers = ruleContainers;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
