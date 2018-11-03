package lab.pkg4_carlosnuila_danielagurcia;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {

    String nombre;
    String apodo;
    int numeroCamiseta;
    String equipoFutFav;
    String equipoBasFav;
    String jugadorFav;
    int edad;
    String anoNacimiento;
    int numeroEstrellas;
    int goles;

    public Jugador() {
    }

    public Jugador(String nombre, String apodo, int numeroCamiseta, String equipoFutFav, String equipoBasFav, String jugadorFav, int edad, String anoNacimiento, int numeroEstrellas, int goles) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.numeroCamiseta = numeroCamiseta;
        this.equipoFutFav = equipoFutFav;
        this.equipoBasFav = equipoBasFav;
        this.jugadorFav = jugadorFav;
        this.edad = edad;
        this.anoNacimiento = anoNacimiento;
        this.numeroEstrellas = numeroEstrellas;
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getEquipoFutFav() {
        return equipoFutFav;
    }

    public void setEquipoFutFav(String equipoFutFav) {
        this.equipoFutFav = equipoFutFav;
    }

    public String getEquipoBasFav() {
        return equipoBasFav;
    }

    public void setEquipoBasFav(String equipoBasFav) {
        this.equipoBasFav = equipoBasFav;
    }

    public String getJugadorFav() {
        return jugadorFav;
    }

    public void setJugadorFav(String jugadorFav) {
        this.jugadorFav = jugadorFav;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(String anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public int getNumeroEstrellas() {
        return numeroEstrellas;
    }

    public void setNumeroEstrellas(int numeroEstrellas) {
        this.numeroEstrellas = numeroEstrellas;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre del Jugador = " + nombre + "    Apodo=" + apodo + " Numero de Camiseta=" + numeroCamiseta + 
                "\nEquipo de Fut Fav=" + equipoFutFav + "   EquipoBasFav=" + equipoBasFav + "   JugadorFav=" + jugadorFav + 
                "\nEdad=" + edad + "    anioNacimiento=" + anoNacimiento + "    numeroEstrellas=" + numeroEstrellas + '}';
    }

    public double Atacar(int tipoTiro) {
        return 0;
    }
}
