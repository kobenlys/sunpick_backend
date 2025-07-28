package com.backend.sunpick.domain.coupon.enums;

import jakarta.persistence.AttributeConverter;
import java.util.Objects;

public class DiscountTypeConverter implements AttributeConverter<DiscountType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(DiscountType discountType) {
        if(!Objects.isNull(discountType)){
            return discountType.getCode();
        }
        throw new IllegalArgumentException();
    }

    @Override
    public DiscountType convertToEntityAttribute(Integer code) {
        if(!Objects.isNull(code)){
            return DiscountType.ofLegacyCode(code);
        }
        throw new IllegalArgumentException();
    }
}
