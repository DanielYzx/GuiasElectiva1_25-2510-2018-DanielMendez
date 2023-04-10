package utec.edu.sv.mimappdos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Primerf extends Fragment {

    public Primerf() {
        // Required empty public constructor
    }


    public static Primerf newInstance(String param1, String param2) {
        Primerf fragment = new Primerf();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_primerf, container, false);
    }
}