/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automobile;
import java.util.Vector;
/**
 *
 * @author OSMAN
 */
 public class Autopark{

        Vector<Automobile> sayarpark;
       public static long otoparkKasasi = 0;
        
        // vector tipinde otopark oluşturun boyutu size kadar olsun.
        // otopark kasasını 0 yapın.

        Autopark(int size){
           sayarpark = new Vector<Automobile>(size);
           this.setOtoparkKasasi(1);
        }
        long basla=0,bitir=0,fark=0;

        // Automobile otoparka giriyor otoparktaki araçların otopark kapasitesini
        // geçmediğini kontrol edip otoparka girdiğinde otonun giriş zamanını kaydeder
        // bunun için System.currentTimeMillis(); kullanılır
        // eğer araç park edemezse, yani otopark doluysa, [license no] "park edemedi" yazılır
        public void girisYap(Automobile a) {
           if (sayarpark.capacity() > sayarpark.size()) {

            basla = System.currentTimeMillis();
            System.out.print("\n" + a.getLicense() + " otoparka girdi. ");
            System.out.print("Otopark kapasitesi ve boyutu : " + sayarpark.capacity() + "," + sayarpark.size() + "\n");
            sayarpark.add(a);
        } else {
            System.out.println(a.getLicense() + " park edemedi. ");
        }
        }
        // içeride kalınan zamanı bulun (çıkarken bulunan zaman - girişzamanı)
        //(içerde kalınan zaman/100f) * 10 ile kasaya eklenecek miktarı bul ve
        // bu miktarı kasaya ekledikten sonra Aracı otoparktan removela
        // ekrana hangi araç çıktığını plaka ile, nekadar süre kaldığını ve kaç tl ödediğini de yazdırır
        // eğer çıkacak olan araç otoparkta var ise çıkar.Parkta yoksa araç bulunamadı diye ekrana yazar.

        public void cikisYap(Automobile a) {
             if (sayarpark.contains(a)) {
            bitir = System.currentTimeMillis();
            fark = (bitir - basla);
              this.setOtoparkKasasi((int) (long) (otoparkKasasi + (fark / 100f) * 10));
            System.out.print(a.getLicense() + " otoparktan " + fark + " milisaniye sonra cikti.");
            System.out.print("Kasaya eklenecek tutar (" + +(fark / 100f) + " saniye * Saniye basina 10TL) = " + this.getOtoparkKasasi() + "\n");
            sayarpark.remove(a);
        } else {
            System.out.println("Arac bulunamadi");
        }
        }
   
        

    public Vector<Automobile> getSayarpark() {
        return sayarpark;
    }

    public void setSayarpark(Vector<Automobile> sayarpark) {
        this.sayarpark = sayarpark;
    }

     public long getOtoparkKasasi() {
        return otoparkKasasi;
    }

    public void setOtoparkKasasi(long otorparkKasasi) {
        this.otoparkKasasi = otorparkKasasi;
    }
    
    
//
//    private void setOtorparkKasasi(int i) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private String getOtorparkKasasi() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
        
        
        

 }