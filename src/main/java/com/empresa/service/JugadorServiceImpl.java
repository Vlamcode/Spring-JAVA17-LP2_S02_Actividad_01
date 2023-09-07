package com.empresa.service;

import com.empresa.entity.Jugador;
import com.empresa.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JugadorServiceImpl implements JugadorService {

    @Autowired
    private JugadorRepository repository;

    @Override
    public Jugador insertaJugador(Jugador obj) {
        return repository.save(obj);
    }
}
