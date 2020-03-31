import static java.lang.Math.*;

public class FindNumbers {

    public static void main(String[] args) {
        System.out.println(findNumbers(10,20));
    }
    public static int findNumbers(int a, int b){
        int min = abs(a);
        int max = abs(b);
        for (int i = min+1; i < max; i++) {
            System.out.println(i);
        }
    }
}
