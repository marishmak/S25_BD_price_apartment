// ORM class for table 'real_estate'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Apr 27 17:55:39 MSK 2025
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class real_estate extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("price", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.price = (Integer)value;
      }
    });
    setters.put("date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.date = (String)value;
      }
    });
    setters.put("time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.time = (String)value;
      }
    });
    setters.put("geo_lat", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.geo_lat = (Double)value;
      }
    });
    setters.put("geo_lon", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.geo_lon = (Double)value;
      }
    });
    setters.put("region", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.region = (Integer)value;
      }
    });
    setters.put("building_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.building_type = (Integer)value;
      }
    });
    setters.put("level", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.level = (Integer)value;
      }
    });
    setters.put("levels", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.levels = (Integer)value;
      }
    });
    setters.put("rooms", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.rooms = (Integer)value;
      }
    });
    setters.put("area", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.area = (Double)value;
      }
    });
    setters.put("kitchen_area", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.kitchen_area = (Double)value;
      }
    });
    setters.put("object_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        real_estate.this.object_type = (Integer)value;
      }
    });
  }
  public real_estate() {
    init0();
  }
  private Integer price;
  public Integer get_price() {
    return price;
  }
  public void set_price(Integer price) {
    this.price = price;
  }
  public real_estate with_price(Integer price) {
    this.price = price;
    return this;
  }
  private String date;
  public String get_date() {
    return date;
  }
  public void set_date(String date) {
    this.date = date;
  }
  public real_estate with_date(String date) {
    this.date = date;
    return this;
  }
  private String time;
  public String get_time() {
    return time;
  }
  public void set_time(String time) {
    this.time = time;
  }
  public real_estate with_time(String time) {
    this.time = time;
    return this;
  }
  private Double geo_lat;
  public Double get_geo_lat() {
    return geo_lat;
  }
  public void set_geo_lat(Double geo_lat) {
    this.geo_lat = geo_lat;
  }
  public real_estate with_geo_lat(Double geo_lat) {
    this.geo_lat = geo_lat;
    return this;
  }
  private Double geo_lon;
  public Double get_geo_lon() {
    return geo_lon;
  }
  public void set_geo_lon(Double geo_lon) {
    this.geo_lon = geo_lon;
  }
  public real_estate with_geo_lon(Double geo_lon) {
    this.geo_lon = geo_lon;
    return this;
  }
  private Integer region;
  public Integer get_region() {
    return region;
  }
  public void set_region(Integer region) {
    this.region = region;
  }
  public real_estate with_region(Integer region) {
    this.region = region;
    return this;
  }
  private Integer building_type;
  public Integer get_building_type() {
    return building_type;
  }
  public void set_building_type(Integer building_type) {
    this.building_type = building_type;
  }
  public real_estate with_building_type(Integer building_type) {
    this.building_type = building_type;
    return this;
  }
  private Integer level;
  public Integer get_level() {
    return level;
  }
  public void set_level(Integer level) {
    this.level = level;
  }
  public real_estate with_level(Integer level) {
    this.level = level;
    return this;
  }
  private Integer levels;
  public Integer get_levels() {
    return levels;
  }
  public void set_levels(Integer levels) {
    this.levels = levels;
  }
  public real_estate with_levels(Integer levels) {
    this.levels = levels;
    return this;
  }
  private Integer rooms;
  public Integer get_rooms() {
    return rooms;
  }
  public void set_rooms(Integer rooms) {
    this.rooms = rooms;
  }
  public real_estate with_rooms(Integer rooms) {
    this.rooms = rooms;
    return this;
  }
  private Double area;
  public Double get_area() {
    return area;
  }
  public void set_area(Double area) {
    this.area = area;
  }
  public real_estate with_area(Double area) {
    this.area = area;
    return this;
  }
  private Double kitchen_area;
  public Double get_kitchen_area() {
    return kitchen_area;
  }
  public void set_kitchen_area(Double kitchen_area) {
    this.kitchen_area = kitchen_area;
  }
  public real_estate with_kitchen_area(Double kitchen_area) {
    this.kitchen_area = kitchen_area;
    return this;
  }
  private Integer object_type;
  public Integer get_object_type() {
    return object_type;
  }
  public void set_object_type(Integer object_type) {
    this.object_type = object_type;
  }
  public real_estate with_object_type(Integer object_type) {
    this.object_type = object_type;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof real_estate)) {
      return false;
    }
    real_estate that = (real_estate) o;
    boolean equal = true;
    equal = equal && (this.price == null ? that.price == null : this.price.equals(that.price));
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.time == null ? that.time == null : this.time.equals(that.time));
    equal = equal && (this.geo_lat == null ? that.geo_lat == null : this.geo_lat.equals(that.geo_lat));
    equal = equal && (this.geo_lon == null ? that.geo_lon == null : this.geo_lon.equals(that.geo_lon));
    equal = equal && (this.region == null ? that.region == null : this.region.equals(that.region));
    equal = equal && (this.building_type == null ? that.building_type == null : this.building_type.equals(that.building_type));
    equal = equal && (this.level == null ? that.level == null : this.level.equals(that.level));
    equal = equal && (this.levels == null ? that.levels == null : this.levels.equals(that.levels));
    equal = equal && (this.rooms == null ? that.rooms == null : this.rooms.equals(that.rooms));
    equal = equal && (this.area == null ? that.area == null : this.area.equals(that.area));
    equal = equal && (this.kitchen_area == null ? that.kitchen_area == null : this.kitchen_area.equals(that.kitchen_area));
    equal = equal && (this.object_type == null ? that.object_type == null : this.object_type.equals(that.object_type));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof real_estate)) {
      return false;
    }
    real_estate that = (real_estate) o;
    boolean equal = true;
    equal = equal && (this.price == null ? that.price == null : this.price.equals(that.price));
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.time == null ? that.time == null : this.time.equals(that.time));
    equal = equal && (this.geo_lat == null ? that.geo_lat == null : this.geo_lat.equals(that.geo_lat));
    equal = equal && (this.geo_lon == null ? that.geo_lon == null : this.geo_lon.equals(that.geo_lon));
    equal = equal && (this.region == null ? that.region == null : this.region.equals(that.region));
    equal = equal && (this.building_type == null ? that.building_type == null : this.building_type.equals(that.building_type));
    equal = equal && (this.level == null ? that.level == null : this.level.equals(that.level));
    equal = equal && (this.levels == null ? that.levels == null : this.levels.equals(that.levels));
    equal = equal && (this.rooms == null ? that.rooms == null : this.rooms.equals(that.rooms));
    equal = equal && (this.area == null ? that.area == null : this.area.equals(that.area));
    equal = equal && (this.kitchen_area == null ? that.kitchen_area == null : this.kitchen_area.equals(that.kitchen_area));
    equal = equal && (this.object_type == null ? that.object_type == null : this.object_type.equals(that.object_type));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.price = JdbcWritableBridge.readInteger(1, __dbResults);
    this.date = JdbcWritableBridge.readString(2, __dbResults);
    this.time = JdbcWritableBridge.readString(3, __dbResults);
    this.geo_lat = JdbcWritableBridge.readDouble(4, __dbResults);
    this.geo_lon = JdbcWritableBridge.readDouble(5, __dbResults);
    this.region = JdbcWritableBridge.readInteger(6, __dbResults);
    this.building_type = JdbcWritableBridge.readInteger(7, __dbResults);
    this.level = JdbcWritableBridge.readInteger(8, __dbResults);
    this.levels = JdbcWritableBridge.readInteger(9, __dbResults);
    this.rooms = JdbcWritableBridge.readInteger(10, __dbResults);
    this.area = JdbcWritableBridge.readDouble(11, __dbResults);
    this.kitchen_area = JdbcWritableBridge.readDouble(12, __dbResults);
    this.object_type = JdbcWritableBridge.readInteger(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.price = JdbcWritableBridge.readInteger(1, __dbResults);
    this.date = JdbcWritableBridge.readString(2, __dbResults);
    this.time = JdbcWritableBridge.readString(3, __dbResults);
    this.geo_lat = JdbcWritableBridge.readDouble(4, __dbResults);
    this.geo_lon = JdbcWritableBridge.readDouble(5, __dbResults);
    this.region = JdbcWritableBridge.readInteger(6, __dbResults);
    this.building_type = JdbcWritableBridge.readInteger(7, __dbResults);
    this.level = JdbcWritableBridge.readInteger(8, __dbResults);
    this.levels = JdbcWritableBridge.readInteger(9, __dbResults);
    this.rooms = JdbcWritableBridge.readInteger(10, __dbResults);
    this.area = JdbcWritableBridge.readDouble(11, __dbResults);
    this.kitchen_area = JdbcWritableBridge.readDouble(12, __dbResults);
    this.object_type = JdbcWritableBridge.readInteger(13, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(price, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(date, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(time, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(geo_lat, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(geo_lon, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(region, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(building_type, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(level, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(levels, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(rooms, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(area, 11 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(kitchen_area, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(object_type, 13 + __off, 4, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(price, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(date, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(time, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(geo_lat, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(geo_lon, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(region, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(building_type, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(level, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(levels, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(rooms, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(area, 11 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(kitchen_area, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(object_type, 13 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.price = null;
    } else {
    this.price = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.date = null;
    } else {
    this.date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.time = null;
    } else {
    this.time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.geo_lat = null;
    } else {
    this.geo_lat = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.geo_lon = null;
    } else {
    this.geo_lon = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.region = null;
    } else {
    this.region = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.building_type = null;
    } else {
    this.building_type = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.level = null;
    } else {
    this.level = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.levels = null;
    } else {
    this.levels = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.rooms = null;
    } else {
    this.rooms = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.area = null;
    } else {
    this.area = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.kitchen_area = null;
    } else {
    this.kitchen_area = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.object_type = null;
    } else {
    this.object_type = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.price);
    }
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date);
    }
    if (null == this.time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, time);
    }
    if (null == this.geo_lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.geo_lat);
    }
    if (null == this.geo_lon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.geo_lon);
    }
    if (null == this.region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.region);
    }
    if (null == this.building_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.building_type);
    }
    if (null == this.level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.level);
    }
    if (null == this.levels) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.levels);
    }
    if (null == this.rooms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.rooms);
    }
    if (null == this.area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.area);
    }
    if (null == this.kitchen_area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.kitchen_area);
    }
    if (null == this.object_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.object_type);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.price);
    }
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date);
    }
    if (null == this.time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, time);
    }
    if (null == this.geo_lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.geo_lat);
    }
    if (null == this.geo_lon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.geo_lon);
    }
    if (null == this.region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.region);
    }
    if (null == this.building_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.building_type);
    }
    if (null == this.level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.level);
    }
    if (null == this.levels) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.levels);
    }
    if (null == this.rooms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.rooms);
    }
    if (null == this.area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.area);
    }
    if (null == this.kitchen_area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.kitchen_area);
    }
    if (null == this.object_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.object_type);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(price==null?"null":"" + price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time==null?"null":time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geo_lat==null?"null":"" + geo_lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geo_lon==null?"null":"" + geo_lon, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region==null?"null":"" + region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(building_type==null?"null":"" + building_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(level==null?"null":"" + level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(levels==null?"null":"" + levels, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rooms==null?"null":"" + rooms, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area==null?"null":"" + area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(kitchen_area==null?"null":"" + kitchen_area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(object_type==null?"null":"" + object_type, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(price==null?"null":"" + price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time==null?"null":time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geo_lat==null?"null":"" + geo_lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(geo_lon==null?"null":"" + geo_lon, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region==null?"null":"" + region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(building_type==null?"null":"" + building_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(level==null?"null":"" + level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(levels==null?"null":"" + levels, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rooms==null?"null":"" + rooms, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area==null?"null":"" + area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(kitchen_area==null?"null":"" + kitchen_area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(object_type==null?"null":"" + object_type, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.price = null; } else {
      this.price = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date = null; } else {
      this.date = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.time = null; } else {
      this.time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.geo_lat = null; } else {
      this.geo_lat = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.geo_lon = null; } else {
      this.geo_lon = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.region = null; } else {
      this.region = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.building_type = null; } else {
      this.building_type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.level = null; } else {
      this.level = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.levels = null; } else {
      this.levels = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rooms = null; } else {
      this.rooms = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.area = null; } else {
      this.area = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.kitchen_area = null; } else {
      this.kitchen_area = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.object_type = null; } else {
      this.object_type = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.price = null; } else {
      this.price = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.date = null; } else {
      this.date = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.time = null; } else {
      this.time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.geo_lat = null; } else {
      this.geo_lat = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.geo_lon = null; } else {
      this.geo_lon = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.region = null; } else {
      this.region = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.building_type = null; } else {
      this.building_type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.level = null; } else {
      this.level = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.levels = null; } else {
      this.levels = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rooms = null; } else {
      this.rooms = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.area = null; } else {
      this.area = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.kitchen_area = null; } else {
      this.kitchen_area = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.object_type = null; } else {
      this.object_type = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    real_estate o = (real_estate) super.clone();
    return o;
  }

  public void clone0(real_estate o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("price", this.price);
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("time", this.time);
    __sqoop$field_map.put("geo_lat", this.geo_lat);
    __sqoop$field_map.put("geo_lon", this.geo_lon);
    __sqoop$field_map.put("region", this.region);
    __sqoop$field_map.put("building_type", this.building_type);
    __sqoop$field_map.put("level", this.level);
    __sqoop$field_map.put("levels", this.levels);
    __sqoop$field_map.put("rooms", this.rooms);
    __sqoop$field_map.put("area", this.area);
    __sqoop$field_map.put("kitchen_area", this.kitchen_area);
    __sqoop$field_map.put("object_type", this.object_type);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("price", this.price);
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("time", this.time);
    __sqoop$field_map.put("geo_lat", this.geo_lat);
    __sqoop$field_map.put("geo_lon", this.geo_lon);
    __sqoop$field_map.put("region", this.region);
    __sqoop$field_map.put("building_type", this.building_type);
    __sqoop$field_map.put("level", this.level);
    __sqoop$field_map.put("levels", this.levels);
    __sqoop$field_map.put("rooms", this.rooms);
    __sqoop$field_map.put("area", this.area);
    __sqoop$field_map.put("kitchen_area", this.kitchen_area);
    __sqoop$field_map.put("object_type", this.object_type);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
