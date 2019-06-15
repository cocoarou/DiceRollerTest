package l1l.test;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import l1l.test.models.Die3;
import l1l.test.models.Die4;
import l1l.test.models.Die6;
import l1l.test.models.Die8;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button d3Button = findViewById(R.id.die3);
        Button d4Button = findViewById(R.id.die4);
        Button d6Button = findViewById(R.id.die6);
        Button d8Button = findViewById(R.id.die8);


        Button clearButton = findViewById(R.id.clearButton);

        // Clear Button
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = findViewById(R.id.resultTextView);
                TextView logTextView = findViewById(R.id.logTextView);
                TextView countTextView = findViewById(R.id.countTextView);

                EditText die3EditText = findViewById(R.id.die3EditText);
                EditText die4EditText = findViewById(R.id.die4EditText);
                EditText die6EditText = findViewById(R.id.die6EditText);
                EditText die8EditText = findViewById(R.id.die8EditText);

                resultTextView.setText("");
                logTextView.setText("");
                countTextView.setText("");

                die3EditText.setText("");
                die4EditText.setText("");
                die6EditText.setText("");
                die8EditText.setText("");

            }
        });

        // D3
        d3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Die3 d3 = Die3.getInstance();

                TextView resultTextView = findViewById(R.id.resultTextView);
                TextView logTextView = findViewById(R.id.logTextView);
                TextView countTextView = findViewById(R.id.countTextView);

                EditText die3EditText = findViewById(R.id.die3EditText);

                logTextView.setMovementMethod(new ScrollingMovementMethod());

                int result = 0;

                if(!(die3EditText.getText().length() > 0)) {
                    result = d3.roll();

                    resultTextView.setText(result + "");
                    logTextView.append(result + " ");
                    countTextView.setText(1 + "D" + 3);
                } else {
                    List<Integer> results = new ArrayList<>();
                    int repetitions = Integer.parseInt(die3EditText.getText().toString());
                    for(int i = 1; i <= repetitions; i++) {
                        results.add(d3.roll());
                    }
                    for(int result_ : results) {
                        result += result_;
                    }
                    resultTextView.setText(result + "");
                    logTextView.append(results + " ");
                    countTextView.setText(repetitions + "D" + 3);
                }

            }
        });

        // D4
        d4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Die4 d4 = Die4.getInstance();

                TextView resultTextView = findViewById(R.id.resultTextView);
                TextView logTextView = findViewById(R.id.logTextView);
                TextView countTextView = findViewById(R.id.countTextView);

                EditText die6EditText = findViewById(R.id.die6EditText);

                logTextView.setMovementMethod(new ScrollingMovementMethod());

                int result = 0;

                if(!(die6EditText.getText().length() > 0)) {
                    result = d4.roll();

                    resultTextView.setText(result + "");
                    logTextView.append(result + " ");
                    countTextView.setText(1 + "D" + 4);
                } else {
                    List<Integer> results = new ArrayList<>();
                    int repetitions = Integer.parseInt(die6EditText.getText().toString());
                    for(int i = 1; i <= repetitions; i++) {
                        results.add(d4.roll());
                    }
                    for(int result_ : results) {
                        result += result_;
                    }
                    resultTextView.setText(result + "");
                    logTextView.append(results + " ");
                    countTextView.setText(repetitions + "D" + 4);
                }

            }
        });

        // D6
        d6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Die6 d6 = Die6.getInstance();

                TextView resultTextView = findViewById(R.id.resultTextView);
                TextView logTextView = findViewById(R.id.logTextView);
                TextView countTextView = findViewById(R.id.countTextView);

                EditText die6EditText = findViewById(R.id.die6EditText);

                logTextView.setMovementMethod(new ScrollingMovementMethod());

                int result = 0;

                if(!(die6EditText.getText().length() > 0)) {
                    result = d6.roll();

                    resultTextView.setText(result + "");
                    logTextView.append(result + " ");
                    countTextView.setText(1 + "D" + 6);
                } else {
                    List<Integer> results = new ArrayList<>();
                    int repetitions = Integer.parseInt(die6EditText.getText().toString());
                    for(int i = 1; i <= repetitions; i++) {
                        results.add(d6.roll());
                    }
                    for(int result_ : results) {
                        result += result_;
                    }
                    resultTextView.setText(result + "");
                    logTextView.append(results + " ");
                    countTextView.setText(repetitions + "D" + 6);
                }

            }
        });

        // D8
        d8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Die8 d8 = Die8.getInstance();

                TextView resultTextView = findViewById(R.id.resultTextView);
                TextView logTextView = findViewById(R.id.logTextView);
                TextView countTextView = findViewById(R.id.countTextView);

                EditText die8EditText = findViewById(R.id.die8EditText);

                logTextView.setMovementMethod(new ScrollingMovementMethod());

                int result = 0;

                if(!(die8EditText.getText().length() > 0)) {
                    result = d8.roll();

                    resultTextView.setText(result + "");
                    logTextView.append(result + " ");
                    countTextView.setText(1 + "D" + 8);
                } else {
                    List<Integer> results = new ArrayList<>();
                    int repetitions = Integer.parseInt(die8EditText.getText().toString());
                    for(int i = 1; i <= repetitions; i++) {
                        results.add(d8.roll());
                    }
                    for(int result_ : results) {
                        result += result_;
                    }
                    resultTextView.setText(result + "");
                    logTextView.append(results + " ");
                    countTextView.setText(repetitions + "D" + 8);
                }

            }
        });

    }
}
