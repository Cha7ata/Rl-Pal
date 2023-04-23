package com.eniso.rlpal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "utilisateur")
@NoArgsConstructor
@AllArgsConstructor
public class User extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "date_naissance")
    private Date date_naissance;

    @Column(name = "password")
    private String password;

    @Column(name = "photo")
    private String photo;

    @ManyToOne(optional=false)
    @JoinColumn(name = "idlistami")
    private ListAmi listAmi;

    @Column(name = "listpost")
    @OneToMany(mappedBy= "user")
    private List<Post> listPost;

    @Column(name = "commentaire")
    @OneToMany(mappedBy= "user")
    private List<Commentaire> listcommentaire;

    @Column(name = "listmessage")
    @OneToMany(mappedBy= "user")
    private List<Message> listmessage;


}
