package com.eniso.rlpal.dto;

import com.eniso.rlpal.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentaireDto {

    private String contenu;
    private Date date_commentaire;
    private User user;
}
