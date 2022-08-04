package com.practicaRest.models;
// Generated 20/06/2022 09:42:49 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Countries generated by hbm2java
 */
@Entity
@Table(name="COUNTRIES"
    ,schema="HR"
)
public class Countries  implements java.io.Serializable {


     private String countryId;
     private String countryName;
     private BigDecimal regionId;

    public Countries() {
    }

	
    public Countries(String countryId) {
        this.countryId = countryId;
    }
    public Countries(String countryId, String countryName, BigDecimal regionId) {
       this.countryId = countryId;
       this.countryName = countryName;
       this.regionId = regionId;
    }
   
    @Id 
    @Column(name="COUNTRY_ID", unique=true, nullable=false, length=2)
    public String getCountryId() {
        return this.countryId;
    }
    
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    
    @Column(name="COUNTRY_NAME", length=40)
    public String getCountryName() {
        return this.countryName;
    }
    
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    
    @Column(name="REGION_ID", precision=22, scale=0)
    public BigDecimal getRegionId() {
        return this.regionId;
    }
    
    public void setRegionId(BigDecimal regionId) {
        this.regionId = regionId;
    }




}

