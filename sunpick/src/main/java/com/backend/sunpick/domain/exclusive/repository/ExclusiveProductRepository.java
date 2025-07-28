package com.backend.sunpick.domain.exclusive.repository;

import com.backend.sunpick.domain.exclusive.entity.ExclusiveProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExclusiveProductRepository extends JpaRepository<ExclusiveProduct, Integer> {

}
