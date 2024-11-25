package flower.store.demo;

public class PaperDecorator extends ItemDecorator{
    private final Item item;
    public PaperDecorator(Item item){
        this.item = item;
    }
    @Override
    public double getPrice(){
        return  13 + item.getPrice();
    }
}