package strategy;

public interface CompressionStrategy {
    byte[] compress(String fileName, byte[] rawData);
    String getFormatName();
}
