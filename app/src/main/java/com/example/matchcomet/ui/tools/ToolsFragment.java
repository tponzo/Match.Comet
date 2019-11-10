package com.example.matchcomet.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.matchcomet.GroupComets;
import com.example.matchcomet.R;
import com.example.matchcomet.TotalGroups;
import com.example.matchcomet.ui.slideshow.SlideshowFragment;

public class ToolsFragment extends Fragment {

    private ToolsViewModel toolsViewModel;

    Button doneBtn;
    EditText name;
    EditText date;
    EditText desc;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel =
                ViewModelProviders.of(this).get(ToolsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tools, container, false);
        doneBtn = (Button) root.findViewById(R.id.doneCreateButton);
        name = (EditText) root.findViewById(R.id.editGroupName);
        date = (EditText) root.findViewById(R.id.editDate);
        desc = (EditText) root.findViewById(R.id.editDescription);
        doneBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                GroupComets myGroup = new GroupComets(name.toString(), "", date.toString(), desc.toString());
                TotalGroups.addGroup(myGroup);
                TotalGroups.print();
                name.setText("");
                date.setText("");
                desc.setText("");
            }
        });
        return root;
    }
}