package com.bobbyCRUD.jugtours.repository;

import com.bobbyCRUD.jugtours.model.OLD_ENTITY.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<EventEntity, Long> {
    EventEntity findByTitle(String name);
}