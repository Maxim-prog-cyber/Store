import java.util.ArrayList;


public class Basket  {

    private int sumBasket;
    private int numberOrder;

    {
        ArrayList abstractProduct = new ArrayList();
        abstractProduct.add("Добавить товар");

    }


    public int getSumBasket() {
        return sumBasket;
    }

    public void setSumBasket(int sumBasket) {
        this.sumBasket = sumBasket;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }
}
