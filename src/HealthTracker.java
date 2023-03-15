import java.util.*;
public class HealthTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int choice;

        // Display the menu
        System.out.println("Welcome to Health Tracker!");
        System.out.println("1. Track your daily steps");
        System.out.println("2. Record your meals");
        System.out.println("3. Monitor your blood pressure");
        System.out.println("4. View your health stats");
        System.out.println("5. Exit");

        do {
            // Get the user's choice
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Track daily steps
                    int steps = getDailySteps();
                    System.out.println("You have walked " + steps + " steps today.");
                    break;
                case 2:
                    // Record meals
                    recordMeal();
                    break;
                case 3:
                    // Monitor blood pressure
                    int systolic = getBloodPressure("systolic");
                    int diastolic = getBloodPressure("diastolic");
                    System.out.println("Your blood pressure is " + systolic + "/" + diastolic);
                    break;
                case 4:
                    // View health stats
                    displayStats();
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Thank you for using Health Tracker!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }

    public static int getDailySteps() {
        // Get the number of steps walked today
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of steps you have walked today: ");
        return scanner.nextInt();
    }

    public static void recordMeal() {
        // Record a meal and its calorie count
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the meal: ");
        String name = scanner.nextLine();
        System.out.print("Enter the calorie count for " + name + ": ");
        int calories = scanner.nextInt();
        System.out.println(name + " recorded (" + calories + " calories)");
    }

    public static int getBloodPressure(String type) {
        // Get the systolic or diastolic blood pressure reading
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your " + type + " blood pressure reading: ");
        return scanner.nextInt();
    }

    public static void displayStats() {
        // Display the user's health stats
        System.out.println("----- Your Health Stats -----");
        System.out.println("Steps walked today: " + getDailySteps());
        recordMeal();
        int systolic = getBloodPressure("systolic");
        int diastolic = getBloodPressure("diastolic");
        System.out.println("Blood pressure: " + systolic + "/" + diastolic);
        System.out.println("------------------------------");

	}

}
