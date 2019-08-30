
package com.zapatatechnology.dcgs.sdeimport.enhanced;

import java.util.Properties;

/**
 *
 * @author zapataai
 */
public class SDEImportProperties extends Properties{
        
   public static final String CGWIN = "cgwyn";
   public static final String DELETE_FILES = "deleteFiles";
   public static final String DRIVER_SDE = "driverSDE";
   public static final String IMPORT_COMMAND = "importCommand";
   public static final String IN_DIR = "inDir";
   public static final String KEY_FIELDS = "keyFields";
   public static final String LAYER_NAME = "layerName";
   public static final String MAIN_ID_COLUMN = "mainIDColumn";
   public static final String MIN_FILE_LATENCY = "minFileLatency";
   public static final String NUM_IMPORTS = "numImports";
   public static final String PASSWD_SDE = "passwdSDE";
   public static final String SDE_DATABASE = "SDEDatabase";
   public static final String SDE_HOST = "SDEHost";
   public static final String SDE_PORT = "SDEPort";
   public static final String SLEEP_TIME = "sleepTime";
   public static final String TABLE_NAME = "tableName";
   public static final String URL_SDE = "urlSDE";
   public static final String USER_SDE = "userSDE";

    public Properties getDefaults() {
        return defaults;
    }

    public void setDefaults(Properties defaults) {
        this.defaults = defaults;
    }
   
   
    
}
