import java.lang.Math;

public class Biseksi {

  // mencari nilai dari F(x)
  public static double fungsi(Double x) {
    double hasil;

    // f(x) = x^3 - 10x + 8
    hasil = Math.pow(x, 3) - (10 * x) + 8;

    return hasil;
  }

  // mencari nilai Xr
  public static double exer(Double a, Double b) {
    double hasil;
    // Xr = (a + b) / 2
    hasil = (a + b) / 2;
    return hasil;
  }

  public static void main(String[] args) {
    double A = 2.4;         
    double B = 2.7;         
    double E = 0.02;        
    int N = 5, iterasi = 0; 
    double hasilA;          
    double hasilB;         
    double hasilXr = 0;     
    double hasilfxr = 0;    
    double absA;           
    boolean kondisi = true;
    
    hasilA = fungsi(A); 
    hasilB = fungsi(B); 

    //jika f(a).f(b) > 0, maka
    if (hasilA * hasilB > 0) { 
      //true
      //tidak ada akar              
      System.out.println("Tidak ada akar"); 
    } else { 
      //false
      //mempunyai akar
      while (kondisi) { 
        //iterasi +1
        iterasi++; 

        hasilXr = exer(A, B);       
        hasilfxr = fungsi(hasilXr); 

        absA = Math.abs(B-A); // |b-a|

        if (absA < E || iterasi > N) { // |a-b| < e atau iterasi > iterasi maksimum
          //keluar dari loop
          kondisi = false;
        } else {
          // kondisi = true
          if (hasilA * hasilfxr < 0) { // jika f(a).f(Xr) < 0
            // true
            B = hasilXr;       // b = xr
            hasilB = hasilfxr; // f(b) = f(Xr) 
          } else {
            //false
            A = hasilXr;        // a = xr
            hasilA = hasilfxr;  // f(a) = f(Xr)
          }

        }

      }
    
      System.out.println("Akar xr : " + hasilXr + " dan F(Xr) : " + hasilfxr);
    }
  }

}