package com.joneva.patients_service.service;

import com.joneva.patients_service.dao.PatientDetails;
import com.joneva.patients_service.repository.PatientsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientsService {
    private final PatientsRepository patientsRepository;

    public PatientsService(PatientsRepository patientsRepository) {
        this.patientsRepository = patientsRepository;
    }

    public List<PatientDetails> getPatients(){
        return patientsRepository.findAll();
    }

    public Optional<PatientDetails> getPatient(Long id){
        return patientsRepository.findById(id);
    }

    public PatientDetails createPatient(PatientDetails patientDetails) {
//        patientDetails.setId(1L);
        return patientsRepository.save(patientDetails);
    }

    public PatientDetails updatePatient(Long id, PatientDetails patientDetails) {
        return patientsRepository.findById(id).map(existingPatient -> {
            existingPatient.setFirstName(patientDetails.getFirstName());
            existingPatient.setMiddleName(patientDetails.getMiddleName());
            existingPatient.setLastName(patientDetails.getLastName());
            existingPatient.setDateOfBirth(patientDetails.getDateOfBirth());
            existingPatient.setGender(patientDetails.getGender());
            existingPatient.setContactNumber(patientDetails.getContactNumber());
            existingPatient.setEmail(patientDetails.getEmail());
            existingPatient.setAddress(patientDetails.getAddress());
            existingPatient.setMedicalHistorySummary(patientDetails.getMedicalHistorySummary());
            existingPatient.setBloodType(patientDetails.getBloodType());
            existingPatient.setAllergies(patientDetails.getAllergies());
            existingPatient.setChronicConditions(patientDetails.getChronicConditions());
            existingPatient.setEmergencyContactName(patientDetails.getEmergencyContactName());
            existingPatient.setEmergencyContactNumber(patientDetails.getEmergencyContactNumber());
            existingPatient.setInsuranceProvider(patientDetails.getInsuranceProvider());
            existingPatient.setInsuranceNumber(patientDetails.getInsuranceNumber());
            return patientsRepository.save(existingPatient);
        }).orElseGet(() -> {
            return patientsRepository.save(patientDetails);
        });
    }
}
