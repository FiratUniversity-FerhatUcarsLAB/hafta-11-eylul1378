public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // TODO: a*b + c işlemini gerçekleştir
        return a * b + c;
    }

    public static double expSum(double x) {
        // TODO: x*e^(-x) + sqrt(1-e^(-x)) ifadesini hesapla
        double term1 = multadd(x, Math.exp(-x), 0.0);       // x * e^(-x)
        double term2_inner = multadd(-1.0, Math.exp(-x), 1.0); // 1 - e^(-x)
        double term2 = Math.sqrt(term2_inner);             // sqrt(1 - e^(-x))
        return term1 + term2;
    }

    public static void main(String[] args) {
        // TODO: test methods (Metotları test etme)
        
        System.out.println("--- multadd() Testi ---");
        // Basit Test: 1 * 2 + 3 = 5
        double test1 = multadd(1.0, 2.0, 3.0);
        System.out.println("1.0 * 2.0 + 3.0 = " + test1);

        System.out.println("\n--- Matematiksel İfadeler ---");

        // 1. İfade: sin(π/4) + cos(π/4)/2
        // multadd(a, b, c) -> a*b + c şeklinde yazılır: multadd(cos(π/4), 0.5, sin(π/4))
        double piOver4 = Math.PI / 4.0; 
        double result1 = multadd(Math.cos(piOver4), 0.5, Math.sin(piOver4));
        System.out.println("sin(π/4) + cos(π/4)/2 = " + result1);

        // 2. İfade: log 10 + log 20 (Java'da Math.log() doğal logaritma ln() demektir)
        // multadd(a, b, c) -> a*b + c şeklinde yazılır: multadd(1.0, log(20), log(10))
        double result2 = multadd(1.0, Math.log(20.0), Math.log(10.0));
        System.out.println("log(10) + log(20) = " + result2); 

        System.out.println("\n--- expSum() Testi ---");
        // Örn: x = 2.0 için test
        double x_val = 2.0;
        double expSumResult = expSum(x_val);
        System.out.println("expSum(" + x_val + ") = " + expSumResult);
    }
}