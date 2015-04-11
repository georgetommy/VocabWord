package com.vocabworld.danigabi.datastructure;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Gabrielle on 11-Apr-15.
 */
@DatabaseTable(tableName = "wordlanguages")
public class WordLanguage {

    @DatabaseField(id = true, canBeNull = false, generatedId = true, allowGeneratedIdInsert = true)
    private int id;

    @DatabaseField
    private String shortName;

    @DatabaseField
    private String name;

    @DatabaseField
    private String image;

    public WordLanguage(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
