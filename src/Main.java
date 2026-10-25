import context.ImageProcessor;
import strategy.JpegCompressionStrategy;
import strategy.PngCompressionStrategy;
import strategy.WebpCompressionStrategy;

public class Main {
    public static void main(String[] args) {
        byte[] dummyImageData = new byte[1024 * 1024];

        ImageProcessor processor = new ImageProcessor(new JpegCompressionStrategy(80));
        processor.processImage("photo_hero.raw", dummyImageData);

        processor.setStrategy(new PngCompressionStrategy());
        processor.processImage("logo_transparent.raw", dummyImageData);

        processor.setStrategy(new WebpCompressionStrategy());
        processor.processImage("banner_ad.raw", dummyImageData);
    }
}
