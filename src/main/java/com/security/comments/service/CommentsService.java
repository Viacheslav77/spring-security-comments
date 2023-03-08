package com.security.comments.service;

import java.util.List;

import com.security.comments.dto.Comments;
import com.security.comments.model.Comment;

public interface CommentsService {
    Comments getAllByURL();

    List<Comment> updateAll(List<Comment> comments);

    List<Comment> getAllByDB();
}
