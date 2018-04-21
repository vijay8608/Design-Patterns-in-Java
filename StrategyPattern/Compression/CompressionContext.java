package Compression;

public class CompressionContext {

    private CompressionStrategy strategy;

    // set compression strategy at runtime
    public void setCompressionStrategy(CompressionStrategy strategy){
        this.strategy = strategy;
    }

    // use compression strategy
    public void createArchive(){
        strategy.compressFiles();
    }


}
