package edu.cnm.deepdive.liquidcourage.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
    indices = @Index(value = "app_name", unique = true)
)

public class App{

  @ColumnInfo(name = "app_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @NonNull
  @ColumnInfo(name = "app_name")
  private String appName;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appname) {
    this.appName = appName;
  }

}





