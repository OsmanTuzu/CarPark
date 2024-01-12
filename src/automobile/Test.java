/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automobile;

/**
 *
 * @author OSMAN
 */
public class Test {
      public static void main(String[] args) throws InterruptedException {
        Automobile ford = new Automobile("34 AB 123");
        System.out.println(ford.getLicense());
        Automobile audi = new Automobile("34 TR 456 ");
        Automobile tofas = new Automobile("45 OT 045");

        Autopark park = new Autopark(3);
        park.girisYap(ford);

        park.girisYap(audi);
        park.girisYap(tofas);
        Thread.sleep(200);

        park.girisYap(audi);
        Thread.sleep(999);
        Thread.sleep(500);
        park.cikisYap(audi);
        park.cikisYap(ford);
        park.cikisYap(tofas);

    }


 }