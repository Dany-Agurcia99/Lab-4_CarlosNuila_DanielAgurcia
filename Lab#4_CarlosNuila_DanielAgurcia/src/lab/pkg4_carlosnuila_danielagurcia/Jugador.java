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

    public Jugador() {
    }

    public Jugador(String nombre, String apodo, int numeroCamiseta, String equipoFutFav, String equipoBasFav, String jugadorFav, int edad, String anoNacimiento, int numeroEstrellas) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.numeroCamiseta = numeroCamiseta;
        this.equipoFutFav = equipoFutFav;
        this.equipoBasFav = equipoBasFav;
        this.jugadorFav = jugadorFav;
        this.edad = edad;
        this.anoNacimiento = anoNacimiento;
        this.numeroEstrellas = numeroEstrellas;
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
        return "Jugador{" + "nombre=" + nombre + ", apodo=" + apodo + ", numeroCamiseta=" + numeroCamiseta + ", equipoFutFav=" + equipoFutFav + ", equipoBasFav=" + equipoBasFav + ", jugadorFav=" + jugadorFav + ", edad=" + edad + ", anoNacimiento=" + anoNacimiento + ", numeroEstrellas=" + numeroEstrellas + '}';
    }

    public double Atacar() {
        return 0;
    }

    Scanner sc = new Scanner(System.in);

    public void Menu() {
        int opcionMenu = 0;
        ArrayList<Equipo> listaEquipos = new ArrayList();
        while (opcionMenu != 5) {
            System.out.println("1)Administrar Equipo\n"
                    + "2)Administrar Jugadores\n"
                    + "3)Jugar\n"
                    + "4)Salir");
            opcionMenu = sc.nextInt();
            if (opcionMenu == 1) {
                int opcionEquipo = 0;
                while (opcionEquipo != 5) {
                    System.out.println("1)Crear Equipo\n"
                            + "2)Modificar Equipo\n"
                            + "3)Eliminar Equipo\n"
                            + "4)Listar Equipo\n"
                            + "5)Atras");
                    System.out.print("Ingrese su opcion: ");
                    opcionEquipo = sc.nextInt();
                }
                if (opcionEquipo == 1) {
                    System.out.print("Ingrese el nombre del Equipo: ");
                    String nombreEquipo = sc.next();
                    System.out.print("Ingrese el estadio del Equipo: ");
                    String estadio = sc.next();
                    System.out.print("Ingrese el pais del Equipo: ");
                    String pais = sc.next();
                    System.out.print("Ingrese el nombre del entrenador del Equipo: ");
                    String nombreEntrenador = sc.next();
                    System.out.print("Ingrese el nombre del dueno del Equipo: ");
                    String nombreDueno = sc.next();
                    System.out.print("Ingrese el nombre de la mascota del Equipo: ");
                    String nombreMascota = sc.next();
                    System.out.print("Ingrese la fecha de creacion del Equipo: ");
                    String fechaCreacion = sc.next();
                    System.out.print("Ingrese el color del Equipo: ");
                    String color = sc.next();
                    listaEquipos.add(new Equipo(nombreEquipo, estadio, pais, nombreEntrenador, nombreDueno, nombreMascota, fechaCreacion, color));
                }
                if (opcionEquipo == 2) {
                    System.out.println("1)Nombre del Equipo\n"
                            + "2)Estadio\n"
                            + "3)Pais\n"
                            + "4)Nombre del Entrenador\n"
                            + "5)Nombre del Dueno\n"
                            + "6)Nombre de la Mascota\n"
                            + "7)Fecha de Creacion\n"
                            + "8)Color");
                    System.out.print("Ingrese su opcion: ");
                    int opcionModificar = sc.nextInt();
                    if (opcionModificar == 1){
                        
                    }
                }

            }
        }
    }

}
