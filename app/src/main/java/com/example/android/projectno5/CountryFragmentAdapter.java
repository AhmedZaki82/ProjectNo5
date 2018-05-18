package com.example.android.projectno5;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Tsultrim on 5/18/18.
 */

public class CountryFragmentAdapter extends FragmentStatePagerAdapter {

    Context mContext;

    public CountryFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {

            return new AboutFragment();

        } else if (position == 1) {

            return new HistoryFragment();

        } else if (position == 2) {

            return new FamousFragment();

        } else if (position == 3) {

            return new AttractionFragment();

        } else {

            return new CafesFragment();
        }

    };

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {

            return mContext.getString(R.string.about_name);

        } else if (position == 1) {

            return mContext.getString(R.string.history_name);

        } else if (position == 2) {

            return mContext.getString(R.string.famous);

        } else if (position == 3) {

            return mContext.getString(R.string.attractions);

        } else {

            return mContext.getString(R.string.cafes);
        }
    }
}
