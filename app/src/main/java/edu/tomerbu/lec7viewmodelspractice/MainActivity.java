package edu.tomerbu.lec7viewmodelspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.tomerbu.lec7viewmodelspractice.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}
