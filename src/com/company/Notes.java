package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Notes {

    private ArrayList<Note> notesList= new ArrayList<Note>();
    private Scanner scanner= new Scanner(System.in);
    private Note note;


    public Note note(){
        return this.note= new Note();

    }
    public void n(int nr){
        //Note note= new Note();
        note();
        note.createNote(nr);
        notesList.add(note);
    }

    public void v(){
        for (int i=0; i<notesList.size(); i++){
            notesList.get(i).showNote();
        }
    }

    private int i() {
        System.out.println("search by index");
        int ind = scanner.nextInt();
        System.out.println("found: ");
        notesList.get(ind).showNote();
//        notesList.remove(delInd);
//        System.out.println("was removed");
        return ind;
    }


    private int t() {
        System.out.println("search by title");
        String delTit = scanner.next();
        for (int i = 0; i < notesList.size(); i++) {
            if (note.getTitle().contains(delTit)) {
                System.out.println("found: ");
                int ind = note.getTitle().indexOf(delTit);
                notesList.get(i).showNote();
                //note.showNote();
//                notesList.remove(ind);
//                System.out.println("was removed");
                return ind;

            }
        }
        return -1;
    }

        public void s() {
            System.out.println("search i vs t");
            String how = scanner.next();
            switch (how) {
                case "t":
                    t();
                    break;
                case "i":
                    i();
                    break;
            }
        }

    public void d(){
        System.out.println("search t vs i");
        String how = scanner.next();
        switch (how) {
            case "t":
                int delT= t();
                System.out.println("now for removing");
                notesList.remove(delT);
                System.out.println("was removed");
                break;
            case "i":
                int delI= i();
                System.out.println("now for removing");
                notesList.remove(delI);
                System.out.println("was removed");
                break;
        }

    }

}
