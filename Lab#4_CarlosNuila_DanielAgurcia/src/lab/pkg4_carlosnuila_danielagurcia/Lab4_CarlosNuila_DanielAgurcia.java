package lab.pkg4_carlosnuila_danielagurcia;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4_CarlosNuila_DanielAgurcia {

    public static Scanner sc = new Scanner(System.in);
    public static Random r = new Random();
    public static ArrayList<Equipo> listaEquipos = new ArrayList();

    public static void main(String[] args) {
        int opcionMenu = 0;
        System.out.println("perro");
        ArrayList<Equipo> listaEquipos = new ArrayList();
        while (opcionMenu != 4) {
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
            }
            if (opcionMenu == 2) {
                System.out.print("Ingrese la posicion del equipo: ");
                int posicionEquipo = sc.nextInt();
                if (posicionEquipo >= 0 && posicionEquipo < listaEquipos.size()) {
                    int opcionJugador = 0;
                    while (opcionJugador != 4) {
                        System.out.println("1)Crear Jugador\n"
                                + "2)Modificar Jugador\n"
                                + "3)Eliminar Jugador\n"
                                + "4)Atras");
                        System.out.print("Ingrese su opcion: ");
                        opcionJugador = sc.nextInt();

                        if (opcionJugador == 1) {
                            if (listaEquipos.get(posicionEquipo).ListaJugadores.size() <= 5) {
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
                                            System.out.print("Ingrese la fuerza del pateador(1-100): ");
                                            fuerza = sc.nextInt();
                                        }
                                        System.out.print("Ingrese la habilidad regateadora del pateador(1-100): ");
                                        int habilidadRegateadora = sc.nextInt();
                                        while (habilidadRegateadora < 1 || habilidadRegateadora > 100) {
                                            System.out.println("Entre 1 y 100");
                                            System.out.print("Ingrese la habilidad regateadora del pateador(1-100): ");
                                            habilidadRegateadora = sc.nextInt();
                                        }
                                        listaEquipos.get(posicionEquipo).getListaJugadores().add(new Pateador(hablidadPateador, fuerza, habilidadRegateadora, nombreJugador, apodo, numeroCamiseta, equipoFutfav, equipoBasfav, jugadorFav, edad, anoNacimiento, numeroEstrellas));
                                    }
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
                                            System.out.print("Ingrese el manejo de balon del tirador(1-100): ");
                                            manejoBalon = sc.nextInt();
                                        }
                                        listaEquipos.get(posicionEquipo).getListaJugadores().add(new Tirador(tiro3, tiro2, manejoBalon, nombreJugador, apodo, numeroCamiseta, equipoFutfav, equipoBasfav, jugadorFav, edad, anoNacimiento, numeroEstrellas));
                                    } else {
                                        System.out.println("Ya tiene la cantidad maxima de Tiradores");
                                    }
                                }
                            } else {
                                System.out.println("Ya tiene 5 jugadores");
                            }
                        }
                        if (opcionJugador == 2) {
                            System.out.print("Ingrese la posicion del jugador: ");
                            int posicionJugador = sc.nextInt();
                            if (posicionJugador >= 0 && posicionJugador < listaEquipos.get(posicionEquipo).ListaJugadores.size()) {
                                System.out.println("1)Nombre del Jugador\n"
                                        + "2)Apodo\n"
                                        + "3)Numero de Camiseta\n"
                                        + "4)Equipo de Futbol favorito\n"
                                        + "5)Equipo de Basketball favorito\n"
                                        + "6)Jugador Favorito\n"
                                        + "7)Edad\n"
                                        + "8)Anio de Nacimiento\n"
                                        + "9)Numero de Estrellas\n"
                                        + "10)Habilidad Pateadora\n"
                                        + "11)Hablididad Regateadora\n"
                                        + "12)Fuerza\n"
                                        + "13)Tiro 3\n"
                                        + "14)Tiro 2\n"
                                        + "15)Manejo de Balon");
                                System.out.print("Ingrese su opcion: ");
                                int opcionModificar = sc.nextInt();
                                if (opcionModificar == 1) {
                                    System.out.print("Ingrese el nombre del Jugador: ");
                                    String nombreJugador = sc.next();
                                    listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador).setNombre(nombreJugador);
                                }
                                if (opcionModificar == 2) {
                                    System.out.print("Ingrese el apodo del Jugador: ");
                                    String apodo = sc.next();
                                    listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador).setApodo(apodo);
                                }
                                if (opcionModificar == 3) {
                                    System.out.print("Ingrese el numero de la camiseta del Jugador: ");
                                    int numeroCamiseta = sc.nextInt();
                                    listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador).setNumeroCamiseta(numeroCamiseta);
                                }
                                if (opcionModificar == 4) {
                                    System.out.print("Ingrese el equipo de Futbol favorito del Jugador: ");
                                    String equipoFutfav = sc.next();
                                    listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador).setEquipoFutFav(equipoFutfav);
                                }
                                if (opcionModificar == 5) {
                                    System.out.print("Ingrese el equipo de Basketball favorito del Jugador: ");
                                    String equipoBasfav = sc.next();
                                    listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador).setEquipoBasFav(equipoBasfav);
                                }
                                if (opcionModificar == 6) {
                                    System.out.print("Ingrese el jugador favorito del Jugador: ");
                                    String jugadorFav = sc.next();
                                    listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador).setJugadorFav(jugadorFav);
                                }
                                if (opcionModificar == 7) {
                                    System.out.print("Ingrese la edad del Jugador: ");
                                    int edad = sc.nextInt();
                                    listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador).setEdad(edad);
                                }
                                if (opcionModificar == 8) {
                                    System.out.print("Ingrese el anio de nacimiento del Jugador: ");
                                    String anoNacimiento = sc.next();
                                    listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador).setAnoNacimiento(anoNacimiento);
                                }
                                if (opcionModificar == 9) {
                                    System.out.print("Ingrese el numero de Estrellas del Jugador: ");
                                    int numeroEstrella = sc.nextInt();
                                    while (numeroEstrella < 1 || numeroEstrella > 5) {
                                        System.out.println("Debe ser entre 1 y 5");
                                        System.out.print("Ingrese el numero de Estrellas del Jugador(1-5): ");
                                        numeroEstrella = sc.nextInt();
                                    }
                                    listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador).setNumeroEstrellas(numeroEstrella);
                                }
                                if (opcionModificar == 10) {
                                    if (listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador) instanceof Pateador) {
                                        System.out.print("Ingrese la habilidad Pateadora del Jugador: ");
                                        int habilidadPateadora = sc.nextInt();
                                        while (habilidadPateadora < 1 || habilidadPateadora > 100) {
                                            System.out.println("Entre 1 y 100");
                                            System.out.print("Ingrese la habilidad pateadora del pateador(1-100): ");
                                            habilidadPateadora = sc.nextInt();
                                        }
                                        ((Pateador) listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador)).setHabilidadPateador(habilidadPateadora);
                                    } else {
                                        System.out.println("No es un pateador");
                                    }
                                }
                                if (opcionModificar == 11) {
                                    if (listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador) instanceof Pateador) {
                                        System.out.print("Ingrese la habilidad Regateadora del Jugador: ");
                                        int habilidadRegateadora = sc.nextInt();
                                        while (habilidadRegateadora < 1 || habilidadRegateadora > 100) {
                                            System.out.println("Entre 1 y 100");
                                            System.out.print("Ingrese la habilidad regateadora del pateador(1-100): ");
                                            habilidadRegateadora = sc.nextInt();
                                        }
                                        ((Pateador) listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador)).setHabilidadRegateadora(habilidadRegateadora);
                                    } else {
                                        System.out.println("No es un pateador");
                                    }
                                }
                                if (opcionModificar == 12) {
                                    if (listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador) instanceof Pateador) {
                                        System.out.print("Ingrese la fuerza del Jugador: ");
                                        int fuerza = sc.nextInt();
                                        while (fuerza < 1 || fuerza > 100) {
                                            System.out.println("Entre 1 y 100");
                                            System.out.print("Ingrese la fuerza del pateador(1-100): ");
                                            fuerza = sc.nextInt();
                                        }
                                        ((Pateador) listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador)).setFuerza(fuerza);
                                    } else {
                                        System.out.println("No es un pateador");
                                    }
                                }
                                if (opcionModificar == 13) {
                                    if (listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador) instanceof Tirador) {
                                        System.out.print("Ingrese el tiro de 3 del Jugador: ");
                                        int tiro3 = sc.nextInt();
                                        while (tiro3 < 1 || tiro3 > 100) {
                                            System.out.println("Entre 1 y 100");
                                            System.out.print("Ingrese el tiro de 3 del tirador(1-100): ");
                                            tiro3 = sc.nextInt();
                                        }
                                        ((Tirador) listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador)).setTiro3(tiro3);
                                    } else {
                                        System.out.println("No es un tirador");
                                    }
                                }
                                if (opcionModificar == 14) {
                                    if (listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador) instanceof Tirador) {
                                        System.out.print("Ingrese el tiro2 del Jugador: ");
                                        int tiro2 = sc.nextInt();
                                        while (tiro2 < 1 || tiro2 > 100) {
                                            System.out.println("Entre 1 y 100");
                                            System.out.print("Ingrese la fuerza del pateador(1-100): ");
                                            tiro2 = sc.nextInt();
                                        }
                                        ((Tirador) listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador)).setTiro2(tiro2);
                                    } else {
                                        System.out.println("No es un tirador");
                                    }
                                }
                                if (opcionModificar == 15) {
                                    if (listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador) instanceof Tirador) {
                                        System.out.print("Ingrese el manejo del Balon del Jugador: ");
                                        int manejoBalon = sc.nextInt();
                                        while (manejoBalon < 1 || manejoBalon > 100) {
                                            System.out.println("Entre 1 y 100");
                                            System.out.print("Ingrese la fuerza del pateador(1-100): ");
                                            manejoBalon = sc.nextInt();
                                        }
                                        ((Tirador) listaEquipos.get(posicionEquipo).ListaJugadores.get(posicionJugador)).setManejoBalon(manejoBalon);
                                    } else {
                                        System.out.println("No es un tirador");
                                    }
                                }
                            } else {
                                System.out.println("No existe ese nodo");
                            }
                        }
                        if (opcionJugador == 3) {
                            System.out.print("Ingrese la posicion del jugador: ");
                            int posicionJugador = sc.nextInt();
                            if (posicionJugador >= 0 && posicionJugador < listaEquipos.get(posicionEquipo).ListaJugadores.size()) {
                                listaEquipos.get(posicionEquipo).ListaJugadores.remove(posicionJugador);
                            } else {
                                System.out.println("No existe ese nodo");
                            }
                        }
                    }
                } else {
                    System.out.println("No existe ese nodo");
                }
            }
            if (opcionMenu == 3) {

            }
        }

    }

    public static void Jugar(Equipo EquipoJ1, Equipo EquipoJ2, String NombreJ1, String NombreJ2) {
        int contPosJ1 = 0;
        int contPosJ2 = 0;
        int golesJ1 = 0;
        int golesJ2 = 0;
        Jugador JugadorConBalonJ1 = null;
        Jugador JugadorConBalonJ2 = null;
        boolean Turno = true;
        boolean EstadoJuego = true;
        while (EstadoJuego == true) {
            int goles = 0;
            Equipo EquipoActual = null;
            String NombreJugador = "";
            Jugador JugadorConBalon = null;
            if (Turno == true) {
                JugadorConBalon = JugadorConBalonJ1;
                contPosJ1++;
                goles = golesJ1;
                EquipoActual = EquipoJ1;
                NombreJugador = NombreJ1;
                Turno = false;
            } else {
                JugadorConBalon = JugadorConBalonJ2;
                contPosJ2++;
                goles = golesJ2;
                EquipoActual = EquipoJ2;
                NombreJugador = NombreJ2;
                Turno = true;
            }
            if (contPosJ1 == 1 || contPosJ2 == 1) {
                System.out.println("Ingrese la posicion del jugador que quiere llevar la pelota");
                int posicionJugador = sc.nextInt();
                JugadorConBalon = EquipoActual.getListaJugadores().get(posicionJugador);
            }
            int contPases = 0;
            while (contPases < 5) {
                System.out.println("Ingrese la opcion que desee:\n1)Dar un Pase a otro Jugador\n2)Tirar");
                int opcion1 = sc.nextInt();
                switch (opcion1) {
                    case 1:
                        if (JugadorConBalon instanceof Tirador) {
                            System.out.println("Seleccione la posicion del jugador a quien le quiere dar pase: ");
                            int posicionPase = sc.nextInt();
                            while (EquipoActual.getListaJugadores().get(posicionPase) instanceof Tirador) {
                                System.out.println("El Tirador no puede darle pases a otro Tirador, tiene que darle pase a un Pateador");
                                System.out.println("Seleccione la posicion del jugador a quien le quiere dar pase: ");
                                posicionPase = sc.nextInt();
                            }
                            JugadorConBalon = EquipoActual.getListaJugadores().get(posicionPase);
                            contPases++;
                        } else if (JugadorConBalon instanceof Pateador) {
                            System.out.println("Seleccione la posicion del jugador a quien le quiere dar pase: ");
                            int posicionPase = sc.nextInt();
                            while (EquipoActual.getListaJugadores().get(posicionPase) instanceof Pateador) {
                                System.out.println("El Pateador no puede darle pases a otro Pateador, tiene que darle pase a un Tirador");
                                System.out.println("Seleccione la posicion del jugador a quien le quiere dar pase: ");
                                posicionPase = sc.nextInt();
                            }
                            JugadorConBalon = EquipoActual.getListaJugadores().get(posicionPase);
                            contPases++;
                        }
                        break;
                    case 2:
                        contPases = 6;
                        break;
                }
            }
            int num = 1 + r.nextInt(100);
            if (JugadorConBalon instanceof Pateador) {
                if (num < JugadorConBalon.Atacar(0)) {
                    System.out.println(JugadorConBalon.getApodo() + " ANOTOO A LA PORTERIA!!!");
                    if (EquipoActual == EquipoJ1) {
                        JugadorConBalon.setGoles(JugadorConBalon.getGoles() + 1);
                        golesJ1++;
                    } else {
                        JugadorConBalon.setGoles(JugadorConBalon.getGoles() + 1);
                        golesJ2++;
                    }
                } else {
                    System.out.println(JugadorConBalon.getApodo() + " SE LA HA FALLADOOO A LA PORTERIA!!");
                }
            } else if (JugadorConBalon instanceof Tirador) {
                System.out.println("Ingrese 2 si tira de 2 puntos\nIngrese 3 si tira de 3 puntos");
                int opcionTiro = sc.nextInt();
                switch (opcionTiro) {
                    case 2:
                        if (num < JugadorConBalon.Atacar(2)) {
                            System.out.println(JugadorConBalon.getApodo() + " ANOTOO AL AROOO!!!");
                            if (EquipoActual == EquipoJ1) {
                                JugadorConBalon.setGoles(JugadorConBalon.getGoles() + 1);
                                golesJ1++;
                            } else {
                                JugadorConBalon.setGoles(JugadorConBalon.getGoles() + 1);
                                golesJ2++;
                            }
                        } else {
                            System.out.println(JugadorConBalon.getApodo() + " LA TIRO AL ARO Y SE LA HA FALLADO SE LA HA FALLADOOO!!");
                        }
                        break;
                    case 3:
                        if (num < JugadorConBalon.Atacar(3)) {
                            System.out.println(JugadorConBalon.getApodo() + " ANOTOO AL AROOO!!!");
                            if (EquipoActual == EquipoJ1) {
                                JugadorConBalon.setGoles(JugadorConBalon.getGoles() + 1);
                                golesJ1++;
                            } else {
                                JugadorConBalon.setGoles(JugadorConBalon.getGoles() + 1);
                                golesJ2++;
                            }
                        } else {
                            System.out.println(JugadorConBalon.getApodo() + " LA TIRO AL ARO Y SE LA HA FALLADOOO!!");
                        }
                        break;
                }
            }
            if (golesJ1 == 11 || golesJ2 == 11) {
                EstadoJuego = false;
            }
        }
        if (golesJ1 == 11) {
            System.out.println("Felicidades " + NombreJ1 + " Ganaste la partida de Futloncesto");
        } else if (golesJ2 == 11) {
            System.out.println("Felicidades " + NombreJ2 + " Ganaste la partida de Futloncesto");
        }
        System.out.println(EquipoJ1);
        System.out.println("Anoto: " + golesJ1);
        for (Jugador temp : EquipoJ1.getListaJugadores()) {
            if (temp instanceof Tirador) {
                System.out.println("Tipo: Tirador");
            } else {
                System.out.println("Tipo: Pateador");
            }
            if (temp.getGoles() > 0) {
                temp.toString();
            }
        }
        System.out.println(EquipoJ2);
        System.out.println("Anoto: " + golesJ2);
        for (Jugador temp : EquipoJ2.getListaJugadores()) {
            if (temp.getGoles() > 0) {
                if (temp instanceof Tirador) {
                    System.out.println("Tipo: Tirador");
                } else {
                    System.out.println("Tipo: Pateador");
                }
                temp.toString();
            }
        }
    }
}
