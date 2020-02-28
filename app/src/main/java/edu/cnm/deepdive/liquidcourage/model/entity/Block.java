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
        childColumns = "app_id",
        onDelete = ForeignKey.CASCADE
    )
)
public class Block {

  @ColumnInfo(name = "block_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo(name = "app_id", index = true)
  private long appId;

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

  public long getAppId() {
    return appId;
  }

  public void setAppId(long appId) {
    this.appId = appId;
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
