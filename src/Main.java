import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n,r,total=1,i;
        Scanner inp=new Scanner(System.in);

        System.out.println("Ussu alinacak sayiyi giriniz: ");
        n=inp.nextInt();
        System.out.println("Us olacak sayiyi giriniz: ");
        r=inp.nextInt();

        for (i=1;i<=r;i++){
            total *= n;
        }
        System.out.println("Uslu sayi toplami: "+total);
    }
}
