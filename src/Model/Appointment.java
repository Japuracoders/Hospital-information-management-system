package Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private Patient patient;
    private LocalDate appointmentDate;
    private LocalTime time;
    private String symptoms;
    private int appointmentNo;
    private MedicalOfficer medicalOfficer;
    private AppointmentStatus appointmentStatus;
    private static int appointmentCounter;

    public Appointment(Patient patient,LocalDate appointmentDate,LocalTime time,String symptoms,int appointmentNo,MedicalOfficer medicalOfficer,AppointmentStatus appointmentStatus){
        this.setPatient(patient);
        this.setAppointmentDate(appointmentDate);
        this.setTime(time);
        this.setSymptoms(symptoms);
        this.setAppointmentNo(appointmentNo);
        this.setMedicalOfficer(medicalOfficer);
        this.setStatus(appointmentStatus);
        appointmentCounter++;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public void setAppointmentNo(int appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    public void setMedicalOfficer(MedicalOfficer medicalOfficer) {
        this.medicalOfficer = medicalOfficer;
    }

    public void setStatus(AppointmentStatus appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }


    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = LocalDate.now();
    }

    public void setTime(LocalTime time) {
        this.time = LocalTime.now();
    }


    public void setAppointmentCounter(int appointmentCounter) {
        Appointment.appointmentCounter = appointmentCounter;
    }


    public LocalDate getAppointmentDate() {
        return this.appointmentDate;
    }

    public LocalTime getTime() {
        return this.time;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public String getSymptoms() {
        return this.symptoms;

    }

    public int getAppointmentNo() {
        return this.appointmentNo;
    }

    public AppointmentStatus getAppointmentStatus() {
        return this.appointmentStatus;}

    public int getAppointmentCounter() {
        return Appointment.appointmentCounter;
    }

    @Override
    public String toString(){
        return this.getPatient()+ "," + this.getAppointmentDate()+ "," + this.getPatient()+ "," + this.getTime()+ "," + this.getSymptoms()+ "," + this.getAppointmentNo()+","+this.getAppointmentStatus();
    }
}
