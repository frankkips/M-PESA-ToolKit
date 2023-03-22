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

public class BuyAirtimeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_airtime);

        ListView listView = findViewById(R.id.airtime_list);
        List<String> list = new ArrayList<>();
        list.add("My Phone");
        list.add("Other Phone");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = list.get(position);
                // Do something with the selected item, such as start a new activity

                switch (selectedItem) {
                    case "My Phone":
                        // Start Safaricom activity
                        Intent safaricomIntent = new Intent(BuyAirtimeActivity.this, MyPhoneActivity.class);
                        startActivity(safaricomIntent);
                        break;
                    case "Other Phone":
                        Intent mpesaIntent = new Intent(BuyAirtimeActivity.this, OtherPhoneActivity.class);
                        startActivity(mpesaIntent);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + selectedItem);
                }
            }
        });

    }
}
