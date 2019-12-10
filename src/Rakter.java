import java.util.ArrayList;

public class Rakter {
    ArrayList<ArrayList<Objektum>> rakter = new ArrayList<>();
    ArrayList<Munkas> munkas = new ArrayList<>();

    public void setupRakter(){
        for(int i = 0; i < 7; i++) {
            ArrayList<Objektum> list = new ArrayList<>();
            rakter.add(list);
            for (int j = 0; j < 7; j++) {
                list.add(null);
            }
        }

        for(int i = 0; i < 7; i++){
            addFal(i,0);
            addFal(i,6);
        }

        for(int j = 0; j < 7; j++){
            addFal(0, j);
            addFal(6, j);
        }

        addFal(3, 3);
    }

    public void addMunkas(int x, int y){
        rakter.get(y).set(x, new Munkas());
        munkas.add((Munkas) rakter.get(y).get(x));
        rakter.get(y).get(x).setPos(y, x);
    }

    public void addFal(int x, int y){
        rakter.get(y).set(x, new Fal());
    }

    public void addPuhaborond(){
        if(rakter.get(1).get(3) == null) {
            rakter.get(1).set(3, new Puha_borond());
            rakter.get(1).get(3).szomszed_frissites(rakter.get(0).get(3),
                    rakter.get(1).get(4),
                    rakter.get(2).get(3),
                    rakter.get(1).get(2)
            );
            if(rakter.get(1).get(2) != null){
                rakter.get(1).get(2).szomszed_frissites(
                        rakter.get(0).get(2),
                        rakter.get(1).get(3),
                        rakter.get(2).get(2),
                        rakter.get(1).get(1)
                );
            }
            if(rakter.get(1).get(4) != null){
                rakter.get(1).get(4).szomszed_frissites(
                        rakter.get(0).get(4),
                        rakter.get(1).get(5),
                        rakter.get(2).get(4),
                        rakter.get(1).get(3)
                );
            }
            if(rakter.get(2).get(3) != null){
                rakter.get(2).get(3).szomszed_frissites(
                        rakter.get(1).get(3),
                        rakter.get(2).get(4),
                        rakter.get(3).get(3),
                        rakter.get(2).get(2)
                );
            }
        }
        else System.out.println("Foglalt a kezdohely!");
    }

    public void addKemenyborond(){
        if(rakter.get(1).get(3) == null) {
            rakter.get(1).set(3, new Kemeny_borond());
            rakter.get(1).get(3).szomszed_frissites(rakter.get(0).get(3),
                    rakter.get(1).get(4),
                    rakter.get(2).get(3),
                    rakter.get(1).get(2)
            );
            if(rakter.get(1).get(2) != null){
                rakter.get(1).get(2).szomszed_frissites(
                        rakter.get(0).get(2),
                        rakter.get(1).get(3),
                        rakter.get(2).get(2),
                        rakter.get(1).get(1)
                );
            }
            if(rakter.get(1).get(4) != null){
                rakter.get(1).get(4).szomszed_frissites(
                        rakter.get(0).get(4),
                        rakter.get(1).get(5),
                        rakter.get(2).get(4),
                        rakter.get(1).get(3)
                );
            }
            if(rakter.get(2).get(3) != null){
                rakter.get(2).get(3).szomszed_frissites(
                        rakter.get(1).get(3),
                        rakter.get(2).get(4),
                        rakter.get(3).get(3),
                        rakter.get(2).get(2)
                );
            }
        }
        else System.out.println("Foglalt a kezdohely!");
    }

    //csak lefele mozgás
    public boolean MoveDown(int x) {
        if(munkas.get(0).getSzomszed(2) == null) {
            rakter.get(munkas.get(0).getPosy()).set(munkas.get(0).getPosx(), null);
            rakter.get(munkas.get(0).getPosy() + 1).set(munkas.get(0).getPosx(), munkas.get(0));
            munkas.get(0).setPos(munkas.get(0).getPosx(), munkas.get(0).getPosy()  + 1);

            munkas.get(0).szomszed_frissites(
                    rakter.get(munkas.get(0).getPosy() - 1).get(munkas.get(0).getPosx()),
                    rakter.get(munkas.get(0).getPosy()).get(munkas.get(0).getPosx() + 1),
                    rakter.get(munkas.get(0).getPosy() + 1).get(munkas.get(0).getPosx()),
                    rakter.get(munkas.get(0).getPosy()).get(munkas.get(0).getPosx() - 1)
            );
            return true;
        }
        return false;
    }

