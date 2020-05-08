package com.example.doitnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class AddListActivity extends AppCompatActivity implements View.OnClickListener {

    EditText item, newItem;
    LinearLayout list, horizontal;
    Button ok, add;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list);

        item = findViewById(R.id.item1);
        list = findViewById(R.id.list);
        add = findViewById(R.id.add_note);
        horizontal = findViewById(R.id.constr);

        add.setOnClickListener(this);

        ok = findViewById(R.id.ok3);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AddListActivity.this, List.class);
                startActivity(intent);
                finish();

            }
        });
    }
    @Override
    public void onClick(View v){
        newItem = new EditText(this);
        newItem.setText(item.getText());
        list.addView(newItem);
        item.setText("");

    }
}
