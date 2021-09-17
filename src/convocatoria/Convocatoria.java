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
 * @author Jose and Sebas
 */
public class Convocatoria {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
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
                                      
                    do{
                        System.out.println("Digite el/los nombre(s): ");
                        jugadores[contador].setNombre(entrada.next());
                    }while(jugadores[contador].getNombre()==null || jugadores[contador].getNombre().equals(""));
                    
                    do{
                        System.out.println("Digite los apellidos: ");
                        jugadores[contador].setApellidos(entrada.next());
                    }while(jugadores[contador].getApellidos()==null || jugadores[contador].getApellidos().equals(""));
                    
                    do{ 
                        System.out.println("Digite el dorsal: ");
                        jugadores[contador].setNumeroCamiseta(entrada.next());                                   
                    }while(jugadores[contador].getNumeroCamiseta()==null || jugadores[contador].getNumeroCamiseta().equals(""));
                    
                    do{
                        System.out.println("Digite la posición: ");
                        jugadores[contador].setPosicion(entrada.next());
                    }while(jugadores[contador].getPosicion()==null || jugadores[contador].getPosicion().equals(""));
                    
                    do{
                        System.out.println("Digite la edad: ");
                        jugadores[contador].setEdad(entrada.next());
                    }while(jugadores[contador].getEdad()==null || jugadores[contador].getEdad().equals(""));
                    
                    do{
                        System.out.println("Digite el equipo donde juega: ");
                        jugadores[contador].setEquipoJugador(entrada.next());
                    }while(jugadores[contador].getEquipoJugador()==null || jugadores[contador].getEquipoJugador().equals(""));
                    
                    contador++;
                    
                    break;
                   
                case 2:
                    
                    System.out.println("Digite el dorsal del jugador:");
                    int dorsal = entrada.nextInt();
                    int contadoruno=0;
                    for(int i=0; i<contador; i++){
                    
                        if(dorsal == Integer.parseInt(jugadores[i].getNumeroCamiseta())){
                            
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
                            
                                do{
                                    jugadores[i].setNombre("");
                                    System.out.println("Digite el/los nombre(s): ");
                                    jugadores[i].setNombre(entrada.next());
                                }while(jugadores[i].getNombre()==null || jugadores[i].getNombre().equals(""));

                                do{
                                    jugadores[i].setApellidos("");
                                    System.out.println("Digite los apellidos: ");
                                    jugadores[i].setApellidos(entrada.next());
                                }while(jugadores[i].getApellidos()==null || jugadores[i].getApellidos().equals(""));

                                do{ 
                                    jugadores[i].setNumeroCamiseta("");
                                    System.out.println("Digite el dorsal: ");
                                    jugadores[i].setNumeroCamiseta(entrada.next());                                   
                                }while(jugadores[i].getNumeroCamiseta()==null || jugadores[i].getNumeroCamiseta().equals(""));

                                do{
                                    jugadores[i].setPosicion("");
                                    System.out.println("Digite la posición: ");
                                    jugadores[i].setPosicion(entrada.next());
                                }while(jugadores[i].getPosicion()==null || jugadores[i].getPosicion().equals(""));

                                do{
                                    jugadores[i].setEdad("");
                                    System.out.println("Digite la edad: ");
                                    jugadores[i].setEdad(entrada.next());
                                }while(jugadores[i].getEdad()==null || jugadores[i].getEdad().equals(""));

                                do{
                                    jugadores[i].setEquipoJugador("");
                                    System.out.println("Digite el equipo donde juega: ");
                                    jugadores[i].setEquipoJugador(entrada.next());
                                }while(jugadores[i].getEquipoJugador()==null || jugadores[i].getEquipoJugador().equals(""));
                            
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
