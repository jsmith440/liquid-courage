package edu.cnm.deepdive.liquidcourage.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import edu.cnm.deepdive.liquidcourage.model.entity.App;
import io.reactivex.Single;
import java.util.List;

@Dao
public interface AppDao {

  @Insert
  Single<Long> insert(App app);

  @Delete
  Single<Integer> delete(App... apps);

  @Query("SELECT * FROM App")
  LiveData<List<App>> select();

  @Query("SELECT * FROM App WHERE app_name = :name")
  LiveData<App> find(String name);

}

