package com.guaratecnologia.minhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.guaratecnologia.minhaideiadb.R;
import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.controller.ClienteController;
import com.guaratecnologia.minhaideiadb.datasource.AppDataBase;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: App minha ideia");

        clienteController = new ClienteController(getApplicationContext());

    }
}