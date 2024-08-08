package com.moyastudio.appsimple.app_spring_thyeleaftcna.service.impl;

import com.moyastudio.appsimple.app_spring_thyeleaftcna.entities.Persona;
import com.moyastudio.appsimple.app_spring_thyeleaftcna.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService{

    @Autowired
    public IPersonaRepository personaRepository;


    @Override
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Persona persona) {
        Persona personaActual = personaRepository.findById(persona.getId()).orElse(null);

        if(personaActual!=null){
            personaActual.setNombre(persona.getNombre());
            personaActual.setEdad(persona.getEdad());
            personaRepository.save(personaActual);
        }
        return null;
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }
}
