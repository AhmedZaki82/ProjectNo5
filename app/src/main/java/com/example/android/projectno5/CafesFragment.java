package com.example.android.projectno5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CafesFragment extends Fragment {


    public CafesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.item_list,container,false);

        ArrayList <Country> cafes = new ArrayList<>();

        cafes.add(new Country(R.string.costa_name,R.drawable.costa,R.string.costa_name,
                R.string.costa_add));
        cafes.add(new Country(R.string.star_name,R.drawable.star,R.string.star_name,
                R.string.star_add));
        cafes.add(new Country(R.string.zanilli_name,R.drawable.zanilli,R.string.zanilli_name,
                R.string.zanilli_add));
        cafes.add(new Country(R.string.pablo_name,R.drawable.pablo,R.string.pablo_name,
                R.string.pablo_add));
        cafes.add(new Country(R.string.carlos_name,R.drawable.carlos,R.string.carlos_name,
                R.string.carlos_add));
        cafes.add(new Country(R.string.roastery_name,R.drawable.roastery,R.string.roastery_name,
                R.string.roastery_add));

        CountryAdapter adapter = new CountryAdapter(getActivity(),cafes);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
