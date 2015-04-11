package com.vocabworld.danigabi.datastructure;

/**
 * Created by Gabrielle on 11-Apr-15.
 */
public class Word {

    private int id;

    private int languageId;

    private int meaningId;

    private String text;

    private String timeDeleted;

    private String timeCreated;

    private String timeUpdated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getMeaningId() {
        return meaningId;
    }

    public void setMeaningId(int meaningId) {
        this.meaningId = meaningId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTimeDeleted() {
        return timeDeleted;
    }

    public void setTimeDeleted(String timeDeleted) {
        this.timeDeleted = timeDeleted;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getTimeUpdated() {
        return timeUpdated;
    }

    public void setTimeUpdated(String timeUpdated) {
        this.timeUpdated = timeUpdated;
    }


}
