package formacion.josevi.com.herramientas.activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import formacion.josevi.com.herramientas.R;
import formacion.josevi.com.herramientas.fragments.LinternaFragment;
import formacion.josevi.com.herramientas.fragments.MenuFragment;
import formacion.josevi.com.herramientas.fragments.MusicaFragment;
import formacion.josevi.com.herramientas.fragments.NivelFragment;
import formacion.josevi.com.herramientas.interfaces.ComunicaMenu;

public class HerramientasActivity extends AppCompatActivity implements ComunicaMenu{

    Fragment[] misFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientas);

        misFragmentos = new Fragment[3];
        misFragmentos[0]= new LinternaFragment();
        misFragmentos[1]= new MusicaFragment();
        misFragmentos[2]= new NivelFragment();


        Bundle extras = getIntent().getExtras();
        menu(extras.getInt("BOTONPULSADO"));
    }

    @Override
    public void menu(int queBoton) {
        FragmentManager manejadorFragment = getFragmentManager();
        FragmentTransaction transaccionFragment = manejadorFragment.beginTransaction();

        Fragment menuIluminado = new MenuFragment();
        Bundle datos = new Bundle();
        datos.putInt("BOTONPULSADO",queBoton);
        menuIluminado.setArguments(datos);
        transaccionFragment.replace(R.id.menu,menuIluminado);

        transaccionFragment.replace(R.id.herramientas,misFragmentos[queBoton]);
        transaccionFragment.commit();

    }
}
