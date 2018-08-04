package cn.inxiny.service;

import cn.inxiny.model.ShopCat;

import java.util.List;

public interface ShopCatService {


    List<ShopCat> addShopCat(ShopCat shopCat);

    List<ShopCat> updateShopCat(ShopCat shopCat, Integer rank);

    List<ShopCat> deleteShopCat(ShopCat shopCat);
}
