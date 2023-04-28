public class Over {
    int x;
    int y;
    int z;
    private String l;
    Over(int X, int Y, int Z) {
        x = X;
        y = Y;
        z = Z;
    }
    Over(int X) {
        x = X;
        y = X;
        z = X;
    }
    Over() {
        x = 10;
        y = 10;
        z = 10;
    }
    public int getx() {
        return x;
    }
    public void setx(int newx) {
        this.x = newx;
    }
    public int gety() {
        return y;
    }
    public void sety(int newy) {
        this.y = newy;
    }
    public int getz() {
        return z;
    }
    public void setz(int newz) {
        this.z = newz;
    }
}
