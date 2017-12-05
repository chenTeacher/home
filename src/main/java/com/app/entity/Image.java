package com.app.entity;

/**
 * 启动图片 广告图片
 */
public class Image {


    private String ID;
    private String IMGP;
    private String IMGN;
    private String TP;
    private String DETAILS;
    private String UT;


    public void setID(String ID) {
        this.ID = ID;
    }

    public void setIMGP(String IMGP) {
        this.IMGP = IMGP;
    }

    public void setIMGN(String IMGN) {
        this.IMGN = IMGN;
    }

    public void setTP(String TP) {
        this.TP = TP;
    }

    public void setDETAILS(String DETAILS) {
        this.DETAILS = DETAILS;
    }

    public void setUT(String UT) {
        this.UT = UT;
    }

    public String getID() {

        return ID;
    }

    public String getIMGP() {
        return IMGP;
    }

    public String getIMGN() {
        return IMGN;
    }

    public String getTP() {
        return TP;
    }

    public String getDETAILS() {
        return DETAILS;
    }

    public String getUT() {
        return UT;
    }
}
