package edu.cnm.deepdive.liquidcourage.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import edu.cnm.deepdive.liquidcourage.model.entity.Block;
import io.reactivex.Single;
import java.util.List;

@Dao
public interface BlockDao {

  @Insert
  Single<Long> insert(Block block);

  @Update
  Single<Integer> update(Block block);

  @Delete
  Single<Integer> delete(Block... blocks);

  @Query("SELECT * FROM Block ORDER BY start")
  LiveData<List<Block>> getAll();

  @Query("SELECT * FROM Block WHERE app_id = :appId")
  LiveData<List<Block>> getByApp(long appId);

}

