package formacion.josevi.com.herramientas.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import formacion.josevi.com.herramientas.R;
import formacion.josevi.com.herramientas.interfaces.ComunicaMenu;

public class MainActivity extends AppCompatActivity implements ComunicaMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void menu(int queBoton) {
       Intent i = new Intent(this, HerramientasActivity.class);
       i.putExtra("BOTONPULSADO",queBoton);
       startActivity(i);
    }
}
