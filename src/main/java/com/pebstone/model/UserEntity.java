package com.pebstone.model;

import java.util.Date;


import lombok.Data;

@Data
public class UserEntity {

    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String countryCode;

    private String password;

    private Boolean isEmailConfirmed;

    private Boolean isPhoneConfirmed;

    private Date createdTime;

    private Integer modifiedBy;

    private Long modifiedTime;

    private Boolean isActive;

    private Boolean isDeleted;

    private Integer roleId;

    private String authToken;

    private String jabberedId;

    private String jabberedPassword;

    private Date loginTime;

    private Integer loginCount;

    private String childList;

    private Integer schoolId;

    private boolean isPaymentEnabled;

    private boolean isTncAccepted;

    private String source;

    private String pincode;

    private String accountList;

    private Date birthDate;

    private String enrollmentId;

    private String rollNumber;

}
