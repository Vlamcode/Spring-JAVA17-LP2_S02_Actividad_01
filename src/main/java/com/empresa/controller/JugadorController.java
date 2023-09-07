package com.empresa.controller;

import com.empresa.entity.Jugador;
import com.empresa.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class JugadorController {

    @Autowired
    private JugadorService service;

    @GetMapping(value = "/verJugador")
    public String verJugador() {
        return "registraJugador";
    }

    @PostMapping("/registraJugador")
    @ResponseBody
    public Map<?, ?> registra(Jugador obj) {
        HashMap<String, String> map = new HashMap<>();
        Jugador objSalida = service.insertaJugador(obj);

        if (objSalida == null) {
            map.put("MENSAJE", "Error en el registro");
        } else {
            map.put("MENSAJE", "Registro exitoso");
        }
        return map;
    }
}
