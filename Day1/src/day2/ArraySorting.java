package day2;

import java.util.Arrays;

public class ArraySorting {

    public static void sortArray(int a []){
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i]<a[j])
                {
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
//        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int arr[] ={33,66,22,11,55,77};
        sortArray(arr);                               //Passing By Reference
        System.out.println("After sorting the Array : "+Arrays.toString(arr));
    }
}
