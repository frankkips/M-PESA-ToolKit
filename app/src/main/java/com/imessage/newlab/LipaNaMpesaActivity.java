package com.imessage.newlab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class LipaNaMpesaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lipa_mpesa);

        ListView listView = findViewById(R.id.lipa_mpesa_list);
        List<String> list = new ArrayList<>();
        list.add("Pay Bill");
        list.add("Buy Goods & Services");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = list.get(position);
                // Do something with the selected item, such as start a new activity

                switch (selectedItem) {
                    case "Pay Bill":
                        // Start Safaricom activity
                        Intent safaricomIntent = new Intent(LipaNaMpesaActivity.this, PayBillActivity.class);
                        startActivity(safaricomIntent);
                        break;
                    case "Buy Goods & Services":
                        Intent mpesaIntent = new Intent(LipaNaMpesaActivity.this, BUyGoodsActivity.class);
                        startActivity(mpesaIntent);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + selectedItem);
                }
            }
        });

    }
}
