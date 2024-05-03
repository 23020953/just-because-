import java.util.Scanner;

public class RecoverySupportProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Recovery Support Program!");
        System.out.println("This program aims to provide support and resources for individuals dealing with depression and addiction.\n");
        
        // Prompt the user to choose an option
        while (true) {
            System.out.println("Please choose what you'd like to do:");
            System.out.println("1. Learn about depression and addiction");
            System.out.println("2. Access self-help resources");
            System.out.println("3. Connect with a support group");
            System.out.println("4. Speak with a counselor");
            System.out.println("5. Get emergency help");
            System.out.println("6. Exit");
            
            int choice = getUserChoice(scanner);
            
            switch (choice) {
                case 1:
                    learnAboutDepressionAndAddiction();
                    break;
                case 2:
                    accessSelfHelpResources();
                    break;
                case 3:
                    connectWithSupportGroup();
                    break;
                case 4:
                    speakWithCounselor();
                    break;
                case 5:
                    getEmergencyHelp();
                    break;
                case 6:
                    System.out.println("Thank you for using the Recovery Support Program. Take care!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Oops! That's not a valid option. Please choose a number from 1 to 6.");
            }
        }
    }
    
    // Function to get the user's choice and ensure it's valid
    private static int getUserChoice(Scanner scanner) {
        int choice = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Sorry, I didn't catch that. Please enter a number.");
            }
        }
        return choice;
    }
    
    // Function to provide information about depression and addiction
    private static void learnAboutDepressionAndAddiction() {
        System.out.println("=== Understanding Depression and Addiction ===");
        System.out.println("Depression is a serious condition that can make you feel sad, hopeless, and uninterested in things you used to enjoy.");
        System.out.println("Addiction is when you can't stop using something, even if it's harming you.");
        System.out.println("Learning about these issues can help you feel more in control and understand what you
