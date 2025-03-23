package ex_07_For_Loop;

public class Lab041_F0r_Loop_IQ {
    public static void main(String[] args) {
//  To find the even & odd numbers
//       even i%2==0

        for (int i = 0; i <=50 ; i++) {
            if (i%2==0){
                System.out.println("Even"+ " " +i);
            }else{
                System.out.println("Odd"+ " " +i);
            }

        }
    }
}
