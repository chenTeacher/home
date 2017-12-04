package com.app.entity;

/**
 * 服务实体类
 */
public class Service {

    //服务唯一标识符
    private String id;
    //服务名称
    private String name;
    //服务价格
    private String price;
    //服务说明
    private String summary;
    //服务周期
    private String period;
    //服务详情
    private String details;
    //服务广告图片路径
    private String ad_img_path;
    //服务广告图片名称
    private String ad_img_name;
    //服务详情图片路径
    private String det_img_path;
    //服务详情图片名称
    private String det_img_name;
    //服务类型标识符KY
    private String tp;
    //控制商品排序ORDER
    private String od;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getSummary() {
        return summary;
    }

    public String getPeriod() {
        return period;
    }

    public String getDetails() {
        return details;
    }

    public String getAd_img_path() {
        return ad_img_path;
    }

    public String getAd_img_name() {
        return ad_img_name;
    }

    public String getDet_img_path() {
        return det_img_path;
    }

    public String getDet_img_name() {
        return det_img_name;
    }

    public String getTp() {
        return tp;
    }

    public String getOd() {
        return od;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setAd_img_path(String ad_img_path) {
        this.ad_img_path = ad_img_path;
    }

    public void setAd_img_name(String ad_img_name) {
        this.ad_img_name = ad_img_name;
    }

    public void setDet_img_path(String det_img_path) {
        this.det_img_path = det_img_path;
    }

    public void setDet_img_name(String det_img_name) {
        this.det_img_name = det_img_name;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public void setOd(String od) {
        this.od = od;
    }


    @Override
    public String toString() {
        return "Service{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", summary='" + summary + '\'' +
                ", period='" + period + '\'' +
                ", details='" + details + '\'' +
                ", ad_img_path='" + ad_img_path + '\'' +
                ", ad_img_name='" + ad_img_name + '\'' +
                ", det_img_path='" + det_img_path + '\'' +
                ", det_img_name='" + det_img_name + '\'' +
                ", tp='" + tp + '\'' +
                ", od='" + od + '\'' +
                '}';
    }
}
