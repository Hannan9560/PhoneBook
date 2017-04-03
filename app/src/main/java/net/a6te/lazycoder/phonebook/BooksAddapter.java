package net.a6te.lazycoder.phonebook;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 4/3/2017.
 */

public class BooksAddapter extends ArrayAdapter<Books> {
    private Context context;
    private ArrayList<Books>books;

    public BooksAddapter(Context context, ArrayList<Books> books) {
        super(context, R.layout.contact_layout, books);
        this.context = context;
        this.books = books;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.contact_layout, parent, false);

        TextView name = (TextView) convertView.findViewById(R.id.nameTV);
        TextView number = (TextView) convertView.findViewById(R.id.numberTV);
        TextView gmail = (TextView) convertView.findViewById(R.id.gmailTV);

        name.setText(books.get(position).getName());
        number.setText(books.get(position).getNumber());
        gmail.setText(books.get(position).getGmale());


        return convertView;
    }
}
