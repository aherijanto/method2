import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {

        MethodLib.Title();
        MethodLib.PrintMessage();
        MethodLib.PrintMessageParams("Penjumlahan Dua Angka");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input First Number = ");
        double mFirst = sc.nextDouble();

        System.out.print("Input Second Number = ");
        double mSecond = sc.nextDouble();

        MethodLib.sumTwoNumbers(mFirst,mSecond);
        System.out.println("\n");

        System.out.print("Input Jumlah Data = ");
        int totalDataInput = sc.nextInt();
        int noUrut = 0;
        System.out.println("\n");
        double[] deretAngka = new double[totalDataInput];
        for(int j = 0; j< deretAngka.length;j++){
            noUrut++;
            System.out.print("Masukan Angka Ke " + noUrut + " = ");
            double inputAngka = sc.nextDouble();
            deretAngka[j] = inputAngka;
        }

        MethodLib.SumNumbersFromArray(deretAngka);

    }
}
