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
        List<String> sortnames = new ArrayList<String>();
        for (Commodity commodity : classList) {
            String sortname = commodity.getSortname();
            sortnames.add(sortname);
        }
        return sortnames;
    }

}