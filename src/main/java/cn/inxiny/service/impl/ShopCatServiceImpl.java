package cn.inxiny.service.impl;

import cn.inxiny.dao.ShopCatMapper;
import cn.inxiny.model.Commodity;
import cn.inxiny.model.ShopCat;
import cn.inxiny.service.ShopCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("shopCatService")
public class ShopCatServiceImpl implements ShopCatService {

    @Autowired
    private ShopCatMapper shopCatMapper;

    /**
     * 添加商品进入购物车
     * @param shopCat
     * @return
     */
    public List<ShopCat> addShopCat(ShopCat shopCat) {
        ShopCat shopCat1 = shopCatMapper.selectShopCatA(shopCat);
        if (shopCat1 == null){
            shopCatMapper.addShopCat(shopCat);
        }else {
            //  查询商品数量
            ShopCat shop = shopCatMapper.selectCount(shopCat);
            shopCat.setCommoditycount(shop.getCommoditycount());

            shopCatMapper.addShopCatCount(shopCat);
        }
        List<ShopCat> list = shopCatMapper.selectShopCat(shopCat);
        for (ShopCat cat : list) {
            cat.setCommodity(shopCatMapper.selectCommodity(cat));
        }
        return list;
    }

    /**
     * 更新数据库
     * @param shopCat
     * @param rank
     * @return
     */
    public List<ShopCat> updateShopCat(ShopCat shopCat, Integer rank) {
        //  查询商品数量
        ShopCat shop = shopCatMapper.selectCount(shopCat);
        shopCat.setCommoditycount(shop.getCommoditycount());
        if(rank == 0){
            //  减一
            shopCatMapper.minusShopCatCount(shopCat);
        }else if (rank == 1){
            //  加一
            shopCatMapper.addShopCatCount(shopCat);
        }
        List<ShopCat> list = shopCatMapper.selectShopCat(shopCat);
        for (ShopCat cat : list) {
            cat.setCommodity(shopCatMapper.selectCommodity(cat));
        }
        return list;
    }

    /**
     * 删除购物车中商品
     * @param shopCat
     * @return
     */
    public List<ShopCat> deleteShopCat(ShopCat shopCat) {
        shopCatMapper.deleteShopCat(shopCat);
        List<ShopCat> list = shopCatMapper.selectShopCat(shopCat);
        for (ShopCat cat : list) {
            cat.setCommodity(shopCatMapper.selectCommodity(cat));
        }
        return list;
    }
}
