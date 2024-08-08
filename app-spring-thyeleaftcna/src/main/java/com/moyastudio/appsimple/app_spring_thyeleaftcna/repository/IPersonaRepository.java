package com.moyastudio.appsimple.app_spring_thyeleaftcna.repository;

import com.moyastudio.appsimple.app_spring_thyeleaftcna.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
