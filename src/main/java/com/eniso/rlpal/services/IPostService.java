package com.eniso.rlpal.services;

import com.eniso.rlpal.dto.PostDto;
import com.eniso.rlpal.model.Post;
import com.eniso.rlpal.model.User;

import java.util.List;

public interface IPostService {
    PostDto save(Post dto);

    List<PostDto> findAll();

    void delete(Integer id);

    void update(Integer id, String title, String value);

    void update(Integer id, String contenue, User user);

    PostDto findById(Integer id);

    PostDto save(PostDto dto);
}
