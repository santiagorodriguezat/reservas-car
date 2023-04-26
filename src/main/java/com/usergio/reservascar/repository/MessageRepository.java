package com.usergio.reservascar.repository;

import com.usergio.reservascar.model.MessageModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageModel, Integer> {
}
