package com.example.pixel.clientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.pixel.myapplication.R;

public class OpcClientes extends AppCompatActivity {
    private String[] opcionesc={"Agregar Cliente","Editar Cliente","Eliminar Cliente","Volver"};
    private ListView opc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opc_clientes);
        opc = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opcionesc);
        opc.setAdapter(adapter);
        opc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:{
                        Toast msg=Toast.makeText(OpcClientes.this, "Agregar",Toast.LENGTH_SHORT);
                        msg.show();
                        break;
                    }case 1:{
                        Toast msg=Toast.makeText(OpcClientes.this,"Editar",Toast.LENGTH_SHORT);
                        msg.show();
                        break;
                    }case 2:{
                        Toast msg=Toast.makeText(OpcClientes.this,"Eliminar",Toast.LENGTH_SHORT);
                        msg.show();
                        break;
                    }case 3:{
                        Toast msg=Toast.makeText(OpcClientes.this,"Volver",Toast.LENGTH_SHORT);
                        msg.show();
                        break;
                    }
                }
            }
        });
    }
}
