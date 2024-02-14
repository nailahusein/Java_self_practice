package thursday_practices;

public class QuizzCheck {

    public static void main(String[] args) {
        int wd = 0;
        String[] days = {"Sun", "Mon", "Wed", "Sat"};

        for (int i = 0; i < days.length; i++) {
            switch (days[i]) {
                case "Sat", "Sun":
                    wd -= 1;
                    break;
                case "Mon":
                    wd += 1;
                case "Wed":
                    wd += 2;
            }
        }

        System.out.println(wd);
    }
}
