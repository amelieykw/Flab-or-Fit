package com.yukaiwen.flaborfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_TITLE = "extra.item.title";
    public static final String EXERCISE_WEIGHTS = "Weight lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightBtn = (RelativeLayout) findViewById(R.id.weightBtn);
        RelativeLayout yogaBtn = (RelativeLayout) findViewById(R.id.yogaBtn);
        RelativeLayout cardioBtn = (RelativeLayout) findViewById(R.id.cardioBtn);

        weightBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                launchDetailActivity(MainActivity.EXERCISE_WEIGHTS);
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                launchDetailActivity(MainActivity.EXERCISE_YOGA);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                launchDetailActivity(MainActivity.EXERCISE_CARDIO);
            }
        });
    }

    private void launchDetailActivity(String exerciseTitle) {
//        to tell the activity manager that it's MainActivity which loads the DetailsActivity
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
//        to tell the activity manager to fetch the value exerciseTitle and then store it into the keyname EXTRA_ITEM_TITLE
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        startActivity(intent);
    }
}
