import java.util.ArrayList;
import java.util.Scanner;
public class App {
    private static ArrayList<String> todos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Dummy nextLine to consume the newline character

            switch (choice) {
                case 1:
                    listTodos();
                    break;
                case 2:
                    addTodo();
                    break;
                case 3:
                    markAsDone();
                    break;
                case 4:
                    removeTodo();
                    break;
                case 5:
                    System.out.println("Exiting ToDo App. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n======= ToDo App =======");
        System.out.println("1. List Todos");
        System.out.println("2. Add Todo");
        System.out.println("3. Mark Todo as Done");
        System.out.println("4. Remove Todo");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void listTodos() {
        if (todos.isEmpty()) {
            System.out.println("No todos found. Add some tasks!");
        } else {
            System.out.println("======= Your Todos =======");
            for (int i = 0; i < todos.size(); i++) {
                System.out.println((i + 1) + ". " + todos.get(i));
            }
        }
    }

    private static void addTodo() {
        System.out.print("Enter your new todo: ");
        String todo = scanner.nextLine();
        todos.add(todo);
        System.out.println("Todo added successfully!");
    }

    private static void markAsDone() {
        if (todos.isEmpty()) {
            System.out.println("No todos found. Add some tasks!");
        } else {
            System.out.print("Enter the number of the todo you want to mark as done: ");
            int index = scanner.nextInt();
            if (index >= 1 && index <= todos.size()) {
                System.out.println("Marking \"" + todos.get(index - 1) + "\" as done.");
                todos.remove(index - 1);
            } else {
                System.out.println("Invalid todo number. Please try again.");
            }
        }
    }

    private static void removeTodo() {
        if (todos.isEmpty()) {
            System.out.println("No todos found. Add some tasks!");
        } else {
            System.out.print("Enter the number of the todo you want to remove: ");
            int index = scanner.nextInt();
            if (index >= 1 && index <= todos.size()) {
                System.out.println("Removing \"" + todos.get(index - 1) + "\".");
                todos.remove(index - 1);
            } else {
                System.out.println("Invalid todo number. Please try again.");
            }
        }
    
    }
}
