package thursday_practices;

public class innerOuter {

    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 4; i++) {
            if (i == 2) {
                continue;
            }
            inner:
            for (int j = 0; j < 4; j++) {
                if (j == 2) {
                    continue outer;
                }
                if (i == 1) {
                    break outer;
                }
                System.out.println("i =  " + i + " j  = " + j);
            }
        }
    }
}