package com.ky.mall.portal.domain;

import java.util.List;

import com.ky.mall.model.PmsProduct;
import com.ky.mall.model.PmsProductFullReduction;
import com.ky.mall.model.PmsProductLadder;
import com.ky.mall.model.PmsSkuStock;

/**
 * Created by macro on 2018/8/27.
 * 商品的促销信息，包括sku、打折优惠、满减优惠
 */
public class PromotionProduct extends PmsProduct {
  private static final long serialVersionUID = 1079576310138873905L;
    //商品库存信息
    private List<PmsSkuStock> skuStockList;
    //商品打折信息
    private List<PmsProductLadder> productLadderList;
    //商品满减信息
    private List<PmsProductFullReduction> productFullReductionList;

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }

    public List<PmsProductLadder> getProductLadderList() {
        return productLadderList;
    }

    public void setProductLadderList(List<PmsProductLadder> productLadderList) {
        this.productLadderList = productLadderList;
    }

    public List<PmsProductFullReduction> getProductFullReductionList() {
        return productFullReductionList;
    }

    public void setProductFullReductionList(List<PmsProductFullReduction> productFullReductionList) {
        this.productFullReductionList = productFullReductionList;
    }
}
