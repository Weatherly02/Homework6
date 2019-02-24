package edu.dmacc.codedsm.hw6;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class StringCombiner {
    public static void main(String[] args) {
        String kind = "Hershey";
        String sweets = "Chocolate";
        String addTogether = together(kind, sweets);

        System.out.println(addTogether);

        String currentDate = outputDate();
        System.out.println("Today is " + outputDate());

        String addTogetherTwo = togetherTwo(addTogether, currentDate);
        System.out.println(addTogetherTwo);
    }

    public static String together(String kind, String sweets) {
        return kind + " " + sweets;
    }

    public static String outputDate() {

        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
        return format.format(Date.from(Instant.now()));

    }

    public static String togetherTwo(String together, String outputDate) {
        return together + " " + outputDate;

    }


}
