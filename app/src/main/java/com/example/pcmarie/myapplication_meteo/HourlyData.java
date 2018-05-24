
package com.example.pcmarie.myapplication_meteo;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class HourlyData {

    @SerializedName("0H00")
    @Expose
    private Hours _0H00;
    @SerializedName("1H00")
    @Expose
    private Hours _1H00;
    @SerializedName("2H00")
    @Expose
    private Hours _2H00;
    @SerializedName("3H00")
    @Expose
    private Hours _3H00;
    @SerializedName("4H00")
    @Expose
    private Hours _4H00;
    @SerializedName("5H00")
    @Expose
    private Hours _5H00;
    @SerializedName("6H00")
    @Expose
    private Hours _6H00;
    @SerializedName("7H00")
    @Expose
    private Hours _7H00;
    @SerializedName("8H00")
    @Expose
    private Hours _8H00;
    @SerializedName("9H00")
    @Expose
    private Hours _9H00;
    @SerializedName("10H00")
    @Expose
    private Hours _10H00;
    @SerializedName("11H00")
    @Expose
    private Hours _11H00;
    @SerializedName("12H00")
    @Expose
    private Hours _12H00;
    @SerializedName("13H00")
    @Expose
    private Hours _13H00;
    @SerializedName("14H00")
    @Expose
    private Hours _14H00;
    @SerializedName("15H00")
    @Expose
    private Hours _15H00;
    @SerializedName("16H00")
    @Expose
    private Hours _16H00;
    @SerializedName("17H00")
    @Expose
    private Hours _17H00;
    @SerializedName("18H00")
    @Expose
    private Hours _18H00;
    @SerializedName("19H00")
    @Expose
    private Hours _19H00;
    @SerializedName("20H00")
    @Expose
    private Hours _20H00;
    @SerializedName("21H00")
    @Expose
    private Hours _21H00;
    @SerializedName("22H00")
    @Expose
    private Hours _22H00;
    @SerializedName("23H00")
    @Expose
    private Hours _23H00;

    public Hours get0H00() {
        return _0H00;
    }

    public void set0H00(Hours _0H00) {
        this._0H00 = _0H00;
    }

    public Hours get1H00() {
        return _1H00;
    }

    public void set1H00(Hours _1H00) {
        this._1H00 = _1H00;
    }

    public Hours get2H00() {
        return _2H00;
    }

    public void set2H00(Hours _2H00) {
        this._2H00 = _2H00;
    }

    public Hours get3H00() {
        return _3H00;
    }

    public void set3H00(Hours _3H00) {
        this._3H00 = _3H00;
    }

    public Hours get4H00() {
        return _4H00;
    }

    public void set4H00(Hours _4H00) {
        this._4H00 = _4H00;
    }

    public Hours get5H00() {
        return _5H00;
    }

    public void set5H00(Hours _5H00) {
        this._5H00 = _5H00;
    }

    public Hours get6H00() {
        return _6H00;
    }

    public void set6H00(Hours _6H00) {
        this._6H00 = _6H00;
    }

    public Hours get7H00() {
        return _7H00;
    }

    public void set7H00(Hours _7H00) {
        this._7H00 = _7H00;
    }

    public Hours get8H00() {
        return _8H00;
    }

    public void set8H00(Hours _8H00) {
        this._8H00 = _8H00;
    }

    public Hours get9H00() {
        return _9H00;
    }

    public void set9H00(Hours _9H00) {
        this._9H00 = _9H00;
    }

    public Hours get10H00() {
        return _10H00;
    }

    public void set10H00(Hours _10H00) {
        this._10H00 = _10H00;
    }

    public Hours get11H00() {
        return _11H00;
    }

    public void set11H00(Hours _11H00) {
        this._11H00 = _11H00;
    }

    public Hours get12H00() {
        return _12H00;
    }

    public void set12H00(Hours _12H00) {
        this._12H00 = _12H00;
    }

    public Hours get13H00() {
        return _13H00;
    }

    public void set13H00(Hours _13H00) {
        this._13H00 = _13H00;
    }

    public Hours get14H00() {
        return _14H00;
    }

    public void set14H00(Hours _14H00) {
        this._14H00 = _14H00;
    }

    public Hours get15H00() {
        return _15H00;
    }

    public void set15H00(Hours _15H00) {
        this._15H00 = _15H00;
    }

    public Hours get16H00() {
        return _16H00;
    }

    public void set16H00(Hours _16H00) {
        this._16H00 = _16H00;
    }

    public Hours get17H00() {
        return _17H00;
    }

    public void set17H00(Hours _17H00) {
        this._17H00 = _17H00;
    }

    public Hours get18H00() {
        return _18H00;
    }

    public void set18H00(Hours _18H00) {
        this._18H00 = _18H00;
    }

    public Hours get19H00() {
        return _19H00;
    }

    public void set19H00(Hours _19H00) {
        this._19H00 = _19H00;
    }

    public Hours get20H00() {
        return _20H00;
    }

    public void set20H00(Hours _20H00) {
        this._20H00 = _20H00;
    }

    public Hours get21H00() {
        return _21H00;
    }

    public void set21H00(Hours _21H00) {
        this._21H00 = _21H00;
    }

    public Hours get22H00() {
        return _22H00;
    }

    public void set22H00(Hours _22H00) {
        this._22H00 = _22H00;
    }

    public Hours get23H00() {
        return _23H00;
    }

    public void set23H00(Hours _23H00) {
        this._23H00 = _23H00;
    }

    public LinkedList<Hours> getAllHours () {
        LinkedList<Hours> allHours = new LinkedList<>();
        allHours.add(this._0H00);
        allHours.add(this._1H00);
        allHours.add(this._2H00);
        allHours.add(this._3H00);
        allHours.add(this._4H00);
        allHours.add(this._5H00);
        allHours.add(this._6H00);
        allHours.add(this._7H00);
        allHours.add(this._8H00);
        allHours.add(this._9H00);
        allHours.add(this._10H00);
        allHours.add(this._11H00);
        allHours.add(this._12H00);
        allHours.add(this._13H00);
        allHours.add(this._14H00);
        allHours.add(this._15H00);
        allHours.add(this._16H00);
        allHours.add(this._17H00);
        allHours.add(this._18H00);
        allHours.add(this._19H00);
        allHours.add(this._20H00);
        allHours.add(this._21H00);
        allHours.add(this._22H00);
        allHours.add(this._23H00);
        return allHours;
    }

}
