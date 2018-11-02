package lab.pkg4_carlosnuila_danielagurcia;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_CarlosNuila_DanielAgurcia {

    public static Scanner sc = new Scanner(System.in);

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
                        System.out.println("Seleccione la posicion del jugador a quien le quiere dar pase: ");
                        int posicionPase = sc.nextInt();
                        JugadorConBalon = EquipoActual.getListaJugadores().get(posicionPase);
                        break;
                    case 2:
                        contPases = 6;
                        break;
                }
            }
        }
    }
}
