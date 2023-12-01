package org.bridgelabz;

import java.util.HashMap;

public class StockPortfolio {
    static HashMap<String,Stock> shareContainer=new HashMap<>();
     public static int totalValue=0;
    public static void add(Stock st){

        totalValue+=st.getValue();
        shareContainer.put(st.getName(),st);
    }

    public static void  print(){
       for(Stock st: shareContainer.values()) System.out.println(st);
    }

   public static int getTotalValues(){
        return totalValue;
   }

   public static void retrieve(String name){
        if(shareContainer.containsKey(name)){
            System.out.println(shareContainer.get(name));
        }
        else{
            System.out.println("No such share exist ");
        }
   }

}
