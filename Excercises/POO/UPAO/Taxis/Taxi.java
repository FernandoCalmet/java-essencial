package Excercises.POO.UPAO.Taxis;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Taxi {

    private String placa;
    private String marca;
    private String modelo;
    private Chofer chofer;

    public Taxi(String placa, String marca, String modelo, Chofer chofer) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.chofer = chofer;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    @Override
    public String toString() {
        return "Taxi:" + "\nPlaca: " + getPlaca() + "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nChofer: "
                + getChofer();
    }
}
