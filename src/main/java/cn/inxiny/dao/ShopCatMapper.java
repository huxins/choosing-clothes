package cn.inxiny.dao;

import cn.inxiny.model.Commodity;
import cn.inxiny.model.ShopCat;

import java.util.List;

public interface ShopCatMapper {

    void addShopCat(ShopCat shopCat); // 添加商品进入购物车

    List<ShopCat> selectShopCat(ShopCat shopCat); // 查询用户购物车中商品信息

    Commodity selectCommodity(ShopCat cat); // 查询商品
    ShopCat selectShopCatA(ShopCat cat); // 查询商品

    void addShopCatCount(ShopCat shopCat); // 已有商品增加数量

    ShopCat selectCount(ShopCat shopCat); //    查询已有商品数量

    void minusShopCatCount(ShopCat shopCat); // 减一

    void deleteShopCat(ShopCat shopCat); // 删除购物车中的商品
}