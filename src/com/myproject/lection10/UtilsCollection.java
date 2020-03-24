package com.myproject.lection10;

import com.myproject.utils.ApplicationLogger;

import java.util.*;

public class UtilsCollection {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * This method filling list with ListIterator  random marks and after delete not good marks (<6).
     * Also output MAX mark
     */
    public static void studentMarks() {

        List<Integer> list = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator();

        Random rnd = new Random();


        for (int i = 0; i < 10; i++) {
            int mark = rnd.nextInt(10) + 1;
            iterator.add(mark);

        }

        ApplicationLogger.LOGGER.info("Number of marks: " + list.size());
        int tmp = 0;
        for (int i = 0; i < list.size(); i++) {
            ApplicationLogger.LOGGER.info("Student mark0" + i + "=" + list.get(i));
            if (tmp < list.get(i)) {
                tmp = list.get(i);
            }
        }
        ApplicationLogger.LOGGER.info("Maximum student mark is " + tmp);


        iterator = list.listIterator();
        while (iterator.hasNext()) {
            int mark = iterator.next();
            if (mark < 6) {
                iterator.remove();
            }
        }

        ApplicationLogger.LOGGER.info("Number of marks after removing bad " + list.size());
        for (int i = 0; i < list.size(); i++) {
            ApplicationLogger.LOGGER.info("Student mark0" + i + "=" + list.get(i));

        }
    }

    /**
     * This method output students in assending and descending more, using two variants.
     * First - using for cycle,
     * Second - using iterator
     *
     */
    public static void student() {

        List<String> studentName = new LinkedList<>() {
            {
                add("Vasiliy");
                add("Gregory");
                add("Vitaly");
                add("Innokenty");
                add("Valera");
                add("Marfa");
                add("Polina");
                add("Venera");
                add("Andrey");

            }
        };

        ApplicationLogger.LOGGER.info("Students name in ascending mode, cycle output");
        for (int i = 0; i < studentName.size(); i++) {
            ApplicationLogger.LOGGER.info("Name #" + i + " " + studentName.get(i));

        }

        Collections.reverse(studentName);

        ApplicationLogger.LOGGER.info("Students name in descending mode, cycle output");
        for (int i = 0; i < studentName.size(); i++) {
            ApplicationLogger.LOGGER.info("Name #" + i + " " + studentName.get(i));

        }

        ApplicationLogger.LOGGER.info("Students name in ascending mode, iterator  output");
        ListIterator<String> iterator = studentName.listIterator();
        int counter01 = 0;
        while (iterator.hasNext()) {
            ApplicationLogger.LOGGER.info("Name #" + counter01 + " " + iterator.next());
            counter01++;
        }

        ApplicationLogger.LOGGER.info("Students name in decending mode, iterator  output");
        int counter02 = 0;
        while (iterator.hasPrevious()) {

            ApplicationLogger.LOGGER.info("Name #" + counter02 + " " + iterator.previous());
            counter02++;
        }

    }

}












