package com.security.comments.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.security.comments.model.Comment;

@Repository
public interface CommentsRepository extends JpaRepository<Comment, Long> {

}
