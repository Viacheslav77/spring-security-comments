package com.security.comments.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CommentDTO {

    @JsonProperty(value = "id")
    private long id;

    @JsonProperty(value = "body")
    private String body;

    @JsonProperty(value = "postId")
    private long postId;

    @JsonProperty(value = "user")
    private UserDTO user;

}
