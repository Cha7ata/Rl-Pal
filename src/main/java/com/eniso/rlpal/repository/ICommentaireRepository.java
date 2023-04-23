package com.eniso.rlpal.repository;

import com.eniso.rlpal.model.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentaireRepository extends JpaRepository<Commentaire,Integer> {
}
