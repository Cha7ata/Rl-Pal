package com.eniso.rlpal.services;

import com.eniso.rlpal.dto.CommentaireDto;

import java.util.List;

public interface ICommentaireService {
    List<CommentaireDto> findAll();

    CommentaireDto findById(Integer id);

    CommentaireDto save(CommentaireDto dto);
}
