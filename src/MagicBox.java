import java.util.Random;

public class MagicBox<T> {


    private int maxAmount;
    protected T[] items;
    Random random = new Random();

    public MagicBox(int maxAmount) {
        this.maxAmount = maxAmount;
        items = (T[]) new Object[maxAmount];
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null)
                throw new RuntimeException
                        ("Ячейки коробки ещё не заполнины, осталось заполнить" + (maxAmount - i));
        }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}