
package com.example.pcmarie.myapplication_meteo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FcstDay {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("day_long")
    @Expose
    private String dayLong;
    @SerializedName("tmin")
    @Expose
    private Integer tmin;
    @SerializedName("tmax")
    @Expose
    private Integer tmax;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("condition_key")
    @Expose
    private String conditionKey;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("icon_big")
    @Expose
    private String iconBig;
    @SerializedName("hourly_data")
    @Expose
    private HourlyData hourlyData;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDayLong() {
        return dayLong;
    }

    public void setDayLong(String dayLong) {
        this.dayLong = dayLong;
    }

    public Integer getTmin() {
        return tmin;
    }

    public void setTmin(Integer tmin) {
        this.tmin = tmin;
    }

    public Integer getTmax() {
        return tmax;
    }

    public void setTmax(Integer tmax) {
        this.tmax = tmax;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getConditionKey() {
        return conditionKey;
    }

    public void setConditionKey(String conditionKey) {
        this.conditionKey = conditionKey;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconBig() {
        return iconBig;
    }

    public void setIconBig(String iconBig) {
        this.iconBig = iconBig;
    }

    public HourlyData getHourlyData() {
        return hourlyData;
    }

    public void setHourlyData(HourlyData hourlyData) {
        this.hourlyData = hourlyData;
    }

}
