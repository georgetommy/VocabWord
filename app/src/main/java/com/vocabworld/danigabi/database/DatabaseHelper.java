package com.vocabworld.danigabi.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;

/**
 * Created by Gabrielle on 11-Apr-15.
 */
import java.sql.SQLException;

import android.util.Log;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.table.TableUtils;
import com.vocabworld.danigabi.datastructure.Word;
import com.vocabworld.danigabi.vocabworld.R;
import com.vocabworld.danigabi.vocabworld.Thing;


/**
 * Helper class which creates/updates our database and provides the DAOs.
 *
 * @author kevingalligan
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "notify.db";
    private static final int DATABASE_VERSION = 4;
    private final String LOG_NAME = getClass().getName();

    private Dao<Thing, Integer> thingDao;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Thing.class);
        } catch (SQLException e) {
            Log.e(LOG_NAME, "Could not create new table for Thing", e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int oldVersion,
                          int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, Thing.class, true);
            onCreate(sqLiteDatabase, connectionSource);
        } catch (SQLException e) {
            Log.e(LOG_NAME, "Could not upgrade the table for Thing", e);
        }
    }

    public Dao<Thing, Integer> getThingDao() throws SQLException {
        if (thingDao == null) {
            thingDao = getDao(Thing.class);
        }
        return thingDao;
    }
}

///**
// * Database helper class used to manage the creation and upgrading of your database. This class also usually provides
// * the DAOs used by the other classes.
// */
//public class DatabaseHelper extends OrmLiteSqliteOpenHelper {
//
//    // name of the database file for your application -- change to something appropriate for your app
//    private static final String DATABASE_NAME = "helloAndroid.db";
//    // any time you make changes to your database objects, you may have to increase the database version
//    private static final int DATABASE_VERSION = 1;
//
//    // the DAO object we use to access the SimpleData table
//    private Dao<Word, Integer> wordDao = null;
//    private RuntimeExceptionDao<Word, Integer> simpleRuntimeDao = null;
//
//    public DatabaseHelper(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION); //, R.raw.ormlite_config
//    }
//
//    /**
//     * This is called when the database is first created. Usually you should call
//     * createTable statements here to create
//     * the tables that will store your data.
//     */
//    @Override
//    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
//        try {
//            System.out.println("onCreate of database helper");
//            TableUtils.createTable(connectionSource, Word.class);
//        } catch (SQLException e) {
//            Log.e(DatabaseHelper.class.getName(), "Can't create database", e);
//            throw new RuntimeException(e);
//        }
//
//        // here we try inserting data in the on-create as a test
//        RuntimeExceptionDao<Word, Integer> dao = getSimpleRuntimeDao();
//        long millis = System.currentTimeMillis();
//        // create some entries in the onCreate
//        Word word = new Word();
//        word.setText(String.valueOf(millis));
//        dao.create(word);
//        word = new Word();
//        word.setText(String.valueOf(millis + 1));
//        dao.create(word);
//        System.out.println( "created new entries in onCreate: " + millis);
//    }
//
//    /**
//     * This is called when your application is upgraded and it has a higher version number.
//     * This allows you to adjust
//     * the various data to match the new version number.
//     */
//    @Override
//    public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
//        try {
//            Log.i(DatabaseHelper.class.getName(), "onUpgrade");
//            TableUtils.dropTable(connectionSource, Word.class, true);
//            // after we drop the old databases, we create the new ones
//            onCreate(db, connectionSource);
//        } catch (SQLException e) {
//            Log.e(DatabaseHelper.class.getName(), "Can't drop databases", e);
//            throw new RuntimeException(e);
//        }
//    }
//
//    /**
//     * Returns the Database Access Object (DAO) for our SimpleData class. It will create it or just give the cached
//     * value.
//     */
//    public Dao<Word, Integer> getWordDao() throws SQLException {
//        if (wordDao == null) {
//            wordDao = getDao(Word.class);
//        }
//        return wordDao;
//    }
//
//    /**
//     * Returns the RuntimeExceptionDao (Database Access Object) version of a Dao for our SimpleData class. It will
//     * create it or just give the cached value. RuntimeExceptionDao only through RuntimeExceptions.
//     */
//    public RuntimeExceptionDao<Word, Integer> getSimpleRuntimeDao() {
//        if (simpleRuntimeDao == null) {
//            simpleRuntimeDao = getRuntimeExceptionDao(Word.class);
//        }
//        return simpleRuntimeDao;
//    }
//
//    /**
//     * Close the database connections and clear any cached DAOs.
//     */
//    @Override
//    public void close() {
//        super.close();
//        wordDao = null;
//        simpleRuntimeDao = null;
//    }
//}