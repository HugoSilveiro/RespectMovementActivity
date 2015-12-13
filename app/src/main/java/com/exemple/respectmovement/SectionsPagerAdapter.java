package com.exemple.respectmovement;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final String DEBUGER_TAG = "SectionsPagerAdapter";

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                //return GiveRespectFragment.newInstance(position);
            case 1:
                //return TakeRespectFragment.newInstance(position);
            case 2:
                //return ChallengeFragment.newInstance(position);
            default:
                Log.e(DEBUGER_TAG, "Out of range position");
        }
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        return GiveRespectFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Give";
            case 1:
                return "Take";
            case 2:
                return "Challenge";
        }
        return null;
    }
}