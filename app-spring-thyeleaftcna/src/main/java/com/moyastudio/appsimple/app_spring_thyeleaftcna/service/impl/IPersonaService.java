package com.moyastudio.appsimple.app_spring_thyeleaftcna.service.impl;

import com.moyastudio.appsimple.app_spring_thyeleaftcna.entities.Persona;

import java.util.List;

public interface IPersonaService {

    List<Persona> obtenerTodas();

    Persona obtenerPorId(Long id);

    Persona crearPersona(Persona persona);

    Persona actualizarPersona(Persona persona);

    void eliminarPersona(Long id);
}
