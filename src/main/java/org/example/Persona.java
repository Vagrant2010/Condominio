package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Persona {

    private String nome,cognome,numeroTel;
    Condominio condominio;

}
