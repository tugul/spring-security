package com.oreilly.security.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oreilly.security.domain.entities.AutoUser;

public interface AutoUserRepository extends JpaRepository<AutoUser, Long> {

}
