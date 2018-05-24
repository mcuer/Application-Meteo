package com.example.pcmarie.myapplication_meteo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meteo {

    @SerializedName("city_info")
    @Expose
    private CityInfo cityInfo;
    @SerializedName("forecast_info")
    @Expose
    private ForecastInfo forecastInfo;
    @SerializedName("current_condition")
    @Expose
    private CurrentCondition currentCondition;
    @SerializedName("fcst_day_0")
    @Expose
    private FcstDay _fcstDay0;
    @SerializedName("fcst_day_1")
    @Expose
    private FcstDay _fcstDay1;
    @SerializedName("fcst_day_2")
    @Expose
    private FcstDay _fcstDay2;
    @SerializedName("fcst_day_3")
    @Expose
    private FcstDay _fcstDay3;
    @SerializedName("fcst_day_4")
    @Expose
    private FcstDay _fcstDay4;

    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public ForecastInfo getForecastInfo() {
        return forecastInfo;
    }

    public void setForecastInfo(ForecastInfo forecastInfo) {
        this.forecastInfo = forecastInfo;
    }

    public CurrentCondition getCurrentCondition() {
        return currentCondition;
    }

    public void setCurrentCondition(CurrentCondition currentCondition) {
        this.currentCondition = currentCondition;
    }

    public FcstDay get_fcstDay0() {
        return _fcstDay0;
    }

    public void set_fcstDay0(FcstDay _fcstDay0) {
        this._fcstDay0 = _fcstDay0;
    }

    public FcstDay get_fcstDay1() {
        return _fcstDay1;
    }

    public void set_fcstDay1(FcstDay _fcstDay1) {
        this._fcstDay1 = _fcstDay1;
    }

    public FcstDay get_fcstDay2() {
        return _fcstDay2;
    }

    public void set_fcstDay2(FcstDay _fcstDay2) {
        this._fcstDay2 = _fcstDay2;
    }

    public FcstDay get_fcstDay3() {
        return _fcstDay3;
    }

    public void set_fcstDay3(FcstDay _fcstDay3) {
        this._fcstDay3 = _fcstDay3;
    }

    public FcstDay get_fcstDay4() {
        return _fcstDay4;
    }

    public void set_fcstDay4(FcstDay _fcstDay4) {
        this._fcstDay4 = _fcstDay4;
    }
}
