package utec.edu.sv.guia4ejercicio2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {
    Context contexto;
    int layout;
    List<String> nombre;
    List <String> descriptionn;

    int[]imagenes;

    public Adaptador(Context contexto, int layout, List<String> nombre,List<String> descriptionn, int[] img) {
        this.contexto = contexto;
        this.layout = layout;
        this.nombre = nombre;
        this.descriptionn = descriptionn;
        this.imagenes = img;
    }

    @Override
    public int getCount() {
        return nombre.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= convertView;
        LayoutInflater layoutInflater=LayoutInflater.from(contexto);
        v=layoutInflater.inflate(R.layout.listadofrutas,null);

        TextView txtNombre=v.findViewById(R.id.tvNombre);
        txtNombre.setText(nombre.get(position));

        TextView txtDescrip=v.findViewById(R.id.tvDrescrip);
        txtDescrip.setText(descriptionn.get(position));


        ImageView img=v.findViewById(R.id.imvFruta2);
        img.setImageResource(imagenes[position]);

        return v;

    }
}
