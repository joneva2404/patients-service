CREATE SCHEMA IF NOT EXISTS patients_service;

CREATE TABLE patients_service.patients_details
(
	pd_id BIGINT PRIMARY KEY,
	pd_first_name VARCHAR(100) NOT NULL,
	pd_middle_name VARCHAR(100),
	pd_last_name VARCHAR(100),
	pd_dob DATE NOT NULL,
    gender VARCHAR(10) CHECK (gender IN ('Male', 'Female', 'Other')),
    contact_number CHAR(10),
    email VARCHAR(100),
    address TEXT,
    medical_history_summary TEXT,
    blood_type VARCHAR(3),
    allergies TEXT,
    chronic_conditions TEXT,
    emergency_contact_name VARCHAR(100),
    emergency_contact_number CHAR(10),
    insurance_provider VARCHAR(100),
    insurance_number VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)