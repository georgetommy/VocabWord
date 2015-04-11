package com.vocabworld.danigabi.datastructure;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Gabrielle on 11-Apr-15.
 */
@DatabaseTable(tableName = "meanings")
public class Meaning {

    @DatabaseField(id = true, canBeNull = false, generatedId = true)
    private int id;

    @DatabaseField
    private String name;

    public Meaning(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
