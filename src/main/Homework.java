package main;

import java.util.ArrayList;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Самостоятельная работа №8.\nКоллекции в Java - List.\n");
        {
            // 1) Вывести список. Создайте список из 5 целых чисел. Выведите его элементы через пробел.
            List<Integer> intDigits = new ArrayList<>(List.of(7, 2, 7, 42, 6));
            System.out.println("Вывод списка числе через пробел:");
            printListViaSeparator(intDigits);
            System.out.println();
        }
        {
            // 2) Доступ по индексу. Выведите третий элемент списка.
            List<Integer> intDigits = new ArrayList<>(List.of(7, 2, 7, 42, 6));
            System.out.printf("Третий элемент из списка %s равен: %s\n\n", intDigits, intDigits.get(2));
        }
        {
            // 3) Удаление элемента. Удалите второй элемент списка и выведите оставшиеся.
            List<Integer> intDigits = new ArrayList<>(List.of(7, 2, 7, 42, 6));
            System.out.printf("Результат удаления 2 элемента списка %s:\n", intDigits);
            intDigits.remove(1);
            printListViaSeparator(intDigits);
            System.out.println();
        }
        {
            // 4) Сумма элементов. Найдите сумму всех чисел в списке.
            List<Integer> intDigits = new ArrayList<>(List.of(7, 2, 7, 42, 6));
            int sum = 0;
            for (Integer i : intDigits) {
                sum += i;
            }
            System.out.printf("Сумма чисел из списка %s равна: %s\n\n", intDigits, sum);
        }
        {
            // 5) Подсчёт количества. Подсчитайте, сколько раз в списке встречается число 7.
            List<Integer> intDigits = new ArrayList<>(List.of(7, 2, 7, 42, 6));
            int countSeven = 0;
            for (Integer i : intDigits) {
                if (i == 7) {
                    countSeven++;
                }
            }
            System.out.printf("Число 7 содержится в списке в количестве: %s\n\n", countSeven);
        }
        {
            // 6) Поиск элемента. Проверьте, содержится ли число 42 в списке.
            List<Integer> intDigits = new ArrayList<>(List.of(7, 2, 7, 42, 6));
            System.out.printf("Число 42 %s в списке: %s\n\n", intDigits.contains(42) ? "содержится" : "не содержится", intDigits);
        }
        {
            // 7) Минимум и максимум. Найдите и выведите минимальное и максимальное число в списке.
            List<Integer> intDigits = new ArrayList<>(List.of(7, 2, 7, 42, 6));
            int minInt = intDigits.getFirst();
            int maxInt = intDigits.getFirst();
            for (int i = 1; i < intDigits.size(); i++) {
                if (intDigits.get(i) < minInt) {
                    minInt = intDigits.get(i);
                } else if (intDigits.get(i) > maxInt) {
                    maxInt = intDigits.get(i);
                }
            }
            System.out.printf("Минимальный элемент списка: %s\nМаксимальный элемент списка: %s\n\n", minInt, maxInt);
        }
        {
            // 8) Удалить все чётные числа. Удалите из списка все числа, делящиеся на 2.
            List<Integer> intDigits = new ArrayList<>(List.of(7, 2, 7, 42, 6));
            System.out.print("Список до удаления кратных 2: ");
            printListViaSeparator(intDigits);
            intDigits.removeIf(i -> i % 2 == 0);
            System.out.print("Список после удаления кратных 2: ");
            printListViaSeparator(intDigits);
            System.out.println();
        }
        {
            // 9) Создание списка из массива. Создайте список из массива int[] arr = {1, 2, 3, 4}.
            int[] arr = {1, 2, 3, 4};
            List<Integer> intDigits = new ArrayList<>();
            for (int num : arr) {
                intDigits.add(num);
            }
            System.out.print("Создание списка из массива: ");
            printListViaSeparator(intDigits);
            System.out.println();
        }
        {
            // 10) Количество элементов > N. Найдите количество элементов, больше чем число N.
            List<Integer> intDigits = new ArrayList<>(List.of(7, 2, 7, 42, 6, 5));
            final int numN = 4;
            int countElementsMoreN = 0;
            for (Integer i : intDigits) {
                if (i > numN) {
                    countElementsMoreN++;
                }
            }
            System.out.printf("Элементов списка %s, количество элементов больше N(%s) равно %s%n", intDigits.size(), numN, countElementsMoreN);
            System.out.println();
        }
        {
            // 11) Создание списка строк и фильтрация. Создайте список строк. Выведите строки, длина которых больше 5.
            List<String> stringList = new ArrayList<>(List.of("HelloWorld", "ByeBye", "JavaIsTheBest", "C", "C++", "Python"));
            boolean ifFirst = true;
            System.out.println("Вывод строк, длина которых больше 5:");
            for (String str : stringList) {
                if (str.length() > 5) {
                    if (ifFirst) {
                        System.out.print(str);
                    } else {
                        System.out.print(", " + str);
                    }
                    ifFirst = false;
                }
            }
            System.out.print("\n\n");
        }
        {
            // 12) Инвертировать список. Напишите метод, который возвращает список в обратном порядке.
            List<String> stringList = new ArrayList<>(List.of("HelloWorld", "ByeBye", "JavaIsTheBest", "C", "C++"));
            List<Integer> intDigits = new ArrayList<>(List.of(7, 2, 7, 42, 6));
            System.out.println("Инвертировать список:");
            printListViaSeparator(stringList, ", ");
            printListViaSeparator(reverseList(stringList), ", ");
            printListViaSeparator(intDigits);
            printListViaSeparator(reverseList(intDigits));
            System.out.println();
        }
        {
            // 13) Объединение двух списков без дубликатов. Даны два списка. Объедините их в один, не добавляя повторы.
            List<String> listFirst = new ArrayList<>(List.of("HelloWorld", "ByeBye", "C++", "Python", "JavaScript Language"));
            List<String> listSecond = new ArrayList<>(List.of("HelloWorld", "ByeBye", "Basic", "C#", "Cobol"));

            List<String> listResult = new ArrayList<>();
            for (String str : listFirst) {
                if (!listResult.contains(str)) {
                    listResult.add(str);
                }
            }
            for (String str : listSecond) {
                if (!listResult.contains(str)) {
                    listResult.add(str);
                }
            }
            System.out.println("Объединение двух списков без дубликатов:");
            printListViaSeparator(listFirst, ", ");
            printListViaSeparator(listSecond, ", ");
            printListViaSeparator(listResult, ", ");
            System.out.println();
        }
        {
            // 14) Сумма только нечётных чисел. Считайте List<Integer> и посчитайте сумму только нечётных чисел.
            List<Integer> intDigits = new ArrayList<>(List.of(7, 2, 7, 42, 6, -7));
            Integer sumOdd = 0;
            for (int num : intDigits) {
                if (num % 2 != 0) {
                    sumOdd += num;
                }
            }
            System.out.

                    printf("Сумма нечетных элементов списка %s равна: %s\n\n", intDigits, sumOdd);
        }
        {
            // 15) Фильтр по первой букве. Дан список строк. Верните новый список, содержащий только строки, начинающиеся с буквы "А"
            List<String> listFirst = new ArrayList<>();
            listFirst.add("Арарат");
            listFirst.add("Арбуз");
            listFirst.add("Архангельск");
            listFirst.add("Колумбия");
            listFirst.add("Австралия");
            System.out.println("Список элементов начинающихся с буквы \"А\":");
            printListViaSeparator(getListByFirstSymbol(listFirst, 'А'), ", ");
        }
    }

    public static void printListViaSeparator(List<?> list, String separator) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(separator);
            } else System.out.println();
        }
    }

    public static void printListViaSeparator(List<?> list) {
        String defaultSeparator = " ";
        printListViaSeparator(list, defaultSeparator);
    }

    public static <T> List<T> reverseList(List<T> list) {
        List<T> reverseList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        return reverseList;
    }

    public static List<String> getListByFirstSymbol(List<String> list, Character firstSymbol) {
        List<String> listResult = new ArrayList<>();
        for (String str : list) {
            if (str.charAt(0) == firstSymbol) {
                listResult.add(str);
            }
        }
        return listResult;
    }
}