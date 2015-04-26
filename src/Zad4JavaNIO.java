import java.io.BufferedWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zad4JavaNIO {

    public static void odczyt() throws IOException {

        System.out.println("\n---Odczyt z pakietu java.nio---");

        try
        {
            RandomAccessFile aFile = new RandomAccessFile(
                    "test.txt","r");
            FileChannel inChannel = aFile.getChannel();
            long fileSize = inChannel.size();
            ByteBuffer buffer = ByteBuffer.allocate((int) fileSize);
            inChannel.read(buffer);
            //buffer.rewind();
            buffer.flip();
            for (int i = 0; i < fileSize; i++)
            {
                System.out.print((char) buffer.get());
            }
            inChannel.close();
            aFile.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }


    public static void zapis(String s) {

        System.out.println("---Zapis z pakietu java.nio---");

        Path file = Paths.get("test.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            writer.write(s, 0, s.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}
