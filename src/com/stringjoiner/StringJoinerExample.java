package com.stringjoiner;

import java.util.StringJoiner;

/**
 * @author anoop
 *
 *         Java added a new final class StringJoiner in java.util package. It is
 *         used to construct a sequence of characters separated by a delimiter.
 *         Now, you can create string by passing delimiters like comma(,),
 *         hyphen(-) etc.
 */
public class StringJoinerExample {

    /**
     * @param args passing comma and prefix & suffix in string joiner
     */
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",", "[", "]"); // passing comma(,) as delimiter

        // Adding values to StringJoiner
        joinNames.add("Rahul");
        joinNames.add("Raju");
        joinNames.add("Peter");
        joinNames.add("Raheem");

        System.out.println(joinNames);

        // Creating StringJoiner with :(colon) delimiter
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]"); // passing colon(:) and square-brackets as delimiter

        // Adding values to StringJoiner
        joinNames2.add("Peter");
        joinNames2.add("Raheem");

        // Merging two StringJoiner
        StringJoiner merge = joinNames.merge(joinNames2);
        System.out.println(merge);

    }

}
