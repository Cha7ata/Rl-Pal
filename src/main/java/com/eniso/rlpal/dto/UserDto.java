package com.eniso.rlpal.dto;

import com.eniso.rlpal.model.Commentaire;
import com.eniso.rlpal.model.ListAmi;
import com.eniso.rlpal.model.Message;
import com.eniso.rlpal.model.Post;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String nom;
    private String prenom;
    private String email;
    private Date date_naissance;
    private String password;
    private String photo;
    private ListAmi listAmi;
    private List<Post> listPost;
    private List<Commentaire> listcommentaire;
    private List<Message> listmessage;
}
