public class VarArguments {
    static void showList(String... A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println(i + 1 + ". " + A[i]);
        }
    }

    public static void main(String[] args) {
        showList("ajay", "suresh", "ganesh");
    }

}
