package Ex_10_Strngbuffer_Strngbuilder;

public class Lab055_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Moumita");
        stringBuffer.append(" Dasgupta");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
        String s1 = "Hello"; //new string in SCP
        String s2 = "World"; //new string in SCP
        String s3 = s1+" "+ s2; //new string in SCP
        System.out.println( s1+" "+ s2);

    }
}
