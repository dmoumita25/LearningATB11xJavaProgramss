package ex_09_String;

public class Lab051_String_Function_IQ {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(4)); //l chartAt starts from index 0
       // System.out.println(name.charAt(10)); //string index out of bound exception

        //concat
        System.out.println(name.concat(" ")+"Patel");
//contains
        System.out.println(name.contains("Om"));

        //equals
        System.out.println(name.equals("Sonal"));

        //equals ignore case
        System.out.println(name.equalsIgnoreCase("sonal"));

        String name1 = "madam";
        //Return the index within the string of the
        //first occurrence of the specified substring
        System.out.println(name1.indexOf("m"));

        //index of
        System.out.println(name.indexOf('n'));

        //replace
        System.out.println(name1.replace('a', 'A'));

        //split function
        String gmail = "moumita@live.com@123";
        String[] split = gmail.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //substring
        System.out.println(name.substring(1,3));

        //startswith
        System.out.println(name.startsWith("S"));

        //endswith
        System.out.println(name.endsWith("l"));

        //trim
        String level= "   new level   ";
        System.out.println(level.trim());

        //compareto
        System.out.println(name.compareTo("Sonal"));


    }

}
