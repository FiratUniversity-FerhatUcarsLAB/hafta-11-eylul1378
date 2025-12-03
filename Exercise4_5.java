public class Exercise4_5 {

    public static void zoop (String fred, int bob) {
        System.out.println(fred);       // Çıktı 1: fred (\n) | Çıktı 4: fred (\n)
        if (bob == 5) {                 // 1. çağrıda TRUE, 2. çağrıda FALSE
            ping("not "); // Çağrı 2: ping("not ")
        } else {
            System.out.println("!"); // Çıktı 5: "!" (\n) (Sadece 2. çağrıda çalışır)
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop( "just for", bizz);   // Çağrı 1: zoop("just for", 5)
        clink(2 * buzz);                // Çağrı 3: clink(4)
    }

    public static void clink (int fork) {
        System.out.print( "It's ");   // Çıktı 3: "It's "
        zoop("breakfast ", fork); // Çağrı 4: zoop("breakfast ", 4)
    }

    public static void ping (String strangStrung) {
        System.out.println("any" + strangStrung + "more "); // Çıktı 2: "any not more " (\n)
    }
    
    /*
    // EK GÖREV 1: PROGRAMIN TAM ÇIKTISI (Hatasız çalışması varsayılarak)

    just for
    any not more 
    It's breakfast !
    */

    /*
    // EK GÖREV 2: zoop metodu İKİNCİ kez çağrıldığında programın durumunu gösteren stack diyagramı (clink içinden çağrılırken)

    | Metot | Aktif Satır (Dönüş Adresi) | Parametreler | Yerel Değişkenler |
    | :---: | :---: | :---: | :---: |
    | **zoop** | (Çalışıyor) | fred: "breakfast " | (Yok) |
    | | | bob: 4 | |
    | **clink** | Satır 21 (zoop sonrası) | fork: 4 | (Yok) |
    | **main** | Satır 17 (clink sonrası) | args (String dizisi) | bizz: 5 |
    | | | | buzz: 2 |
    */
}