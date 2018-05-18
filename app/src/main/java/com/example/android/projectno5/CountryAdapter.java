package com.example.android.projectno5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tsultrim on 5/18/18.
 */

public class CountryAdapter extends ArrayAdapter <Country> {


    public CountryAdapter(@NonNull Context context,@NonNull List<Country> countries) {
        super(context, 0, countries);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View lisView = convertView;
        Country currentItem = getItem(position);

       if (lisView == null) {

           lisView = LayoutInflater.from(getContext()).inflate(R.layout.standard_view,parent,false);
       }

        TextView name = lisView.findViewById(R.id.title);
        name.setText(currentItem.getmName());

        TextView name1 = lisView.findViewById(R.id.name);
        name1.setText(currentItem.getmName());

        TextView subject = lisView.findViewById(R.id.subject);
        subject.setText(currentItem.getmSubject());

        ImageView image = lisView.findViewById(R.id.image);

        if (currentItem.hasImage()) {

            image.setImageResource(currentItem.getmImage());
        } else {

            image.setVisibility(View.GONE);
        }
        return lisView;
    }
}
