package com.example.ideapad510.framents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Ideapad 510 on 8/13/2017.
 */

public class frag extends android.support.v4.app.Fragment {

    Button btn1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view, container, false);


        btn1 = view.findViewById(R.id.fragbtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "This is Frag!", Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }
}
