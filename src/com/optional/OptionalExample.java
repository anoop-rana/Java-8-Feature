package com.optional;

import java.util.Optional;

/**
 * @author anoop
 * 
 *         Java introduced a new class Optional in jdk8. It is a public final
 *         class and used to deal with NullPointerException in Java application.
 *
 */
public class OptionalExample {

    public static void main(String[] args) {
        String[] str = new String[10];

        Optional<String> checkNull = Optional.ofNullable(str[5]);

        // check for value is present or not
        if (checkNull.isPresent()) {
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        } else
            System.out.println("string value is not present");

        // Setting value for 5th index
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
        checkNull = Optional.ofNullable(str[5]);
        if (checkNull.isPresent()) { // It Checks, value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        } else
            System.out.println("string value is not present");

        // Setting value for 5th index
        str[5] = "JAVA OPTIONAL FOR METHOD REFERENCE";
        /* printing value by using method reference */
        checkNull.ifPresent(System.out::println);
        // printing value by using get method
        System.out.println(checkNull.get());
        System.out.println(str[5].toLowerCase());
    }

}
