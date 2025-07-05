package com.java.eleven;

public class RSwitch {
    public static void main(String[] args) {
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            default:
                dayName = "Weekend";
                break;
        }
        System.out.println(dayName);

        /**
         * 新的switch
         */
        int days = 4;
        String dayNames = switch (days) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Weekend";
        };
        System.out.println(dayNames);


        /**
         * 多个判断组合
         */
        String index = "s";
        String switch2 = switch (index) {
            case "1", "2" -> "Monday";
            default -> "Weekend";
        };
        System.out.println(switch2);


        //如果需要在 case 中执行多条语句并返回结果，可以使用 yield 关键字。
        String message = switch (5) {
            case 1:
                yield "Start of the week";
            case 2, 3, 4:
                yield "Midweek";
            case 5:
                System.out.println("Almost weekend!");
                yield "Almost weekend";
            case 6, 7:
                yield "Weekend!";
            default:
                yield "Invalid day";
        };
        System.out.println(message + "\tyield"); // 输出: Almost weekend!
        //       Almost weekend



    }
}
