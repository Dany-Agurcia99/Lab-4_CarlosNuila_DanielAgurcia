/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4_carlosnuila_danielagurcia;

/**
 *
 * @author Carlos Nuila
 */
public class Pateador extends Jugador {
    
    int habilidadPateador;
    int fuerza;
    int habilidadRegateadora;

    public Pateador() {
        super();
    }

    public Pateador(int habilidadPateador, int fuerza, int habilidadRegateadora, String nombre, String apodo, int numeroCamiseta, String equipoFutFav, String equipoBasFav, String jugadorFav, int edad, String anoNacimiento, int numeroEstrellas) {
        super(nombre, apodo, numeroCamiseta, equipoFutFav, equipoBasFav, jugadorFav, edad, anoNacimiento, numeroEstrellas);
        this.habilidadPateador = habilidadPateador;
        this.fuerza = fuerza;
        this.habilidadRegateadora = habilidadRegateadora;
    }

    public int getHabilidadPateador() {
        return habilidadPateador;
    }

    public void setHabilidadPateador(int habilidadPateador) {
        this.habilidadPateador = habilidadPateador;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabilidadRegateadora() {
        return habilidadRegateadora;
    }

    public void setHabilidadRegateadora(int habilidadRegateadora) {
        this.habilidadRegateadora = habilidadRegateadora;
    }

    @Override
    public String toString() {
        return "Pateador{" + "habilidadPateador=" + habilidadPateador + ", fuerza=" + fuerza + ", habilidadRegateadora=" + habilidadRegateadora + '}';
    }
    
   
    
}
