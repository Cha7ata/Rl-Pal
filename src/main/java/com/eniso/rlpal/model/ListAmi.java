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
@Table(name = "listami")
@NoArgsConstructor
@AllArgsConstructor
public class ListAmi extends AbstractEntity{

    @Column(name = "listami")
    @OneToMany(mappedBy= "listAmi")
    private List<User> listAmi;
}

