import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Woody_king {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            File outputFile = new File("output.txt");
            Scanner scanner = new Scanner(inputFile);
            FileWriter writer = new FileWriter(outputFile);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int i = 0;

            if (a == b) {
                writer.write("1");
            } else {
                if (b == 1) {
                    writer.write(String.valueOf(a));
                } else {
                    b = b - 1;
                    int o = ((a / b) * (a - b)) - (b * (((a / b) * ((a / b) - 1)) / 2));
                    writer.write(o < 0 ? "1" : String.valueOf(o));
                }
            }

            scanner.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}