import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rakter rakter = new Rakter();
        rakter.setupRakter();

        rakter.addMunkas(1,1);

        Scanner myObj = new Scanner(System.in);
        String input = "";

        while(!input.equals("exit")){
            rakter.writeout();

            input = myObj.nextLine();

            switch(input){
                case("addpuha"):{
                    rakter.addPuhaborond();
                    rakter.szomszedok_frissites();
                    break;
                }
                case("addkemeny"):{
                    rakter.addKemenyborond();
                    rakter.szomszedok_frissites();
                    break;
                }
                case("movedown"):{
                    if(!rakter.MoveDown(0)){
                        System.out.println("Nem tud arra mozogni!");
                        rakter.szomszedok_frissites();
                    }
                    break;
                }
                case("moveright"):{
                    if(!rakter.MoveRight(0)){
                        System.out.println("Nem tud arra mozogni!");
                        rakter.szomszedok_frissites();
                    }
                    break;
                }
                case("moveleft"):{
                    if(!rakter.MoveLeft(0)){
                        System.out.println("Nem tud arra mozogni!");
                        rakter.szomszedok_frissites();
                    }
                    break;
                }
                case("moveup"):{
                    if(!rakter.MoveUp(0)){
                        System.out.println("Nem tud arra mozogni!");
                        rakter.szomszedok_frissites();
                    }
                    break;
                }
            }
        }
    }
}
