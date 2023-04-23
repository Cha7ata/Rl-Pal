package com.eniso.rlpal.repository;

import com.eniso.rlpal.model.ListAmi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IListAmiRepository extends JpaRepository<ListAmi,Integer> {
}
