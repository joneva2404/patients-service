package com.joneva.patients_service.controller;

import com.joneva.patients_service.dao.PatientDetails;
import com.joneva.patients_service.service.PatientsService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientsService patientsService;

    public PatientController(PatientsService patientsService) {
        this.patientsService = patientsService;
    }

    @GetMapping
    @Operation(summary = "Get Patients", description = "Get all Patients")
    public ResponseEntity<List<PatientDetails>> getMapping(){
        return ResponseEntity.ok(patientsService.getPatients());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get Patient", description = "Get Patient by Id")
    public ResponseEntity<PatientDetails> getMapping(@PathVariable Long id){
        return patientsService.getPatient(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create Patient", description = "Create new Patient")
    public ResponseEntity<PatientDetails> createPatient(@RequestBody PatientDetails patientDetails){
        return ResponseEntity.ok(patientsService.createPatient(patientDetails));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update Patient", description = "Update Patient")
    public ResponseEntity<PatientDetails> updatePatientDetails(@PathVariable Long id, @RequestBody PatientDetails patientDetails) {
        return ResponseEntity.ok(patientsService.updatePatient(id,patientDetails));
    }

}
