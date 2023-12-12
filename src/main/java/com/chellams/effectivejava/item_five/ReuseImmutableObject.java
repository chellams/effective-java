package com.chellams.effectivejava.item_five;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ReuseImmutableObject {
    private static final Date START;
    private static final Date END;

    static {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        START = calendar.getTime();
        calendar.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        END = calendar.getTime();
    }

    /**
     * The below method creates the Calendar, 2 Date objects (start and end) every time its getting called even though
     * those objects are not changing in time.
     *
     * @param birthDate DOB
     * @return true if the baby is boomer
     */
    public boolean isBabyBoomer(Date birthDate) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date start = calendar.getTime();
        calendar.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date end = calendar.getTime();
        return birthDate.compareTo(start) >= 0 && birthDate.compareTo(end) < 0;
    }

    /**
     * Same boomer checking method reuses the existing object as it's not changing.
     *
     * @param birthDate
     * @return
     */
    public boolean isBoomerOptimized(Date birthDate) {
        return birthDate.compareTo(START) >= 0 && birthDate.compareTo(END) < 0;
    }

    public static void main(String[] args) {
        ReuseImmutableObject immutableObject = new ReuseImmutableObject();
        Date birthDate = new GregorianCalendar(1960, Calendar.FEBRUARY, 11).getTime();
        System.out.println(immutableObject.isBabyBoomer(birthDate));
        System.out.println(immutableObject.isBoomerOptimized(birthDate));
    }
}
