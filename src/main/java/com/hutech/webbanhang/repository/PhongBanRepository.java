package com.hutech.webbanhang.repository;

import com.hutech.webbanhang.model.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan, Long> {
}