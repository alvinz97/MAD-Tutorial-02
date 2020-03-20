package tute02.sliit.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button okButton = (Button) findViewById(R.id.okBtn);

        final EditText num01 = (EditText) findViewById(R.id.number01);
        final EditText num02 = (EditText) findViewById(R.id.number02);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent okIntent = new Intent(FirstActivity.this, SecondActivity.class);

                String n1 = num01.getText().toString();
                String n2 = num02.getText().toString();

                okIntent.putExtra("EXTRA1", n1);
                okIntent.putExtra("EXTRA2", n2);

                Context context = getApplicationContext();
                CharSequence message = "Data received";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                startActivity(okIntent);
            }
        });
    }
}
