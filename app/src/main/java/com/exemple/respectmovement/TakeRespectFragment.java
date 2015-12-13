package com.exemple.respectmovement;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;


public class TakeRespectFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private Bundle arguments;
    private SeekBar seekBar;
    private TextView textView;
    private TextView receiverString;
    private TextView motiveString;

    public TakeRespectFragment() {

    }

    public static GiveRespectFragment newInstance(int sectionNumber) {

        GiveRespectFragment fragment = new GiveRespectFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        System.out.println(this.getArguments().getInt(ARG_SECTION_NUMBER));

        //seekBar = (SeekBar) findViewById(R.id.seekBar1);
        //textView = (TextView) findViewById(R.id.textView1);

        // Initialize the textview with '0'.



        //In case that we want the feedback of what we're doing in a small popup
        //http://examples.javacodegeeks.com/android/core/widget/seekbar/android-seekbar-example/
        /*seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
             int progress = 0;

             /*@Override
             public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                 progress = progresValue;
                 Toast.makeText(getApplicationContext(), "Changing seekbar's progress", Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onStartTrackingTouch(SeekBar seekBar) {
                 Toast.makeText(getApplicationContext(), "Started tracking seekbar", Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onStopTrackingTouch(SeekBar seekBar) {
                 textView.setText("Covered: " + progress + "/" + seekBar.getMax());
                 Toast.makeText(getApplicationContext(), "Stopped tracking seekbar", Toast.LENGTH_SHORT).show();
             }
        });*/


        View rootView = inflater.inflate(R.layout.fragment_take_respect, container, false);
        textView.setText("Covered: " + seekBar.getProgress() + "/" + seekBar.getMax());
        receiverString = (TextView) rootView.findViewById(R.id.receiver);
        motiveString = (TextView) rootView.findViewById(R.id.motive);

        sendRespect();

        return rootView;
    }

    private void sendRespect() {
        //Send respect to DB
    }

}
