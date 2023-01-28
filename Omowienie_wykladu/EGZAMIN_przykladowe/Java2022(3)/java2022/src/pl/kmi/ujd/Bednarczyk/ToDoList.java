package pl.kmi.ujd.Bednarczyk;

import java.util.PriorityQueue;
import java.util.Scanner;

class Task implements Comparable<Task> {
    private int priority;
    private String description;

    public Task(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }
}


public class ToDoList  {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter command (add, next, exit): ");
            String command = scanner.nextLine();
            if (command.equals("add")) {
                System.out.print("Enter task priority: ");
                int priority = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter task description: ");
                String description = scanner.nextLine();
                tasks.offer(new Task(priority, description));
            } else if (command.equals("next")) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to complete.");
                } else {
                    Task task = tasks.poll();
                    System.out.println("Completed task: " + task.getDescription());
                }
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
    }
}




