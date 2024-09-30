package day6;

import java.util.ArrayList;
import java.util.List;

public class ToyStore {

    public static void main(String[] args)
    {
        Stock stock = new Stock();
        List<Toy> toyList = new ArrayList<>();
        toyList.add(new Toy(101,"bicycle",5000,new Manufacture_Date(6,2022),"Battery operated", "4+"));
        toyList.add(new Toy(201,"bike",10000,new Manufacture_Date(9,2023),"Battery operated", "8+"));
        toyList.add(new Toy(501,"car",15000,new Manufacture_Date(1,2023),"Battery operated", "7+"));
        toyList.add(new Toy(601,"doll",500,new Manufacture_Date(10,2023),"Educational", "5+"));
        toyList.add(new Toy(401,"puzzle",1000,new Manufacture_Date(8,2024),"Educational", "3+"));
        toyList.add(new Toy(301,"bat",1500,new Manufacture_Date(11,2022),"Educational", "6+"));

        System.out.println("-------List of All the Toys available in the Stock---------");
        stock.printStock(toyList);
        System.out.println("===========================================================================");
        System.out.println("--------------Filtering Stock by Category-------------------");
        stock.filter_by_category(toyList,"educational");
        System.out.println("===========================================================================");
        System.out.println("-------Searching Toy by product Id using binary search-----------");
        stock.search_by_product_id(toyList,601);
        System.out.println("===========================================================================");
        System.out.println("------List of Toys in a price range----------------------------------");
        stock.filter_by_priceRange(toyList,5000,20000);
        System.out.println("===========================================================================");
        System.out.println("----------List of toys above a specific Age-----------------------------");
        stock.filter_by_ageRange(toyList,"6+");
        System.out.println("===========================================================================");
        System.out.println("----------Sorting Toys by Product Id---------------------------------------");
        List<Toy> sortedList =stock.sort_by_prod_id(toyList);
        for (Toy toy: sortedList)
        {
            System.out.println(toy);
        }
        System.out.println("===========================================================================");
        System.out.println("----------Sorting Toys by Product Name---------------------------------------");
        List<Toy> sortedList_name =stock.sort_by_name(toyList);
        for (Toy toy: sortedList_name)
        {
            System.out.println(toy);
        }
        System.out.println("===========================================================================");
        System.out.println("----------Sorting Toys by Product Price---------------------------------------");
        List<Toy> sortedlist_price =stock.sort_by_price(toyList);
        for (Toy toy: sortedlist_price)
        {
            System.out.println(toy);
        }
        System.out.println("===========================================================================");
        System.out.println("-----------------List of Stock older than an Year--------------------------");
        stock.old_stock_list(toyList);

        System.out.println("===========================================================================");
        System.out.println("----------Group of Toys as per their categories----------------------------");
        stock.group_as_per_category(toyList);

    }
}
