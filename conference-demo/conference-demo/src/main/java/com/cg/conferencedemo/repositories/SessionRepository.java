package com.cg.conferencedemo.repositories;

import com.cg.conferencedemo.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {

}
