package com.zapatatechnology.dcgs.sdeimport.enhanced;

import java.util.Properties;

/**
 *
 * @author zapataai
 */
public class SDEImportProperties extends Properties {

    public String CGWIN = "cgwyn";
    public String DELETE_FILES = "deleteFiles";
    public String DRIVER_SDE = "driverSDE";
    public String IMPORT_COMMAND = "importCommand";
    public String IN_DIR = "inDir";
    public String KEY_FIELDS = "keyFields";
    public String LAYER_NAME = "layerName";
    public String MAIN_ID_COLUMN = "mainIDColumn";
    public String MIN_FILE_LATENCY = "minFileLatency";
    public String NUM_IMPORTS = "numImports";
    public String PASSWD_SDE = "passwdSDE";
    public String SDE_DATABASE = "SDEDatabase";
    public String SDE_HOST = "SDEHost";
    public String SDE_PORT = "SDEPort";
    public String SLEEP_TIME = "sleepTime";
    public String TABLE_NAME = "tableName";
    public String URL_SDE = "urlSDE";
    public String USER_SDE = "userSDE";

    public Properties getDefaults() {
        return defaults;
    }

    public void setDefaults(Properties defaults) {
        this.defaults = defaults;
    }

    public String getCGWIN() {
        return CGWIN;
    }

    public void setCGWIN(String CGWIN) {
        this.CGWIN = CGWIN;
    }

    public String getDELETE_FILES() {
        return DELETE_FILES;
    }

    public void setDELETE_FILES(String DELETE_FILES) {
        this.DELETE_FILES = DELETE_FILES;
    }

    public String getDRIVER_SDE() {
        return DRIVER_SDE;
    }

    public void setDRIVER_SDE(String DRIVER_SDE) {
        this.DRIVER_SDE = DRIVER_SDE;
    }

    public String getIMPORT_COMMAND() {
        return IMPORT_COMMAND;
    }

    public void setIMPORT_COMMAND(String IMPORT_COMMAND) {
        this.IMPORT_COMMAND = IMPORT_COMMAND;
    }

    public String getIN_DIR() {
        return IN_DIR;
    }

    public void setIN_DIR(String IN_DIR) {
        this.IN_DIR = IN_DIR;
    }

    public String getKEY_FIELDS() {
        return KEY_FIELDS;
    }

    public void setKEY_FIELDS(String KEY_FIELDS) {
        this.KEY_FIELDS = KEY_FIELDS;
    }

    public String getLAYER_NAME() {
        return LAYER_NAME;
    }

    public void setLAYER_NAME(String LAYER_NAME) {
        this.LAYER_NAME = LAYER_NAME;
    }

    public String getMAIN_ID_COLUMN() {
        return MAIN_ID_COLUMN;
    }

    public void setMAIN_ID_COLUMN(String MAIN_ID_COLUMN) {
        this.MAIN_ID_COLUMN = MAIN_ID_COLUMN;
    }

    public String getMIN_FILE_LATENCY() {
        return MIN_FILE_LATENCY;
    }

    public void setMIN_FILE_LATENCY(String MIN_FILE_LATENCY) {
        this.MIN_FILE_LATENCY = MIN_FILE_LATENCY;
    }

    public String getNUM_IMPORTS() {
        return NUM_IMPORTS;
    }

    public void setNUM_IMPORTS(String NUM_IMPORTS) {
        this.NUM_IMPORTS = NUM_IMPORTS;
    }

    public String getPASSWD_SDE() {
        return PASSWD_SDE;
    }

    public void setPASSWD_SDE(String PASSWD_SDE) {
        this.PASSWD_SDE = PASSWD_SDE;
    }

    public String getSDE_DATABASE() {
        return SDE_DATABASE;
    }

    public void setSDE_DATABASE(String SDE_DATABASE) {
        this.SDE_DATABASE = SDE_DATABASE;
    }

    public String getSDE_HOST() {
        return SDE_HOST;
    }

    public void setSDE_HOST(String SDE_HOST) {
        this.SDE_HOST = SDE_HOST;
    }

    public String getSDE_PORT() {
        return SDE_PORT;
    }

    public void setSDE_PORT(String SDE_PORT) {
        this.SDE_PORT = SDE_PORT;
    }

    public String getSLEEP_TIME() {
        return SLEEP_TIME;
    }

    public void setSLEEP_TIME(String SLEEP_TIME) {
        this.SLEEP_TIME = SLEEP_TIME;
    }

    public String getTABLE_NAME() {
        return TABLE_NAME;
    }

    public void setTABLE_NAME(String TABLE_NAME) {
        this.TABLE_NAME = TABLE_NAME;
    }

    public String getURL_SDE() {
        return URL_SDE;
    }

    public void setURL_SDE(String URL_SDE) {
        this.URL_SDE = URL_SDE;
    }

    public String getUSER_SDE() {
        return USER_SDE;
    }

    public void setUSER_SDE(String USER_SDE) {
        this.USER_SDE = USER_SDE;
    }

}
