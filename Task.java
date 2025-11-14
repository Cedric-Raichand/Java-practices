
import java.util.ArrayList;
import java.util.Scanner;
  public class Task {


        // A list to store tasks
        private static ArrayList<String> tasks = new ArrayList<>();

        // Method to add a task
        public static void addTask(String task) {
            tasks.add(task);
            System.out.println("Task '" + task + "' added!");
        }

        // Method to view all tasks
        public static void viewTasks() {
            if (tasks.isEmpty()) {
                System.out.println("Pls No tasks available here.");
            } else {
                System.out.println("Your tasks:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            }
        }

        // Method to delete a task
        public static void deleteTask(int taskNumber) {
            if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                String removedTask = tasks.remove(taskNumber - 1);
                System.out.println("Task '" + removedTask + "' deleted successfully!");
            } else {
                System.out.println(" Please Invalid task number.");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n1. Add Task");
                System.out.println("2. View Tasks");
                System.out.println("3. Delete Task");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.print("Enter your task: ");
                        String task = scanner.nextLine();
                        addTask(task);
                        break;
                    case "2":
                        viewTasks();
                        break;
                    case "3":
                        viewTasks();
                        if (tasks.isEmpty()) break; // Skip deletion if no tasks
                        try {
                            System.out.print("Enter the task number to delete: ");
                            int taskNum = Integer.parseInt(scanner.nextLine());
                            deleteTask(taskNum);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a number.");
                        }
                        break;
                    case "4":
                        System.out.println("Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }
        }
    }

