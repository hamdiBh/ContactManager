package com.example.hamdi.contactmanager;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    Button ajouter;
    EditText nom;
    EditText numTel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        ajouter = (Button) findViewById(R.id.ajouter);
        nom = (EditText) findViewById( R.id.nom);
        numTel = (EditText) findViewById(R.id.tel);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


        ArrayList<Contact> contacts = new ArrayList<>();

        final ContactAdapter contactAdapter = new ContactAdapter(contacts);

        recyclerView.setAdapter(contactAdapter);


        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nom.getText().toString();
                String phone = numTel.getText().toString();

                nom.setText("");
                numTel.setText("");
                contactAdapter.addItem(new Contact(name,phone));


            }
        });






    }



}
