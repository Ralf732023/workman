package JavaCore_1_2_Lambda_Worker;

public class Worker {
    private JavaCore_1_2_Lambda_Worker.OnTaskDoneListener callback;
    private JavaCore_1_2_Lambda_Worker.OnTaskErrorListener errorCallback;

    public Worker(JavaCore_1_2_Lambda_Worker.OnTaskDoneListener callback, JavaCore_1_2_Lambda_Worker.OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is error");
            } else callback.onDone("Task " + i + " is done");
        }
    }
}