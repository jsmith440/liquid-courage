package edu.cnm.deepdive.liquidcourage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import edu.cnm.deepdive.liquidcourage.service.LiquidCourageDatabase;
import edu.cnm.deepdive.liquidcourage.service.LiquidCourageDatabase_Impl;
import edu.cnm.deepdive.liquidcourage.ui.main.MainFragment;

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
    LiquidCourageDatabase_Impl.setContext(this.getApplication());
    //ApodRepository.setContext(this);
  }
}
