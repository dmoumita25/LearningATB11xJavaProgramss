package ex_11_Arrays;

public class Lab062_Arrays_part2 {
    public static void main(String[] args) {
        String [] name={"Rohit","Ritu","Agni"};//one way
        System.out.println(name.length);
        System.out.println(name[2]);
        System.out.println(name[0]);
        System.out.println(name[1]);


        String[] students = new String[3];
        students[0]="Aditi";
        students[1]="Habib";
        students[2]="Hari";
        System.out.println(students.length);
        System.out.println(students[2]);//2nd way

        boolean[]is_married=new boolean[2];
        is_married[0]=true;
        is_married[1]=false;
        System.out.println(is_married[0]);
        System.out.println(is_married[1]);


    }
}
