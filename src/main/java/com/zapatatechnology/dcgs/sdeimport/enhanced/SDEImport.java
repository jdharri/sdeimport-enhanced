package com.zapatatechnology.dcgs.sdeimport.enhanced;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zapataai
 */
public class SDEImport {

    public static void main(String[] args) {
        try {
            WatchService watchService = FileSystems.getDefault().newWatchService();
            Path path = Paths.get(writeFile("test"));
            path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY);
            WatchKey key;
            while ((key = watchService.take()) != null) {
                for (WatchEvent<?> event : key.pollEvents()) {
                    System.out.println(
                            "Event kind:" + event.kind()
                            + ". File affected: " + event.context() + ".");
                    if (event.kind().equals(StandardWatchEventKinds.ENTRY_CREATE)) {
                        System.out.println("new file created");
                    }
                }
                key.reset();
            }
        } catch (IOException ex) {
            Logger.getLogger(SDEImport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(SDEImport.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String writeFile(String value) throws IOException {
        String PATH = "/";
        String directoryName = "/incoming";
        String fileName = "sdeimport.properties";

        File directory = new File(directoryName);

        if (!directory.exists()) {
            directory.mkdir();
            // If you require it to make the entire directory path including parents,
            // use directory.mkdirs(); here instead.
        }

        File file = new File(directoryName + "/" + fileName);
        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            
            SDEImportProperties props = new SDEImportProperties();
            FileOutputStream out = new FileOutputStream(file);
            
            Field[] fields =  SDEImportProperties.class.getDeclaredFields();
            
            for(int i =0; i<fields.length;i++){
                System.out.println("key: "+fields[i].getName());
                String fieldName = fields[i].getName();
                props.setProperty(fieldName, "");
        }
           props.store(out, fileName);
           // bw.write(value);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        return file.getParent();
    }
    /**
     * public static synchronized String importProcess(String input) {
     * ProcessBuilder pb = new ProcessBuilder("echo " + input);
     *
     * pb.redirectErrorStream(true); Process p = pb.start(); }
     *
     * String prefix = "";
     *
     * if(props.getUsingCYGWIN() == true){ prefix = "cmd,/c,": }
     *
     * String searchFields = ""; String operations = ""; if(deleteFile
     *
     *
     * ){ searchFields = props.getMainIdColumn(this.i); operations = "delete"; }
     *
     *
     * else { searchFields = props.getKeyFields(this.i); operations =
     * "update_else_insert"; } final String pbCommands = prefix +
     * props.getImportedCommand() + ",-o," + operations + ",-t," +
     * props.getTable(this.i) + f.getAbsolutePath() + sdeHost + ",-u," +
     * props.getUser(this.i) + ",-p," + props.getPasswd(this.i) + ",-K," +
     * searchFields;
     *
     * final ProcessBuilder pb = new ProcessBuilder(pbCommands.split(","));
     *
     * pb.redirectErrorStream (
     *
     * true); final Process p = pb.start(); final java.io.InputStream expout =
     * p.getInputStream(); final int exitcode = p.waitFor(); if(expout
     *
     *
     * != null) { final byte[] buf = new byte[512]; int len = 0; while ((len =
     * expout.read(buf)) >= 0) { //log } if ((exitcode == 0) || (exitcode ==
     * 134)) { if (!this.haveAllFiles(f, true)) { continue; } } else { //log }
     * Thread.sleep(1000);
     *
     *
     *
     *
     *
     *
     * private boolean haveAllFiles(final File FileName, final Boolean
     * deleteFiles) { final File dir = new File(props.getInDir(this.i)); if
     * ((dir == null) || !dir.exists() || !dir.isDirectory()) { //log } else {
     * File[] files = null; files = dir.listFiles();
     *
     * if ((files != null) && (files.length > 0)) { //log final
     * FilePriorityQueue fileQueue = new FilePriorityQueue(files.length);
     *
     * for (final File f : files) { fileQueue.offer(f); }
     *
     * this.FoundFilesArray = new ArayList<File>(); int numFiles = 0; int
     * currentFileNum = 0; int counter = 0;
     *
     * while (!fileQueue.isEmpty()) { final File f = fileQueue.poll();
     *
     * if (!f.isFile()) { continue; } //log
     *
     * String getFileName = FileNme.getName(); getFileName =
     * getFileName.substring(0, getFileName.length() - 3); final int FoundFile =
     * f.getName().indexOf(getFileName); final String currentFileName =
     * f.getName();
     *
     * if ((FoundFile != -1)) { try { currentFileNum = Integer.parseInt } } }
     *
     * }
     *
     */

}
