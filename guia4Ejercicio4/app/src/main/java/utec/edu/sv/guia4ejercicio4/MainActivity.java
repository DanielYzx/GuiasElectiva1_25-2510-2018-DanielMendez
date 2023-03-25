package utec.edu.sv.guia4ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;


    int []img;
    List<String> nombre;
    List<String>edad;
    List<String>direccion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=findViewById(R.id.lsvPersonas);

        nombre= new ArrayList<String>();
        nombre.add("Juan Ramos");
        nombre.add("Carlos Lopez");
        nombre.add("Lidia Méndez");
        nombre.add("Carmen Landaverde");
        nombre.add("Benito Peralta");
        nombre.add("Juan Jaramillo");
        nombre.add("Christian Steps");
        nombre.add("Alexa Giraldo");
        nombre.add("Linda Murillo");
        nombre.add("Lizeth Astrada");

        edad= new ArrayList<String>();
        edad.add("20 años");
        edad.add("25 años");
        edad.add("19 años");
        edad.add("23 años");
        edad.add("30 años");
        edad.add("35 años");
        edad.add("21 años");
        edad.add("27 años");
        edad.add("22 años");
        edad.add("29 años");

        direccion= new ArrayList<String>();
        direccion.add("San Salvador");
        direccion.add("Santa Tecla");
        direccion.add("Santa Ana");
        direccion.add("La Paz");
        direccion.add("La Unión");
        direccion.add("Planes de Renderos");
        direccion.add("San Miguel");
        direccion.add("San Vicente");
        direccion.add("Apopa");
        direccion.add("Sonsonate");

        int [] pictures={

                R.drawable.imag1,
                R.drawable.imag2,
                R.drawable.imag3,
                R.drawable.imag4,
                R.drawable.imag5,
                R.drawable.imag6,
                R.drawable.imag7,
                R.drawable.imag8,
                R.drawable.imag9,
                R.drawable.imag10
        };



        // ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        Adaptador adaptador=new Adaptador(this,R.layout.listado,nombre,edad,direccion,pictures);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "selecciono "+nombre.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

}