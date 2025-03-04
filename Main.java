public class Main {
    public static void main(String[] args) {
        TextFileHandler tfh = new TextFileHandler("1st handler");
        ImageFileHandler ifh = new ImageFileHandler("2nd handler");
        DocFileHandler dfh = new DocFileHandler("3nd handler");

        tfh.setHandler(dfh);
        dfh.setHandler(ifh);

        tfh.process(new File("demo" , "text", "C:/OOP"));
        tfh.process(new File("demo2" , "image", "C:/OOP"));
        tfh.process(new File("demo3" , "document", "C:/OOP"));
    }
}