import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int player_health = 10;

        int player_money = 0;

        int player_weapon;

        int enemy_health = 5;

        int enemy_drop_money = 3;

        var can_loot_treasure = true;

        while (1 == 1){
            System.out.println("Hello! You are just teleported to the rpg world! Choose where to go:");

            System.out.println("your stats are:");

            System.out.println(player_money + " Money");

            System.out.println(player_health + " Health");

            System.out.println("1. to the shop");

            System.out.println("2. to the town");

            System.out.println("3. stay here");

            System.out.println("4. find the treasure to get money");

            Scanner scanner = new Scanner(System.in);

            String choose = scanner.next();

            if (choose.equals("1") && player_money == 0){
                System.out.println("you go to the shop but you don't have any money");
            } else if (choose.equals("4") && can_loot_treasure){
                player_money += 5;
                can_loot_treasure = false;
                System.out.println("you found the treasure but you got only 5 money!");
                System.out.println("you have: " + player_money + " money");
            } else if (choose.equals("4") && !can_loot_treasure) {
                System.out.println("no treasure, the chest is empty");
            }
        }
    }
}