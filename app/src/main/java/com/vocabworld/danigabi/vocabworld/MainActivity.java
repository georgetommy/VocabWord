package com.vocabworld.danigabi.vocabworld;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.j256.ormlite.dao.DaoManager;

import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.vocabworld.danigabi.datastructure.Word;

import com.j256.ormlite.dao.Dao;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_WORD = "com.vocabworld.danigabi.vocabworld.WORD";

    private static Logger log = LoggerFactory.getLogger(MainActivity.class);

    public void searchWord(View view) throws Exception{
        System.out.println("coucou ");
        log.debug("coucou");
        Intent intent = new Intent(this,SearchResultActivity.class);
        EditText editText = (EditText)findViewById(R.id.search_word);
        String word = editText.getText().toString();
        intent.putExtra(EXTRA_WORD, word + " - " + testDatabase());
        startActivity(intent);
    }

    public String testDatabase() throws Exception{
//        ConnectionSource connectionSource = new JdbcConnectionSource("url");
//        Dao<Word, String> wordDao = DaoManager.createDao(connectionSource, Word.class);
//        TableUtils.createTable(connectionSource, Word.class);
//        Word word = new Word();
//        word.setId(0);
//        word.setText("coucou");
//        wordDao.create(word);
//
//        Word word2 = wordDao.queryForId("0");
//        connectionSource.close();
        return "testing";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
