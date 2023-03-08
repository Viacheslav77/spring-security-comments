package com.security.comments.mapping;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;
import com.security.comments.dto.Comments;
import com.security.comments.mapping.base.BaseMapper;
import com.security.comments.model.Comment;
import com.security.comments.service.CommentsService;

@Service
public class CommentsMapper implements BaseMapper {

    private final CommentsService commentsService;

    public CommentsMapper(CommentsService commentsService) {
        this.commentsService = commentsService;
    }

    public List<Comment> updateAll() {

        Comments origCommentsByUrl = commentsService.getAllByURL();

        if (origCommentsByUrl == null || origCommentsByUrl.getComments() == null) {
            throw new EntityNotFoundException();
        }

        List<Comment> comments = origCommentsByUrl.getComments()
                .stream()
                .filter(Objects::nonNull)
                .map(c -> map(c, Comment.class)
                        .setUsername(Comment.getCapitalizeName(c.getUser().getUsername()))
                        .setUpdatedAt(Comment.getCarrentDate()))
                .collect(Collectors.toList());

        commentsService.updateAll(comments);

        comments.forEach(System.out::println);

        return commentsService.getAllByDB();

    }

}
