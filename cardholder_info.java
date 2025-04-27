// ORM class for table 'cardholder_info'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Apr 23 05:41:16 MSK 2025
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

public class cardholder_info extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("card_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.card_number = (java.math.BigDecimal)value;
      }
    });
    setters.put("first_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.first_name = (String)value;
      }
    });
    setters.put("last_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.last_name = (String)value;
      }
    });
    setters.put("gender", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.gender = (String)value;
      }
    });
    setters.put("address_street", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.address_street = (String)value;
      }
    });
    setters.put("address_city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.address_city = (String)value;
      }
    });
    setters.put("address_state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.address_state = (String)value;
      }
    });
    setters.put("address_state_zip", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.address_state_zip = (Integer)value;
      }
    });
    setters.put("address_lat", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.address_lat = (Double)value;
      }
    });
    setters.put("address_long", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.address_long = (Double)value;
      }
    });
    setters.put("address_city_pop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.address_city_pop = (Integer)value;
      }
    });
    setters.put("job", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.job = (String)value;
      }
    });
    setters.put("dob", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cardholder_info.this.dob = (java.sql.Date)value;
      }
    });
  }
  public cardholder_info() {
    init0();
  }
  private java.math.BigDecimal card_number;
  public java.math.BigDecimal get_card_number() {
    return card_number;
  }
  public void set_card_number(java.math.BigDecimal card_number) {
    this.card_number = card_number;
  }
  public cardholder_info with_card_number(java.math.BigDecimal card_number) {
    this.card_number = card_number;
    return this;
  }
  private String first_name;
  public String get_first_name() {
    return first_name;
  }
  public void set_first_name(String first_name) {
    this.first_name = first_name;
  }
  public cardholder_info with_first_name(String first_name) {
    this.first_name = first_name;
    return this;
  }
  private String last_name;
  public String get_last_name() {
    return last_name;
  }
  public void set_last_name(String last_name) {
    this.last_name = last_name;
  }
  public cardholder_info with_last_name(String last_name) {
    this.last_name = last_name;
    return this;
  }
  private String gender;
  public String get_gender() {
    return gender;
  }
  public void set_gender(String gender) {
    this.gender = gender;
  }
  public cardholder_info with_gender(String gender) {
    this.gender = gender;
    return this;
  }
  private String address_street;
  public String get_address_street() {
    return address_street;
  }
  public void set_address_street(String address_street) {
    this.address_street = address_street;
  }
  public cardholder_info with_address_street(String address_street) {
    this.address_street = address_street;
    return this;
  }
  private String address_city;
  public String get_address_city() {
    return address_city;
  }
  public void set_address_city(String address_city) {
    this.address_city = address_city;
  }
  public cardholder_info with_address_city(String address_city) {
    this.address_city = address_city;
    return this;
  }
  private String address_state;
  public String get_address_state() {
    return address_state;
  }
  public void set_address_state(String address_state) {
    this.address_state = address_state;
  }
  public cardholder_info with_address_state(String address_state) {
    this.address_state = address_state;
    return this;
  }
  private Integer address_state_zip;
  public Integer get_address_state_zip() {
    return address_state_zip;
  }
  public void set_address_state_zip(Integer address_state_zip) {
    this.address_state_zip = address_state_zip;
  }
  public cardholder_info with_address_state_zip(Integer address_state_zip) {
    this.address_state_zip = address_state_zip;
    return this;
  }
  private Double address_lat;
  public Double get_address_lat() {
    return address_lat;
  }
  public void set_address_lat(Double address_lat) {
    this.address_lat = address_lat;
  }
  public cardholder_info with_address_lat(Double address_lat) {
    this.address_lat = address_lat;
    return this;
  }
  private Double address_long;
  public Double get_address_long() {
    return address_long;
  }
  public void set_address_long(Double address_long) {
    this.address_long = address_long;
  }
  public cardholder_info with_address_long(Double address_long) {
    this.address_long = address_long;
    return this;
  }
  private Integer address_city_pop;
  public Integer get_address_city_pop() {
    return address_city_pop;
  }
  public void set_address_city_pop(Integer address_city_pop) {
    this.address_city_pop = address_city_pop;
  }
  public cardholder_info with_address_city_pop(Integer address_city_pop) {
    this.address_city_pop = address_city_pop;
    return this;
  }
  private String job;
  public String get_job() {
    return job;
  }
  public void set_job(String job) {
    this.job = job;
  }
  public cardholder_info with_job(String job) {
    this.job = job;
    return this;
  }
  private java.sql.Date dob;
  public java.sql.Date get_dob() {
    return dob;
  }
  public void set_dob(java.sql.Date dob) {
    this.dob = dob;
  }
  public cardholder_info with_dob(java.sql.Date dob) {
    this.dob = dob;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof cardholder_info)) {
      return false;
    }
    cardholder_info that = (cardholder_info) o;
    boolean equal = true;
    equal = equal && (this.card_number == null ? that.card_number == null : this.card_number.equals(that.card_number));
    equal = equal && (this.first_name == null ? that.first_name == null : this.first_name.equals(that.first_name));
    equal = equal && (this.last_name == null ? that.last_name == null : this.last_name.equals(that.last_name));
    equal = equal && (this.gender == null ? that.gender == null : this.gender.equals(that.gender));
    equal = equal && (this.address_street == null ? that.address_street == null : this.address_street.equals(that.address_street));
    equal = equal && (this.address_city == null ? that.address_city == null : this.address_city.equals(that.address_city));
    equal = equal && (this.address_state == null ? that.address_state == null : this.address_state.equals(that.address_state));
    equal = equal && (this.address_state_zip == null ? that.address_state_zip == null : this.address_state_zip.equals(that.address_state_zip));
    equal = equal && (this.address_lat == null ? that.address_lat == null : this.address_lat.equals(that.address_lat));
    equal = equal && (this.address_long == null ? that.address_long == null : this.address_long.equals(that.address_long));
    equal = equal && (this.address_city_pop == null ? that.address_city_pop == null : this.address_city_pop.equals(that.address_city_pop));
    equal = equal && (this.job == null ? that.job == null : this.job.equals(that.job));
    equal = equal && (this.dob == null ? that.dob == null : this.dob.equals(that.dob));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof cardholder_info)) {
      return false;
    }
    cardholder_info that = (cardholder_info) o;
    boolean equal = true;
    equal = equal && (this.card_number == null ? that.card_number == null : this.card_number.equals(that.card_number));
    equal = equal && (this.first_name == null ? that.first_name == null : this.first_name.equals(that.first_name));
    equal = equal && (this.last_name == null ? that.last_name == null : this.last_name.equals(that.last_name));
    equal = equal && (this.gender == null ? that.gender == null : this.gender.equals(that.gender));
    equal = equal && (this.address_street == null ? that.address_street == null : this.address_street.equals(that.address_street));
    equal = equal && (this.address_city == null ? that.address_city == null : this.address_city.equals(that.address_city));
    equal = equal && (this.address_state == null ? that.address_state == null : this.address_state.equals(that.address_state));
    equal = equal && (this.address_state_zip == null ? that.address_state_zip == null : this.address_state_zip.equals(that.address_state_zip));
    equal = equal && (this.address_lat == null ? that.address_lat == null : this.address_lat.equals(that.address_lat));
    equal = equal && (this.address_long == null ? that.address_long == null : this.address_long.equals(that.address_long));
    equal = equal && (this.address_city_pop == null ? that.address_city_pop == null : this.address_city_pop.equals(that.address_city_pop));
    equal = equal && (this.job == null ? that.job == null : this.job.equals(that.job));
    equal = equal && (this.dob == null ? that.dob == null : this.dob.equals(that.dob));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.card_number = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.first_name = JdbcWritableBridge.readString(2, __dbResults);
    this.last_name = JdbcWritableBridge.readString(3, __dbResults);
    this.gender = JdbcWritableBridge.readString(4, __dbResults);
    this.address_street = JdbcWritableBridge.readString(5, __dbResults);
    this.address_city = JdbcWritableBridge.readString(6, __dbResults);
    this.address_state = JdbcWritableBridge.readString(7, __dbResults);
    this.address_state_zip = JdbcWritableBridge.readInteger(8, __dbResults);
    this.address_lat = JdbcWritableBridge.readDouble(9, __dbResults);
    this.address_long = JdbcWritableBridge.readDouble(10, __dbResults);
    this.address_city_pop = JdbcWritableBridge.readInteger(11, __dbResults);
    this.job = JdbcWritableBridge.readString(12, __dbResults);
    this.dob = JdbcWritableBridge.readDate(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.card_number = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.first_name = JdbcWritableBridge.readString(2, __dbResults);
    this.last_name = JdbcWritableBridge.readString(3, __dbResults);
    this.gender = JdbcWritableBridge.readString(4, __dbResults);
    this.address_street = JdbcWritableBridge.readString(5, __dbResults);
    this.address_city = JdbcWritableBridge.readString(6, __dbResults);
    this.address_state = JdbcWritableBridge.readString(7, __dbResults);
    this.address_state_zip = JdbcWritableBridge.readInteger(8, __dbResults);
    this.address_lat = JdbcWritableBridge.readDouble(9, __dbResults);
    this.address_long = JdbcWritableBridge.readDouble(10, __dbResults);
    this.address_city_pop = JdbcWritableBridge.readInteger(11, __dbResults);
    this.job = JdbcWritableBridge.readString(12, __dbResults);
    this.dob = JdbcWritableBridge.readDate(13, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(card_number, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(first_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(last_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(gender, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address_street, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address_city, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address_state, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(address_state_zip, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(address_lat, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(address_long, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(address_city_pop, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(job, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(dob, 13 + __off, 91, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(card_number, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(first_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(last_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(gender, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address_street, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address_city, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address_state, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(address_state_zip, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(address_lat, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(address_long, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(address_city_pop, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(job, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(dob, 13 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.card_number = null;
    } else {
    this.card_number = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.first_name = null;
    } else {
    this.first_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.last_name = null;
    } else {
    this.last_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.gender = null;
    } else {
    this.gender = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.address_street = null;
    } else {
    this.address_street = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.address_city = null;
    } else {
    this.address_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.address_state = null;
    } else {
    this.address_state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.address_state_zip = null;
    } else {
    this.address_state_zip = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.address_lat = null;
    } else {
    this.address_lat = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.address_long = null;
    } else {
    this.address_long = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.address_city_pop = null;
    } else {
    this.address_city_pop = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.job = null;
    } else {
    this.job = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dob = null;
    } else {
    this.dob = new Date(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.card_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.card_number, __dataOut);
    }
    if (null == this.first_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_name);
    }
    if (null == this.last_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_name);
    }
    if (null == this.gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gender);
    }
    if (null == this.address_street) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address_street);
    }
    if (null == this.address_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address_city);
    }
    if (null == this.address_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address_state);
    }
    if (null == this.address_state_zip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.address_state_zip);
    }
    if (null == this.address_lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.address_lat);
    }
    if (null == this.address_long) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.address_long);
    }
    if (null == this.address_city_pop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.address_city_pop);
    }
    if (null == this.job) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, job);
    }
    if (null == this.dob) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dob.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.card_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.card_number, __dataOut);
    }
    if (null == this.first_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_name);
    }
    if (null == this.last_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, last_name);
    }
    if (null == this.gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, gender);
    }
    if (null == this.address_street) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address_street);
    }
    if (null == this.address_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address_city);
    }
    if (null == this.address_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address_state);
    }
    if (null == this.address_state_zip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.address_state_zip);
    }
    if (null == this.address_lat) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.address_lat);
    }
    if (null == this.address_long) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.address_long);
    }
    if (null == this.address_city_pop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.address_city_pop);
    }
    if (null == this.job) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, job);
    }
    if (null == this.dob) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dob.getTime());
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
    __sb.append(FieldFormatter.escapeAndEnclose(card_number==null?"null":card_number.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_name==null?"null":first_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_name==null?"null":last_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gender==null?"null":gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_street==null?"null":address_street, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_city==null?"null":address_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_state==null?"null":address_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_state_zip==null?"null":"" + address_state_zip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_lat==null?"null":"" + address_lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_long==null?"null":"" + address_long, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_city_pop==null?"null":"" + address_city_pop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(job==null?"null":job, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dob==null?"null":"" + dob, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(card_number==null?"null":card_number.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_name==null?"null":first_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_name==null?"null":last_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gender==null?"null":gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_street==null?"null":address_street, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_city==null?"null":address_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_state==null?"null":address_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_state_zip==null?"null":"" + address_state_zip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_lat==null?"null":"" + address_lat, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_long==null?"null":"" + address_long, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_city_pop==null?"null":"" + address_city_pop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(job==null?"null":job, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dob==null?"null":"" + dob, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.card_number = null; } else {
      this.card_number = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.first_name = null; } else {
      this.first_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.last_name = null; } else {
      this.last_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.gender = null; } else {
      this.gender = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.address_street = null; } else {
      this.address_street = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.address_city = null; } else {
      this.address_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.address_state = null; } else {
      this.address_state = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.address_state_zip = null; } else {
      this.address_state_zip = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.address_lat = null; } else {
      this.address_lat = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.address_long = null; } else {
      this.address_long = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.address_city_pop = null; } else {
      this.address_city_pop = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.job = null; } else {
      this.job = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dob = null; } else {
      this.dob = java.sql.Date.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.card_number = null; } else {
      this.card_number = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.first_name = null; } else {
      this.first_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.last_name = null; } else {
      this.last_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.gender = null; } else {
      this.gender = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.address_street = null; } else {
      this.address_street = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.address_city = null; } else {
      this.address_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.address_state = null; } else {
      this.address_state = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.address_state_zip = null; } else {
      this.address_state_zip = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.address_lat = null; } else {
      this.address_lat = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.address_long = null; } else {
      this.address_long = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.address_city_pop = null; } else {
      this.address_city_pop = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.job = null; } else {
      this.job = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dob = null; } else {
      this.dob = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    cardholder_info o = (cardholder_info) super.clone();
    o.dob = (o.dob != null) ? (java.sql.Date) o.dob.clone() : null;
    return o;
  }

  public void clone0(cardholder_info o) throws CloneNotSupportedException {
    o.dob = (o.dob != null) ? (java.sql.Date) o.dob.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("card_number", this.card_number);
    __sqoop$field_map.put("first_name", this.first_name);
    __sqoop$field_map.put("last_name", this.last_name);
    __sqoop$field_map.put("gender", this.gender);
    __sqoop$field_map.put("address_street", this.address_street);
    __sqoop$field_map.put("address_city", this.address_city);
    __sqoop$field_map.put("address_state", this.address_state);
    __sqoop$field_map.put("address_state_zip", this.address_state_zip);
    __sqoop$field_map.put("address_lat", this.address_lat);
    __sqoop$field_map.put("address_long", this.address_long);
    __sqoop$field_map.put("address_city_pop", this.address_city_pop);
    __sqoop$field_map.put("job", this.job);
    __sqoop$field_map.put("dob", this.dob);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("card_number", this.card_number);
    __sqoop$field_map.put("first_name", this.first_name);
    __sqoop$field_map.put("last_name", this.last_name);
    __sqoop$field_map.put("gender", this.gender);
    __sqoop$field_map.put("address_street", this.address_street);
    __sqoop$field_map.put("address_city", this.address_city);
    __sqoop$field_map.put("address_state", this.address_state);
    __sqoop$field_map.put("address_state_zip", this.address_state_zip);
    __sqoop$field_map.put("address_lat", this.address_lat);
    __sqoop$field_map.put("address_long", this.address_long);
    __sqoop$field_map.put("address_city_pop", this.address_city_pop);
    __sqoop$field_map.put("job", this.job);
    __sqoop$field_map.put("dob", this.dob);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
