public class LuckyNumbers {

    public int randomIntBetween(int min, int max){
        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        return randomNumber;
    }

    public String getNumbers() {
        int num1 = randomIntBetween(1, 65);
        int num2 = randomIntBetween(1, 65);
        int num3 = randomIntBetween(1, 65);
        int num4 = randomIntBetween(1, 65);
        int num5 = randomIntBetween(1, 65);
        int superB = randomIntBetween(1, 30);

        return "Your luck numbers are: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + "\n" +"The super ball is: " + superB;

    }
}
