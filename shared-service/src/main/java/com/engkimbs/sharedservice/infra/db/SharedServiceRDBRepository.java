package com.engkimbs.sharedservice.infra.db;

import com.engkimbs.sharedservice.domain.entity.AreaMst;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SharedServiceRDBRepository extends JpaRepository<AreaMst, Long> {
}