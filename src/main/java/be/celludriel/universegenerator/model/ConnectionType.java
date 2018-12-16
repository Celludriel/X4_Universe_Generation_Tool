package be.celludriel.universegenerator.model;

public enum ConnectionType {
    N(180, 0, 100000), NE(225,100000, 100000),
    SE(315,100000, -100000), S(360,  0, -100000),
    SW(45, -100000, -100000), NW(135,-100000, 100000),
    CUSTOM(0,0,0);

    static {
        N.opposite = S;
        S.opposite = N;
        NE.opposite = SW;
        SW.opposite = NE;
        SE.opposite = NW;
        NW.opposite = SE;
        CUSTOM.opposite = CUSTOM;
    }

    private int rotation;
    private ConnectionType opposite;
    private int x;
    private int y;

    public int getRotation() {
        return rotation;
    }

    public ConnectionType opposite(){
        return this.opposite;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private ConnectionType(int rotation, int x, int y)
    {
        this.rotation = rotation;
        this.x = x;
        this.y = y;
    }
}