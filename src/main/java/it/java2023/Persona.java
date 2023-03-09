package it.java2023;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Persona {

    private String nome,cognome,numeroTel;
    Condominio condominio;

}
