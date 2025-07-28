package com.backend.sunpick.domain.coupon.enums;

import java.util.Objects;
import lombok.Getter;

@Getter
public enum DiscountType {
    PIXED(1),
    PERCENT(2);

    private Integer code;

    DiscountType(Integer code) {
        this.code = code;
    }

    public static DiscountType ofLegacyCode(Integer code){
        for (DiscountType type : DiscountType.values()) {
            if(Objects.equals(type.getCode(), code)){
                return type;
            }
        }
        throw new IllegalArgumentException("입력된 할인타입 코드번호가 존재하지않습니다.");
    }
}
