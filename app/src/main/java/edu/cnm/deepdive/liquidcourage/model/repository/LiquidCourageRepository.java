package edu.cnm.deepdive.liquidcourage.model.repository;


import android.app.Application;
import androidx.lifecycle.LiveData;
import edu.cnm.deepdive.liquidcourage.model.entity.App;
import edu.cnm.deepdive.liquidcourage.service.LiquidCourageDatabase;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

public class LiquidCourageRepository {

  private final LiquidCourageDatabase database;

  public LiquidCourageRepository(Application application) {
    database = LiquidCourageDatabase.getInstance();
  }

  public LiveData<List<App>> getAllApps() {
    return database.getAppDao().select();
  }

  public Single<Long> insert(App app) {
    return database.getAppDao().insert(app)
        .subscribeOn(Schedulers.io());
  }

  public Single<Integer> delete(App app) {
    return database.getAppDao().delete(app)
        .subscribeOn(Schedulers.io());
  }

  public LiveData<App> findApp(String name) {
    return database.getAppDao().find(name);
  }

}

