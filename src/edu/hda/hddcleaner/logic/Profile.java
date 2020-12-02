package edu.hda.hddcleaner.logic;

import java.util.ArrayList;
import java.util.Properties;

public class Profile {

    private String profile_name;
    private ArrayList<String> saved_paths;
    private ArrayList<String> saved_suffixes;

    public Profile(Properties p) {
        this.profile_name = p.getProperty("profile.name");
        this.saved_paths = new ArrayList<String>();
        this.saved_suffixes = new ArrayList<String>();
        this.setPaths(p);
        this.setSuffixes(p);
    }

    public String getProfileName() {
        return this.profile_name;
    }

    public void setProfileName(String name) {
        this.profile_name = name;
    }

    private void setPaths(Properties p) {
        Integer i = new Integer(0);
        while (p.getProperty("paths." + i.toString()) != null) {
            saved_paths.add(p.getProperty("paths." + i.toString()));
            i++;
        }
    }

    public void addPath(String path) {
        this.saved_paths.add(path);
    }

    public void deletePath(String path) {
        this.saved_paths.remove(path);
    }

    private void setSuffixes(Properties p) {
        Integer i = new Integer(0);
        while (p.getProperty("suffixes." + i.toString()) != null) {
            saved_suffixes.add(p.getProperty("suffixes." + i.toString()));
            i++;
        }
    }

    public void addSuffix(String suffix) {
        this.saved_suffixes.add(suffix);
    }

    public void deleteSuffix(String suffix) {
        this.saved_suffixes.remove(suffix);
    }

    public Properties toProperties() {
        Properties profile_properties = new Properties();
        profile_properties.setProperty("profile.name", this.getProfileName());
        for (int i = 0; i < this.saved_paths.size(); i++) {
            profile_properties.setProperty("paths." + i, this.saved_paths.get(i));
        }
        for (int i = 0; i < this.saved_suffixes.size(); i++) {
            profile_properties.setProperty("suffixes." + i, this.saved_suffixes.get(i));
        }
        return profile_properties;
    }
}
