package com.vocabworld.danigabi.vocabworld;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import com.vocabworld.danigabi.database.DatabaseHelper;
import com.vocabworld.danigabi.datastructure.Word;

import java.sql.SQLException;
import java.util.List;


public class SearchResultActivity extends OrmLiteBaseActivity<DatabaseHelper> {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_search_result);

        Intent intent = getIntent();
        String word = intent.getStringExtra(MainActivity.EXTRA_WORD);

        TextView textView = new TextView(this);



        List<Word> words;
      //  try {
       //     words = getHelper().getWordDao().queryForAll();
       // }catch(SQLException e){
      //      throw new RuntimeException("nope",e);
      //  }
        int count = -1;
      //  if(words != null){
     //       count = words.size();
     //   }
        textView.setText("No result found for \"" + word + "\" \nFound " + count + " words in DB");

        setContentView(textView);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search_result, menu);
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
