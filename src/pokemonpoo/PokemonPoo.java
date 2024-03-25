/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemonpoo;

/**
 *
 * @author JDANIEL
 */
public class PokemonPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Bulbasur bulbasur = new Bulbasur();
        Pikachu pikachu = new  Pikachu();
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        
        
        
        bulbasur.atacarLatigoCepa();
        pikachu.atacarImpactrueno();
        squirtle.atacarHidrobomba();
        charmander.atacarLanzallamas();
    }
    
}
