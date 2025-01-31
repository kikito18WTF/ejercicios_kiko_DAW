package org.example;

public class PERSONA {

    String nombre;
    String apellido;
    String DNI;
    char sexo;
    int edad;
    String ciudad;
    String profesion;

    public PERSONA(){

    }

    public PERSONA(String nombre, String apellido, String DNI, char sexo, int edad){

        setNombre(nombre);
        this.apellido=apellido;
        this.DNI=DNI;
        this.sexo=sexo;
        this.edad=edad;
    }


    public String getNombre(){
        return  this.nombre;
    }

    public void setNombre(String nombre){
        if (!nombre.equalsIgnoreCase("Messi")) {
            this.nombre=nombre;
        }
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public String getDNI(){
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String concatenar (){

        return this.nombre +" "+ this.apellido;
    }

    public void nostrarinfo(){
        System.out.println(this.nombre+" "+ this.apellido+ " "+ this.DNI+" "+this.sexo+" "+ this.edad+" "+this.ciudad+" "+this.profesion);
    }
}
