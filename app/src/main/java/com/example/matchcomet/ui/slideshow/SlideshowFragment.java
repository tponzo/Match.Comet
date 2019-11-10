package com.example.matchcomet.ui.slideshow;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.matchcomet.GroupComets;
import com.example.matchcomet.R;
import com.example.matchcomet.TotalGroups;

import org.w3c.dom.Text;

import java.util.Vector;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    private LinearLayout lay;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        update(root);
        final Vector vect = TotalGroups.getVector();
        CardView card1 = (CardView)root.findViewById(R.id.CV1);
        card1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GroupComets c1 = (GroupComets)vect.get(0);
                alretThing(c1);
            }
        });
        CardView card2 = (CardView)root.findViewById(R.id.CV2);
        card2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GroupComets c2 = (GroupComets)vect.get(1);
                alretThing(c2);
            }
        });
        CardView card3 = (CardView)root.findViewById(R.id.CV3);
        card3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GroupComets c3 = (GroupComets)vect.get(2);
                alretThing(c3);
            }
        });
        CardView card4 = (CardView)root.findViewById(R.id.CV4);
        card4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GroupComets c4 = (GroupComets)vect.get(3);
                alretThing(c4);
            }
        });
        CardView card5 = (CardView)root.findViewById(R.id.CV5);
        card5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GroupComets c5 = (GroupComets)vect.get(4);
                alretThing(c5);
            }
        });

        return root;
    }
    void alretThing(GroupComets c){
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        builder.setMessage(c.getGroupDesc());
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
    }

    public void update(View v){
        lay = (LinearLayout) v.findViewById(R.id.layoutInset);
        Vector vect = TotalGroups.getVector();
        int count = 1;
        TextView t1 = (TextView) v.findViewById(R.id.textView1);
        GroupComets n = (GroupComets) vect.get(0);
        t1.setText(n.getGroupTitle());
        TextView t2 = (TextView) v.findViewById(R.id.textView2);
        t2.setText(n.getGroupDate());
        TextView t3 = (TextView) v.findViewById(R.id.textView3);
        n = (GroupComets) vect.get(1);
        t3.setText(n.getGroupTitle());
        TextView t4 = (TextView) v.findViewById(R.id.textView4);
        t4.setText(n.getGroupDate());
        TextView t5 = (TextView) v.findViewById(R.id.textView5);
        n = (GroupComets) vect.get(2);
        t5.setText(n.getGroupTitle());
        TextView t6 = (TextView) v.findViewById(R.id.textView6);
        t6.setText(n.getGroupDate());
        TextView t7 = (TextView) v.findViewById(R.id.textView7);
        n = (GroupComets) vect.get(3);
        t7.setText(n.getGroupTitle());
        TextView t8 = (TextView) v.findViewById(R.id.textView8);
        t8.setText(n.getGroupDate());
        TextView t9 = (TextView) v.findViewById(R.id.textView9);
        n = (GroupComets) vect.get(4);
        t9.setText(n.getGroupTitle());
        TextView t10 = (TextView) v.findViewById(R.id.textView10);
        t10.setText(n.getGroupDate());



    }
}