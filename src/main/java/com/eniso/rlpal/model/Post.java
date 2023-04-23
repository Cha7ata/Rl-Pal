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
@Table(name = "post")
@NoArgsConstructor
@AllArgsConstructor
public class Post extends AbstractEntity{

    @Column(name = "contenu")
    private String contenu;

    @ManyToOne
    private User user;
}
