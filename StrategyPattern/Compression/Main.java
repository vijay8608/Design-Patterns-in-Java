package Compression;

public class Main {

    public static  void main(String[] args){

        CompressionContext ctx = new CompressionContext();

        ctx.setCompressionStrategy(new ZipCompressionStrategy());

        ctx.createArchive();

        ctx.setCompressionStrategy(new RarCompressionStrategy());

        ctx.createArchive();

    }

}
