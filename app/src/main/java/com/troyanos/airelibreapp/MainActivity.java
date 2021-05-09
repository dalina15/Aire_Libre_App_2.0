package com.troyanos.airelibreapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.troyanos.airelibreapp.ui.login.LoginFragment;
import com.troyanos.airelibreapp.ui.login.RegisterFragment;
import com.troyanos.airelibreapp.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction transaction;
    Fragment MainFragment, ContactoFragment, EspaciosFragment,PerfilFragment, MapsFragment,LoginFragment, RegisterFragment,SobreFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        MainFragment = new MainFragment();
        ContactoFragment = new ContactFragment();
        EspaciosFragment = new EspaciosFragment();
        PerfilFragment = new PerfilFragment();
        MapsFragment = new MapsFragment();
        LoginFragment = new LoginFragment();
        RegisterFragment = new RegisterFragment();
        SobreFragment = new SobreFragment();


        getSupportFragmentManager().beginTransaction().add(R.id.FTUE, MainFragment).commit();
    }
    public void onClick (View view) {
        transaction=getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.btn_Lista_De_Espacio:
                transaction.replace(R.id.mainFragment, EspaciosFragment);
                transaction.addToBackStack(null);
                break;
            case R.id.btn_MisSitios:
                transaction.replace(R.id.mainFragment, PerfilFragment);
                transaction.addToBackStack(null);
                break;
            case R.id.btn_Ajustes:
                transaction.replace(R.id.mainFragment, PerfilFragment);
                transaction.addToBackStack(null);
                break;
            case R.id.btn_Contacto:
                transaction.replace(R.id.mainFragment, ContactoFragment);
                transaction.addToBackStack(null);
                break;
            case R.id.btn_Sobre:
                transaction.replace(R.id.mainFragment, SobreFragment);
                transaction.addToBackStack(null);
                break;
        }
        transaction.commit();

        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }*/


    }
}