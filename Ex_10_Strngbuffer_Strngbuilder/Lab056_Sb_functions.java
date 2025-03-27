package Ex_10_Strngbuffer_Strngbuilder;

public class Lab056_Sb_functions {
    public static void main(String[] args) {
StringBuffer sb = new StringBuffer("Moumita Dasgupta");
sb.delete(0,7);
        System.out.println(sb); //delete

        StringBuffer sb1 = new StringBuffer("Moumita");
        sb1.replace(0,4,"n");
        System.out.println(sb1);



    }
}
