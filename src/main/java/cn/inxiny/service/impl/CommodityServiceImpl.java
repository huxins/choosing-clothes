package cn.inxiny.service.impl;

import cn.inxiny.dao.CommodityMapper;
import cn.inxiny.model.Commodity;
import cn.inxiny.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("commodityService")
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;

    public List findClass(){
        List<Commodity> classList = commodityMapper.findClass();
        for (Commodity commodity : classList) {
            Integer commodityid = commodity.getCommodityid();
            List<Commodity> classification = commodityMapper.findClassification(commodityid);
            commodity.setChildrenCommodity(classification);
        }
        return classList;
    }

    public List findSeries(){
        List<Commodity> classList = commodityMapper.findSeries();
        for (Commodity commodity : classList) {
            Integer commodityid = commodity.getCommodityid();
            List<Commodity> classification = commodityMapper.findSeriesification(commodityid);
            commodity.setChildrenCommodity(classification);
        }
        return classList;
    }

//    商品列表分类页面
    public List findList(Commodity commodity) {
        List<Commodity> list = new ArrayList<Commodity>();
        if (commodity.getRank()==0){
            //  分类的列表
            Commodity comm = commodityMapper.findComm(commodity);
            comm.setSortname(commodity.getSortname());
            Commodity list1 = commodityMapper.findList1(comm);

            list = commodityMapper.findList2(list1);
        }else if (commodity.getRank()==1){
            //  系列的列表
            Commodity comm = commodityMapper.afindComm(commodity);
            comm.setSortname(commodity.getSortname());
            Commodity list1 = commodityMapper.afindList1(comm);

            list = commodityMapper.afindList2(list1);
        }

        return list;
    }

//    模糊查询
    public Commodity findCommodity(Commodity commodity) {
        Commodity commodity1 = commodityMapper.findCommodity(commodity);
        return commodity1;
    }

}