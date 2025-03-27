package Ex_10_Strngbuffer_Strngbuilder;

public class Lab054_Strngbuffer_strndbuilder {
    public static void main(String[] args) {
String name = "Moumita";
String n1 = new String("Moumita"); //90% usage

        StringBuffer stringbuffer = new StringBuffer("Moumita");
        StringBuilder stringBuilder = new StringBuilder("Moumita");


        // less than <10% used.
        System.out.println(name);
        System.out.println(n1);
        System.out.println(stringbuffer);
        System.out.println(stringBuilder);

    }
}
