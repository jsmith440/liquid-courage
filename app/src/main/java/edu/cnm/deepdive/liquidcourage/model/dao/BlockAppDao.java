package edu.cnm.deepdive.liquidcourage.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import edu.cnm.deepdive.liquidcourage.model.entity.BlockApp;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface BlockAppDao {

  @Insert
  Single<Long> insert(BlockApp blockApp);

  @Update
  int update(BlockApp blockApps);

  @Delete
  int delete(BlockApp... blockApps);

  @Query("SELECT * FROM BlockApp WHERE block_app = :id")
  Single<BlockApp> select(long id);

}

