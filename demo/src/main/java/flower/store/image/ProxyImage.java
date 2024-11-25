package flower.store.image;

public class ProxyImage implements MyImage {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("Initializing RealImage for the first time.");
            realImage = new RealImage(filename);
        } else {
            System.out.println("RealImage already initialized.");
        }
        realImage.display();
    }
}
