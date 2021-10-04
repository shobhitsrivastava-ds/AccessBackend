package com.msaccess.AccessBackend.Service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.msaccess.AccessBackend.models.ClaimJsonData;
import com.msaccess.AccessBackend.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.List;

@Component
public class DataService {

    @Autowired
    ClaimRepository claimRepository;

    public List<ClaimJsonData> returnClaims(int claimId) throws IOException {
        //ObjectMapper objectMapper = new ObjectMapper();
        //List<ClaimJsonData> langList = objectMapper.readValue((JsonParser) claimRepository.getDataById(claimId), new TypeReference<List<ClaimJsonData>>(){});
        //read json file and convert to customer object
       // List<ClaimJsonData> result = (List<ClaimJsonData>) objectMapper.readValue((JsonParser) claimRepository.getDataById(claimId), ClaimJsonData.class);
//        List<ClaimJsonData> a= new ArrayList<ClaimJsonData>();
//        a.add(new ClaimJsonData(111, "ffsdf","fdsfs", "fsdf","rewrw","srewr","rwer","ewrew","ffef",new ArrayList<>(), "34234", 343243,"r3rewr"));
//        a.add(new ClaimJsonData(111, "ffsdf","fdsfs", "fsdf","rewrw","srewr","rwer","ewrew","ffef",new ArrayList<>(), "34234", 343243,"r3rewr"));
//        a.add(new ClaimJsonData(111, "ffsdf","fdsfs", "fsdf","rewrw","srewr","rwer","ewrew","ffef",new ArrayList<>(), "34234", 343243,"r3rewr"));
//        return(a);
        //System.out.println("RESULT:::::::::::::::: "+ result);
        return (List<ClaimJsonData>)claimRepository.getDataById(claimId);
    }

    public List<ClaimJsonData> returnPatients() throws IOException
    {
        return null;
    }
    public List<ClaimJsonData> returnProviders() throws IOException
    {
        return null;
    }
}
