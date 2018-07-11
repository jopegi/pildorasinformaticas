package formacion.josevi.com.herramientas.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import formacion.josevi.com.herramientas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MusicaFragment extends Fragment {


    public MusicaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_musica, container, false);
    }

}
