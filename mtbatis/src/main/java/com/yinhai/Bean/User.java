package com.yinhai.Bean;


import lombok.Data;

import java.math.BigInteger;
import java.util.List;


public @Data class User {
    private BigInteger id;
    private BigInteger userId;
    private String password;
    private String name;
    private String email;
    private String status;
    private List<Role> roles;
}
