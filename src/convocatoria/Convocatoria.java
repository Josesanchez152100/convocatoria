/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convocatoria;

import java.util.Scanner;
import jugadores.Jugador;

/**
 *
 * @author Jose
 */
public class Convocatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion, contador = 0;
        Jugador[] jugadores = new Jugador[23];
        do{
            
            System.out.println("Bienvenido a la convocatoria de la Selección Colombia");
            System.out.println("******************************************************");
            
            System.out.println("1. Agregar jugador");
            System.out.println("2. Buscar jugador");
            System.out.println("3. Editar jugador");
            System.out.println("4. Mostrar convocatoria");
            System.out.println("5. Salir");
            System.out.println("Digite una opción");
            opcion=entrada.nextInt();
            
            switch(opcion){
                
                case 1:
                    
                    System.out.println("Registro de jugador: ");
                    System.out.println("");
                    
                    jugadores[contador]=new Jugador();
                    
                    jugadores[contador].setId(contador);
                    
                    System.out.println("Digite el nombre: ");
                    jugadores[contador].setNombre(entrada.next());
                    
                    System.out.println("Digite los apellidos: ");
                    jugadores[contador].setApellidos(entrada.next());
                    
                    System.out.println("Digite el dorsal: ");
                    jugadores[contador].setNumeroCamiseta(entrada.nextInt());
                    
                    System.out.println("Digite la posición: ");
                    jugadores[contador].setPosicion(entrada.next());
                    
                    System.out.println("Digite la edad: ");
                    jugadores[contador].setEdad(entrada.nextInt());
                    
                    System.out.println("Digite el equipo donde juega: ");
                    jugadores[contador].setEquipoJugador(entrada.next());
                                                          
                    contador++;
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Digite el dorsal del jugador:");
                    int dorsal = entrada.nextInt();
                    int contadoruno=0;
                    for(int i=0; i<contador; i++){
                    
                        if(dorsal == jugadores[i].getNumeroCamiseta()){
                            
                        System.out.println("Id: "+jugadores[i].getId());
                        System.out.println("Nombre: "+jugadores[i].getNombre());
                        System.out.println("Apellidos: "+jugadores[i].getApellidos());
                        System.out.println("Dorsal: "+jugadores[i].getNumeroCamiseta());
                        System.out.println("Posición: "+jugadores[i].getPosicion());
                        System.out.println("Edad: "+jugadores[i].getEdad());
                        System.out.println("Equipo donde juega: "+jugadores[i].getEquipoJugador());
                        System.out.println("");
                            
                            break;
                         
                        }
                        contadoruno++;                                               
                    }
                    if(contadoruno==contador){
                        System.out.println("Ningún jugador convocado posee este dorsal");
                    }
                    
                    break;
                    
                case 3:
                   
                    System.out.println("Digite el id del jugador:");
                    int id = entrada.nextInt();
                    int contadordos=0;
                    for(int i=0; i<contador; i++){
                    
                        if(id == jugadores[i].getId()){
                            
                            System.out.println("Digite el nombre: ");
                            jugadores[i].setNombre(entrada.next());

                            System.out.println("Digite los apellidos: ");
                            jugadores[i].setApellidos(entrada.next());

                            System.out.println("Digite el dorsal: ");
                            jugadores[i].setNumeroCamiseta(entrada.nextInt());

                            System.out.println("Digite la posición: ");
                            jugadores[i].setPosicion(entrada.next());

                            System.out.println("Digite la edad: ");
                            jugadores[i].setEdad(entrada.nextInt());

                            System.out.println("Digite el equipo donde juega: ");
                            jugadores[i].setEquipoJugador(entrada.next());
                            
                            break;
                        
                        }
                          contadordos++;                                             
                    }
                    if(contadordos==contador){
                    System.out.println("Ningún jugador convocado posee este id");
                    }
                    break;        
                    
                case 4:
                    
                    System.out.println("Jugadores convocados:");
                    System.out.println("");
                    
                    for(int i=0; i<contador; i++){
                        
                        System.out.println("Id: "+jugadores[i].getId());
                        System.out.println("Nombre: "+jugadores[i].getNombre());
                        System.out.println("Apellidos: "+jugadores[i].getApellidos());
                        System.out.println("Dorsal: "+jugadores[i].getNumeroCamiseta());
                        System.out.println("Posición: "+jugadores[i].getPosicion());
                        System.out.println("Edad: "+jugadores[i].getEdad());
                        System.out.println("Equipo donde juega: "+jugadores[i].getEquipoJugador());
                        System.out.println("");
                        
                    }
                    
                    
                    break;
                    
                case 5:
                    
                    System.exit(0);
                    break;
                    
                default:
                    
                    break;               
                
            }
        
        }while(opcion != 5);
        
    }
    
}
