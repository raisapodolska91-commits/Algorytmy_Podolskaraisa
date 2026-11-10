package arrayproject_masiv2;

public class Array_masiv2 {
    public static void main(String[] args) {
        long[] arr;                  // посилання на масив
        arr = new long[100];         // створення масиву
        int nElems = 0;              // кількість елементів
        int j;                       // лічильник циклу
        long searchKey;              // ключ шуканого елемента

        // Вставка елементів
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElems = 10;                 // у масиві зберігаються 10 елементів

        // Виведення елементів
        for (j = 0; j < nElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println("");

        // Пошук елемента
        searchKey = 66;
        for (j = 0; j < nElems; j++)
            if (arr[j] == searchKey)
                break;
        if (j == nElems)
            System.out.println("Can not find " + searchKey);
        else
            System.out.println("Found " + searchKey);

        // Видалення елемента з значенням 55
        searchKey = 55;
        for (j = 0; j < nElems; j++)
            if (arr[j] == searchKey)
                break;
        for (int k = j; k < nElems - 1; k++)
            arr[k] = arr[k + 1];
        nElems--;

        // Виведення елементів
        for (j = 0; j < nElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println("");
    }
}