/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpoo;

import pokemonpoo.logica.PokemonElectrico;

/**
 *
 * @author JDANIEL
 */
public class Pikachu extends Pokemon implements PokemonElectrico {

    public Pikachu() {
    }

    public Pikachu(int num_pokedex, String nombre_pokemon, double peso, String temporada) {
        super(num_pokedex, nombre_pokemon, peso, temporada);
    }

    @Override
    public void placaje() {

        System.out.println("Picachu usa placaje");

    }

    @Override
    public void arañaje() {

        System.out.println("Picachu usa arañaso");
    }

    @Override
    public void mordida() {

        System.out.println("Picachu usa mordida");

    }

    @Override
    public void atacarImpactrueno() {

        System.out.println("Picachu usa impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {

        System.out.println("Picachu usa puño trueno");

    }

    @Override
    public void atacarRayo() {

        System.out.println("Picachu usa ataque rayo");

    }

    @Override
    public void tacarRayoCarga() {

        System.out.println("Picachu usa rayo carga");

    }

}
