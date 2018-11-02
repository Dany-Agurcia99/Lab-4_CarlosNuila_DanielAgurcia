package lab.pkg4_carlosnuila_danielagurcia;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4_CarlosNuila_DanielAgurcia {

    public static Scanner sc = new Scanner(System.in);
    public static Random r = new Random();

    public static void main(String[] args) {
        ArrayList<Equipo> Listaequipos = new ArrayList();
        Equipo Madrid = new Equipo();
        Equipo Barcelona = new Equipo();
        String nombre1 = "daniel";
        String nombre2 = "nuila";
        Jugar(Barcelona, Barcelona, nombre1, nombre1);
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
                        golesJ1++;
                    } else {
                        golesJ2++;
                    }
                } else {
                    System.out.println(JugadorConBalon.getApodo() + "SE LA HA FALLADOOO A LA PORTERIA!!");
                }
            } else if (JugadorConBalon instanceof Tirador) {
                System.out.println("Ingrese 2 si tira de 2 puntos\nIngrese 3 si tira de 3 puntos");
                int opcionTiro = sc.nextInt();
                switch (opcionTiro) {
                    case 2:
                        if (num < JugadorConBalon.Atacar(2)) {
                            System.out.println(JugadorConBalon.getApodo() + " ANOTOO AL AROOO!!!");
                            if (EquipoActual == EquipoJ1) {
                                golesJ1++;
                            } else {
                                golesJ2++;
                            }
                        } else {
                            System.out.println(JugadorConBalon.getApodo() + "LA TIRO AL ARO Y SE LA HA FALLADO SE LA HA FALLADOOO!!");
                        }
                        break;
                    case 3:
                        if (num < JugadorConBalon.Atacar(3)) {
                            System.out.println(JugadorConBalon.getApodo() + " ANOTOO AL AROOO!!!");
                            if (EquipoActual == EquipoJ1) {
                                golesJ1++;
                            } else {
                                golesJ2++;
                            }
                        } else {
                            System.out.println(JugadorConBalon.getApodo() + "LA TIRO AL ARO Y SE LA HA FALLADOOO!!");
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
    }
}
