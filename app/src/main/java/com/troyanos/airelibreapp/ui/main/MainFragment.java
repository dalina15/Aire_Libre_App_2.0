package com.troyanos.airelibreapp.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.troyanos.airelibreapp.R;

import org.jetbrains.annotations.NotNull;

import static com.troyanos.airelibreapp.R.string.*;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    // public MainFragment (){}

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView Usuario = view.findViewById(R.id.usuario);
        TextView Membresia = view.findViewById(R.id.tv_TipoMembresia);
        Button MisSitios = view.findViewById(R.id.btn_MisSitios);
        Button Ajustes = view.findViewById(R.id.btn_Ajustes);
        Button Contacto = view.findViewById(R.id.btn_Contacto);
        Button Sobre = view.findViewById(R.id.btn_Sobre);

    /*Usuario.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Navigation.findNavController(v).navigate(R.id.perfilFragment);}});

            // Toast.makeText(this, getResources().getString(ToastUsuario), Toast.LENGTH_SHORT).show();}})
    Membresia.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Navigation.findNavController(v).navigate(R.id.perfilFragment);}});
            //Toast.makeText(MainFragment.this,getResources().getString(MisSitios2), Toast.LENGTH_SHORT).show();}});
    MisSitios.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
            Navigation.findNavController(v).navigate(R.id.perfilFragment);}});
            //Toast.makeText(MainFragment.this,getResources().getString(R.string.MisSitios),Toast.LENGTH_SHORT).show();}});
     Ajustes.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Navigation.findNavController(v).navigate(R.id.perfilFragment);}});
     Contacto.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Navigation.findNavController(v).navigate(R.id.contactFragment);}});
     Sobre.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Navigation.findNavController(v).navigate(R.id.sobreFragment);}});
         }
         @Override
         public void onActivityCreated( Bundle savedInstanceState) {
             super.onActivityCreated(savedInstanceState);
             mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
             // TODO: Use the ViewModel
         }*/}}