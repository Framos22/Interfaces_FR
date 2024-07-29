
public class App {
    public static void main(String[] args) {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        Process process1 = new Process("Process 1");

        task1.setPriority(Priority.MIN_PRIORITY);
        task2.setPriority(Priority.MAX_PRIORITY);
        process1.setPriority(Priority.MED_PRIORITY);

        System.out.println(task1);
        System.out.println(task2);
        System.out.println(process1);

        System.out.println("Comparing tasks:");
        System.out.println("Task 1 vs Task 2: " + task1.compareTo(task2)); 
        System.out.println("Task 2 vs Task 1: " + task2.compareTo(task1)); 

        System.out.println("Comparing process with tasks:");
        System.out.println("Process 1 vs Task 1: " + process1.compareTo(task1)); 
        System.out.println("Process 1 vs Task 2: " + process1.compareTo(task2)); 
    }
}
