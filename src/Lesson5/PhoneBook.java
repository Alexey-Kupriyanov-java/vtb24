package Lesson5;

import java.util.*;

public class PhoneBook {
    Map<String, HashSet<String>> book;

    public PhoneBook() {
        book = new HashMap<>();
    }

    void add(String surname, String phoneNumber) {
        if (!book.containsKey(surname)) {
            book.put(surname, new HashSet<>());
        }
        book.get(surname).add(phoneNumber);
    }

    Set<String> get(String surname) {
        return book.get(surname);
    }
}
