package com.backend.sunpick.domain.purchase.enums;

import jakarta.persistence.AttributeConverter;
import java.util.Objects;

public class PurchaseTypeConverter implements AttributeConverter<PurchaseType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(PurchaseType purchaseType) {
        if(!Objects.isNull(purchaseType)){
            return purchaseType.getCode();
        }
        throw new IllegalArgumentException();
    }

    @Override
    public PurchaseType convertToEntityAttribute(Integer code) {
        if(!Objects.isNull(code)){
            return PurchaseType.ofLegacyCode(code);
        }
        throw new IllegalArgumentException();
    }
}
