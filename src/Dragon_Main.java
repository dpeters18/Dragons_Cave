import java.util.Scanner;

public class Dragon_Main {

    public static void main(String[] args)
    {   System.out.println("You are in a land full of dragons. In front of you, \n" +
            "you see two caves. In one cave, the dragon is friendly \n"+
           "and will share his treasure with you. The other dragon \n"+
            "is hungry and greedy and will eat you on sight. \n"+
            "Which cave will you go into (1 or 2)?");
        Scanner derf= new Scanner(System.in);
        String inputt= derf.nextLine();
        while(!inputt.equals("1")&&!inputt.equals("2"))
        {
            System.out.println("Please type either 1 for Cave 1 or 2 for Cave 2.");
            inputt=derf.nextLine();
        }
        if(inputt.equals("1"))
        {
           System.out.println("You approach the cave...\n" +
                   "It is dark and spooky...\n" +
                   "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                   "Gobbles you in one bite!");
        }
        else
        {
            System.out.println("You enter a cave...\n" +
                    "It has a pleasant warmth to it...\n"+
            "You see a peacefully sleeping dragon on top of a bed of saffron flowers...\n"+
            "The dragon awakens, and invites you to his stash of the finest saffron pistils the world has ever known."+
                    "\n60 years later, you die a rich, satisfied man.");
        }
    }
}
