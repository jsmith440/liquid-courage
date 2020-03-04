package edu.cnm.deepdive.liquidcourage.viewmodel;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import edu.cnm.deepdive.liquidcourage.model.entity.App;
import edu.cnm.deepdive.liquidcourage.model.repository.LiquidCourageRepository;
import edu.cnm.deepdive.liquidcourage.service.LiquidCourageService;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MainViewModel extends ViewModel {
  // TODO: Implement the ViewModel
}
