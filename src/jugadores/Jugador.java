/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugadores;

/**
 *
 * @authors Jose and Sebastian
 */
public class Jugador {
    
        //ATRIBUTOS = VARIABLES = DATOS
        private int id;
        private String nombre, apellidos, posicion, equipoJugador,numeroCamiseta, edad; 
                               
        //METODO=ACCION=FUNCION ESPECIAL=CONSTRUCTOR
    
        public Jugador() {
        }
    
        //METODOS=ACCIONES=FUNCIONES

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(String numeroCamiseta) {
        if(numeroCamiseta.matches("^[0-9]*$")){
            this.numeroCamiseta = numeroCamiseta;
        }else {
            System.out.println("El dorsal solo admite números");
	}
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        if(edad.matches("^[0-9]*$")){
            this.edad = edad;
        } else {
            System.out.println("La edad solo admite números");
	}        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { 
    	if(nombre.matches("^[a-zA-Z ]*$")){
            this.nombre = nombre;
	} else {
            System.out.println("El/los nombre(s) solo admite letras");
	}            
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if(apellidos.matches("^[a-zA-Z ]*$")){
            this.apellidos = apellidos;
        }else {
            System.out.println("El/los apellido(s) solo admiten letas");
	}
        
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        if(posicion.matches("^[a-zA-Z ]*$")){      
            this.posicion = posicion;
        }else {
            System.out.println("La posición solo admite letas");
	}
    }

    public String getEquipoJugador() {
        return equipoJugador;
    }

    public void setEquipoJugador(String equipoJugador) {
        if(equipoJugador.matches("^[a-zA-Z ]*$")){
            this.equipoJugador = equipoJugador;
        }else {
            System.out.println("El equipo solo admite letas");
	}
    }
        
        
}
