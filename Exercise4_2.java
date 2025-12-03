public class Exercise4_2 {
// 1
    // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {
        zippo("rattle", 13); // 1
    } // 12

    public static void baffle(String blimp) { // 5, 10
        System.out.println(blimp); // 6
        zippo("ping", -5); // 7
    } // 11

    public static void zippo(String quince, int flag) { // 2, 8
        if (flag < 0) { // 3, 9
            System.out.println(quince + " zoop"); // 9
        } 
        else { // 3
            System.out.println("ik"); // 4
            baffle(quince); // 5
            System.out.println("boo-wa-ha-ha"); // 11
        }
    } // 7, 12
    
    /*
    // EK SORULARIN CEVAPLARI

    // 2. baffle metodu ilk çağrıldığında blimp parametresinin değeri nedir?
    // Cevap: "rattle" 

    // 3. Programın ürettiği tüm çıktıyı yazınız.
    // Cevap:
    // ik
    // rattle
    // ping zoop
    // boo-wa-ha-ha

    // 4. Hangi satırlar birden fazla kez çalışmıştır? Satır numaralarını listeleyin.
    // Satır 5: zippo çağrısı (main içinde)
    // Satır 7: zippo çağrısı (baffle içinde)
    // Satır 14: zippo metot tanımı
    // Satır 15: if (flag < 0) koşulu
    // Satır 23: zippo metot sonu
    */
}