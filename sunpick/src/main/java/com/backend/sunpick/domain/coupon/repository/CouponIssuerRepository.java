package com.backend.sunpick.domain.coupon.repository;

import com.backend.sunpick.domain.coupon.entity.CouponIssuer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponIssuerRepository extends JpaRepository<CouponIssuer, Integer> {

}
