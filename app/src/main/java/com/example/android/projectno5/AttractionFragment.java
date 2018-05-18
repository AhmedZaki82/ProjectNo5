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
public class AttractionFragment extends Fragment {


    public AttractionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.item_list,container,false);
        ArrayList <Country> attraction = new ArrayList<>();

        attraction.add(new Country(R.string.san_name,R.drawable.san,R.string.san_name,
                R.string.san_add));
        attraction.add(new Country(R.string.montazah_name,R.drawable.montazah,R.string.montazah_name,
                R.string.maamoura_add));
        attraction.add(new Country(R.string.planetarium_name,R.drawable.planetarium,R.string.planetarium_name,
                R.string.planetarium_add));
        attraction.add(new Country(R.string.bibliotheca_name,R.drawable.bibliotheca,R.string.bibliotheca_name,
                R.string.bibliotheca_add));
        attraction.add(new Country(R.string.qaitbay_name,R.drawable.qaitbay,R.string.qaitbay_name,
                R.string.qaitbay_add));
        attraction.add(new Country(R.string.maamoura_name,R.drawable.maamoura,R.string.maamoura_name,
                R.string.maamoura_add));
        attraction.add(new Country(R.string.stanely_name,R.drawable.stanely,R.string.stanely_name,
                R.string.stanely_add));

        CountryAdapter adapter = new CountryAdapter(getActivity(),attraction);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
