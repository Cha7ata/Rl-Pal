package com.eniso.rlpal.services;

import com.eniso.rlpal.dto.MessageDto;

import java.util.List;

public interface IMessageService {
    List<MessageDto> findAll();

    MessageDto findById(Integer id);

    MessageDto save(MessageDto dto);
}
