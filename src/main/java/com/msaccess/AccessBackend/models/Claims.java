package com.msaccess.AccessBackend.models;

import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="Claims")
@Entity
public class Claims {
    @Id
    @Column(name="id")
    private int claimId;

    @Column(name = "data", columnDefinition = "json")
    @JsonRawValue
    private String data;

    public Claims() {
    }

    public Claims(int claimId, String data) {
        this.claimId = claimId;
        this.data = data;
    }

    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
