package JavaCore_1_2_Lambda_Worker;

public class Main {

    public static void main(String[] args) {
        JavaCore_1_2_Lambda_Worker.OnTaskDoneListener listener = System.out::println;
        JavaCore_1_2_Lambda_Worker.OnTaskErrorListener errorListener = System.out::println;
        JavaCore_1_2_Lambda_Worker.OnTaskDoneListener.Worker worker = new JavaCore_1_2_Lambda_Worker.OnTaskDoneListener.Worker(listener, errorListener);
        worker.start();
    }
}