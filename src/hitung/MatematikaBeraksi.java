
package hitung;


public class MatematikaBeraksi  {
    public static void main(String[] args){
    //membuat objek
    Matematika siddiq = new Matematika(4,2);
    
    System.out.println("Hasil penjumlahan : "+siddiq.setPenjumlahan());
    System.out.println("Hasil pengurangan : "+siddiq.setPengurangan());
    System.out.println("Hasil perkalian : "+siddiq.setPerkalian());
    System.out.println("Hasil pembagian : "+siddiq.setPembagian());
    }
}
