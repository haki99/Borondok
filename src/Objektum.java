public abstract class Objektum {
    private boolean Rogzitett;
    private Objektum[] szomszedok = new Objektum[4];
    private int xpos;
    private int ypos;

    public void setPos(int i, int j){
        xpos = i;
        ypos = j;
    }

    public int getPosx(){
        return xpos;
    }

    public int getPosy(){
        return ypos;
    }

    public void setRogzitett(boolean b){
        Rogzitett = b;
    }

    public boolean isRogzitett(){
        return  Rogzitett;
    }

    public void szomszed_frissites(Objektum fent, Objektum jobb, Objektum alul, Objektum bal){
        szomszedok[0] = fent;
        szomszedok[1] = jobb;
        szomszedok[2] = alul;
        szomszedok[3] = bal;
    }

    public Objektum getSzomszed(int x){
        return szomszedok[x];
    }
}
