package com.ky.mall.portal.domain;

import java.util.List;

import com.ky.mall.model.PmsProduct;
import com.ky.mall.model.PmsProductAttribute;
import com.ky.mall.model.PmsSkuStock;

/**
 * 购物车中选择规格的商品信息 Created by macro on 2018/8/2.
 */
public class CartProduct extends PmsProduct {
  private static final long serialVersionUID = 2592071239108511975L;
  
  private List<PmsProductAttribute> productAttributeList;
  private List<PmsSkuStock> skuStockList;

  public List<PmsProductAttribute> getProductAttributeList() {
    return productAttributeList;
  }

  public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
    this.productAttributeList = productAttributeList;
  }

  public List<PmsSkuStock> getSkuStockList() {
    return skuStockList;
  }

  public void setSkuStockList(List<PmsSkuStock> skuStockList) {
    this.skuStockList = skuStockList;
  }
}
