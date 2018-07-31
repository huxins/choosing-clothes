package cn.inxiny.model;

import java.util.Date;
import java.util.List;

public class Commodity {
    private Integer commodityid;

    private Integer sort;

    private Integer series;

    private Date time;

    private Integer sales;

    private Integer rank;

    private String commodityname;

    private Integer grade;

    private String brand;

    private String place;

    private Integer capacity;

    private String sortname;

    private String seriesname;

    private Integer sortsuper;

    private Integer seriessuper;

    private String effect;

    private String skintype;

    private String pic;

    private List<Commodity> ChildrenCommodity;  //  子级

    public List<Commodity> getChildrenCommodity() {
        return ChildrenCommodity;
    }

    public void setChildrenCommodity(List<Commodity> childrenCommodity) {
        ChildrenCommodity = childrenCommodity;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getSortname() {
        return sortname;
    }

    public void setSortname(String sortname) {
        this.sortname = sortname == null ? null : sortname.trim();
    }

    public String getSeriesname() {
        return seriesname;
    }

    public void setSeriesname(String seriesname) {
        this.seriesname = seriesname == null ? null : seriesname.trim();
    }

    public Integer getSortsuper() {
        return sortsuper;
    }

    public void setSortsuper(Integer sortsuper) {
        this.sortsuper = sortsuper;
    }

    public Integer getSeriessuper() {
        return seriessuper;
    }

    public void setSeriessuper(Integer seriessuper) {
        this.seriessuper = seriessuper;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect == null ? null : effect.trim();
    }

    public String getSkintype() {
        return skintype;
    }

    public void setSkintype(String skintype) {
        this.skintype = skintype == null ? null : skintype.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodityid=" + commodityid +
                ", sort=" + sort +
                ", series=" + series +
                ", time=" + time +
                ", sales=" + sales +
                ", rank=" + rank +
                ", commodityname='" + commodityname + '\'' +
                ", grade=" + grade +
                ", brand='" + brand + '\'' +
                ", place='" + place + '\'' +
                ", capacity=" + capacity +
                ", sortname='" + sortname + '\'' +
                ", seriesname='" + seriesname + '\'' +
                ", sortsuper=" + sortsuper +
                ", seriessuper=" + seriessuper +
                ", effect='" + effect + '\'' +
                ", skintype='" + skintype + '\'' +
                ", pic='" + pic + '\'' +
                ", ChildrenCommodity=" + ChildrenCommodity +
                '}';
    }
}