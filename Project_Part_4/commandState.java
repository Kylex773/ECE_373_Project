import java.util.Scanner;

public class commandState extends screenState
{
    public commandState(Machine machine, int functType, UserData userData){
        super(machine, functType, userData);
        
        //variables needed for setup
        boolean commandExit = false;
        String userCommand;
        Scanner keyboard = new Scanner(System.in);
        
        while (!commandExit){
        userCommand = keyboard.nextLine();
        
        switch(userCommand)
            {   
            case "?":
                String commandList = "---------------\n" +
                                     "List of Commands: \n" +
                                     "MathTime (Enters the calculator)\n" +
                                     "Credits (Display credits)\n" +
                                     "Exit (Bye bye)\n" +
                                     "---------------\n";
                
                Screen.print(commandList);
                break;
            case "MathTime":
                Screen.print("Good Luck Soldier\n");
                
                commandExit = true;
                break;
                
            case "Credits":
                String credits = "-----------------------------\n" +
                                 "Master programmers: Brayden and Kyle\n" +
                                 "Made his diagrams pretty: Brayden\n" +
                                 "Made the user interface pretty: Kyle\n" +
                                 "Wasted most time: Kyle\n" +
                                 "Needs more sleep: Brayden\n" +
                                 "-----------------------------\n";
                Screen.print(credits);
                break;
                
            case "Exit":
                System.exit(0);
                break;
                
            default:
                Screen.print("Not a command\n");
                break;
                
            }
        }
        
        machine.terminateState();
        }
    }