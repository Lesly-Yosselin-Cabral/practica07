package mx.com.softgame.poo1game.personajes;


public class Personaje{
	//Atributos
	private String nombre;
	private int edad;

	//Métodos

	public void setNombre(String nombre){
        if(nombre.length() <= 10 || nombre.length() >= 3){
            this.nombre = nombre;
        }
	 	
	}

	public String getNombre(){
		return nombre;
	}

    public void saludar(){
	System.out.println("Hola Alumno de POO " + " " + nombre);
    }

    public int getEdad(){
    	return edad;
    }

    public boolean setEdad(int edad){
    	if(edad > 0 && edad <120){
    		this.edad = edad;
    		return true;
        }
        else{
            return false;    
        }
    }
    public String getDetalle(){
        return nombre + "\t" + edad;
    }
    //Constructores

    public Personaje(String nombre){
    	this.nombre = nombre;
    	this.edad = 0;

    }

}