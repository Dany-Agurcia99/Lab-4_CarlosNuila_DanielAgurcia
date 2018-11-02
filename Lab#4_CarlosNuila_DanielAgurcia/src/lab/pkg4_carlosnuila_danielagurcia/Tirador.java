package lab.pkg4_carlosnuila_danielagurcia;

public class Tirador extends Jugador {

    int tiro3;
    int tiro2;
    int manejoBalon;

    public Tirador() {
    }

    public Tirador(int tiro3, int tiro2, int manejoBalon) {
        this.tiro3 = tiro3;
        this.tiro2 = tiro2;
        this.manejoBalon = manejoBalon;
    }

    public Tirador(int tiro3, int tiro2, int manejoBalon, String nombre, String apodo, int numeroCamiseta, String equipoFutFav, String equipoBasFav, String jugadorFav, int edad, String anoNacimiento, int numeroEstrellas) {
        super(nombre, apodo, numeroCamiseta, equipoFutFav, equipoBasFav, jugadorFav, edad, anoNacimiento, numeroEstrellas);
        this.tiro3 = tiro3;
        this.tiro2 = tiro2;
        this.manejoBalon = manejoBalon;
    }

    public int getTiro3() {
        return tiro3;
    }

    public void setTiro3(int tiro3) {
        this.tiro3 = tiro3;
    }

    public int getTiro2() {
        return tiro2;
    }

    public void setTiro2(int tiro2) {
        this.tiro2 = tiro2;
    }

    public int getManejoBalon() {
        return manejoBalon;
    }

    public void setManejoBalon(int manejoBalon) {
        this.manejoBalon = manejoBalon;
    }

    @Override
    public String toString() {
        return "Tirador{" + "tiro3=" + tiro3 + ", tiro2=" + tiro2 + ", manejoBalon=" + manejoBalon + '}';
    }

    public double Atacar(int tipoTiro) {
        if (tipoTiro == 2) {
            return (tiro3 + manejoBalon) * 0.90 * numeroEstrellas / 10;
        } else {
            return (tiro2 + manejoBalon) * 0.95 * numeroEstrellas / 10;
        }
    }

}
