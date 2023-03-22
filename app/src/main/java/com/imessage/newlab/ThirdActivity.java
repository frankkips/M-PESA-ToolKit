package com.imessage.newlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ListView listView = findViewById(R.id.thirdView);
        List<String> list = new ArrayList<>();
        list.add("Send Money");
        list.add("Withdraw Cash");
        list.add("Buy Airtime");
        list.add("Loans and Savings");
        list.add("Lipa na M-PESA");
        list.add("My Account");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

//        click listener for the list items

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = list.get(position);
                // Do something with the selected item, such as start a new activity

                switch (selectedItem) {
                    case "Send Money":
                        // Start Send Money activity
                        Intent sendMoneyIntent = new Intent(ThirdActivity.this, SendMoneyActivity.class);
                        startActivity(sendMoneyIntent);
                        break;
                    case "Withdraw Cash":
                        // Start Withdraw Cash activity
                        Intent withdrawCashIntent = new Intent(ThirdActivity.this, WithdrawCashActivity.class);
                        startActivity(withdrawCashIntent);
                        break;
                    case "Buy Airtime":
                        // Start Buy Airtime activity
                        Intent buyAirtimeIntent = new Intent(ThirdActivity.this, BuyAirtimeActivity.class);
                        startActivity(buyAirtimeIntent);
                        break;
                    case "Loans and Savings":
                        // Start Loans and Savings activity
                        Intent loansSavingsIntent = new Intent(ThirdActivity.this, LoansSavingsActivity.class);
                        startActivity(loansSavingsIntent);
                        break;
                    case "Lipa na M-PESA":
                        // Start Lipa na M-PESA activity
                        Intent lipaNaMpesaIntent = new Intent(ThirdActivity.this, LipaNaMpesaActivity.class);
                        startActivity(lipaNaMpesaIntent);
                        break;
                    case "My Account":
                        // Start My Account activity
                        Intent myAccountIntent = new Intent(ThirdActivity.this, MyAccountActivity.class);
                        startActivity(myAccountIntent);
                        break;
                }

            }
        });



    }
}