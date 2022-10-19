package core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void logged(String data) {
        System.out.println("Database'ye loglandı: "+ data);
    }
}
