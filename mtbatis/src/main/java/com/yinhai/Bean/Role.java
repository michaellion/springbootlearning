package com.yinhai.Bean;

import lombok.Data;

import java.math.BigInteger;
import java.util.List;

public @Data class Role {
    private BigInteger id;
    private BigInteger roleid;
    private BigInteger userId;
    private String roleName;
    private String description;
    private List<Right> rights;
    private List<User> users;
}
