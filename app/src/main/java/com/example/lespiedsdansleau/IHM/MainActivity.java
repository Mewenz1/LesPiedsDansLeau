package com.example.lespiedsdansleau.IHM;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lespiedsdansleau.R;

import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class

MainActivity extends AppCompatActivity {
    private int position = 0;

    private Button bMaraichage;
    private Button bPisciculture;
    private Button bQualiteEau;
    private Button bExploitation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bMaraichage = (Button) findViewById(R.id.maraichagebutton);
        bMaraichage.setOnClickListener(maraichageListener);

        bPisciculture = (Button) findViewById(R.id.pisciculturebutton);
        bPisciculture.setOnClickListener(piscicultureListener);

        bQualiteEau = (Button) findViewById(R.id.qualiteeaubutton);
        bQualiteEau.setOnClickListener(qualiteeauListener);

        bExploitation = (Button) findViewById(R.id.exploitationbutton);
        bExploitation.setOnClickListener(exploitationListener);

    }
    private View.OnClickListener maraichageListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, ListeMaraichageActivity.class);
            startActivityForResult(intent, 0);
        }
    };

    private View.OnClickListener piscicultureListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, ListePiscicultureActivity.class);
            startActivityForResult(intent, 0);
        }
    };

    private View.OnClickListener qualiteeauListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, ListeQualiteEauActivity.class);
            startActivityForResult(intent, 0);
        }
    };

    private View.OnClickListener exploitationListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, EditExploitationActivity.class);
            intent.putExtra("position",position);
            startActivityForResult(intent, 0);
        }
    };
}