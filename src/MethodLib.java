public class MethodLib {

    public static void Title(){
        String myHeader;
        myHeader = "Calling Method From Other Java Class File \n" +
                    "This Title Imported To MainActivity.Java \n";
        System.out.println(myHeader);
    }

    public static void PrintMessage(){
        System.out.println("Print Message From Library\n");
    }

    public static void PrintMessageParams(String receiveMessage){
        System.out.println(receiveMessage);
    }

    public static void sumTwoNumbers(double Angka1, double Angka2){
        double mtotal = Angka1 + Angka2;
        System.out.println("Hasil penjumlahan " + Angka1 + " + " + Angka2 + " Adalah " + mtotal);
    }

    public static void SumNumbersFromArray(double[] ListNumbers){
        double SumNumberArray = 0;

        for(int i = 0; i <  ListNumbers.length;i++){
            SumNumberArray += ListNumbers[i];
        }
        System.out.println("Penjumlahan Angka Dalam Array Adalah = " + SumNumberArray);
    }

}
