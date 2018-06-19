import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size shout not exceed 20");
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.print("List: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        int x;
        System.out.println("Enter element delete: ");
        x = scanner.nextInt();
        int index_del;
        boolean isExist = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index_del = i;
                System.out.println("The position of element delete is: " + (index_del +1));
                isExist = true;
                for (int j = index_del; j < (array.length - 1); j++) {
                    array[j] = array[j + 1];
                }
                array[array.length -1] = 0;
                System.out.print("The new list: ");
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j] + "\t");
                }
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found " + x + " in the list.");


    }
}
