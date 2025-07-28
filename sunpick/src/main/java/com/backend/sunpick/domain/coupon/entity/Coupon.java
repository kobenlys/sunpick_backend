package com.backend.sunpick.domain.coupon.entity;

import com.backend.sunpick.domain.coupon.enums.DiscountType;
import com.backend.sunpick.domain.coupon.enums.DiscountTypeConverter;
import com.backend.sunpick.global.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "coupon")
@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Coupon extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "issuer_id", nullable = false)
    private CouponIssuer couponIssuer;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "valid_days", nullable = false)
    private Integer validDays;

    @Column(name = "discount_weight", nullable = false)
    private Integer discountWeight;

    @Convert(converter = DiscountTypeConverter.class)
    @Column(name = "discount_type", nullable = false)
    private DiscountType discountType;
}



