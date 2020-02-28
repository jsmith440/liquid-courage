package edu.cnm.deepdive.liquidcourage.service;

import android.app.Application;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import edu.cnm.deepdive.liquidcourage.model.dao.AppDao;
import edu.cnm.deepdive.liquidcourage.model.dao.BlockDao;
import edu.cnm.deepdive.liquidcourage.model.entity.App;
import edu.cnm.deepdive.liquidcourage.model.entity.Block;
import edu.cnm.deepdive.liquidcourage.service.LiquidCourageDatabase.Converters;
import java.util.Date;

@Database(
    entities = {App.class, Block.class},
    version = 1,
    exportSchema = true
)
@TypeConverters(Converters.class)
public abstract class LiquidCourageDatabase extends RoomDatabase {

  private static final String DB_NAME = "LiquidCourageDatabase";

  private static Application context;

  public static void setContext(Application context) {
    LiquidCourageDatabase.context = context;
  }

  public static LiquidCourageDatabase getInstance() {
    return InstanceHolder.INSTANCE;
  }

  public abstract AppDao getAppDao();

  public abstract BlockDao getBlockDao();

  private static class InstanceHolder {

    private static final LiquidCourageDatabase INSTANCE = Room.databaseBuilder(
        context, LiquidCourageDatabase.class, DB_NAME)
        .build();

  }

  public static class Converters {

    @TypeConverter
    public static Long fromDate(Date date) {
      return (date != null) ? date.getTime() : null;
    }

    @TypeConverter
    public static Date fromLong(Long value) {
      return (value != null) ? new Date(value) : null;
    }

  }

}
