package edu.cnm.deepdive.liquidcourage.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.util.Date;

@Entity(
    foreignKeys = @ForeignKey(
        entity = App.class,
        parentColumns = "app_id",
        childColumns = "blockApp_id",
        onDelete = ForeignKey.CASCADE
    )
)
public class BlockApp {

  @NonNull
  @ColumnInfo(name = "blockApp_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @NonNull
  @ColumnInfo(name = "app_name")
  private String appName;

  @NonNull
  @ColumnInfo
  private Date start = new Date();

  @ColumnInfo
  private Date end = new Date();


  // @ColumnInfo(index = true)
  // No name needed when we wanted to use the actual method name as a column name.
  // private boolean success;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @NonNull
  public String getAppName() {
    return appName;
  }

  public void setAppName(@NonNull String appName) {
    this.appName = appName;
  }

  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

//  public Enum getMethod() {
//    return method;
//  }
//
//  public void setMethod(Enum method) {
//    this.method = method;
//  }


}
