package com.msaccess.AccessBackend.models;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PatientData {
    String PatientName;
    int TotalClaimAmount;
    String PatientPostalCode;

    public PatientData() {
    }

    public PatientData(String patientName, int totalClaimAmount, String patientPostalCode) {
        PatientName = patientName;
        TotalClaimAmount = totalClaimAmount;
        PatientPostalCode = patientPostalCode;
    }
}