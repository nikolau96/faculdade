package com.media.notas.controllers;


import org.springframework.web.bind.annotation.*;


@RestController
public class MediaController {
    @GetMapping("/notas")
    public double calcularMedia(@RequestParam double notaInstrumento1, @RequestParam double notaInstrumento2, @RequestParam double notaProvaOficial){
        double notaFinal = notaInstrumento1 + notaInstrumento2 + notaProvaOficial;
        return notaFinal;
    }
}
