/*
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Notes notes= new Notes();
        ToDoS toDoS= new ToDoS();

        //note99.setContent("انما الهكم الله الذي لا اله الا هو وسع كل شى علما");

        boolean flag= true;

        while (flag){
            System.out.println("note vs todo");
            String ch= scanner.next();
            switch (ch){
                case "note":
                    boolean fleg= true;
                    while (fleg){
                        System.out.println("new note p:1, view notes p:2");
                        int n= scanner.nextInt();
                        switch (n){
                            case 1:
                                notes.n();
                                break;

                            case 2:
                                notes.s();
                                break;

                            case 0:
                                fleg= false;
                                break;
                        }
                    }

                case "todo":
                    System.out.println("new todo p:1, view todos p:2");
                    int d= scanner.nextInt();
                    if (d==1){
                        toDoS.n();
                        break;
                    }
                    else if (d==2){
                        toDoS.s();
                        break;
                    }
                    else if (d==3){
//                                    System.out.println("select list to mark done");
//                                    int mark= scanner.nextInt();
//                                    ToDo ck= toDoS.toDos.get(mark);
//                                    System.out.println(ck.getTitle());
                        break;
                    }
                case "exit":
                    System.out.println("backing");
                    flag= false;
            }


        }

    }
}
*/
