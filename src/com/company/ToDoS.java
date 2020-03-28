package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoS {

    private Scanner scanner= new Scanner(System.in);

    ArrayList<ToDo> toDos= new ArrayList<ToDo>();


    public ToDo toDo() {
        return new ToDo();
    }

/*    public void n(){
        toDo().create();
        toDos.add(toDo());
    }

    public void v(){
        //System.out.println(toDos.size());
        for (int i=0; i<toDos.size(); i++){
            toDos.get(i).showCheckList();
        }
    }

    public void i(){
        System.out.println("search by index");
        int ind= scanner.nextInt();
        toDos.get(ind).showChecklist();

    }*/

//    public void t(){
//        System.out.println("search by title");
//        String ind= scanner.next();
//        toDos.
//    }

    public void add(){
        System.out.println("this metohd from todos, called add, adds new items to a list");
        boolean flag= true;
        String item;
        while (flag){
            System.out.println("c to create new list vs 000 to exit");
            item= scanner.next();
            switch (item){
                case "000":
                    flag= false;
                    break;
                case "c":
                    ToDo toDo= new ToDo();
                    toDo.setTitle();
                    toDo.add();
                    this.toDos.add(toDo);
                    break;
            }
        }
    }

    public void show(){
        if (toDos.size()>= 0){
            System.out.println("you have no prjects, alhamduLLAH");
        }
        else {
            System.out.println("your projects:");
            for (int i=0; i< toDos.size(); i++){
                System.out.println("-" + toDos.get(i).getTitle());
                toDos.get(i).show();
            }
        }
    }

}
