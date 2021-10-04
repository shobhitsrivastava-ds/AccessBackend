package com.msaccess.AccessBackend.repository;
import com.fasterxml.jackson.core.JsonParser;
import com.msaccess.AccessBackend.models.ClaimJsonData;
import com.msaccess.AccessBackend.models.Claims;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClaimRepository extends CrudRepository<Claims, Integer> {
    @Query(value= "select data from Claims", nativeQuery = true)
    List<ClaimJsonData> getDataById(Integer id);
}

//@Query(value= "select * from Claims where json_contains(claimId, '{\"claimId\": ?1 \"\"}')", nativeQuery = true)
