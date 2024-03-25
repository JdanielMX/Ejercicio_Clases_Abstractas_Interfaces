/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpoo;

/**
 *
 * @author JDANIEL
 */
public abstract class Pokemon {

    private int num_pokedex;
    private String nombre_pokemon;
    private double peso;
    private String temporada;

    public Pokemon() {
    }

    public Pokemon(int num_pokedex, String nombre_pokemon, double peso, String temporada) {
        this.num_pokedex = num_pokedex;
        this.nombre_pokemon = nombre_pokemon;
        this.peso = peso;
        this.temporada = temporada;
    }
    
    

    public abstract void placaje();

    public abstract void arañaje();

    public abstract void mordida();

}
