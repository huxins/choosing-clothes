package cn.inxiny.dao;

import cn.inxiny.model.Commodity;

import java.util.List;

public interface CommodityMapper {
    List<Commodity> findClass(); // 一级分类
    List<Commodity> findClassification(Integer id); // 二级分类


    List<Commodity> findSeries(); // 一级系列
    List<Commodity> findSeriesification(Integer id); // 二级系列

    Commodity findComm(Commodity commodity); // 商品列表
    Commodity findList1(Commodity commodity); // 商品列表
    List<Commodity> findList2(Commodity commodity); // 商品列表

    Commodity afindComm(Commodity commodity); // 商品列表
    Commodity afindList1(Commodity commodity); // 商品列表
    List<Commodity> afindList2(Commodity commodity); // 商品列表

    List<Commodity> findCommodity(Commodity commodity); // 模糊查询

    Commodity bfindComm(Commodity commodity); // 分类总列表
    List<Commodity> bfindCommA(Commodity comm); // 分类总列表
    List<Commodity> bfindCommB(Commodity comm1); // 分类总列表

    Commodity cfindComm(Commodity commodity); // 系列总列表
    List<Commodity> cfindCommA(Commodity comm); // 系列总列表
    List<Commodity> cfindCommB(Commodity comm1); // 系列总列表

}