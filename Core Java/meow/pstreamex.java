package meow;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

public class pstreamex {
    public static void main(String[] args) {
        File file = new File("Core Java/meow/pstreamex.txt");
        try {
            List<String> l = Files.readAllLines(file.toPath());
            Stream<String> s = l.parallelStream().parallel();
            // parallel -> now use the whole power

            s.forEach(e -> {
                System.out.println(e);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
