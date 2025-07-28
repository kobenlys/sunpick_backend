package com.backend.sunpick.domain.purchase.entity;

import com.backend.sunpick.domain.coupon.entity.Coupon;
import com.backend.sunpick.domain.exclusive.entity.ExclusiveProduct;
import com.backend.sunpick.domain.exclusive.entity.ExclusiveSaleEvent;
import com.backend.sunpick.domain.member.entity.Member;
import com.backend.sunpick.domain.point.entity.SunpickPointHistory;
import com.backend.sunpick.domain.purchase.enums.PurchaseType;
import com.backend.sunpick.domain.purchase.enums.PurchaseTypeConverter;
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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "purchase_history")
@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PurchaseHistory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "used_coupon_id")
    private Coupon coupon;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "exclusive_sale_event_id", nullable = false)
    private ExclusiveSaleEvent exclusiveSaleEvent;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sunpic_point_history_id")
    private SunpickPointHistory sunpickPointHistory;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Convert(converter = PurchaseTypeConverter.class)
    @Column(name = "purchase_type", nullable = false)
    private PurchaseType purchaseType;

}
