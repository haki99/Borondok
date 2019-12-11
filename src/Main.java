import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rakter rakter = new Rakter();
        rakter.setupRakter();

        rakter.addMunkas(1,1);

        Scanner myObj = new Scanner(System.in);
        String inputorg = "";
        String[] input = new String[2];
        input[0] = "";
        input[1] = "";

        while(!input[0].equals("exit")){
            rakter.writeout();

            inputorg = myObj.nextLine();
            input = inputorg.split(" ");

            switch(input[0]){
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
                case("lock"):{
                    if(!rakter.Lock(0, input[1])){
                        System.out.println("Nem lehet lekotni!");
                        rakter.szomszedok_frissites();
                    }
                    break;
                }
                case("unlock"):{
                    if(!rakter.Unlock(0, input[1])){
                        System.out.println("Nem lehet lekotni!");
                        rakter.szomszedok_frissites();
                    }
                    break;
                }
                case("pull"):{
                    if(!rakter.pull(0, input[1])){
                        System.out.println("Nem lehet huzni!");
                        rakter.szomszedok_frissites();
                    }
                    break;
                }
            }
        }
    }
}
