package com.eniso.rlpal.services;

import com.eniso.rlpal.dto.ListAmiDto;

import java.util.List;

public interface IListAmiService {
    List<ListAmiDto> findAll();

    ListAmiDto findById(Integer id);

    ListAmiDto save(ListAmiDto dto);
}
