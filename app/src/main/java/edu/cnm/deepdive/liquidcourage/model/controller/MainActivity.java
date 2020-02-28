package edu.cnm.deepdive.liquidcourage.model.controller;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import edu.cnm.deepdive.liquidcourage.R;

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
