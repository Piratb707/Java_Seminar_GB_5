////Реализация структуры телефонной книги с помощью HashMap:
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class PhoneBook {
//    private Map<String, List<String>> phoneBook = new HashMap<>();
//
//    public void add(String name, String phone) {
//        List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());
//        phones.add(phone);
//        phoneBook.put(name, phones);
//    }
//
//    public List<String> getPhonesByName(String name) {
//        return phoneBook.get(name);
//    }
//
//    public void printDuplicates() {
//        Map<String, Integer> nameToCount = new HashMap<>();
//        for (String name : phoneBook.keySet()) {
//            List<String> phones = phoneBook.get(name);
//            if (phones.size() > 1) {
//                nameToCount.put(name, phones.size());
//            }
//        }
//        nameToCount.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
//    }
//}


////Реализация алгоритма пирамидальной сортировки (HeapSort):
//public class HeapSort {
//    public static void sort(int[] arr) {
//        int n = arr.length;
//
//        for (int i = n / 2 - 1; i >= 0; i--) {
//            heapify(arr, n, i);
//        }
//
//        for (int i = n - 1; i >= 0; i--) {
//            int temp = arr[0];
//            arr[0] = arr[i];
//            arr[i] = temp;
//
//            heapify(arr, i, 0);
//        }
//    }
//
//    private static void heapify(int[] arr, int n, int i) {
//
