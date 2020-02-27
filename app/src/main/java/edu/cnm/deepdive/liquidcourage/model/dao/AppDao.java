package edu.cnm.deepdive.liquidcourage.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import edu.cnm.deepdive.liquidcourage.model.entity.App;
import java.util.List;

@Dao
public interface AppDao {

  @Insert
  void insertApp (App apps);

  @Query("SELECT * FROM App")
  LiveData<List<App>> select();
}

