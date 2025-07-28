package com.backend.sunpick.domain.coupon.repository;

import com.backend.sunpick.domain.coupon.entity.ProvidedCoupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvidedCouponRepository extends JpaRepository<ProvidedCoupon, Integer> {

}
