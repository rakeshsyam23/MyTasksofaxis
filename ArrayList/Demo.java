package ArrayList;
import java.util.ArrayList;

import java.util.Iterator;


public class Demo {
    String name;
    int number;
    String place;
    private ArrayList<Demo>list;

    public Demo(String name, int number, String place){
        this.name = name;
        this.number = number;
        this.place = place;
    }
    public void display(){
        
    }
    public static void main(String[] args){
        Demo obj1 = new Demo("Rakesh", 1,"Amalapuram");
        Demo obj2 = new Demo("Rajesh", 2,"Amalapuram");
        Demo obj3 = new Demo("Prasad", 3,"Amalapuram");
        
        ArrayList<Demo>list = new ArrayList<Demo>();

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        System.out.println(list.isEmpty());
        for(Demo i : list){
            i.display();
        }
        Iterator it = list.iterator();
        while(it.hasNext()){
            Demo obj = (Demo)it.next();
            obj1.display();

        }

    
    }
}