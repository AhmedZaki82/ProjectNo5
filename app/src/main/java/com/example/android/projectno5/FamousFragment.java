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
public class FamousFragment extends Fragment {


    public FamousFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.item_list,container,false);

        ArrayList <Country> famous = new ArrayList<>();

        famous.add(new Country(R.string.euclid_name,R.drawable.euclid,R.string.euclid_name,
                R.string.euclid_add));
        famous.add(new Country(R.string.hypatia_name,R.drawable.hypatia,R.string.hypatia_name,
                R.string.hypatia_add));
        famous.add(new Country(R.string.ptolemy_name,R.drawable.ptolemy,R.string.ptolemy_name,
                R.string.ptolemy_add));

        CountryAdapter adapter = new CountryAdapter(getActivity(),famous);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
