package com.guaratecnologia.minhaideiadb.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.guaratecnologia.minhaideiadb.R;
import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.controller.ClienteController;
import com.guaratecnologia.minhaideiadb.model.Cliente;

public class MainActivity extends AppCompatActivity {
    ClienteController clienteController;
    Cliente cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clienteController = new ClienteController(getApplicationContext());

        cliente = new Cliente();

        cliente.setId(1);
        cliente.setNome("Renato da Leal Silva");
        cliente.setEmail("renatolealhiss@gmail.com");



//        cliente = new Cliente();
//        cliente.setNome("Renato da Leal Silva");
//        cliente.setEmail("renatolealhiss@gmail.com");

//
//        if (clienteController.incluir(cliente)) {
//            Toast.makeText(MainActivity.this, "Cliente inserido na tabela: "
//                    + cliente.getNome() + " e "
//                    + cliente.getEmail(), Toast.LENGTH_LONG).show();
//            Log.i(AppUtil.TAG, "onCreate: Cliente Incluido");
//        } else {
//            Toast.makeText(MainActivity.this, "Cliente inserido na tabela: "
//                    + cliente.getNome() + " e "
//                    + cliente.getEmail(), Toast.LENGTH_LONG).show();
//            Log.e(AppUtil.TAG, "onCreate: Cliente Não incluido");
//        }

                if (clienteController.deletar(cliente.getId())) {
            Toast.makeText(MainActivity.this, "Cliente excluido da tabela: "
                    + cliente.getNome() + " e "
                    + cliente.getEmail(), Toast.LENGTH_LONG).show();
            Log.i(AppUtil.TAG, "onCreate: Cliente excluido");
        } else {
            Toast.makeText(MainActivity.this, "Cliente excluido da tabela: "
                    + cliente.getNome() + " e "
                    + cliente.getEmail(), Toast.LENGTH_LONG).show();
            Log.e(AppUtil.TAG, "onCreate: Cliente Não excluido");
        }




    }
}