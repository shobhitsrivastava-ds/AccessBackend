package com.msaccess.AccessBackend.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProviderData {
    String ProviderName;
    String Organization;
    String LastOrganization;
    String LicenseNumber;
    String WorkExperience;

    public ProviderData() {
    }

    public ProviderData(String providerName, String organization, String lastOrganization, String licenseNumber, String workExperience) {
        ProviderName = providerName;
        Organization = organization;
        LastOrganization = lastOrganization;
        LicenseNumber = licenseNumber;
        WorkExperience = workExperience;
    }
}