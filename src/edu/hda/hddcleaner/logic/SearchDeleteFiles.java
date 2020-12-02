package edu.hda.hddcleaner.logic;

import java.io.File;
import java.util.ArrayList;

public class SearchDeleteFiles {

    public ArrayList<File> searchFilesInDirectories(ArrayList<String> path_names, ArrayList<String> suffixes) {
    
        ArrayList<File> files_found = new ArrayList<File>();
        ArrayList<File> directories = new ArrayList<File>();
        for (int i = 0; i < path_names.size(); i++) {
            directories.add(new File(path_names.get(i)));
          System.out.print(path_names.get(i) + "hallohallohallo");
        }
        for (int i = 0; i < directories.size(); i++) {
            files_found.addAll(this.searchFilesInDirectory(directories.get(i), suffixes));
        }
        System.out.print(files_found);
        return files_found;
    }

    private ArrayList<File> searchFilesInDirectory(File directory, ArrayList<String> suffixes) {
        ArrayList<File> files_found = new ArrayList<File>();
        File[] dir_files = directory.listFiles();
        if (dir_files != null) {
            for (int i = 0; i < dir_files.length; i++) {
                if (dir_files[i].isDirectory()) {
                    files_found.addAll(searchFilesInDirectory(dir_files[i], suffixes));
                }
                for (int j = 0; j < suffixes.size(); j++) {
                    if (dir_files[i].getName().endsWith(suffixes.get(j))) {
                        files_found.add(dir_files[i]);
                    }
                }
            }
        }
        return files_found;
    }

public ArrayList<File> deleteFilesInDirectory(ArrayList<File> files_found){

       for(int i=0; i < files_found.size(); i++) {
           files_found.get(i).delete();
       
       }
       return files_found;
}
}