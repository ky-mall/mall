package com.ky.mall.dto;

import com.ky.mall.model.SmsFlashPromotionSession;

import lombok.Getter;
import lombok.Setter;

/**
 * 包含商品数量的场次信息
 * Created by macro on 2018/11/19.
 */
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    private static final long serialVersionUID = 7776827431120092469L;
    @Setter
    @Getter
    private Long productCount;
}
