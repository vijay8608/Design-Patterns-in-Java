package Compression;

public class ZipCompressionStrategy implements CompressionStrategy {

    @Override
    public void compressFiles() {
        System.out.println("Using Zip compression strategy");
    }
}
