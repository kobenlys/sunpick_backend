package com.backend.sunpick.domain.purchase.enums;

import java.util.Objects;
import lombok.Getter;

@Getter
public enum PurchaseType {

    CARD(1),
    POINT(2),
    TOSSPAY(3);

    private Integer code;

    PurchaseType(Integer code) {
        this.code = code;
    }

    public static PurchaseType ofLegacyCode(Integer code) {
        for (PurchaseType type : PurchaseType.values()) {
            if (Objects.equals(type.getCode(), code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("지원하지 않는 구매방식입니다.");
    }
}
