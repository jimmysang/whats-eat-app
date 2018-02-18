package main.model;


import java.util.List;
import java.util.Set;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private List<Setting> settings;
    private int currentSetting;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Setting> getSettings() {
        return settings;
    }

    public void setSettings(List<Setting> settings) {
        this.settings = settings;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCurrentSetting() {
        return currentSetting;
    }

    public void setCurrentSetting(int currentSetting) {
        this.currentSetting = currentSetting;
    }
}