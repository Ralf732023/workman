package JavaCore_1_2_Lambda_Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}