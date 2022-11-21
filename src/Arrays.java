import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[10];
        System.out.print("Початковий масив: ");
        for (int i = 0; i < 10; i++) {
            myArray[i] = random.nextInt(100); // заповнюємо масив цілими числами від 0 до 100
            System.out.print(myArray[i] + " ");
        }
        System.out.print("\nІнвертований масив: ");
        int[] reversArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            reversArray[i] = myArray[myArray.length - 1 - i];
            System.out.print(reversArray[i] + " ");
        }
    }
}
