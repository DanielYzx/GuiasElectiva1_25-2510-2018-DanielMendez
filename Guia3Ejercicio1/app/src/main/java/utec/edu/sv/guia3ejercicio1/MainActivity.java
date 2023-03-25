package utec.edu.sv.guia3ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txValor;
    TextView tvvResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txValor=findViewById(R.id.txtValor);
        tvvResul=findViewById(R.id.tvResultado);

    }

    public void Mosttrar(View m)
    {
        double valorr;
        String Mensaje;
        double resultado,v1,v2,v3,v4,v5;
        valorr=Double.parseDouble(txValor.getText().toString());

        if (valorr< 0 ) {
            Mensaje="El número ingresado es negativo";
        } else if (valorr>0) {
            Mensaje="El número ingresado es positivo";

        } else  {
                Mensaje="El número ingresado es nulo";

        }





        tvvResul.setText(String.valueOf(Mensaje));
    }


}