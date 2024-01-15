import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        // if itu digunakan untuk menentukan suatu kondisi true or false
        // selama kondisi itu memenuhi suatu validasi ---> true
        // sebaliknya bernilai false
        String status;
        int angka = 2;
        if(angka == 2){
            status = "benar";
        }else{
            status = "salah";
        }


        // Angka Genap atau Ganjil
        System.out.println("Masukkan Angka = ");
        Scanner inputAngka = new Scanner(System.in);
        int Angka = inputAngka.nextInt();// angka = 25, 25 ini berasal dari variabel inputAgka
        String Status; // variabel untuk menampung status 'Genap' atau 'Ganjil'
        if(angka % 2 == 0){ // pembagian sisa (modulus)---> 4 % 2 = 4 mod 2 = 2 sisa 0
            status = "Angka Genap";
        }else{
            status = "Angka Ganjil";
        }
        System.out.println(angka + " adalah " + status);
    } // yang sudah selesai silahkan di running
}
