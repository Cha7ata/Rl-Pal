package com.eniso.rlpal.services;

import com.eniso.rlpal.dto.PostDto;

import java.util.List;

public interface IPostService {
    List<PostDto> findAll();

    PostDto findById(Integer id);

    PostDto save(PostDto dto);
}
