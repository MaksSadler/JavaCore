package homework.task6;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            byte[] gameBoard = readFile("game_bo.dat");
            printGameBoard(gameBoard);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] readFile(String fileName) throws IOException {
        try (DataInputStream dis = new DataInputStream(Files.newInputStream(Paths.get(fileName)))) {
            byte[] gameBoard = new byte[9];
            for (int i = 0; i < 9; i++) {
                gameBoard[i] = dis.readByte();
            }
            return gameBoard;
        }
    }

    public static void printGameBoard(byte[] gameBoard) {
        System.out.println("Считанные значения из файла: ");
        for (byte value : gameBoard) {
            System.out.print(value + " ");
        }
    }
}
