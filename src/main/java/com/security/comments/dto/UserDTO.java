package com.security.comments.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

@Data
public class UserDTO {
    
    @JsonProperty(value = "id")
    private long id;  
    
    @JsonProperty(value = "username")
    private String username;

}
