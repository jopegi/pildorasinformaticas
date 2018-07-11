package formacion.josevi.com.herramientas.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import formacion.josevi.com.herramientas.R;
import formacion.josevi.com.herramientas.interfaces.ComunicaMenu;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    private final int[] BOTONESMENU = {R.id.linterna, R.id.musica,R.id.nivel};
    private final int[] BOTONESILUMINADOS = {R.drawable.linterna2, R.drawable.musica2, R.drawable.nivel2};
    private int boton;


    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View miMenu = inflater.inflate(R.layout.fragment_menu, container, false);

        boton = -1;

        if(getArguments()!= null){
            boton = getArguments().getInt("BOTONPULSADO");
        }

        ImageButton botonMenu;

        for (int i = 0; i<BOTONESMENU.length; i++){
            botonMenu = miMenu.findViewById(BOTONESMENU[i]);
            if(boton == i){
                botonMenu.setImageResource(BOTONESILUMINADOS[i]);
            }
            final int queBoton = i;
            botonMenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Activity estaActividad = getActivity();
                    //CASTING DE UNA ACTIVIDAD A UNA INTERFACE
                    ((ComunicaMenu)estaActividad).menu(queBoton);
                }
            });
        }

        return miMenu;
    }

}
