package DSA.generalQuestion;

import java.util.Scanner;

public class DecisionMakingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        System.out.println("Welcome to the adventure game!");

        do
        {
            System.out.println("You are in a dark room. There is a door to your left and right.");
            System.out.println("Which one do you take? (Type 'left' or 'right')");
            choice = sc.nextLine().trim().toLowerCase();

            if (choice.equals("left"))
            {
                System.out.println("You found a key, Congratulations!");
                System.out.println("There is another door in front of you.");
                System.out.println("Do you want to open it or go back? (Type 'open' or 'go back')");
                choice = sc.nextLine().trim().toLowerCase();

                if (choice.equals("open"))
                {
                    System.out.println("You see a chest in the room.");
                    System.out.println("Do you want to open the chest or leave it? (Type 'open' or 'leave')");
                    choice = sc.nextLine().trim().toLowerCase();

                    if (choice.equals("open"))
                    {
                        System.out.println("The chest contains gold! You're rich!");
                    }
                    else if (choice.equals("leave"))
                    {
                        System.out.println("You leave the room with the key. Maybe the key will be useful later.");
                    }
                    else
                    {
                        System.out.println("Invalid option, Please try again!");
                    }
                }
                else if (choice.equals("go back"))
                {
                    do
                    {
                        System.out.println("You are back in the dark room. There is still the door to your left and right.");
                        System.out.println("Which one do you take? (Type 'left' or 'right')");
                        choice = sc.nextLine().trim().toLowerCase();

                        if (choice.equals("left"))
                        {
                            System.out.println("You found the key again, but you've already been here.");
                            System.out.println("Do you want to open the door in front of you or go back again? (Type 'open' or 'go back')");
                            choice = sc.nextLine().trim().toLowerCase();

                            if (choice.equals("open"))
                            {
                                System.out.println("You've already seen the chest. You decide to leave the room.");
                            } else if (choice.equals("goback"))
                            {
                                System.out.println("You go back to the dark room again.");
                            } else {
                                System.out.println("Invalid option, Please try again!");
                            }
                        } else if (choice.equals("right"))
                        {
                            System.out.println("You fell into the pit again. This time you decide to wait for help.");
                            choice = "wait"; // Exit the loop
                        } else {
                            System.out.println("Invalid option, Please try again!");
                        }
                    }
                    while (!choice.equals("wait"));
                }
                else
                {
                    System.out.println("Invalid option, Please try again!");
                }
            }
            else if (choice.equals("right"))
            {
                System.out.println("You fell into a pit, you are hurt.");
                System.out.println("Do you want to climb out of the pit or wait for help? (Type 'climb' or 'wait')");
                choice = sc.nextLine().trim().toLowerCase();

                if (choice.equals("climb"))
                {
                    System.out.println("You managed to climb out but lost some health and encountered a monster and died");
                }
                else if (choice.equals("wait"))
                {
                    System.out.println("Help arrives after a long time. You are rescued but very weak.");
                }
                else
                {
                    System.out.println("Invalid option, Please try again!");
                }
            }
            else
            {
                System.out.println("Invalid option, Please try again!");
            }
        }
        while (!choice.equals("open") && !choice.equals("leave") && !choice.equals("climb") && !choice.equals("wait"));

        System.out.println("Thank you for playing the adventure game!");
    }
}
