package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {

    private Scanner scanner= new Scanner(System.in);
    private int nr;
    private String title;
    private ArrayList<String> checkList= new ArrayList<String>();
    private ArrayList<String> checklist= new ArrayList<String>();



    public ToDo() {
    }

/*    public void setNr(int nr) {
        this.nr = nr;
    }

    public void setTitle() {
        System.out.println("add title to your todo list");
        this.title = scanner.next();
    }

    public String getTitle() {
        return title;
    }

    public void setCheckList(){
        boolean flag= true;
        while (flag){
            System.out.println("new item");
            int newBullet= scanner.nextInt();
            switch (newBullet){
                case 1:
                    System.out.println("add list ");
                    String bullet= scanner.next();
                    checkList.add(bullet);
                    break;
                case 0:
                    System.out.println("finish");
                    flag= false;
                    break;
            }
        }

    }

    public void showCheckList(){
        System.out.println(getTitle());
        for (int i=0; i<checkList.size(); i++){
            System.out.println("* " + checkList.get(i));
        }
    }

    public void create(){
        setNr(nr);
        setTitle();
        setCheckList();
    }*/

/*    public void mark(){
        System.out.println("select bullet to mark done");
        int bullet= scanner.nextInt();
        String cont= checkList.get(bullet);
        int ind= checkList.indexOf(cont);
        checkList.set(ind, cont + "√");
        checkList.get(ind);
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        System.out.println("add project name");
        this.title = scanner.next();
    }

    public void add(){
        boolean flag= true;
        String item;
        while (flag){
            System.out.println("i to add new item or 000 to exit");
            item= scanner.next();
            switch (item){
                case "000":
                    flag= false;
                    break;
                case "i":
                    System.out.println("add task");
                    item = scanner.next();
                    this.checklist.add(item);
                    break;
            }
        }
    }
    public void show() {
//        System.out.println("size");
//        System.out.println(this.checklist.size());
        if (this.checklist.size() == 0) {
            System.out.println("you have no tasks, yaay");
        } else {
            System.out.println("your tasks");
            for (int i = 0; i < this.checklist.size(); i++) {
                System.out.println("    *" + this.checklist.get(i));
            }
        }
    }
}
