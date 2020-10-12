package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ArrayList<String> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources(); //  Arrays.asList(Types).indexOf(userString);
        movies = new ArrayList<String>(Arrays.asList(res.getStringArray(R.array.movieList)));
        textView = findViewById(R.id.Name);
    }

    public void Generate(View v) {
        if (movies.size() != 0) {
            int randId = (int) (Math.random() * movies.size());
            textView.setText(movies.get(randId));
            movies.remove(randId);
        }
        else textView.setText("There is no more movies to show");
    }
}