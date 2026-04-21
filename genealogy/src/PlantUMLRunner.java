import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PlantUMLRunner {
    private static String runnerPath;
    public static void setJarPath(String path) {
        runnerPath = path;
    }

    public static void generateUML (String data, String outPath, String outFile) {
        File directory = new File(outPath);
        directory.mkdirs();
        File file = new File(outPath + "/" + outFile);

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
            ProcessBuilder pb = new ProcessBuilder("echo", data, "| java -jar ",
                    runnerPath, "-pipe > ", outPath+"/"+outFile);
            Process proc = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
