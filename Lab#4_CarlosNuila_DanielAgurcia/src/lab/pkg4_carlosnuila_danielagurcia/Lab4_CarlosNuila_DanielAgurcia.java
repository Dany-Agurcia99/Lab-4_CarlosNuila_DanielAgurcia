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
        int goles = 0;

        Equipo EquipoActual = null;
        boolean Turno = true;
        boolean EstadoJuego = true;
        while (EstadoJuego == true) {
            if (Turno == true) {
                Turno = false;
            } else {
                Turno = true;
            }
        }
    }
}
