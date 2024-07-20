package homework.task6;

import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteToFile {
    public static void main(String[] args) {

        byte[] gameBoard = {1, 2, 0, 3, 2, 1, 0, 3, 2};

        try (DataOutputStream dos = new DataOutputStream(Files.newOutputStream(Paths.get("game_bo.dat")))) {
            for (byte b : gameBoard) {
                dos.writeByte(b);
            }
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
