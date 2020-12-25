package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int water = 200;
        int milk = 50;
        int beans = 15;

        System.out.println("Write how many cups of coffee you will need:");

        int multiple = input.nextInt();

         water = water * multiple;
         milk = milk * multiple;
         beans = beans * multiple;
        System.out.println("For " + multiple + " cups of coffee you will need:");

        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");

    }
}
