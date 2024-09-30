package day6;

import java.util.Comparator;

public class NameComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return o1.getProd_name().compareTo(o2.getProd_name());
    }
}
