import java.util.*;
public class Client{
    public static void main(String [] args){
        int input;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Which hero you want to build?");
            System.out.println("(1-Iron Man; 2-Captain America)");
            input = scanner.nextInt();
            
            if(input == 1){
                Factory factory = new IronManFactory();
                System.out.println(factory.createMask());
                System.out.println(factory.createShield());
            }else if(input == 2){
                Factory factory = new CaptainAmericaFactory();
                System.out.println(factory.createMask());
                System.out.println(factory.createShield());
            }else{
                System.out.println("wrong number!");
            }
        }
    }
}
