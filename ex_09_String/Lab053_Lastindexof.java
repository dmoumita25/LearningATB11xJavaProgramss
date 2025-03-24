package ex_09_String;

public class Lab053_Lastindexof {
    public static void main(String[] args) {
        String namenew = "hello moto";
        System.out.println(namenew.lastIndexOf("o"));
        System.out.println(namenew.lastIndexOf("j")); //no such character present return -1
    }
}
