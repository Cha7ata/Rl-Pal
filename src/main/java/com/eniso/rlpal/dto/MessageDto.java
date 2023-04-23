package com.eniso.rlpal.dto;

import com.eniso.rlpal.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDto {

    private String contenu;
    private User user;
}
