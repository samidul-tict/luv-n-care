package com.learning.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.learning.academy.model.Stuff;

@Repository
public interface StuffRepository extends JpaRepository<Stuff, String> {
}
