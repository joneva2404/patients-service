package com.joneva.patients_service.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "patients_details", schema = "patients_service")
@Getter
@Setter
@NoArgsConstructor
public class PatientDetails {

    @Id
    @Column(name = "pd_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pd_first_name")
    @JsonProperty("firstName")
    private String firstName;

    @Column(name = "pd_middle_name")
    @JsonProperty("middleName")
    private String middleName;

    @Column(name = "pd_last_name")
    @JsonProperty("lastName")
    private String lastName;

    @Column(name = "pd_dob")
    @JsonProperty("dateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name = "gender")
    @JsonProperty("gender")
    private String gender;

    @Column(name = "contact_number")
    @JsonProperty("contactNumber")
    private String contactNumber;

    @Column(name = "email")
    @JsonProperty("email")
    private String email;

    @Column(name = "address")
    @JsonProperty("address")
    private String address;

    @Column(name = "medical_history_summary")
    @JsonProperty("medicalHistorySummary")
    private String medicalHistorySummary;

    @Column(name = "blood_type")
    @JsonProperty("bloodType")
    private String bloodType;

    @Column(name = "allergies")
    @JsonProperty("allergies")
    private String allergies;

    @Column(name = "chronic_conditions")
    @JsonProperty("chronicConditions")
    private String chronicConditions;

    @Column(name = "emergency_contact_name")
    @JsonProperty("emergencyContactName")
    private String emergencyContactName;

    @Column(name = "emergency_contact_number")
    @JsonProperty("emergencyContactNumber")
    private String emergencyContactNumber;

    @Column(name = "insurance_provider")
    @JsonProperty("insuranceProvider")
    private String insuranceProvider;

    @Column(name = "insurance_number")
    @JsonProperty("insuranceNumber")
    private String insuranceNumber;

}
