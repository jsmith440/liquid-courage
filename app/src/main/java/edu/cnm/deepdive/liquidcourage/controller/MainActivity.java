package edu.cnm.deepdive.liquidcourage.controller;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import edu.cnm.deepdive.liquidcourage.R;
import edu.cnm.deepdive.liquidcourage.view.AppRecyclerAdapter;
import edu.cnm.deepdive.liquidcourage.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

/*
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
          .replace(R.id.container, MainFragment.newInstance())
          .commitNow();
    }
  }
*/

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    RecyclerView iconList = findViewById(R.id.icon_list);
    MainViewModel viewModel = new ViewModelProvider(this).get(MainViewModel.class);
    viewModel.getApps().observe(this, (apps) -> {
      AppRecyclerAdapter adapter = new AppRecyclerAdapter(this, apps);
      iconList.setAdapter(adapter);
    });
    viewModel.refreshApps();
  }



}
