package homework.task5;

import java.io.IOException;
import java.nio.file.*;

public class BackupUtility {
    public static void main(String[] args) {
        try {
            createBackup("src/homework/task5", "src/homework/backup");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void createBackup(String src, String backup) throws IOException {
        Path srcPath = Paths.get(src);
        Path backupPath = Paths.get(backup);
        if (!Files.exists(backupPath)) {
            Files.createDirectories(backupPath);
        }
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(srcPath)) {
            for (Path entry : stream) {
                if (Files.isRegularFile(entry)) {
                    copyFile(entry, backupPath.resolve(entry.getFileName()));
                }
            }
        }
    }

    private static void copyFile(Path src, Path destination) throws IOException {
        Files.copy(src, destination, StandardCopyOption.REPLACE_EXISTING);
    }
}
