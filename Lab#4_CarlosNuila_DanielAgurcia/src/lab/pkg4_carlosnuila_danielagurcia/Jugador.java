package lab.pkg4_carlosnuila_danielagurcia;

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

}
