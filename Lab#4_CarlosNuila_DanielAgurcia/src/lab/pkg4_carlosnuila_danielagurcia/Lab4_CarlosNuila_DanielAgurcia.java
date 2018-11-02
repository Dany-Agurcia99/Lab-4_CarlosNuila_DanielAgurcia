package lab.pkg4_carlosnuila_danielagurcia;

import java.util.ArrayList;

public class Lab4_CarlosNuila_DanielAgurcia {

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
        boolean Turno = true;
        boolean EstadoJuego = true;
        while (EstadoJuego == true) {
            int contpos = 0;
            int goles = 0;
            Equipo EquipoActual = null;
            String NombreJugador = "";
            if (Turno == true) {
                contpos = contPosJ1;
                goles = golesJ1;
                EquipoActual = EquipoJ1;
                NombreJugador = NombreJ1;
                Turno = false;
            } else {
                contpos = contPosJ2;
                goles = golesJ2;
                EquipoActual = EquipoJ2;
                NombreJugador = NombreJ2;
                Turno = true;
            }
            
            
            
            
            
            
            
        }
    }
}
