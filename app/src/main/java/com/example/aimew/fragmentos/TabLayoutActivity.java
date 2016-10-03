package com.example.aimew.fragmentos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;

public class TabLayoutActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

    //Instancias utilizadas al usar ViewPager
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;

    //Instancias utilizadas al usar FrameLayout
    private FrameLayout frameLayout;
    private FragmentTransaction transaction;
    private RecyclerFragmentLibro fragmentLibro;
    private RecyclerFragmentAutor fragmentAutor;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //referenciar TabLayout
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        //añadir pestañas al tabLayout
        tabLayout.addTab(tabLayout.newTab().setIcon(android.R.drawable.btn_star));
        tabLayout.addTab(tabLayout.newTab().setText("Autor"));
        //tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        //Hacer la tablayout clickable
        tabLayout.setOnTabSelectedListener(this);

        //referenciar viewPager
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        //crear el adaptador del viewPager
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        //agregar el adaptador al viewPager
        viewPager.setAdapter(pagerAdapter);


        /*//referenciar el frameLayout
        frameLayout = (FrameLayout)findViewById(R.id.frame_layout);
        //colocar un fragmento por default al frameLayout
        //iniciar transaccion
        transaction = getSupportFragmentManager().beginTransaction();
        //crear objeto de fragmento
        fragmentLibro = new RecyclerFragmentLibro();
        //reemplazar el fragmento en la actividad
        transaction.replace(R.id.frame_layout, fragmentLibro);
        //realizar transaccion
        transaction.commit();*/

    }//onCreate

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
        /*if(tab.getPosition() == 0 ){
            //iniciar transaccion
            transaction = getSupportFragmentManager().beginTransaction();
            //crear objeto de fragmento
            fragmentLibro = new RecyclerFragmentLibro();
            //reemplazar el fragmento en la actividad
            transaction.replace(R.id.frame_layout, fragmentLibro);
            //realizar transaccion
            transaction.commit();
        }
        else if(tab.getPosition() == 1){
            ///iniciar transaccion
            transaction = getSupportFragmentManager().beginTransaction();
            //crear objeto de fragmento
            fragmentAutor = new RecyclerFragmentAutor();
            //reemplazar el fragmento en la actividad
            transaction.replace(R.id.frame_layout, fragmentAutor);
            //realizar transaccion
            transaction.commit();
        }*/
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

}//class
