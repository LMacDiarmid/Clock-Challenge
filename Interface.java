package ChallengeExercise;
import java.util.Scanner;

public class Interface {
private int choice;
private boolean quit = false;

   public Interface()
    {
        while (!quit)
        {
            //instantiating a new clock object
            Clock time = new Clock();

            //Displaying a menu
            displayMenu();

            //deciding what the user wanted
            callChoice(time);

            lineBreak();
        }

        //Exit message
        System.out.println("See you next time!");
    }

    //Menu
    public void displayMenu()
    {
        Scanner kboard = new Scanner(System.in);
        System.out.println("\nMenu");
        System.out.println("Press 1 for 24hr time");
        System.out.println("Press 2 for 12hr time");
        System.out.println("Press 3 to exit");
        choice = kboard.nextInt();
    }

    public void lineBreak()
    {
        System.out.println("\n___________________________________________________________");
    }

    //deciding the what clock to call or to end the program
    public void callChoice(Clock time)
    {
        switch (choice) {
            case 1:
            {
                time.set24hrTime();
                time.displayTime();
                break;

            }
            case 2:
            {
                time.set12hrTime();
                time.displayTime();
                break;

            }
            case 3:
            {
                quit = true;
                break;

            }
            default:
            {
                System.out.println("Please enter either 1,2 or 3");
                break;

            }
        }

    }


}


