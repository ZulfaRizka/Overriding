
package nama;

/**
 *
 * @author zulfarm
 */
public class Nama {
public void Sapa(){
// Membuat Variabel
System.out.println("Jurusan : RPL");
System.out.println("Hobi    : Bermain Voli");
}
   
    public static void main(String[] args) {
        //Membuat Objek
        Siapa ss = new Siapa();
        Nama nn = new Nama();
     
    ss.Sapa();//memanggil method pada class Siapa
    nn.Sapa();//memanggil method pada class Nama
}
}