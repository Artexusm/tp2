package org.example.tp2oussama.service;


import org.example.tp2oussama.entities.Consultation;
import org.example.tp2oussama.entities.Medecin;
import org.example.tp2oussama.entities.Patient;
import org.example.tp2oussama.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
