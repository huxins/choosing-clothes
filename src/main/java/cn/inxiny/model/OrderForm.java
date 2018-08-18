package cn.inxiny.model;

import java.util.List;

public class OrderForm {
    private Integer orderid;

    private Integer userid;

    private Integer commodityid;

    private Integer commoditycount;

    private Integer orderformid;

    private String datetime;

    private List<Commodity> commodities;

    private User user;

    public List<Commodity> getCommodities() {
        return commodities;
    }

    @Override
    public String toString() {
        return "OrderForm{" +
                "orderid=" + orderid +
                ", userid=" + userid +
                ", commodityid=" + commodityid +
                ", commoditycount=" + commoditycount +
                ", orderformid=" + orderformid +
                ", datetime='" + datetime + '\'' +
                ", commodities=" + commodities +
                ", user=" + user +
                '}';
    }

    public void setCommodities(List<Commodity> commodities) {
        this.commodities = commodities;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getCommoditycount() {
        return commoditycount;
    }

    public void setCommoditycount(Integer commoditycount) {
        this.commoditycount = commoditycount;
    }

    public Integer getOrderformid() {
        return orderformid;
    }

    public void setOrderformid(Integer orderformid) {
        this.orderformid = orderformid;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime == null ? null : datetime.trim();
    }
}