    public boolean MoveLeft(int x) {
        if(munkas.get(0).getSzomszed(3) == null) {
            rakter.get(munkas.get(0).getPosy()).set(munkas.get(0).getPosx(), null);
            rakter.get(munkas.get(0).getPosy()).set(munkas.get(0).getPosx() - 1, munkas.get(0));
            munkas.get(0).setPos(munkas.get(0).getPosx() - 1, munkas.get(0).getPosy());

            munkas.get(0).szomszed_frissites(
                    rakter.get(munkas.get(0).getPosy() - 1).get(munkas.get(0).getPosx()),
                    rakter.get(munkas.get(0).getPosy()).get(munkas.get(0).getPosx() + 1),
                    rakter.get(munkas.get(0).getPosy() + 1).get(munkas.get(0).getPosx()),
                    rakter.get(munkas.get(0).getPosy()).get(munkas.get(0).getPosx() - 1)
            );
            return true;
        }
        return false;
    }

    public boolean MoveUp(int x) {
        if(munkas.get(0).getSzomszed(0) == null) {
            rakter.get(munkas.get(0).getPosy()).set(munkas.get(0).getPosx(), null);
            rakter.get(munkas.get(0).getPosy() - 1).set(munkas.get(0).getPosx(), munkas.get(0));
            munkas.get(0).setPos(munkas.get(0).getPosx(), munkas.get(0).getPosy()  - 1);

            munkas.get(0).szomszed_frissites(
                    rakter.get(munkas.get(0).getPosy() - 1).get(munkas.get(0).getPosx()),
                    rakter.get(munkas.get(0).getPosy()).get(munkas.get(0).getPosx() + 1),
                    rakter.get(munkas.get(0).getPosy() + 1).get(munkas.get(0).getPosx()),
                    rakter.get(munkas.get(0).getPosy()).get(munkas.get(0).getPosx() - 1)
            );
            return true;
        }
        return false;
    }

