package utec.edu.sv.guia3ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResul;
    EditText txVal1,txVal2,txVal3,txVal4,txVal5,txVal6,txVal7,txVal8,txVal9,txVal10;
    Button btMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txVal1=findViewById(R.id.txtValor1);
        txVal2=findViewById(R.id.txtValor2);
        txVal3=findViewById(R.id.txtValor3);
        txVal4=findViewById(R.id.txtValor4);
        txVal5=findViewById(R.id.txtValor5);
        txVal6=findViewById(R.id.txtValor6);
        txVal7=findViewById(R.id.txtValor7);
        txVal8=findViewById(R.id.txtValor8);
        txVal9=findViewById(R.id.txtValor9);
        txVal10=findViewById(R.id.txtValor10);
        btMostrar=findViewById(R.id.btnMostrar);
        tvResul=findViewById(R.id.tvResultado);

    }

    public void Mosttrar(View m)
    {
        double suma;
        double resultado,v1,v2,v3,v4,v5;

        v1=Double.parseDouble(txVal6.getText().toString());
        v2=Double.parseDouble(txVal7.getText().toString());
        v3=Double.parseDouble(txVal8.getText().toString());
        v4=Double.parseDouble(txVal9.getText().toString());
        v5=Double.parseDouble(txVal10.getText().toString());
        suma=v1+v2+v3+v4+v5;
        resultado=suma;


        tvResul.setText("La suma de los ultimos 5 valores es es:"+String.valueOf(resultado));
    }
}