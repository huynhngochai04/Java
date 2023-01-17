

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.function.DoubleToIntFunction;

public class main {
    public static void main(String[] args) {
        Scanner cin = new Scanner (System.in);
        Author author=new Author("Huynh Ngoc Hai");
        theBook book = new theBook("De men phieu luu ky",50000,2023,author);
        System.out.println(book.getBookName());
        theBook book_test=new theBook("Conan",10000,2023,author);
        if (book.equals(book_test))
        {
            System.out.println("Sach 1 cung nam xuat ban voi sach 2");
        } else {
            System.out.println("Sach 1 khong cung nam xuat ban voi sach 2");
        }
        System.out.print("Moi ban nhap vao phan tram can giam: ");
        double sale = cin.nextDouble();
        System.out.println("Gia sach sau khi giam la: "+book.discount(sale));
        System.out.println("Ngay thang nam sinh cua tac gia la: "+author.toString());
    }
    public static boolean checkPrimeNumber(int n){
        if (n<2) return false;
        for (int i=2;i*i<=n;i++){
            if (n%i==0) return false;
        }
        return true;
    }
    public int hashCode(MyDate index){
        final int key=31;
        int result=1;
        result=key*result+index.getDay();
        result=key*result+index.getMonth();
        result=key*result+index.getYear();
        return result;
    }
    //        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
    //            System.out.println(entry.getKey()+" "+entry.getValue());
    //        }
    //  HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
    // map.put(), map.remove(), map.containskey();
}