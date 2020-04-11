package com.ky.mall.dto;

import com.ky.mall.model.OmsOrder;
import com.ky.mall.model.OmsOrderItem;
import com.ky.mall.model.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 * Created by macro on 2018/10/11.
 */
public class OmsOrderDetail extends OmsOrder {
  private static final long serialVersionUID = -8251795953714478836L;
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
