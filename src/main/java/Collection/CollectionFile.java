package Collection;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class CollectionFile {
    public static void main(String[] args) throws FileNotFoundException {

        String stroka;
        int maxPovtor = 0;
        String maxKey= null;

        TreeMap<String, Integer> collections = new TreeMap<>();

        File file = new File("src\\main\\java\\Collection\\FileFromCollection");
        // Читаем содержание файла с помощью сканера и записываем в строку
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            stroka = scanner.nextLine();
            // Читаем строку и записываем слова в коллекцию разделяя сплитом. Считаем дубли
            String[] massiv = stroka.split(" ");
            for (String slovo : massiv) {
                slovo = slovo.toLowerCase();
                if (!collections.containsKey(slovo)) {
                    collections.put(slovo, 1);
                } else {
                    collections.put(slovo, collections.get(slovo) + 1);
                }
            }
        }
        // Проходим по коллекции и с помощью сета убираем дубли и находим слово с максимальным повторением
        for (Map.Entry<String, Integer> unicalnost : collections.entrySet()) {
            if (maxPovtor < unicalnost.getValue()) {
                maxPovtor = unicalnost.getValue();
                maxKey = unicalnost.getKey();
            }
            //Выводим список слов с повторами
            System.out.println(unicalnost.getKey() + " = " + unicalnost.getValue());
        }

        System.out.println("\nСамое частое слово: " + maxKey + "\nЧисло повторов = " + collections.get(maxKey));
        scanner.close();
    }
}
