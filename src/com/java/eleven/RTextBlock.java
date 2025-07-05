package com.java.eleven;

/**
 * Text block 测试
 */
public class RTextBlock {
    public static void main(String[] args) {
        String textBlock = """
                你好,
                Hello world;\t
                \r\nAAAA
                """;
        System.out.println(textBlock);

        Object o = new Object();

        /**
         * 增强的 instanceof 语法允许在条件判断后直接进行类型转换
         */
        if (textBlock instanceof String s) {
            System.out.println("Length: " + s.length());
        }


    }
}
