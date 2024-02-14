package day13_practice_tasks.state_task;

public class StateClients {

    public static void main(String[] args) {

        Virginia virginia = new Virginia("Virginia","VA", "Democratic Party","Glenn Youngkin","Mark Warner", 8_642_000);

        California california = new California("California", "CA", "Democratic Party","Gavin Newsom","Laphonza Butler",39_290_000);

        Texas texas = new Texas("Texas", "TX", "Republican Party", "Greg Abbott", "Ted Cruz", 29_530_000);

        Florida florida = new Florida("Florida", "FL", "Republican Party", "Ron DeSantis", "Rick Scott", 21_780_000);


        System.out.println(virginia);
        System.out.println(california);
        System.out.println(texas);
        System.out.println(florida);
    }
}