    //jobbra mozgás és tolás
    public boolean MoveRight(int x) {
        //ha csak szabadon mozog
        if(munkas.get(0).getSzomszed(1) == null){
            rakter.get(munkas.get(0).getPosy()).set(munkas.get(0).getPosx(), null);
            rakter.get(munkas.get(0).getPosy()).set(munkas.get(0).getPosx() + 1, munkas.get(0));
            munkas.get(0).setPos(munkas.get(0).getPosx() + 1, munkas.get(0).getPosy());
            munkas.get(0).szomszed_frissites(
                    rakter.get(munkas.get(0).getPosy() - 1).get(munkas.get(0).getPosx()),
                    rakter.get(munkas.get(0).getPosy()).get(munkas.get(0).getPosx() + 1),
                    rakter.get(munkas.get(0).getPosy() + 1).get(munkas.get(0).getPosx()),
                    rakter.get(munkas.get(0).getPosy()).get(munkas.get(0).getPosx() - 1)
            );
            return true;
        }
        else{
            Objektum last_obj = munkas.get(0).getSzomszed(1);
            last_obj.setPos(munkas.get(0).getPosx() + 1, munkas.get(0).getPosy());
            last_obj.szomszed_frissites(
                rakter.get(last_obj.getPosy() - 1).get(last_obj.getPosx()),
                rakter.get(last_obj.getPosy()).get(last_obj.getPosx() + 1),
                rakter.get(last_obj.getPosy() + 1).get(last_obj.getPosx()),
                rakter.get(last_obj.getPosy()).get(last_obj.getPosx() - 1)
            );
            int nextposy = munkas.get(0).getPosy();
            int nextposx = munkas.get(0).getPosx() + 1;

            //utolsó megkeresése
            while(last_obj.getSzomszed(1) != null){
                last_obj = rakter.get(nextposy).get(nextposx + 1);
                last_obj.setPos(nextposx + 1, nextposy);

                if (last_obj.getClass() == Fal.class) {
                    if (rakter.get(nextposy).get(nextposx).getClass() != Puha_borond.class) return false;
                    else if (rakter.get(nextposy).get(nextposx).getClass() == Puha_borond.class) {
                        rakter.get(rakter.get(nextposy).get(nextposx).getPosy()).set(rakter.get(nextposy).get(nextposx).getPosx(), null);
                        last_obj = rakter.get(nextposy).get(nextposx - 1);
                        last_obj.setPos(nextposx - 1, nextposy);
                    }
                }

                nextposx = last_obj.getPosx();
                last_obj.szomszed_frissites(
                        rakter.get(last_obj.getPosy() - 1).get(last_obj.getPosx()),
                        rakter.get(last_obj.getPosy()).get(last_obj.getPosx() + 1),
                        rakter.get(last_obj.getPosy() + 1).get(last_obj.getPosx()),
                        rakter.get(last_obj.getPosy()).get(last_obj.getPosx() - 1)
                );

                if(last_obj.getSzomszed(1) != null && last_obj.getClass() != Puha_borond.class) {
                    System.out.println("eh");
                    return false;
                }
            }

            //munkás utániak mozgatása
            while(last_obj.getClass() != Munkas.class) {
                rakter.get(last_obj.getPosy()).set(last_obj.getPosx() + 1, last_obj);
                last_obj = last_obj.getSzomszed(3);
                last_obj.setPos(last_obj.getPosx(), last_obj.getPosy());
                last_obj.szomszed_frissites(
                        rakter.get(last_obj.getPosy() - 1).get(last_obj.getPosx()),
                        rakter.get(last_obj.getPosy()).get(last_obj.getPosx() + 1),
                        rakter.get(last_obj.getPosy() + 1).get(last_obj.getPosx()),
                        rakter.get(last_obj.getPosy()).get(last_obj.getPosx() - 1)
                );
            }

            //munkás mozggatása
            rakter.get(munkas.get(0).getPosy()).set(munkas.get(0).getPosx(), null);
            rakter.get(munkas.get(0).getPosy()).set(munkas.get(0).getPosx() + 1, munkas.get(0));
            munkas.get(0).setPos(munkas.get(0).getPosx() + 1, munkas.get(0).getPosy());

            munkas.get(0).szomszed_frissites(
                rakter.get(munkas.get(0).getPosy() - 1).get(munkas.get(0).getPosx()),
                rakter.get(munkas.get(0).getPosy()).get(munkas.get(0).getPosx() + 1),
                rakter.get(munkas.get(0).getPosy() + 1).get(munkas.get(0).getPosx()),
                rakter.get(munkas.get(0).getPosy()).get(munkas.get(0).getPosx() - 1)
            );
        }
        return true;
    }

    public void szomszedok_frissites() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (rakter.get(j).get(i) != null) {
                    rakter.get(j).get(i).szomszed_frissites(
                            rakter.get(j - 1).get(i),
                            rakter.get(j).get(i + 1),
                            rakter.get(j + 1).get(i),
                            rakter.get(j).get(i - 1)
                    );
                }
            }
        }
    }

    //for test
    public void writeout(){
        for(int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("[");
                if(rakter.get(i).get(j) != null){
                    if(rakter.get(i).get(j).getClass() == Fal.class) System.out.print("x");
                    if(rakter.get(i).get(j).getClass() == Puha_borond.class) System.out.print("P");
                    if(rakter.get(i).get(j).getClass() == Kemeny_borond.class) System.out.print("K");
                    if(rakter.get(i).get(j).getClass() == Munkas.class) System.out.print(munkas.indexOf(rakter.get(i).get(j)));
                }
                else System.out.print(" ");
                System.out.print("]");
            }
            System.out.println();
        }
    }
}
