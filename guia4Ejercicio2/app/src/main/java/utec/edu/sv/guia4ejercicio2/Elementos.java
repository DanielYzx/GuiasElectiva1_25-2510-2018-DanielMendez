package utec.edu.sv.guia4ejercicio2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Elementos extends RecyclerView.ViewHolder{

    static ImageView imvimFrut;
    static TextView tvnomFrut,tvdesFrut;

    public Elementos(@NonNull View itemView) {
        super(itemView);

        imvimFrut=itemView.findViewById(R.id.imvFruta2);
        tvnomFrut=itemView.findViewById(R.id.tvNombre);
        tvdesFrut=itemView.findViewById(R.id.tvDrescrip);
    }
}
