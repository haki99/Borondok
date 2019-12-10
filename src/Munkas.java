public class Munkas extends Objektum {
    Objektum[] szomszedok = new Objektum[4];

    public void tol(Objektum b){
        boolean tartalmazza = false;
        for(int i = 0; i < 4; i++){
            if(szomszedok[i] == b) tartalmazza = true;
        }

        if(!tartalmazza) return;


    }

    public void szomszed_frissites(){
    }
}
