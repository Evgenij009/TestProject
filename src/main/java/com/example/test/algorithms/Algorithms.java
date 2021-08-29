package by.epam.algorithms;

public class Algorithms {

    //Поиск подстроки в строках
    public static String findLongersubLineInTheLines(String[] lines) {
        String matchingLine = "";
        int count = 0;
        for (int i = 0; i < lines[0].length(); ++i) {
            char letter = lines[0].charAt(i);
            for (int j = 1; j < lines.length; ++j) {
                if (lines[j].length() < i || letter != lines[j].charAt(i)) {
                    System.out.println("Count: " + count);
                    return matchingLine;
                }
                ++count;
            }
            matchingLine += letter;
        }
        System.out.println("Count: " + count);
        return matchingLine;
    }


}
