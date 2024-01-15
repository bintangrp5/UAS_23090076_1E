public class LatihanArray {

    public static void main(String[] args){
        //Array seperti laci di lemari baju misalnya
        //array itu indeksnya dimulai dari Nol (0)

        //Panjang suatu arrray ditentukan menggunakan length()
        //untuk mengakses value dari array yang diakses adalah indeksnya
        //Panjang suatu array itu pasti / tidak dinamis

        // Deklarasi Array - Contoh
        String[] kata = new String[4];
        kata[0] = "hallo";
        kata[1] = "selamat";
        kata[2] = "malam";
        kata[3] = "1E";
        int panjangkata = kata.length;// 4

        //deklarasi
        String[] nama = {"dewi","budi","heni"};
        int p = nama.length; // p=3

        // statement for untuk mengambil semua data dari varible array nama
        for(int index=0; index < nama.length;index++){
            System.out.println("index ke " + index+ " adalah : " + nama[index]);
        }

        // Secara singkat dapat menggunakan for..each
        for(String name : nama){
            System.out.println(name);
        }
    }
}
