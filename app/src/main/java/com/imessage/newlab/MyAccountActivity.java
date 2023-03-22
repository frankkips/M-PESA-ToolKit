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


public class MyAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        ListView listView = findViewById(R.id.account_list);
        List<String> list = new ArrayList<>();
        list.add("Mini Statement");
        list.add("Check Balance");
        list.add("Change M-PESA PIN");
        list.add("Change Language");
        list.add("Update Customer Menu");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = list.get(position);
                // Do something with the selected item, such as start a new activity

                switch (selectedItem) {
                    case "Mini Statement":
                        // Start Safaricom activity
                        Intent safaricomIntent = new Intent(MyAccountActivity.this, MyAccountActivity.class);
                        startActivity(safaricomIntent);
                        break;
                    case "Check Balance":
                        // Start Safaricom activity
                        Intent checkIntent = new Intent(MyAccountActivity.this, MyAccountActivity.class);
                        startActivity(checkIntent);
                    case "Change M-PESA PIN":
                        // Start Safaricom activity
                        Intent pinIntent = new Intent(MyAccountActivity.this, MyAccountActivity.class);
                        startActivity(pinIntent);
                        break;
                    case "Change Language":
                        // Start Safaricom activity
                        Intent languageIntent = new Intent(MyAccountActivity.this, MyAccountActivity.class);
                        startActivity(languageIntent);
                        break;
                    case "Update Customer Menu":
                        // Start Safaricom activity
                        Intent menuIntent = new Intent(MyAccountActivity.this, MyAccountActivity.class);
                        startActivity(menuIntent);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + selectedItem);
                }
            }
        });
    }
}
