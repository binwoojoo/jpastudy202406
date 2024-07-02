package com.spring.jpastudy.event.repository;

import com.spring.jpastudy.event.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long>, EventRepositoryCustom {
}
