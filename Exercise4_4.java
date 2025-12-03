public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
/*
        1) Dönüş Değerinin Kullanılmaması:
           getNumber(); metodu çalışır ve 42 değerini döndürür. 
           Dönen değer hiçbir değişkene atanmaz veya bir ifadede kullanılmaz.
           Java derleyicisi bir HATA (Error) vermez, program normal şekilde çalışır. 
           Ancak, çoğu modern IDE/Derleyici bu durum için bir UYARI (Warning) verir: 
           "The value returned by the method is never used" (Metot tarafından döndürülen değer hiç kullanılmadı).
        */

        /*
        2) void Metodun İfade İçinde Kullanılması:
           System.out.println(sayHello() + 7); satırı bir DERLEME HATASI (Compile-time Error) üretir.
           Hata Nedeni: sayHello() metodu 'void' tipinde bir değer döndürür (hiçbir değer döndürmez).
           Java'da 'void' tipi bir değer, aritmetik işlemlerde (+ 7) veya birleştirme ifadelerinde
           (System.out.println içinde) kullanılamaz, çünkü bir veri değeri temsil etmez. [
           Tipik Hata Mesajı: "Error: bad operand types for binary operator '+'" (İkili operatör '+' için yanlış işlenen tipleri)
           veya "void type not allowed here" (Burada void tipine izin verilmez).
        */
    }
}
