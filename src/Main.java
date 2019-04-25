import task1.FirstTask;
import task2.SecondTask;
import task3.ThirdTask;
import task4.FourthTask;
import task5.FifthTask;

public class Main {
    public static void main(String[] args) {
        System.out.println("1st TASK:\n");
        System.out.println(new FirstTask().prepareAndExecute());                    // 1
        System.out.println("===================================================");

        System.out.println("2nd TASK:\n");
        new SecondTask().prepareAndExecute().stream().forEach(System.out::println); //2
        System.out.println("===================================================");

        System.out.println("3rd TASK:\n");
        System.out.println(new ThirdTask().prepareAndExecute());                    //3
        System.out.println("===================================================");

        System.out.println("4th TASK:\n");
        //!!Runs for a very long time!!
        //new FourthTask().prepateAndExecute();                                      //4
        System.out.println("===================================================");

        System.out.println("5th TASK:\n");
        new FifthTask().prepareAndExecute();
        System.out.println("===================================================");
    }
}
