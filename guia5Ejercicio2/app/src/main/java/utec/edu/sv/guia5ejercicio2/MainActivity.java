package utec.edu.sv.guia5ejercicio2;

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
    List<String>description;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=findViewById(R.id.lsvFrutas);

        nombre= new ArrayList<String>();
        nombre.add("Zapote");
        nombre.add("Granada");
        nombre.add("Jocote");
        nombre.add("Maracuya");
        nombre.add("Naranja");
        nombre.add("Melon");
        nombre.add("Banana");
        nombre.add("Mandarina");
        nombre.add("Melocoton");
        nombre.add("Pera");
        nombre.add("Manzana");
        nombre.add("Papaya");
        nombre.add("Sandia");
        nombre.add("Uvas");
        nombre.add("Cerezas");
        nombre.add("Piña");
        nombre.add("Fresa");
        nombre.add("Mango");
        nombre.add("Guayaba");
        nombre.add("Arandanos");
        nombre.add("Granadilla");
        nombre.add("MarañonJaponese");
        nombre.add("Mamón");
        nombre.add("Manzana Verde");
        nombre.add("Jicama");

        description= new ArrayList<String>();
        description.add("es fibrosa, suave y especialmente lisa cuando está madura");
        description.add("es una fruta de temporada, de un exquisito sabor agridulce");
        description.add("El Jocote es reconocido mundialmente por ser un fruto agridulce de mesa");
        description.add("Es dulce, algo ácida y muy refrescante");
        description.add("La naranja es un fruto hesperidio (pulpa carnosa)");
        description.add("Presenta una corteza lisa finamente reticulada ");
        description.add("Su sabor es más o menos dulce según la variedad");
        description.add("Por su sabor, dulce pero no demasiado, fresco pero no intenso");
        description.add("A pesar de su sabor dulce, el melocotón no es tan azucarado como parece");
        description.add("La pera (Pyrus communis) es una fruta en forma de bombilla;");
        description.add("La manzana es una fruta con textura firme");
        description.add("La papaya es una de las frutas tropicales preferidas por todos");
        description.add("La sandía es originaria del África tropical");
        description.add("Las uvas son frutas pequeñas, de forma ovalada y un sabor dulce");
        description.add("Las cerezas dulces tienen un sabor dulzón");
        description.add("Es de hermoso color y agradable sabor agridulce");
        description.add("El sabor de la fresa es una compleja combinación de dulzor,");
        description.add("El sabor del mango maduro es dulce");
        description.add("Con una pulpa blancuzca o rosada y también roja parda");
        description.add("Los arándanos azules suelen tener un sabor dulce ");
        description.add("El sabor de la Fruta de la Pasión Dulce");
        description.add("La fruta de este árbol es un seudo fruto carnoso con sabor ácido");
        description.add("Es una fruta de sabor dulce y ácido");
        description.add("Son de color verde intenso, pulpa firme y jugosa");
        description.add("Su sabor es dulce y almidonado");





        int [] pictures={

                R.drawable.imagen1,
                R.drawable.imagen2,
                R.drawable.imagen3,
                R.drawable.imagen4,
                R.drawable.imagen5,
                R.drawable.imagen6,
                R.drawable.imagen7,
                R.drawable.imagen8,
                R.drawable.imagen9,
                R.drawable.imagen10,
                R.drawable.imagen11,
                R.drawable.imagen12,
                R.drawable.imagen13,
                R.drawable.imagen14,
                R.drawable.imagen15,
                R.drawable.pina,
                R.drawable.imagen17,
                R.drawable.imagen18,
                R.drawable.imagen19,
                R.drawable.imagen20,
                R.drawable.imagen21,
                R.drawable.imagen22,
                R.drawable.imagen23,
                R.drawable.imagen24,
                R.drawable.imagen25
        };



        // ArrayAdapter<String> adaptador= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        Adaptador adaptador=new Adaptador(this,R.layout.listadofrutas,nombre,description,pictures);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "selecciono "+nombre.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}