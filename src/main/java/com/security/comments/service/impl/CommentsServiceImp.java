package com.security.comments.service.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.security.comments.dto.Comments;
import com.security.comments.model.Comment;
import com.security.comments.repository.CommentsRepository;
import com.security.comments.service.CommentsService;

import org.springframework.beans.factory.annotation.Value;

@Service
public class CommentsServiceImp implements CommentsService {

    @Value("${storage.comments.url}")
    private String strUrl;

    private final CommentsRepository repository;

    public CommentsServiceImp(CommentsRepository repository) {
        this.repository = repository;
    }

    @Override
    public Comments getAllByURL() {
        return get(getUrl(), Comments.class);
    }

    public <T> T get(URL url, Class<T> type) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(url, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private URL getUrl() {
        URL url = null;
        try {
            url = new URL(strUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    @Override
    public List<Comment> updateAll(List<Comment> comments) {
        repository.saveAll(comments);
        return comments;
    }

    @Override
    public List<Comment> getAllByDB() {
        return repository.findAll();
    }

}
