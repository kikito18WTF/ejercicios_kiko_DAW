kage org.example;

import java.util.ArrayList;

public class EQUIPO {

   private String nombre;
   private ArrayList<PERSONA> integrantes;

    public EQUIPO(String nombre){
        this.nombre=nombre;
        integrantes = new ArrayList<>();
    }

    public String getNombre(){
        return  nombre;
    }

    public void setNombre(String nombre){

            this.nombre=nombre;

    }

    public ArrayList<PERSONA> getIntegrantes(){
        return integrantes;
    }

    public void setintegrantes (ArrayList<PERSONA> integrantes){
        this.integrantes = integrantes;
    }

    public void insertarIntegrantes(PERSONA persona){
        integrantes.add(persona);
    }

    public void borrarIntegrantes(PERSONA persona){
        integrantes.remove(persona);
    }
}
