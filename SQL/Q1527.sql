select * from Patients
where patient_id in 
(select distinct patient_id 
                from Patients 
 where conditions like 'DIAB1%' or conditions like '% DIAB1%')