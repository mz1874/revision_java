package com.java.eight.fucntionalInterfaceAndLambda.time;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class RTime {
    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.now();
        System.out.println("格式化后的时间" + dateFormatter.format(date));
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("格式化后的时间" + dateFormatter.format(localDateTime));


        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime + "原始时间");
        ZonedDateTime zonedDateTime1 = offsetDateTime.atZoneSameInstant(ZoneId.of("Pacific/Guadalcanal"));
        System.out.println(zonedDateTime1 + "偏移后的时间");


    }

}
