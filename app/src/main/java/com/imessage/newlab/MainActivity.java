package com.imessage.newlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.firstView);
        List<String> list = new ArrayList<>();
        list.add("Safaricom");
        list.add("Airtel");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = list.get(position);
                // Do something with the selected item, such as start a new activity

                switch (selectedItem) {
                    case "Safaricom":
                        // Start Safaricom activity
                        Intent safaricomIntent = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(safaricomIntent);
                        break;
                    case "Airtel":
//                        Toast to show that its clicked
                        Toast.makeText(MainActivity.this, "Airtel", Toast.LENGTH_SHORT).show();
                    default:
                        throw new IllegalStateException("Unexpected value: " + selectedItem);
                }
            }
        });
    }
}