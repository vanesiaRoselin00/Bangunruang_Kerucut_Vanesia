import bangunruang.Kerucut;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        Kerucut kerucut1 = new Kerucut();
        System.out.print("Masukkan jari-jari kerucut (cm) = ");
        kerucut1.r = keyboard.nextInt();
        System.out.print("Masukkan tinggi kerucut (cm) = ");
        kerucut1.t = keyboard.nextInt();

        kerucut1.hitungvolumekerucut();
        kerucut1.tampilanvolumekerucut();
    }
}
