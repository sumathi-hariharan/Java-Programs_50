package java50;

import java.io.File;

public class FileListInFolder {
    
    public void listFilesAndFolders(String CIF){
        File directory = new File(CIF);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            System.out.println(file.getName());
        }
    }
}

	