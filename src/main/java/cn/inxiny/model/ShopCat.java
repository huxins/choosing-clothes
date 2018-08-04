package cn.inxiny.model;

public class ShopCat {
    private Integer shopid;

    private Integer userid;

    private Integer commodityid;

    private Integer commoditycount;

    private Commodity commodity;

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
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
}