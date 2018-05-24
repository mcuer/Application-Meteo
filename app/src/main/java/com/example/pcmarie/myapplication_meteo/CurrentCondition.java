
package com.example.pcmarie.myapplication_meteo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentCondition {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("hour")
    @Expose
    private String hour;
    @SerializedName("tmp")
    @Expose
    private Integer tmp;
    @SerializedName("wnd_spd")
    @Expose
    private Integer wndSpd;
    @SerializedName("wnd_gust")
    @Expose
    private Integer wndGust;
    @SerializedName("wnd_dir")
    @Expose
    private String wndDir;
    @SerializedName("pressure")
    @Expose
    private Double pressure;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Integer getTmp() {
        return tmp;
    }

    public void setTmp(Integer tmp) {
        this.tmp = tmp;
    }

    public Integer getWndSpd() {
        return wndSpd;
    }

    public void setWndSpd(Integer wndSpd) {
        this.wndSpd = wndSpd;
    }

    public Integer getWndGust() {
        return wndGust;
    }

    public void setWndGust(Integer wndGust) {
        this.wndGust = wndGust;
    }

    public String getWndDir() {
        return wndDir;
    }

    public void setWndDir(String wndDir) {
        this.wndDir = wndDir;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
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

}
