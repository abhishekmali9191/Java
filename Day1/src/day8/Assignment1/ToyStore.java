package day8.Assignment1;

import day6.Manufacture_Date;
import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    public static void main(String[] args) {
        Stock stock = new Stock();
        List<Toy> toyList = new ArrayList<>();
        toyList.add(new Toy(101,"bicycle",5000,new Manufacture_Date(6,2022),"Battery operated", 4));
        toyList.add(new Toy(201,"bike",10000,new Manufacture_Date(9,2023),"Battery operated", 7));
        toyList.add(new Toy(501,"car",15000,new Manufacture_Date(1,2023),"Battery operated", 5));
        toyList.add(new Toy(601,"doll",2500,new Manufacture_Date(10,2023),"Educational", 8));
        toyList.add(new Toy(401,"puzzle",1000,new Manufacture_Date(8,2024),"Educational", 3));
        toyList.add(new Toy(301,"bat",1500,new Manufacture_Date(11,2022),"Educational", 6));

        System.out.println("-------List of All the Toys available in the Stock---------");
        stock.print_Stock(toyList);
        System.out.println("===========================================================================");
        System.out.println("--------------Filtering Stock by Category-------------------");
        stock.filter_by_category(toyList,"educaTional");
        System.out.println("===========================================================================");
        System.out.println("------List of Toys in a price range----------------------------------");
        stock.toys_by_priceRange(toyList,15000,5000);
        System.out.println("===========================================================================");
        System.out.println("----------Sorting Toys by categories and then by price----------------------------");
        stock.sort_toys_by_category_and_price_wise(toyList);
        System.out.println("===========================================================================");
        System.out.println("-----------------List of Stock older than an Year--------------------------");
        stock.older_stock_list(toyList);
        System.out.println("===========================================================================");
        System.out.println("----------Count of Toys as per their categories----------------------------");
        stock.count_toys_category_wise(toyList);
        System.out.println("===========================================================================");
        System.out.println("---------------Most Expensive Toy-----------------------");
        stock.most_expensive_toy(toyList);
        System.out.println("===========================================================================");
        System.out.println("---------------Least Expensive Toy-----------------------");
        stock.least_expensive_toy(toyList);
        System.out.println("===========================================================================");
        System.out.println("---------------Toy By age group-----------------------");
        for(Toy toy : toyList)
        {
            stock.total_toys_age_group_wise(toyList,toy.getAge());
        }

    }
}
