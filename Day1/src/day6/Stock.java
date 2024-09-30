package day6;

import java.util.*;

public class Stock {
    public void printStock(List<Toy> toyList){
        for(Toy toy : toyList )
        {
            System.out.println(toy);
        }
    }

    public void filter_by_category(List<Toy> toyList, String category)
    {
        List<Toy> newList = new ArrayList<>();
        for(Toy toy : toyList)
        {
            if(toy.getCategory().equalsIgnoreCase(category))
                newList.add(toy);
        }
       for(Toy toy : newList)
       {
           System.out.println(toy);
       }
    }

    public void  search_by_product_id(List<Toy> toyList,int id)
    {

        List<Toy> sortedToyList = sort_by_prod_id(toyList);
        int index = Collections.binarySearch(sortedToyList,new Toy(id,null, 0.00,null,null,null));
        if(index >=0)
        {
            System.out.print("Product found \nProduct Details : ");
            System.out.println(sortedToyList.get(index));
        }
        else
        {
            System.out.println("Product Not Found....");
        }

    }

    public void filter_by_priceRange(List<Toy> toyList,double minRange, double maxRange)
    {

        List<Toy> filteredToy = new ArrayList<>();
        for (Toy toy : toyList)
        {
            if(toy.getProd_price()>= minRange && toy.getProd_price()<= maxRange)
            {
                filteredToy.add(toy);
            }
        }
        for(Toy toy : filteredToy)
        {
            System.out.println(toy);
        }
    }

    public void filter_by_ageRange(List<Toy> toyList,String ageRange)
    {
        ageRange = ageRange.replace("+","");       // replacing the "+" sign by "" in the String input of age i.e., "4+"
        int age= Integer.parseInt(ageRange);                        // converting the age from string to int for comparing it...
        List<Toy> filteredToy = new ArrayList<>();
        for(Toy toy : toyList)
        {
            String s = toy.getAge().replace("+","");    // replacing the "+" sign by "" in the String input of age i.e., "4+"
            int current_age= Integer.parseInt(s);                        // converting the age from string to int for comparing it...

            if(current_age>=age)
            {
                filteredToy.add(toy);
            }

        }
        for(Toy toy : filteredToy)
        {
            System.out.println(toy);
        }
    }

    public List<Toy> sort_by_price(List<Toy> toyList)
    {
        Collections.sort(toyList, new PriceComparator());
        return toyList;
    }

    public List<Toy> sort_by_name(List<Toy> toyList)
    {
        Collections.sort(toyList, new NameComparator());
        return toyList;
    }

    public List<Toy> sort_by_prod_id(List<Toy> toyList)
    {
        Collections.sort(toyList);
        return toyList;
    }

    public void old_stock_list(List<Toy> toyList) {

        Manufacture_Date currentDate = new Manufacture_Date(9, 2024);
        List<Toy> newList = new ArrayList<>();
        for (Toy toy : toyList) {
            if (toy.getPurchase_date().getYear() < currentDate.getYear()) {
                if (toy.getPurchase_date().getYear() == currentDate.getYear() - 1) {
                    if (toy.getPurchase_date().getMonth() < currentDate.getMonth()) {
                        newList.add(toy);
                    }
                } else
                    newList.add(toy);
            }
        }
        for (Toy toy : newList)
                System.out.println(toy);

    }
    public void group_as_per_category(List<Toy> toyList)
    {
        Map<String,List<Toy>> map = new HashMap<>();
        List<Toy> list1 = new ArrayList<>();
        List<Toy> list2 = new ArrayList<>();

        for (Toy toy : toyList)
        {
            if(toy.getCategory().equalsIgnoreCase("Educational"))
                list1.add(toy);
            else
                list2.add(toy);
        }
        map.put("Educational",list1);
        map.put("Battery operated",list2);
        for(Map.Entry<String,List<Toy>> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" -->"+entry.getValue());
        }
    }
}




