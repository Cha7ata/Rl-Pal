package com.eniso.rlpal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "commentaire")
@NoArgsConstructor
@AllArgsConstructor
public class Commentaire extends AbstractEntity{

    @Column(name = "contenu")
    private String contenu;

    @Column(name = "date_commentaire")
    private Date date_commentaire;

    @ManyToOne
    private User user;

}
