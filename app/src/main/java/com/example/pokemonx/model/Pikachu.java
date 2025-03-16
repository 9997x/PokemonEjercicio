package com.example.pokemonx.model;

public class Pikachu extends Pokemon implements IElectrico {


    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y estoy atacando con impactrueno");

    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y estoy atacando con puño trueno");

    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Pikachu y estoy atacando con rayo");

    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y estoy atacando con rayo carga");

    }

    @Override
    void atacarPlacaje()
    {
        System.out.println("Soy Pikachu y estoy atacando con placaje");
    }

    @Override
    void atacarAraniazo() {
        System.out.println("Soy Pikachu y estoy atacando con arañazo");

    }

    @Override
    void atacarMordisco() {
        System.out.println("Soy Pikachu y estoy atacando con mordisco");

    }
}
