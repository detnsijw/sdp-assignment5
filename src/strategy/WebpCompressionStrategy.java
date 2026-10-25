package strategy;

public class WebpCompressionStrategy implements CompressionStrategy {

    @Override
    public byte[] compress(String fileName, byte[] rawData) {
        System.out.printf("[WebP Strategy] Compressing '%s' with WebP Web-Optimization algorithm...%n", fileName);
        return new byte[(int) (rawData.length * 0.35)];
    }

    @Override
    public String getFormatName() {
        return "WebP";
    }
}
