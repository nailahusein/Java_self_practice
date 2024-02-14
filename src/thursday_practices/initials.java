package thursday_practices;
//C.N.
public class initials {

    public static void main(String[] args) {
        String name = "  chuck norris ";
//        String name1 = name.substring(2,3).toUpperCase().concat(".");
//        String name2 = name.substring(8,9).toUpperCase().concat(".");
//        name = name1 +name2;

        name = name.substring(2,3).toUpperCase().concat(".") +
                name.substring(8,9).toUpperCase().concat(".");

        System.out.println(name);
    }
}
