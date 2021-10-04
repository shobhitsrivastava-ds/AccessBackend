package com.msaccess.AccessBackend.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ClaimsData {
    int ClaimId;
    String ProviderName;
    String PatientName;
    int ClaimAmount;
    String Status;

    public ClaimsData() {
    }

    public ClaimsData(int claimId, String providerName, String patientName, int claimAmount, String status) {
        ClaimId = claimId;
        ProviderName = providerName;
        PatientName = patientName;
        ClaimAmount = claimAmount;
        Status = status;
    }
}