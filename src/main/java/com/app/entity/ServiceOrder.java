package com.app.entity;

/**
 * 服务订单
 */
public class ServiceOrder {


    //服务订单 id
    private String ID;
    // 服务id
    private String SERVICE_ID;
    //下单用户编码
    private String CUSTOMER_ID;
    // 订单种类
    private String ADDRESS_ID;
    //服务数量SERVICE_COUNT
    private String SC;
    //满一定额度后总体折扣比例
    private String DISCOUNT;
    //下单时间CREATETIME
    private String CT;
    //订单状态STATE
    private String STT;

    public String getID() {
        return ID;
    }

    public String getSERVICE_ID() {
        return SERVICE_ID;
    }

    public String getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public String getADDRESS_ID() {
        return ADDRESS_ID;
    }

    public String getSC() {
        return SC;
    }

    public String getDISCOUNT() {
        return DISCOUNT;
    }

    public String getCT() {
        return CT;
    }

    public String getSTT() {
        return STT;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setSERVICE_ID(String SERVICE_ID) {
        this.SERVICE_ID = SERVICE_ID;
    }

    public void setCUSTOMER_ID(String CUSTOMER_ID) {
        this.CUSTOMER_ID = CUSTOMER_ID;
    }

    public void setADDRESS_ID(String ADDRESS_ID) {
        this.ADDRESS_ID = ADDRESS_ID;
    }

    public void setSC(String SC) {
        this.SC = SC;
    }

    public void setDISCOUNT(String DISCOUNT) {
        this.DISCOUNT = DISCOUNT;
    }

    public void setCT(String CT) {
        this.CT = CT;
    }

    public void setSTT(String STT) {
        this.STT = STT;
    }
}
