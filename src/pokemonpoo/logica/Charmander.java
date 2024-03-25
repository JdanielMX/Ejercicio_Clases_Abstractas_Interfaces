/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpoo;

import pokemonpoo.logica.*;

/**
 *
 * @author JDANIEL
 */
public class Charmander extends Pokemon implements PokemonFuego {

    public Charmander() {
    }

    public Charmander(int num_pokedex, String nombre_pokemon, double peso, String temporada) {
        super(num_pokedex, nombre_pokemon, peso, temporada);
    }

    @Override
    public void placaje() {

        System.out.println("Charmander usa placaje");

    }

    @Override
    public void arañaje() {

        System.out.println("Charmander usa arañaso");
    }

    @Override
    public void mordida() {

        System.out.println("Charmander usa mordida");

    }

    @Override
    public void atacarPunioFuego() {

        System.out.println("Charmander usa puño fuego");

    }

    @Override
    public void atacarAscuas() {

        System.out.println("Charmander usa ascuas");

    }

    @Override
    public void atacarLanzallamas() {

        System.out.println("Charmander usa lanza llamas");

    }

}
