package com.yukaiwen.flaborfit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        LinearLayout mainBG = (LinearLayout) findViewById(R.id.mainBG);
        TextView exerciseText = (TextView) findViewById(R.id.exerciseTitle);
        ImageView exerciseImage = (ImageView) findViewById(R.id.exerciseImage);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciseText.setText(exerciseTitle);

        if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight3x, getApplicationContext().getTheme()));
        }else if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus3x, getApplicationContext().getTheme()));
        }else {
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart3x, getApplicationContext().getTheme()));
        }
    }
}
