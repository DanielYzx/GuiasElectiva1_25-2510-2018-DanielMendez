package utec.edu.sv.guia4ejercicio4;

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
    List <String> edad;
    List <String> dirreccion;
    int[]imagenes;

    public Adaptador(Context contexto, int layout, List<String> nombre,List<String> edad, List<String> dirreccion, int[] img) {
        this.contexto = contexto;
        this.layout = layout;
        this.nombre = nombre;
        this.edad = edad;
        this.dirreccion = dirreccion;
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
        v=layoutInflater.inflate(R.layout.listado,null);

        TextView txtNombre=v.findViewById(R.id.xtxNombre);
        txtNombre.setText(nombre.get(position));

        TextView txtEdadd=v.findViewById(R.id.txtEdad);
        txtEdadd.setText(edad.get(position));

        TextView txtDireccionn=v.findViewById(R.id.txtDireccion);
        txtDireccionn.setText(dirreccion.get(position));

        ImageView img=v.findViewById(R.id.imageView);
        img.setImageResource(imagenes[position]);

        return v;

    }
}