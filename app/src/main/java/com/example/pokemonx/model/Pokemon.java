package com.example.pokemonx.model;

    public abstract class Pokemon {
        public int numPokedex;
        public String nombre;
        public double peso;
    public String sexo;
    public int temporadaAparicion;

    abstract void atacarPlacaje();

    abstract void atacarAraniazo();

    abstract void atacarMordisco();
}
