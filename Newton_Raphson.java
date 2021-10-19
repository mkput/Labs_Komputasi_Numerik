import java.lang.Math;
import java.util.Scanner;

public class Newton_Raphson {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N = 10, iterasi, pilihan;
    double e = 0.001, y1, y2, xn, x0 = 3.0, absA;


    System.out.println("=== List Jawaban ===");
    System.out.println("1. Soal 1");
    System.out.println("2. Soal 2");
    System.out.println("3. Soal 3");
    System.out.println("====================");
    System.out.print("Pilih jawban yang ingin dilihat (angka): ");
    pilihan = input.nextInt();

    switch (pilihan) {
        case 1:
            
            System.out.print("========================= Soal 1 =========================");
            System.out.printf("\nIterasi\t\txn\t\tf(xn)\t\tf'(xn)\n");
            iterasi = 0;
            xn = x0;
            y1 = Per1(x0);
            y2 = Per1T(x0);
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", iterasi, xn, y1, y2);
            xn = xn - (y1 / y2);
        
            absA = Math.abs(y1);
            while (absA >= e && iterasi <= N) {
                iterasi++;
                y1 = Per1(xn);
                y2 = Per1T(xn);
                System.out.printf("%d\t\t%.5f\t\t%.5f\t\t%.5f\n", iterasi, xn, y1, y2);
                xn = xn - (y1 / y2);
                absA = Math.abs(y1);
            }
            System.out.println("-----------------------------------------------------------");
            System.out.printf("Akar x = %.2f\n", xn);
            break;
    
        case 2:

            System.out.print("========================= Soal 2 =========================");
            System.out.printf("\nIterasi\t\txn\t\tf(xn)\t\tf'(xn)\n");
            iterasi = 0;
            xn = x0;
            y1 = Per2(x0);
            y2 = Per2T(x0);
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", iterasi, x0, y1, y2);
            xn = xn - (y1 / y2);
        
            absA = Math.abs(y1);
            while (absA >= e && iterasi <= N) {
                iterasi++;
                y1 = Per2(xn);
                y2 = Per2T(xn);
                System.out.printf("%d\t\t%.5f\t\t%.5f\t\t%.5f\n", iterasi, xn, y1, y2);
                xn = xn - (y1 / y2);
                absA = Math.abs(y1);
            }
            System.out.println("-----------------------------------------------------------");
            System.out.printf("Akar x = %.2f\n", xn);
            break;
        
        case 3:
            
            System.out.print("========================= Soal 3 =========================");
            System.out.printf("\nIterasi\t\txn\t\tf(xn)\t\tf'(xn)\n");
            iterasi = 0;
            x0 = 1;
            xn = x0;
            y1 = Per3(x0);
            y2 = Per3T(x0);
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", iterasi, x0, y1, y2);
            xn = xn - (y1 / y2);
        
            absA = Math.abs(y1);
            while (absA >= e && iterasi <= N) {
                iterasi++;
                y1 = Per3(xn);
                y2 = Per3T(xn);
                System.out.printf("%d\t\t%.5f\t\t%.5f\t\t%.5f\n", iterasi, xn, y1, y2);
                xn = xn - (y1 / y2);
                absA = Math.abs(y1);
            }
            System.out.println("-----------------------------------------------------------");
            System.out.printf("Akar x = %.2f\n", xn);
            break;
        
        default:
            System.out.println("Pilihan Anda tidak valid!");
            break;
            
    } 
  }


  public static double Per1(Double x) {
    double hasil;
    hasil = (4 * Math.pow(x, 3)) - (15 * Math.pow(x, 2)) + (17 * x) - 6;
    return hasil;
  }

  public static double Per1T(Double x) {
    double hasil;
    hasil = (12 * Math.pow(x, 2)) - (30 * x) + 17;
    return hasil;
  }

  public static double Per2(Double x) {
    double hasil;
    hasil = Math.pow(x, 3) - (2 * Math.pow(x, 2)) + (3 * x) - 6;
    return hasil;
  }

  public static double Per2T(Double x) {
    double hasil;
    hasil = (3 * Math.pow(x, 2)) - (4 * x) + 3;
    return hasil;
  }

  public static double Per3(Double x) {
    double hasil;
    hasil = Math.pow(x, 5) + (2 * Math.pow(x, 2)) - 4;
    return hasil;
  }

  public static double Per3T(Double x) {
    double hasil;
    hasil = (5 * Math.pow(x, 4)) + (4 * x);
    return hasil;
  }

}