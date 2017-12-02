package com.example.pixel.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.pixel.clientes.OpcClientes;

public class Opciones extends Activity {
    private String[] opciones={"Administrar Clientes","Ingresar Pedido","Registrar Entrega","Salir"};
    private ListView opc;
    private int opcion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
        ListView opc = (ListView)findViewById(R.id.listview);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opciones);
        opc.setAdapter(adapter);
        opc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            boolean system=true;
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent cl=new Intent(Opciones.this, OpcClientes.class);
                    startActivity(cl);
                }
            }
        });
    }

}
