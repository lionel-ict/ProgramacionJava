package UD8.B_AbstractasInterfaces.EJE2;

public class Rectangulo implements IDrawable {
    int x, y, ancho, alto;

    public Rectangulo(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public void draw(char[][] plano, char c) {
        for (int i = y; i < (y+alto); i++) {
            for (int j = x; j < (x+ancho); j++) {
                plano[i][j] = c;
            }
        }
    }

    

    

}
