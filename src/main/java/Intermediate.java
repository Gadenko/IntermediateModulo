public class Intermediate {
    public static void main(String[] args) {

        checkHundredNumbers();
        printHundredNumbers();

    }

    public static String giveMeNumbers(int value){
        String result = "";

        if (value % 3 == 0) {
            result += "#";
        }
        if (value % 5 == 0) {
            result += "$";
        }
        return result + value;
    }
    public static String checkHundredNumbers() {
        String numbersText = "";

        for (int i = 1; i <= 100; i++) {
            numbersText += (giveMeNumbers(i) + " ");
        }

        return numbersText;
    }
    public static void printHundredNumbers(){
        System.out.println(checkHundredNumbers());
    }
}
