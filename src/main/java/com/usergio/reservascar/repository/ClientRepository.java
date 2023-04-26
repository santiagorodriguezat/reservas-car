package com.usergio.reservascar.repository;

import com.usergio.reservascar.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
}
