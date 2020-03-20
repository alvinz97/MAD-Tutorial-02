package tute02.sliit.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    String takeExtra1;
    String takeExtra2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button backButton = (Button) findViewById(R.id.backBtn);
        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        Button multyBtn = (Button) findViewById(R.id.multyBtn);
        Button divideBtn = (Button) findViewById(R.id.divideBtn);

        Intent getIntent = getIntent();

        EditText number01 = (EditText) findViewById(R.id.num01);
        EditText number02 = (EditText) findViewById(R.id.num02);

        takeExtra1 = getIntent.getStringExtra("EXTRA1");
        takeExtra2 = getIntent.getStringExtra("EXTRA2");

        number01.setText(takeExtra1);
        number02.setText(takeExtra2);

        String n1 = number01.getText().toString();
        String n2 = number02.getText().toString();

        final int finalNum1 = Integer.parseInt(n1);
        final int finalNum2 = Integer.parseInt(n1);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView result = (TextView) findViewById(R.id.result);
                int finalResult = finalNum1 + finalNum2;
                result.setText(finalResult);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(SecondActivity.this, FirstActivity.class);
                startActivity(backIntent);
            }
        });
    }
}
