import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rakter rakter = new Rakter();

        for(int i = 0; i < 7; i++){
            rakter.addFal(i,0);
            rakter.addFal(i,6);
        }

        for(int j = 0; j < 7; j++){
            rakter.addFal(0, j);
            rakter.addFal(6, j);
        }

        rakter.addFal(3, 3);
        rakter.addMunkas(1,1);

        Scanner myObj = new Scanner(System.in);
        String input = "";

        while(!input.equals("exit")){
            rakter.writeout();

            input = myObj.nextLine();

            switch(input){
                case("addpuha"):{
                    rakter.addPuhaborond();
                    break;
                }
                case("addkemeny"):{
                    rakter.addKemenyborond();
                    break;
                }
            }
        }
    }
}
