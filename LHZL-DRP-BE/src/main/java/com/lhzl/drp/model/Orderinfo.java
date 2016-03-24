package com.lhzl.drp.model;

import java.math.BigDecimal;
import java.util.Date;

public class Orderinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_orderinfo.orderId
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    private Long orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_orderinfo.orderNo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    private String orderno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_orderinfo.lineId
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    private Long lineid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_orderinfo.drpid
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    private Long drpid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_orderinfo.ordamt
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    private BigDecimal ordamt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_orderinfo.startTime
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    private Date starttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_orderinfo.status
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_orderinfo.orderTime
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    private Date ordertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_orderinfo.createby
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    private String createby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_orderinfo.createTime
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_orderinfo.updateby
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    private String updateby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_orderinfo.updateTime
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_orderinfo.orderId
     *
     * @return the value of tbl_orderinfo.orderId
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public Long getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_orderinfo.orderId
     *
     * @param orderid the value for tbl_orderinfo.orderId
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_orderinfo.orderNo
     *
     * @return the value of tbl_orderinfo.orderNo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_orderinfo.orderNo
     *
     * @param orderno the value for tbl_orderinfo.orderNo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_orderinfo.lineId
     *
     * @return the value of tbl_orderinfo.lineId
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public Long getLineid() {
        return lineid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_orderinfo.lineId
     *
     * @param lineid the value for tbl_orderinfo.lineId
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public void setLineid(Long lineid) {
        this.lineid = lineid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_orderinfo.drpid
     *
     * @return the value of tbl_orderinfo.drpid
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public Long getDrpid() {
        return drpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_orderinfo.drpid
     *
     * @param drpid the value for tbl_orderinfo.drpid
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public void setDrpid(Long drpid) {
        this.drpid = drpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_orderinfo.ordamt
     *
     * @return the value of tbl_orderinfo.ordamt
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public BigDecimal getOrdamt() {
        return ordamt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_orderinfo.ordamt
     *
     * @param ordamt the value for tbl_orderinfo.ordamt
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public void setOrdamt(BigDecimal ordamt) {
        this.ordamt = ordamt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_orderinfo.startTime
     *
     * @return the value of tbl_orderinfo.startTime
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_orderinfo.startTime
     *
     * @param starttime the value for tbl_orderinfo.startTime
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_orderinfo.status
     *
     * @return the value of tbl_orderinfo.status
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_orderinfo.status
     *
     * @param status the value for tbl_orderinfo.status
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_orderinfo.orderTime
     *
     * @return the value of tbl_orderinfo.orderTime
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public Date getOrdertime() {
        return ordertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_orderinfo.orderTime
     *
     * @param ordertime the value for tbl_orderinfo.orderTime
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_orderinfo.createby
     *
     * @return the value of tbl_orderinfo.createby
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_orderinfo.createby
     *
     * @param createby the value for tbl_orderinfo.createby
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public void setCreateby(String createby) {
        this.createby = createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_orderinfo.createTime
     *
     * @return the value of tbl_orderinfo.createTime
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_orderinfo.createTime
     *
     * @param createtime the value for tbl_orderinfo.createTime
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_orderinfo.updateby
     *
     * @return the value of tbl_orderinfo.updateby
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_orderinfo.updateby
     *
     * @param updateby the value for tbl_orderinfo.updateby
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_orderinfo.updateTime
     *
     * @return the value of tbl_orderinfo.updateTime
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_orderinfo.updateTime
     *
     * @param updatetime the value for tbl_orderinfo.updateTime
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}