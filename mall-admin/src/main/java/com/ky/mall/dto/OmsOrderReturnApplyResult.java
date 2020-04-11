package com.ky.mall.dto;

import com.ky.mall.model.OmsCompanyAddress;
import com.ky.mall.model.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 * Created by macro on 2018/10/18.
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
  private static final long serialVersionUID = -6372795181948338630L;
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
