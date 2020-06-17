/*
 *   https://github.com/FernandoCalmet
*/
public class VentaAutoNuevo extends Venta {

    public VentaAutoNuevo(String mm, float p) {
        super(mm, p);
    }

    @Override
    public String toString() {
        return "\nMarca y Modelo : " + marcaYModelo + "\nPrecio : " + precio + "\nAño: 2020";
    }

    @Override
    public int getAnioDelModelo() {
        return 2020;
    }
}