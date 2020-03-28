package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Note {

    private Scanner scanner= new Scanner(System.in);
    private int nr=0;
    private String title;
    private String content;

    public Note() {
    }

    private void setNr(int nr) {
        this.nr = nr;
    }

    private void setTitle() {
        System.out.println("add title to your note");
        this.title = scanner.next();
    }

    public String getTitle() {
        return title;
    }

    private void setContent() {
        System.out.println("add content");
        this.content = scanner.next();
    }

    public String getContent() {
        return content;
    }

    public void showNote(){
        System.out.println(nr);
        System.out.println("title: " + title);
        System.out.println("content: " + content);

    }

    public void createNote(int nr){
        setNr(nr);
        setTitle();
        setContent();
    }



}
