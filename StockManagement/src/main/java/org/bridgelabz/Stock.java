package org.bridgelabz;

import java.util.HashMap;

public class Stock {
    private String name;
    private int shareNo;
    private int sharePrice;
    private int value;

    public Stock(String name,int shareNo,int sharePrice){
        this.name=name;
        this.shareNo=shareNo;
        this.sharePrice=sharePrice;
        this.value= shareNo*sharePrice;

    }
    public String getName(){
        return name;
    }

    public int getShareNo() {
        return shareNo;
    }

    public int getSharePrice() {
        return sharePrice;
    }
    public int getValue(){
        return value;
    }
    public void add(HashMap<String,Stock> shareContainer){
        shareContainer.put(name,this);
    }

    @Override
    public String toString(){
        return String.format(
                """
                   Name: %s
                   ShareNo : %d
                   SharePrice : %d
                   Value of %s : %d
               
                        """
        ,name,shareNo,sharePrice,name,value);
    }
}
