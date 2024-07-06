package com.store.toqenperu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity2 extends AppCompatActivity {

    private Button botonusuario, botonadministrador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        botonusuario = (Button) findViewById(R.id.botonusuario);
        botonadministrador = (Button) findViewById(R.id.botonadministrador);

        botonusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity2.this, loginActivity2.class);
                startActivity(intent);

            }
        });

        botonadministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity2.this, LoginAdminActivity2.class);
                startActivity(intent);
            }
        });
    }
}