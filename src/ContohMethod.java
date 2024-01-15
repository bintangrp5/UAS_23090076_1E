import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class ContohMethod {
    //method/function/fungsi adalah blok yang berisi perintah-perintah yang akan dijalankan ketika method tersebut dipanggil.
    public static void main(String[] args) throws IOException{
        // penjualan dua angka
        CetakJudul();// function / method
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Angka 1 : ");
        int x = Integer.parseInt(reader.readLine());// diisi angka 3
        System.out.println("Masukkan Angka 2 : ");
        int y = Integer.parseInt((reader.readLine()));// diisi angka 10
        System.out.println(x + y);

        System.out.println("Hitung Penjumlahan Dua Angka Menggunakan Method");
        //Method Type 1
        JumlahDuaAngka();// Function

        //Method Type 2
        Jumlah_Method2(x,y);// Jumlah_Method2(3,10)

        //Method Type 3
        int something = Jumlah_Method3();// Function
        System.out.println (something);//12

        //Method Type 4
        String hasilku = GanjilGenap(something,"Kelas 1E");// GanjilGenap(45,"Kelas 1E")
        System.out.println("Method ke 4 --> : " + hasilku);
    }

    //routine/sub program
    private static String GanjilGenap(int angkasanya,String text){
        String hasil=null;
        if(angkasanya % 2 == 0 ){
            hasil = "Genap";
        }else{
            hasil = "Ganjil";
        }
        return text + " : " + hasil;
    }
    public static void CetakJudul(){
        System.out.println("Contoh Penjumlahan Dua Angka TANPA Menggunakan Method");
    }

    private static void Jumlah_Method3() throws IOException {
        BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Number1 ; ");
        int number1 =  Integer.parseInt(baca.readLine());
        System.out.print("Masukkan Number2 : ");
        int number2 = Integer.parseInt((baca.readLine()));
        System.out.println(number1+number2);
    }

    private static void Jumlah_Method2(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    private static void JumlahDuaAngka() throws IOException {
        BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukan Number 1 = ");
        int number1 = Integer.parseInt(baca.readLine());//5
        System.out.println("Masukan Number 2 = ");
        int number2 = Integer.parseInt(baca.readLine());//7
        System.out.println(number1 + number2);
    }
}
// Catatan yang perlu dihafalkan!!
// Tipe Tipe Method:
// 1. Method tanpa parameter dan tanpa return (void)
// 2. Method dengan parameter dan tanpa return (void)
// 3. Method tanpa parameter dan dengan return (non void)
// 4. Method dengan parameter dan dengan return (non void)

