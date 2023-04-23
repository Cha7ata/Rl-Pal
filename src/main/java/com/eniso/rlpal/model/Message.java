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
@Table(name = "message")
@NoArgsConstructor
@AllArgsConstructor
public class Message extends AbstractEntity{

    @Column(name = "contenu")
    private String contenu;

    @ManyToOne
    private User user;
}
