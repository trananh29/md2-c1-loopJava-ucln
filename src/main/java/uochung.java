import java.util.Scanner;

public class uochung {
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter a number ");
        a= sc.nextInt();
        System.out.println(" Enter a number ");
        b= sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0 || b==0) {
            System.out.println("khong co uoc chung vi 1 so la 0");
        }
        while (a!=b) {
            if (a>b) {
                a=a-b;
            } else {
                b=b-a;
            }
        }
        System.out.printf("uoc chung lon nhat la %d",a);

    }

}
