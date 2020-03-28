package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Notes notes = new Notes();
        ToDoS toDoS = new ToDoS();


        boolean fleg = true;
        while (fleg) {
            System.out.println("note vs todo");
            String ch = scanner.next();
            switch (ch) {
                case "note":
                    boolean flag = true;
                    int noteNr= 0;
                    int todoNr= 0;
                    while (flag) {
                        System.out.println("NOTE   n for new, v for view, s for search, d for delete, back for back");
                        String work = scanner.next();
                        switch (work) {
                            case "n":
                                System.out.println("new note");
                                notes.n(noteNr);
                                noteNr= noteNr +1;
                                break;
                            case "v":
                                System.out.println("view note");
                                notes.v();
                                break;
                            case "s":
                                System.out.println("search note");
                                notes.s();
                                break;
                            case "d":
                                System.out.println("delete note");
                                notes.d();
                                break;
                            case "back":
                                System.out.println("back note");
                                flag = false;
                                //break;
                        }

                    }
                    break;
                case "todo":
                    boolean flog = true;
                    while (flog) {
                        System.out.println("TODO  n for new, v for view,  or back for back");
                        String work = scanner.next();
                        switch (work) {
                            case "v":
                                toDoS.show();
                                break;
                            case "n":
                                toDoS.add();
                                break;
                            case "i":
                                System.out.println("search index");
                                //toDoS.i();
                                break;
                            case "back":
                                System.out.println("back todo");
                                flog = false;
                                //break;
                        }
                    }
                    break;
                case "exit":
                    System.exit(0);
            }
        }
    }
}
