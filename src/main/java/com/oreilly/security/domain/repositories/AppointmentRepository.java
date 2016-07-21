package com.oreilly.security.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oreilly.security.domain.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
