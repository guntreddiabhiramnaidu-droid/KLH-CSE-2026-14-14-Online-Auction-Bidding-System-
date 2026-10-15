import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/** Week 11: write and read only synthetic classroom lot-state data. */
public class onlineAuction11 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("classroom-lot-state.csv");
        List<String> lines = List.of(
                "label,points,state",
                "AURORA,60,LOCKED",
                "COMET,45,LOCKED",
                "MAPLE,30,OPEN");
        Files.write(file, lines, StandardCharsets.UTF_8);

        List<String> loaded = Files.readAllLines(file, StandardCharsets.UTF_8);
        System.out.println("Saved 3 classroom lots to classroom-lot-state.csv");
        System.out.println("Loaded classroom lots: " + (loaded.size() - 1));
        System.out.println(loaded.get(1));
    }
}