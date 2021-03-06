package lab.pkg4_carlosnuila_danielagurcia;

public class Pateador extends Jugador {

    int habilidadPateador;
    int fuerza;
    int habilidadRegateadora;

    public Pateador() {
        super();
    }

    public Pateador(int habilidadPateador, int fuerza, int habilidadRegateadora, String nombre, String apodo, int numeroCamiseta, String equipoFutFav, String equipoBasFav, String jugadorFav, int edad, String anoNacimiento, int numeroEstrellas) {
        super(nombre, apodo, numeroCamiseta, equipoFutFav, equipoBasFav, jugadorFav, edad, anoNacimiento, numeroEstrellas, 0);
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
        return "Pateador{" + "habilidad de pateador = " + habilidadPateador + "\n fuerza = " + fuerza + "\n habilidad Regateadora = " + habilidadRegateadora + '}';
    }

    public double Atacar(int tipoTiro) {
        return (habilidadPateador + fuerza + habilidadRegateadora) * 0.65 * (numeroEstrellas / 10);
    }
}
