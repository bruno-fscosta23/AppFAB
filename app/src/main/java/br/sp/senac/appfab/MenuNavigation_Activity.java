package br.sp.senac.appfab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MenuNavigation_Activity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_navigation_layout);

//        bottomNavigationView = (BottomNavigationView) findViewById(R.id.idBottonNavigation);
//
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                switch (menuItem.getItemId()) {
//                    case R.id.mFavorite:
//                        Toast.makeText(getApplicationContext(), "Cliquei em Favorito", Toast.LENGTH_LONG).show();
//                        break;
//                    case R.id.mLocation:
//                        Toast.makeText(getApplicationContext(), "Cliquei em Location", Toast.LENGTH_LONG).show();
//                        break;
//                    case R.id.mRecente:
//                        Toast.makeText(getApplicationContext(), "Cliquei em Share", Toast.LENGTH_LONG).show();
//                        break;
//                }
//                return true;
//            }
//        });
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.idBottonNavigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                startActivity(new Intent(getApplicationContext(), Share_Activity.class));

                return true;
            }
        });

    }
}
