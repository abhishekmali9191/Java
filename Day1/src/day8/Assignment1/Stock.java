package day8.Assignment1;

import day6.Manufacture_Date;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stock {

    Stream<Toy> stream;
    Comparator<Toy> byPrice = Comparator.comparing(Toy::getProd_price);
    // Printing Stock
    public void print_Stock(List <Toy> toyList)
    {
        stream = toyList.stream();
        stream.forEach(System.out::println);

    }

    // Filtering stock by catrgory and printing it....
    public void filter_by_category(List <Toy> toyList, String category)
    {
        stream = toyList.stream();
        stream.filter((toy)->toy.getCategory().equalsIgnoreCase(category)).forEach(System.out::println);
    }

    //Displaying toys by price range
    public void toys_by_priceRange(List <Toy> toyList,double maxPrice, double minPrice)
    {
        stream = toyList.stream();
        stream.filter((toy)->{                              // instead of writing predicate separately we write it in stream
                if(toy.getProd_price()>=minPrice && toy.getProd_price()<=maxPrice)
                    return true;
                else
                    return false;
                })
                .forEach(System.out::println);

    }
    // sorting toy by category and then by price
    public void sort_toys_by_category_and_price_wise(List<Toy> toyList)
    {

        Comparator<Toy> byCategory = Comparator.comparing(Toy::getCategory).thenComparing(byPrice);
        stream = toyList.stream();
        stream.sorted(byCategory).forEach(System.out::println);

    }
    // using predicate interface for sorting the toys older than an year
    public void older_stock_list(List<Toy> toyList)
    {
        Manufacture_Date current_date = new Manufacture_Date(10,2024);
        stream = toyList.stream();
        Predicate<Toy> old_stock = (toy)->{
            if(current_date.getYear()-toy.getPurchase_date().getYear()>1)
                return true;
            else if (current_date.getYear()-toy.getPurchase_date().getYear()==1)
            {
                if(current_date.getMonth()-toy.getPurchase_date().getMonth()>0)
                    return true;
                else
                    return false;
            }
            else
                return false;
        };
        stream.filter(old_stock).forEach(System.out::println);
    }
    // Collecting Toy object in a map by giving key as category and object as their key
    public void count_toys_category_wise(List<Toy> toyList)
    {
        stream = toyList.stream();
        Map<String, List<Toy>> count_toys = stream.collect(Collectors.groupingBy(Toy::getCategory));
        count_toys.forEach((toykey, toylist) -> System.out.println(toykey + " : " + toylist));    // printing the map
        System.out.println("Count of Toys as per category : ");
        count_toys.forEach((toykey, toylist) -> System.out.println(toykey + " : " + toylist.size()));  // printing the key and the size of the list
    }

    // comparing toy by their price and printing the max valued toy
    public void most_expensive_toy(List<Toy> toyList)
    {
        stream= toyList.stream();
        Map<String, Optional<Toy>> count_toys = stream.collect(Collectors.groupingBy(Toy::getCategory,Collectors.maxBy(byPrice)));
        count_toys.forEach((key, value) -> System.out.println(key+" : "+value));
    }
    // comparing toy by their price and printing the max valued toy
    public void least_expensive_toy(List<Toy> toyList)
    {
        stream= toyList.stream();
        Map<String, Optional<Toy>> count_toys = stream.collect(Collectors.groupingBy(Toy::getCategory,Collectors.minBy(byPrice)));
        count_toys.forEach((key, value) -> System.out.println(key+" : "+value));
    }
    // Number of toys in an age group
    public void total_toys_age_group_wise(List<Toy> toyList,int age)
    {
        stream = toyList.stream();
        Long agecount = stream.filter((toy)->(toy.getAge()>=age)).collect(Collectors.counting());
        System.out.println("Age : "+age+", and number of toys in this group : "+agecount);
    }

}
