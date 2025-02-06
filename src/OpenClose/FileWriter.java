package OpenClose;

public class FileWriter implements Writer{
    @Override
    public void write(String content) {
        System.out.println("Writing to file");
    }
}