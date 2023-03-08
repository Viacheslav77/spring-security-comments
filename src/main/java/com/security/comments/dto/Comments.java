package com.security.comments.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Comments {

    @JsonProperty(value = "comments")
    private List<CommentDTO> comments;

    @JsonProperty(value = "total")
    private Long total;

    @JsonProperty(value = "skip")
    private Long skip;

    @JsonProperty(value = "limit")
    private Long limit;

}
