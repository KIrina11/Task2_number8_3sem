package ru.vsu.cs.kislova_i_v.utils;

import ru.vsu.cs.kislova_i_v.enums.DayOfWeek;

public class EnumHelper {
    public String getStringDayOfWeek(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";
            case WEDNESDAY:
                return "Wednesday";
            case THURSDAY:
                return "Thursday";
            case FRIDAY:
                return "Friday";
            case SATURDAY:
                return "Saturday";
            case SUNDAY:
                return "Sunday";
        }
        return "";
    }
}
