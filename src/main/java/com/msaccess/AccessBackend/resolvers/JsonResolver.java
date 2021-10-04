package com.msaccess.AccessBackend.resolvers;

import com.msaccess.AccessBackend.Service.DataService;
import com.msaccess.AccessBackend.models.*;
//import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class JsonResolver implements GraphQLQueryResolver {

    @Autowired
    DataService dataService;

    public List<ClaimJsonData> getAllClaims(String cId) throws IOException {
        int claimId = Integer.parseInt(cId);
        return dataService.returnClaims(claimId) ;
    }

    public List<ClaimJsonData> getAllPatients() {
        try{
            System.out.println(dataService.returnPatients());
            return dataService.returnPatients() ;
        }
        catch(Exception e)
        {
            return null;
        }
    }

    public List<ClaimJsonData> getAllProviders(){
        try{
            return dataService.returnProviders() ;
        }
        catch(Exception e)
        {
            return null;
        }
    }


}



//
//
//    [
//            {name: 'Profession', value: '1', checked: false},
//            {name: 'Name', value: '2', checked: false},
//            {name: 'Patients', value: '3', checked: false}
//            ],
//            [
//            {name: 'Name', value: '4', checked: false},
//            {name: 'Disease', value: '5', checked: false},
//            {name: 'Provider', value: '6', checked: false}
//            ],
//            [
//            {name: 'ClaimId', value: '7', checked: false},
//            {name: 'Amount', value: '8', checked: false},
//            {name: 'Status', value: '9', checked: false}
//            ]