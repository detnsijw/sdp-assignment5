package strategy;

public class PngCompressionStrategy implements CompressionStrategy {
    @Override
    public byte[] compress(String fileName, byte[] rawData) {
        System.out.printf("[PNG Strategy] Compressing '%s' with Lossless PNG algorithm (Preserving Transparency)...%n", fileName);
        return new byte[(int) (rawData.length * 0.75)];
    }

    @Override
    public String getFormatName() {
        return "PNG";
    }
}
