package edu.cnm.deepdive.liquidcourage;

import android.app.Application;
import com.facebook.stetho.Stetho;
import edu.cnm.deepdive.liquidcourage.service.LiquidCourageDatabase;
import io.reactivex.schedulers.Schedulers;


public class LiquidCourageApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
    LiquidCourageDatabase.setContext(this);
    LiquidCourageDatabase.getInstance().getAppDao().delete()
        .subscribeOn(Schedulers.io())
        .subscribe();
  }
}
