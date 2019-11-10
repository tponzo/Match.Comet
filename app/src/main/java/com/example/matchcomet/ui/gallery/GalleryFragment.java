package com.example.matchcomet.ui.gallery;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.matchcomet.R;

public class GalleryFragment extends Fragment {

    private SeekBar social;
    private SeekBar volume;
    private SeekBar nerd;

    public static final String BAR_SOCIAL = "bar1";
    public static final String BAR_VOLUME = "bar2";
    public static final String BAR_NERD = "bar3";

    private CheckBox relationship;
    private CheckBox freind;
    private CheckBox indoor;
    private CheckBox outdoor;
    private CheckBox paid;
    private CheckBox free;
    private CheckBox rock;
    private CheckBox pop;
    private CheckBox movie;
    private CheckBox animal;
    private CheckBox street;


    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String SWITCH_RELATIONSHIP = "switch1";
    public static final String SWITCH_FRIEND = "switch2";
    public static final String SWITCH_INDOOR = "switch3";
    public static final String SWITCH_OUTDOOR = "switch4";
    public static final String SWITCH_PAID = "switch5";
    public static final String SWITCH_FREE = "switch6";
    public static final String SWITCH_ROCK = "switch7";
    public static final String SWITCH_POP = "switch8";
    public static final String SWITCH_MOVIE = "switch9";
    public static final String SWITCH_ANIMAL = "switch10";
    public static final String SWITCH_STREET = "switch11";


    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        social = ( SeekBar ) root.findViewById( R.id.social_bar );
        volume = ( SeekBar ) root.findViewById( R.id.volume_bar );
        nerd = ( SeekBar ) root.findViewById( R.id.nerd_bar );

        relationship = ( CheckBox ) root.findViewById( R.id.relationships );
        freind = ( CheckBox ) root.findViewById( R.id.friends );
        indoor = ( CheckBox ) root.findViewById( R.id.indoor );
        outdoor = ( CheckBox ) root.findViewById( R.id.outdoor );
        paid = ( CheckBox ) root.findViewById( R.id.paid );
        free = ( CheckBox ) root.findViewById( R.id.free );
        rock = ( CheckBox ) root.findViewById( R.id.rock );
        pop = ( CheckBox ) root.findViewById( R.id.pop );
        movie = ( CheckBox ) root.findViewById( R.id.movie );
        animal = ( CheckBox ) root.findViewById( R.id.animals );
        street = ( CheckBox ) root.findViewById( R.id.street_food );

        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        nerd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        relationship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        freind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        indoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        outdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        paid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        street.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });

        loadData();

        return root;
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt(BAR_SOCIAL, social.getProgress());
        editor.putInt(BAR_VOLUME, volume.getProgress());
        editor.putInt(BAR_NERD, nerd.getProgress());

        editor.putBoolean(SWITCH_RELATIONSHIP, relationship.isChecked());
        editor.putBoolean(SWITCH_FRIEND, freind.isChecked());
        editor.putBoolean(SWITCH_INDOOR, indoor.isChecked());
        editor.putBoolean(SWITCH_OUTDOOR, outdoor.isChecked());
        editor.putBoolean(SWITCH_PAID, paid.isChecked());
        editor.putBoolean(SWITCH_FREE, free.isChecked());
        editor.putBoolean(SWITCH_ROCK, rock.isChecked());
        editor.putBoolean(SWITCH_POP, pop.isChecked());
        editor.putBoolean(SWITCH_MOVIE, movie.isChecked());
        editor.putBoolean(SWITCH_ANIMAL, animal.isChecked());
        editor.putBoolean(SWITCH_STREET, street.isChecked());

        editor.apply();
    }

    public void loadData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);

        social.setProgress(sharedPreferences.getInt(BAR_SOCIAL,5));
        volume.setProgress(sharedPreferences.getInt(BAR_VOLUME,5));
        nerd.setProgress(sharedPreferences.getInt(BAR_NERD,5));

        relationship.setChecked(sharedPreferences.getBoolean(SWITCH_RELATIONSHIP, false));
        freind.setChecked(sharedPreferences.getBoolean(SWITCH_FRIEND, false));
        indoor.setChecked(sharedPreferences.getBoolean(SWITCH_INDOOR, false));
        outdoor.setChecked(sharedPreferences.getBoolean(SWITCH_OUTDOOR, false));
        paid.setChecked(sharedPreferences.getBoolean(SWITCH_PAID, false));
        free.setChecked(sharedPreferences.getBoolean(SWITCH_FREE, false));
        rock.setChecked(sharedPreferences.getBoolean(SWITCH_ROCK, false));
        pop.setChecked(sharedPreferences.getBoolean(SWITCH_POP, false));
        movie.setChecked(sharedPreferences.getBoolean(SWITCH_MOVIE, false));
        animal.setChecked(sharedPreferences.getBoolean(SWITCH_ANIMAL, false));
        street.setChecked(sharedPreferences.getBoolean(SWITCH_STREET, false));
    }

}