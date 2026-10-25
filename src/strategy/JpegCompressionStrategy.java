package strategy;

public class JpegCompressionStrategy implements CompressionStrategy {
    private final int quality;

    public JpegCompressionStrategy(int quality) {
        this.quality = quality;
    }

    @Override
    public byte[] compress(String fileName, byte[] rawData) {
        System.out.printf("[JPEG Strategy] Compressing '%s' with Lossy JPEG algorithm (Quality: %d%%)...%n", fileName, quality);
        return new byte[(int) (rawData.length * (quality / 100.0) * 0.4)];
    }

    @Override
    public String getFormatName() {
        return "JPEG";
    }
}
