package day6;

import java.util.Comparator;

public class PriceComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        if (o1.getProd_price() < o2.getProd_price())
            return -1;
        else
            return 1;
    }
}
