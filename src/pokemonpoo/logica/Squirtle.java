/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpoo;

import pokemonpoo.logica.PokemonAgua;

/**
 *
 * @author JDANIEL
 */
public class Squirtle extends Pokemon implements PokemonAgua {

    public Squirtle() {
    }

    public Squirtle(int num_pokedex, String nombre_pokemon, double peso, String temporada) {
        super(num_pokedex, nombre_pokemon, peso, temporada);
    }

    @Override
    public void placaje() {

        System.out.println("Squirtle usa placaje");

    }

    @Override
    public void arañaje() {

        System.out.println("Squirtle usa arañaso");
    }

    @Override
    public void mordida() {

        System.out.println("Squirtle usa mordida");

    }

    @Override
    public void atacarHidrobomba() {

        System.out.println("Squirtle usa hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {

        System.out.println("Squirtle usa pistola agua");

    }

    @Override
    public void atacarBurbuja() {

        System.out.println("Squirtle usa borbuja");
    }

    @Override
    public void atacarHidropulso() {

        System.out.println("Squirtle usa hidropulso");

    }

}
