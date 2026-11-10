package hashtable_masiv8;

class DataItem {
    private int iData; // Дані (ключ)

    public DataItem(int ii) {
        iData = ii;
    }

    public int getKey() {
        return iData;
    }
}

class HashTable {
    private DataItem[] hashArray; // Масив хеш-таблиці
    private int arraySize;
    private DataItem nonItem;     // Заповнювач для видалених елементів

    public HashTable(int size) {
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1); // Ключ -1 позначає видалений елемент
    }

    public void displayTable() {
        System.out.print("Table: ");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null)
                System.out.print(hashArray[j].getKey() + " ");
            else
                System.out.print("** ");
        }
        System.out.println("");
    }

    public int hashFunc(int key) {
        return key % arraySize; // Метод залишкового ділення
    }

    public void insert(DataItem item) {
        int key = item.getKey();
        int hashVal = hashFunc(key); // Отримуємо хеш-код

        // Поки не зустрінемо вільну або видалену комірку (лінійне пробивання)
        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            ++hashVal; // Збільшення на 1
            hashVal %= arraySize; // З циркуляцією по колу
        }
        hashArray[hashVal] = item;
    }

    public DataItem delete(int key) {
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                DataItem temp = hashArray[temp = hashVal]; // Зберігаємо посилання
                hashArray[hashVal] = nonItem; // Позначаємо комірку як видалену
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null; // Елемент не знайдено
    }

    public DataItem find(int key) {
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key)
                return hashArray[hashVal]; // Знайдено
            ++hashVal;
            hashVal %= arraySize;
        }
        return null; // Не знайдено
    }
}

public class HashTable_masiv8 {
    public static void main(String[] args) {
        DataItem aDataItem;
        int aKey, size, n;

        // Створення таблиці невеликого розміру для демонстрації
        size = 15;
        n = 7;

        HashTable theHashTable = new HashTable(size);

        for (int j = 0; j < n; j++) {
            aKey = (int) (java.lang.Math.random() * 99);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aDataItem);
        }

        theHashTable.displayTable();

        // Пошук елемента
        aKey = 45;
        aDataItem = theHashTable.find(aKey);
        if (aDataItem != null)
            System.out.println("Found " + aKey);
        else
            System.out.println("Could not find " + aKey);
    }
}