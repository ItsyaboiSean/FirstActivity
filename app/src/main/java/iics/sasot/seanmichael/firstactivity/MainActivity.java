package iics.sasot.seanmichael.firstactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressMeButton = (Button) findViewById(R.id.pressMeButton);

        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText inputEditText1 = (EditText) findViewById(R.id.inputEditText1);
                EditText inputEditText2 = (EditText) findViewById(R.id.inputEditText2);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int result = 0;

                int x = Integer.parseInt(inputEditText1.getText().toString());
                int y = Integer.parseInt(inputEditText2.getText().toString());

                if (x > y) {
                    result = x;
                }
                else {
                    result = y;

                }

                resultTextView.setText("Bigger number is:" + result + " ");
            }

        } );
    }
}
