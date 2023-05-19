package com.usergio.reservascar.repository;

import com.usergio.reservascar.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
    @Query(value = "SELECT client.*,count(*) AS count_status FROM client\n" +
            "INNER JOIN reservation ON client.id = reservation.id_Client\n" +
            "WHERE reservation.status = 'completed'\n" +
            "GROUP BY client.id\n" +
            "ORDER BY count_status DESC", nativeQuery = true)
    List<ClientModel> findClientByStatusCompleted();
}
