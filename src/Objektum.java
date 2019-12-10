public abstract class Objektum {
    private boolean Rogzitett;
    Objektum[] szomszedok = new Objektum[4];

    public void setRogzitett(boolean b){
        Rogzitett = b;
    }

    public abstract void szomszed_frissites();
}
