package com.msaccess.AccessBackend.models;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class ClaimJsonData {
    int ClaimId;
    String ProviderName;
    String ProvidersOrganization;
    String ProvidersLastOrganization;
    String ProviderTotalWorkExp;
    String LicenseNumber;
    String PatientName;
    String PatientPostalCode;
    String GenderCode;
    List<String> Services;
    String ClaimDate;
    int ClaimAmount;
    String ClaimStatus;

    public ClaimJsonData() {
    }

    public ClaimJsonData(int claimId, String providerName, String providersOrganization, String providersLastOrganization, String providerTotalWorkExp, String licenseNumber, String patientName, String patientPostalCode, String genderCode, List<String> services, String claimDate, int claimAmount, String claimStatus) {
        ClaimId = claimId;
        ProviderName = providerName;
        ProvidersOrganization = providersOrganization;
        ProvidersLastOrganization = providersLastOrganization;
        ProviderTotalWorkExp = providerTotalWorkExp;
        LicenseNumber = licenseNumber;
        PatientName = patientName;
        PatientPostalCode = patientPostalCode;
        GenderCode = genderCode;
        Services = services;
        ClaimDate = claimDate;
        ClaimAmount = claimAmount;
        ClaimStatus = claimStatus;
    }

}
