package com.joneva.patients_service.repository;

import com.joneva.patients_service.dao.PatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsRepository extends JpaRepository<PatientDetails,Long> {
}
