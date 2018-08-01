package cn.inxiny.service;

import cn.inxiny.model.Commodity;

import java.util.List;

public interface CommodityService {
    List findClass();
    List findSeries();

    List findList(Commodity commodity);

    Commodity findCommodity(Commodity commodity);

    List<Commodity> search(Commodity commodity);

}

