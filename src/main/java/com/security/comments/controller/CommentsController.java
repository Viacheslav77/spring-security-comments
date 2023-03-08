package com.security.comments.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.security.comments.mapping.CommentsMapper;

@Controller
@RequestMapping("/comments")
public class CommentsController {

    private final CommentsMapper commentsMapper;

    public CommentsController(CommentsMapper commentsMapper) {
        this.commentsMapper = commentsMapper;
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/all")
    public String readAllComments() {
        return "home";
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/update")
    public String updateAllComments(Model model) {
        model.addAttribute("comments", commentsMapper.updateAll());
        return "comments-list";
    }

}
