public class Rakter {
    Objektum[][] rakter = new Objektum[7][7];

    public void addMunkas(int x, int y){
        rakter[y][x] = new Munkas();
    }

    public void addFal(int x, int y){
        rakter[y][x] = new Fal();
    }

    public void addPuhaborond(){
        rakter[0][3] = new Puha_borond();
    }

    public void addKemenyborond(){
        rakter[0][3] = new Kemeny_borond();
        rakter[0][3].szomszed_frissites();
    }

    //for test
    public void writeout(){
        for(int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("[");
                if(rakter[i][j] != null){
                    if(rakter[i][j].getClass() == Fal.class) System.out.print("x");
                    if(rakter[i][j].getClass() == Puha_borond.class) System.out.print("P");
                    if(rakter[i][j].getClass() == Kemeny_borond.class) System.out.print("K");
                    if(rakter[i][j].getClass() == Munkas.class) System.out.print("Y");
                }
                else System.out.print(" ");
                System.out.print("]");
            }
            System.out.println();
        }
    }
}
