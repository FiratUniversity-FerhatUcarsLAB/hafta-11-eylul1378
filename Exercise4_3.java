public class Exercise4_3 {

    public static void zoop() {
        baffle();                           // Çağrı 3: baffle() çağrılır.
        System.out.print("You wugga ");  // Çıktı 5: "You wugga " yazdırılır.
        baffle();                           // Çağrı 6: baffle() çağrılır.
    } // Dönüş: main'e (Satır 12)

    public static void main(String[] args) {
        System.out.print( "No, I ");      // Çıktı 1: "No, I " yazdırılır.
        zoop();                             // Çağrı 2: zoop() çağrılır.
        System.out.print("I ");          // Çıktı 8: "I " yazdırılır.
        baffle();                           // Çağrı 9: baffle() çağrılır.
    } // Program sonu

    public static void baffle() {
        System.out.print("wug");         // Çıktı 2, 6, 10: "wug" yazdırılır.
        ping();                             // Çağrı 4, 7, 11: ping() çağrılır.
    } // Dönüş: zoop veya main'e 

    public static void ping() {
        System.out.println( ".");         // Çıktı 3, 7, 11: "." yazdırılır ve SATIR ATLANIR (\n).
    } // Dönüş: baffle'a
    
    /*
    // EK GÖREV 1: PROGRAMIN TAM ÇIKTISI 
    No, I wug.
    You wugga wug.
    I wug.
    */

    /*
    // EK GÖREV 2: ping metodu ilk kez çağrıldığında programın durumunu gösteren stack diyagramı 

    | Metot | Aktif Satır (Dönüş Adresi) | Parametreler | Yerel Değişkenler |
    | :---: | :---: | :---: | :---: |
    | **ping** | (Çalışıyor) | (Yok) | (Yok) |
    | **baffle** | Satır 18 (ping sonrası) | (Yok) | (Yok) |
    | **zoop** | Satır 5 (baffle sonrası) | (Yok) | (Yok) |
    | **main** | Satır 12 (zoop sonrası) | args (String dizisi) | (Yok) |
    */
}