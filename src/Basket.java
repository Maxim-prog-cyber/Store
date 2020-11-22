import java.util.ArrayList;

public class Basket  {
    ArrayList <AbstractProduct> list1  = new ArrayList<>();
    private int sumBasket;
    private int numberOrder;

    public ArrayList<AbstractProduct> getList() {
        return list1;
    }

    public void setList(ArrayList<AbstractProduct> list) {
        this.list1 = list;
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

    public void addProduct  (AbstractProduct list1){ /////Мой метод "Добавить товар"


    }

}
