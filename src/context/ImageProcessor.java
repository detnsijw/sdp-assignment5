package context;

import strategy.CompressionStrategy;

public class ImageProcessor {
    private CompressionStrategy strategy;

    public ImageProcessor(CompressionStrategy initialStrategy) {
        this.strategy = initialStrategy;
    }

    public void setStrategy(CompressionStrategy newStrategy) {
        System.out.println("\n[Context] Switching compression strategy to: " + newStrategy.getFormatName());
        this.strategy = newStrategy;
    }

    public byte[] processImage(String fileName, byte[] rawData) {
        if (strategy == null) {
            throw new IllegalStateException("Compression strategy is not configured!");
        }
        System.out.println("[Context] Processing file: " + fileName + " (" + rawData.length + " bytes)");
        byte[] compressedData = strategy.compress(fileName, rawData);
        System.out.println("[Context] Processing complete. Final size: " + compressedData.length + " bytes.");
        return compressedData;
    }
}
