/**
 *
 * @author Oğuzcan Özdemir
 */
 
 import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
        int sayi1,sayi2;
        Scanner read = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        sayi1= read.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        sayi2= read.nextInt();
        
        if ( sayi1 == sayi2) {
            System.out.println("Sayi1 == Sayi2");// birbilerine eşitler
        }else {
            System.out.println("Sayi1 != Sayi2");// birbirlerine eşit değiller
        }
        if ( sayi1 > sayi2 ){
            System.out.println("Sayi1 > Sayi2 ");// 1.sayi daha büyük
        }
        else if (sayi2 > sayi1) {
            System.out.println("Sayi2 > Sayi1");//2.sayi daha büyük
        }
        
        if ( sayi1 >= sayi2 ){
            System.out.println("Sayi1 >= Sayi2");// sayi1, sayi2 den daha büyük veya eşit
        }
        
        if ( sayi2 >= sayi1 ){
            System.out.println("Sayi2 >= Sayi1");// sayi2, sayi1 den daha büyük veya eşit
        }

    }
}
