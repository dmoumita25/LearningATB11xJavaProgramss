package ex_11_Arrays;

public class Lab067_Odd_Even_array {
    public static void main(String[] args) {
        int[] num={45,4,8,9,3,2,8,1,0};
        for (int i:num)
        {
            if (i%2==0){
                System.out.println("the number "+i+" is even");
            }else {
                System.out.println("the number "+i+" is odd");
            }
        }
    }
}