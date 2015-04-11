package com.vocabworld.danigabi.datastructure;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Gabrielle on 11-Apr-15.
 */
@DatabaseTable(tableName = "words")
public class Word {

    @DatabaseField(id = true, canBeNull = false, generatedId = true, allowGeneratedIdInsert = true)
    private int id;

    @DatabaseField
    private int languageId;

    @DatabaseField
    private int meaningId;

    //word_text_idx
    @DatabaseField(index=true)
    private String text;

    @DatabaseField
    private String timeDeleted;

    @DatabaseField
    private String timeCreated;

    @DatabaseField
    private String timeUpdated;

    public Word(){

    }

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
