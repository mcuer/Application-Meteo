
package com.example.pcmarie.myapplication_meteo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hours {

    @SerializedName("ICON")
    @Expose
    private String iCON;
    @SerializedName("CONDITION")
    @Expose
    private String cONDITION;
    @SerializedName("TMP2m")
    @Expose
    private String TMP2m;

    public String getICON() {
        return iCON;
    }

    public void setICON(String iCON) {
        this.iCON = iCON;
    }

    public String getCONDITION() {
        return cONDITION;
    }

    public void setCONDITION(String cONDITION) {
        this.cONDITION = cONDITION;
    }

    public String getTMP2m() {
        return TMP2m;
    }

    public void setTMP2m(String TMP2m) {
        this.TMP2m = TMP2m;
    }

}
