-- Create a sequence
CREATE SEQUENCE patients_service.pd_id_seq;

-- Alter the pd_id column to use the sequence
ALTER TABLE patients_service.patients_details
ALTER COLUMN pd_id SET DEFAULT nextval('patients_service.pd_id_seq');

-- Set the sequence's ownership to the pd_id column
ALTER SEQUENCE patients_service.pd_id_seq
OWNED BY patients_service.patients_details.pd_id;
