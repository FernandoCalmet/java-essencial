package Excercises.EDA.ADT.Punto3D;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class Punto {
    private int x, y, z;
    private String dimension;

    public Punto(int coorX, int coorY) {
        this.x = coorX;
        this.y = coorY;
    }

    public Punto(int coorX, int coorY, int coorZ) {
        this.x = coorX;
        this.y = coorY;
        this.z = coorZ;
    }

    public Punto() {
        this.y = 0;
        this.x = 0;
    }

    public String getDimension() {
        return this.dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return this.z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}