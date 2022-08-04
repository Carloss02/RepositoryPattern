package com.practicaRest.models;
// Generated 19/06/2022 07:44:57 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Departments generated by hbm2java
 */
@Entity
@Table(name="DEPARTMENTS"
    ,schema="HR"
)
public class Departments  implements java.io.Serializable {


     private short departmentId;
     private String departmentName;
     private Integer managerId;
     private Short locationId;

    public Departments() {
    }

	
    public Departments(short departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }
    public Departments(short departmentId, String departmentName, Integer managerId, Short locationId) {
       this.departmentId = departmentId;
       this.departmentName = departmentName;
       this.managerId = managerId;
       this.locationId = locationId;
    }
   
    @Id 
    @Column(name="DEPARTMENT_ID", unique=true, nullable=false, precision=4, scale=0)
    public short getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(short departmentId) {
        this.departmentId = departmentId;
    }

    
    @Column(name="DEPARTMENT_NAME", nullable=false, length=30)
    public String getDepartmentName() {
        return this.departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    
    @Column(name="MANAGER_ID", precision=6, scale=0)
    public Integer getManagerId() {
        return this.managerId;
    }
    
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    
    @Column(name="LOCATION_ID", precision=4, scale=0)
    public Short getLocationId() {
        return this.locationId;
    }
    
    public void setLocationId(Short locationId) {
        this.locationId = locationId;
    }




}


