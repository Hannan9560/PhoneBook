package net.a6te.lazycoder.phonebook;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 4/3/2017.
 */

public class Books {
    private String name;
    private String number;
    private String gmale;

    public Books(String name, String number, String gmale) {
        this.name = name;
        this.number = number;
        this.gmale = gmale;
    }

    public Books() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGmale() {
        return gmale;
    }

    public void setGmale(String gmale) {
        this.gmale = gmale;
    }
    public ArrayList<Books> getAllContact()
    {
        ArrayList<Books>bookses = new ArrayList<>();
        bookses.add(new Books("Test", "012345678", "test@gmail.com"));
        bookses.add(new Books("Test1", "012345678", "test1@gmail.com"));
        bookses.add(new Books("Test2", "012345678", "test2@gmail.com"));
        bookses.add(new Books("Test3", "012345678", "test3@gmail.com"));
        bookses.add(new Books("Test4", "012345678", "test4@gmail.com"));
        bookses.add(new Books("Test5", "012345678", "test5@gmail.com"));
        bookses.add(new Books("Test6", "012345678", "test6@gmail.com"));
        bookses.add(new Books("Test7", "012345678", "test7@gmail.com"));
        return bookses;
    }
}
