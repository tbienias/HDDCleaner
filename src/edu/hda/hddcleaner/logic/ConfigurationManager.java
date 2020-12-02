package edu.hda.hddcleaner.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class ConfigurationManager {

    private ArrayList<Profile> profiles;
    public Profile current_profile;

    public ConfigurationManager() {
        this.profiles = new ArrayList<Profile>();
        this.setProfiles(this.readConfigFiles());
    }

    private ArrayList<Properties> readConfigFiles() {
        ArrayList<Properties> properties = new ArrayList<Properties>();
        File[] dir_files = (new File(".")).listFiles();
        Properties p;

        if (dir_files != null) {
            for (int i = 0; i < dir_files.length; i++) {
                if (!dir_files[i].isDirectory() && dir_files[i].getName().endsWith(".profile")) {
                    p = new Properties();
                    try {
                        p.load(new FileInputStream(dir_files[i]));
                    } catch (IOException e) {
                    }
                    properties.add(p);
                }
            }
        }
        return properties;
    }

    public void writeConfigFiles() {
        Properties p;
        for (int i = 0; i < this.profiles.size(); i++) {
            this.setCurrentProfile(i);
            p = this.current_profile.toProperties();
            try {
            p.store(new FileOutputStream(this.current_profile.getProfileName() + ".profile"), "Profile data for profile: " + this.current_profile.getProfileName());
            } catch (IOException e) {
            }
        }
    }

    private void setProfiles(ArrayList<Properties> properties) {
        for (int i = 0; i < properties.size(); i++) {
            this.profiles.add(new Profile(properties.get(i)));
        }
    }

    public void setCurrentProfile(String name) {
        for (int i = 0; i < this.profiles.size(); i++) {
            if (name.compareTo(this.profiles.get(i).getProfileName()) == 0) {
                this.current_profile = this.profiles.get(i);
            }
        }
    }

    public void setCurrentProfile(int index) {
        this.current_profile = this.profiles.get(index);
    }
}
