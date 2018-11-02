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
                            + "4)Listar Equipos\n"
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
                    System.out.print("Ingrese la posicion del equipo: ");
                    int posicionEquipo = sc.nextInt();
                    if (posicionEquipo >= 0 && posicionEquipo < listaEquipos.size()) {
                        System.out.println("1)Nombre del Equipo\n"
                                + "2)Estadio\n"
                                + "3)Pais\n"
                                + "4)Nombre del Entrenador\n"
                                + "5)Nombre del Dueno\n"
                                + "6)Nombre de la Mascota\n"
                                + "7)Fecha de Creacion\n"
                                + "8)Color\n"
                                + "9)Atras");
                        System.out.print("Ingrese su opcion: ");
                        int opcionModificar = sc.nextInt();

                        if (opcionModificar == 1) {
                            System.out.print("Ingrese el nombre del Equipo: ");
                            String nombreEquipo = sc.next();
                            listaEquipos.get(posicionEquipo).setNombre(nombreEquipo);
                            System.out.println("Modificacion Exitosa");
                        }
                        if (opcionModificar == 2) {
                            System.out.print("Ingrese el estadio del Equipo: ");
                            String estadio = sc.next();
                            listaEquipos.get(posicionEquipo).setEstadio(estadio);
                            System.out.println("Modificacion Exitosa");
                        }
                        if (opcionModificar == 3) {
                            System.out.print("Ingrese el pais del Equipo: ");
                            String pais = sc.next();
                            listaEquipos.get(posicionEquipo).setPais(pais);
                            System.out.println("Modificacion Exitosa");
                        }
                        if (opcionModificar == 4) {
                            System.out.print("Ingrese el nombre del entrenador del Equipo: ");
                            String nombreEntrenador = sc.next();
                            listaEquipos.get(posicionEquipo).setNombreEntrenador(nombreEntrenador);
                            System.out.println("Modificacion Exitosa");
                        }
                        if (opcionModificar == 5) {
                            System.out.print("Ingrese el nombreDueno del Equipo: ");
                            String nombreDueno = sc.next();
                            listaEquipos.get(posicionEquipo).setNombreDueno(nombreDueno);
                            System.out.println("Modificacion Exitosa");
                        }
                        if (opcionModificar == 6) {
                            System.out.print("Ingrese el nombreMascota del Equipo: ");
                            String nombreMascota = sc.next();
                            listaEquipos.get(posicionEquipo).setNombreMascota(nombreMascota);
                            System.out.println("Modificacion Exitosa");
                        }
                        if (opcionModificar == 7) {
                            System.out.print("Ingrese el fechaCreacion del Equipo: ");
                            String fechaCreacion = sc.next();
                            listaEquipos.get(posicionEquipo).setFechaCreacion(fechaCreacion);
                            System.out.println("Modificacion Exitosa");
                        }
                        if (opcionModificar == 8) {
                            System.out.print("Ingrese el color del Equipo: ");
                            String color = sc.next();
                            listaEquipos.get(posicionEquipo).setColor(color);
                            System.out.println("Modificacion Exitosa");
                        }
                    } else {
                        System.out.println("No existe ese nodo");
                    }
                }
                if (opcionEquipo == 3) {
                    System.out.print("Ingrese la posicion del equipo: ");
                    int posicionEquipo = sc.nextInt();
                    if (posicionEquipo >= 0 && posicionEquipo < listaEquipos.size()) {
                        listaEquipos.remove(posicionEquipo);
                    } else {
                        System.out.println("No existe ese nodo");
                    }
                }
                if (opcionEquipo == 4) {
                    for (Equipo temp : listaEquipos) {
                        System.out.print(temp.toString());
                    }
                }
            }
            if (opcionMenu == 2) {
                System.out.print("Ingrese la posicion del equipo: ");
                int posicionEquipo = sc.nextInt();
                if (posicionEquipo >= 0 && posicionEquipo < listaEquipos.size()) {
                    int opcionJugador = 0;
                    while (opcionJugador != 5) {

                        System.out.println("1)Crear Jugador\n"
                                + "2)Modificar Jugador\n"
                                + "3)Eliminar Jugador\n"
                                + "4)Listar Jugador\n"
                                + "5)Atras");
                        System.out.print("Ingrese su opcion: ");
                        opcionJugador = sc.nextInt();

                        if (opcionJugador == 1) {
                            System.out.print("Ingrese el nombre del Jugador: ");
                            String nombreJugador = sc.next();
                            System.out.print("Ingrese el apodo del Jugador: ");
                            String apodo = sc.next();
                            System.out.print("Ingrese el numero de camiseta del Jugador: ");
                            int numeroCamiseta = sc.nextInt();
                            System.out.print("Ingrese el equipo de Futbol favorito del Jugador: ");
                            String equipoFutfav = sc.next();
                            System.out.print("Ingrese el equipo de Basketball favorito del Jugador: ");
                            String equipoBasfav = sc.next();
                            System.out.print("Ingrese el jugador Favorito del Jugador: ");
                            String jugadorFav = sc.next();
                            System.out.print("Ingrese la edad del Jugador: ");
                            int edad = sc.nextInt();
                            System.out.print("Ingrese el anio de nacimiento del Jugador: ");
                            String anoNacimiento = sc.next();
                            System.out.print("Ingrese el numero de Estrellas del Jugador(1-5): ");
                            int numeroEstrellas = sc.nextInt();
                            int contPateadores = 0;
                            int contTiradores = 0;
                            while (numeroEstrellas < 1 || numeroEstrellas > 5) {
                                System.out.println("Debe ser entre 1 y 5");
                                System.out.print("Ingrese el numero de Estrellas del Jugador(1-5): ");
                                numeroEstrellas = sc.nextInt();
                            }
                            for (int i = 0; i < listaEquipos.get(posicionEquipo).ListaJugadores.size(); i++) {
                                if (listaEquipos.get(posicionEquipo).ListaJugadores.get(i) instanceof Pateador) {
                                    contPateadores++;
                                } else {
                                    contTiradores++;
                                }
                            }
                            System.out.println("1)Pateador\n"
                                    + "2)Tirador");
                            System.out.print("Ingrese el tipo de jugador: ");
                            int tipoJugador = sc.nextInt();
                            while (tipoJugador < 1 || tipoJugador > 2) {
                                System.out.print("Ingrese el tipo de jugador: ");
                                tipoJugador = sc.nextInt();
                            }
                            if (tipoJugador == 1) {
                                if (contPateadores <= 3) {
                                    System.out.print("Ingrese la habilidad pateadora del pateador(1-100): ");
                                    int hablidadPateador = sc.nextInt();
                                    while (hablidadPateador < 1 || hablidadPateador > 100) {
                                        System.out.println("Entre 1 y 100");
                                        System.out.print("Ingrese la habilidad pateadora del pateador(1-100): ");
                                        hablidadPateador = sc.nextInt();
                                    }
                                    System.out.print("Ingrese la fuerza del pateador(1-100): ");
                                    int fuerza = sc.nextInt();
                                    while (fuerza < 1 || fuerza > 100) {
                                        System.out.println("Entre 1 y 100");
                                        System.out.print("Ingrese la habilidad del pateador(1-100): ");
                                        fuerza = sc.nextInt();
                                    }
                                    System.out.print("Ingrese la habilidad regateadora del pateador(1-100): ");
                                    int habilidadRegateadora = sc.nextInt();
                                    while (habilidadRegateadora < 1 || habilidadRegateadora > 100) {
                                        System.out.println("Entre 1 y 100");
                                        System.out.print("Ingrese la habilidad del pateador(1-100): ");
                                        habilidadRegateadora = sc.nextInt();
                                    }
                                    listaEquipos.get(posicionEquipo).getListaJugadores().add(new Pateador(hablidadPateador, fuerza, habilidadRegateadora, nombreJugador, apodo, numeroCamiseta, equipoFutfav, equipoBasfav, jugadorFav, edad, anoNacimiento, numeroEstrellas));
                                } else {
                                    System.out.println("Ya tiene la cantidad maxima de Pateadores");
                                }
                                if (tipoJugador == 2) {
                                    if (contTiradores <= 2) {
                                        System.out.print("Ingrese la habilidad de tiro de 3 del tirador(1-100): ");
                                        int tiro3 = sc.nextInt();
                                        while (tiro3 < 1 || tiro3 > 100) {
                                            System.out.println("Entre 1 y 100");
                                            System.out.print("Ingrese la habilidad de tiro de 3 del tirador(1-100): ");
                                            tiro3 = sc.nextInt();
                                        }
                                        System.out.print("Ingrese la habilidad de tiro de 2 tirador(1-100): ");
                                        int tiro2 = sc.nextInt();
                                        while (tiro2 < 1 || tiro2 > 100) {
                                            System.out.println("Entre 1 y 100");
                                            System.out.print("Ingrese la habilidad de tiro de 2 tirador(1-100): ");
                                            tiro2 = sc.nextInt();
                                        }
                                        System.out.print("Ingrese el manejo del balon del tirador(1-100): ");
                                        int manejoBalon = sc.nextInt();
                                        while (manejoBalon < 1 || manejoBalon > 100) {
                                            System.out.println("Entre 1 y 100");
                                            System.out.print("Ingrese la habilidad del pateador(1-100): ");
                                            manejoBalon = sc.nextInt();
                                        }
                                        listaEquipos.get(posicionEquipo).getListaJugadores().add(new Tirador(tiro3, tiro2, manejoBalon, nombreJugador, apodo, numeroCamiseta, equipoFutfav, equipoBasfav, jugadorFav, edad, anoNacimiento, numeroEstrellas));
                                    } else {
                                        System.out.println("Ya tiene la cantidad maxima de Tiradores");
                                    }
                                }

                            }
                        }
                        if (opcionJugador == 2) {
                            System.out.println("1)Nombre del Jugador\n"
                                    + "2)Apodo\n"
                                    + "3)Numero de Camiseta\n"
                                    + "4)Equipo de Futbol favorito\n"
                                    + "5)Equipo de Basketball favorito\n"
                                    + "6)Jugador Favorito\n"
                                    + "7)Edad\n"
                                    + "8)Anio de Nacimiento\n"
                                    + "9)Numero de Estrellas\n"
                                    + "10)Atras");
                            System.out.print("Ingrese su opcion: ");
                            int opcionModificar = sc.nextInt();
                        }
                    }
                } else {
                    System.out.println("No existe ese nodo");
                }
            }
        }
    }

}
