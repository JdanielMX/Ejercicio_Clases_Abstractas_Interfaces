/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemonpoo;

import pokemonpoo.logica.PokemonPlanta;

/**
 *
 * @author JDANIEL
 */
public class Bulbasur extends Pokemon implements PokemonPlanta{

    public Bulbasur() {
    }

    public Bulbasur(int num_pokedex, String nombre_pokemon, double peso, String temporada) {
        super(num_pokedex, nombre_pokemon, peso, temporada);
    }

    
    
     @Override
    public void placaje() {

        System.out.println("Bulbasur usa placaje");

    }

    @Override
    public void arañaje() {

        System.out.println("Bulbasur usa arañaso");
    }

    @Override
    public void mordida() {

        System.out.println("Bulbasur usa mordida");

    }

    @Override
    public void atacarParalizar() {

                System.out.println("Bulbasur usa paralizar");

    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasur usa drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasur usa hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasur usa latigo cepa");
    }

    
   
}
