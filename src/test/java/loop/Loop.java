package loop;

public class Loop {
    public static void main(String[] args) {
        String result = "";
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                if ((i * j) % 2 == 0) {
                    result += "*";
                } else {
                    result += (char) ('A' + i + j);
                }
            }
        }
        System.out.println(result);
    }
}