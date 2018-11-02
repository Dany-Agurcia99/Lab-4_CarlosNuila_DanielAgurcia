package lab.pkg4_carlosnuila_danielagurcia;

import java.util.ArrayList;

public class Equipo {

    String nombre;
    String estadio;
    String pais;
    String nombreEntrenador;
    String nombreDueno;
    String nombreMascota;
    String fechaCreacion;
    String color;
    ArrayList<Jugador> ListaJugadores = new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, String estadio, String pais, String nombreEntrenador, String nombreDueno, String nombreMascota, String fechaCreacion, String color) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.pais = pais;
        this.nombreEntrenador = nombreEntrenador;
        this.nombreDueno = nombreDueno;
        this.nombreMascota = nombreMascota;
        this.fechaCreacion = fechaCreacion;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return ListaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> ListaJugadores) {
        this.ListaJugadores = ListaJugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "Nombre Equipo = " + nombre + "\nEstadio = " + estadio + "   Pais=" + pais + "   Nombre del Entrenador = " + nombreEntrenador + 
                "\nNombre del Dueno = " + nombreDueno + "   Nombre de la Mascota = " + nombreMascota + "    Fecha de Creacion = " + fechaCreacion + 
                "   Color Principal = " + color + "\nLista de Jugadores: " + ListaJugadores + '}';
    }

}
