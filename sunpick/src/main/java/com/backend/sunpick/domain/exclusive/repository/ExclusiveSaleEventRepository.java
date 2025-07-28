package com.backend.sunpick.domain.exclusive.repository;

import com.backend.sunpick.domain.exclusive.entity.ExclusiveSaleEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExclusiveSaleEventRepository extends JpaRepository<ExclusiveSaleEvent, Integer> {

}
