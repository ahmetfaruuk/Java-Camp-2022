package core.logging;

public class FileLogger implements Logger{
    @Override
    public void logged(String data) {
        System.out.println("Dosyaya loglandı: " + data);
    }
}
