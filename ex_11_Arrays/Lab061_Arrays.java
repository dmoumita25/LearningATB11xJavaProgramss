package ex_11_Arrays;

public class Lab061_Arrays {
    public static void main(String[] args) {
        int []marks={1,2,3,4,5,6,7};
        //2nd way to create arrays
        int[]marks2=new int[5]; //give a fixed size for array
        String[] names = new String[3];
        names[0]="Mou";
        names[1]="Mita";
        names[2]="Jhum";
        //names[3]="Amit"; //ArrayIndexOutOfBoundsException
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        //System.out.println(names[3]);//ArrayIndexOutOfBoundsException

        System.out.println(marks[3]);

    }
}
