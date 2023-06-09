package com.usergio.reservascar.repository;

import com.usergio.reservascar.model.GamaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamaRepository extends JpaRepository<GamaModel, Integer> {
}
