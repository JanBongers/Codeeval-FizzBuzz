package nl.bongers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static java.util.Objects.nonNull;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while (nonNull((line = reader.readLine()))) {
            processLine(line);
        }
    }

    private static void processLine(String line) {
        line = line.trim();
        String[] input = line.split("\\s+");
        final String output = processFizzBuzz(input);
        System.out.println(output.trim());
    }

    private static String processFizzBuzz(String[] input) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= Integer.valueOf(input[2]); i++) {
            String result = "";
            if (i % Integer.valueOf(input[0]) == 0) result += "F";
            if (i % Integer.valueOf(input[1]) == 0) result += "B";
            if (result.isEmpty()) result = String.valueOf(i);
            output.append(result).append(" ");
        }
        return output.toString();
    }
}
