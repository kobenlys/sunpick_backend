package com.backend.sunpick.domain.point.repository;

import com.backend.sunpick.domain.point.entity.SunpickPointHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SunpickPointHistoryRepository extends JpaRepository<SunpickPointHistory, Integer> {

}
