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

public class SafaricomPlus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safaricom_plus);

        ListView listView = findViewById(R.id.thirdView);
        List<String> list = new ArrayList<>();
        list.add("M-Banking Services");
        list.add("My Account");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = list.get(position);
                // Do something with the selected item, such as start a new activity

                switch (selectedItem) {
                    case "M-Banking Services":
                        // Start Safaricom activity
                        Intent safaricomIntent = new Intent(SafaricomPlus.this, MbankingActivity.class);
                        startActivity(safaricomIntent);
                        break;
                    case "My Account":
                        Intent mpesaIntent = new Intent(SafaricomPlus.this, MyBankAccountActivity.class);
                        startActivity(mpesaIntent);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + selectedItem);
                }
            }
        });

    }

}
