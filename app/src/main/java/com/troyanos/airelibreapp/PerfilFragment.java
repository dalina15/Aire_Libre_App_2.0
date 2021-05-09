package com.troyanos.airelibreapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.troyanos.airelibreapp.ui.main.MainFragment;
import com.troyanos.airelibreapp.ui.main.MainViewModel;

import org.jetbrains.annotations.NotNull;


public class PerfilFragment extends Fragment {

    //public PerfilFragment() {
        // Required empty public constructor
    //}


    /*public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_perfil, container, false);
    }*/

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button Contacto = view.findViewById(R.id.btn_Contacto);

        Contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.contactFragment);
            }
        });
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfil, container, false);
    }

    public static class PerfilFragments extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_perfil);

            Button Ajustes;

            Ajustes = (Button) findViewById(R.id.btn_Ajustes);

            Ajustes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(PerfilFragments.this, getResources().getString(R.string.Toast_ajustes), Toast.LENGTH_SHORT).show();}});

         }}

}