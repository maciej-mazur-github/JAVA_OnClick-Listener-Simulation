import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button buttonPrint = new Button("Button Instance");




    public static void main(String[] args) {

        /*class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("Inner class ClickListener implementing inner Button interface OnClickListener evoked");
            }

            @Override
            public void onClick(String title) {
                System.out.println("This is onclick action");
            }
        }*/

        buttonPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("This is onclick action");
            }
        });

        listen();
    }

    public static void listen() {
        System.out.println("Press:");
        System.out.println("\t1 - for onclick action");
        System.out.println("\t2 - to quit");
        int choice;
        boolean quit = false;

        while(!quit) {
            System.out.print("Choice: ");

            if(!scanner.hasNextInt()) {
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    if(buttonPrint.isOnClickListenerSet()) {
                        buttonPrint.onClick();
                    } else {
                        System.out.println("onClickListener in the Button class instance is not set. Quitting the program now...");
                        quit = true;
                    }

                    break;
                case 2:
                    System.out.println("You decided to quit the program");
                    quit = true;
                default:
                    System.out.println("Choices 1 or 2 allowed only. Try again");
                    scanner.nextLine();
            }
        }
    }
}
