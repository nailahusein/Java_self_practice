package day11_practice_tasks;

public class CarpetClients {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(12, 13.5, 35, true);

        carpet1.calcCost();

        System.out.println(carpet1);

        Carpet carpet2 = new Carpet(24, 27.5, 20, false);

        carpet2.calcCost();

        System.out.println(carpet2);
    }
}
