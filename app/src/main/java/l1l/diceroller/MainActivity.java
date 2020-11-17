package l1l.diceroller;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import l1l.diceroller.models.Die10;
import l1l.diceroller.models.Die100;
import l1l.diceroller.models.Die12;
import l1l.diceroller.models.Die20;
import l1l.diceroller.models.Die3;
import l1l.diceroller.models.Die4;
import l1l.diceroller.models.Die6;
import l1l.diceroller.models.Die8;
import l1l.test.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button d3Button = findViewById(R.id.die3);
        Button d4Button = findViewById(R.id.die4);
        Button d6Button = findViewById(R.id.die6);
        Button d8Button = findViewById(R.id.die8);
        Button d10Button = findViewById(R.id.die10);
        Button d12Button = findViewById(R.id.die12);
        Button d20Button = findViewById(R.id.die20);
        Button d100Button = findViewById(R.id.die100);

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
                EditText die10EditText = findViewById(R.id.die10EditText);
                EditText die12EditText = findViewById(R.id.die12EditText);
                EditText die20EditText = findViewById(R.id.die20EditText);
                EditText die100EditText = findViewById(R.id.die100EditText);

                resultTextView.setText("");
                logTextView.setText("");
                countTextView.setText("");

                die3EditText.setText("");
                die4EditText.setText("");
                die6EditText.setText("");
                die8EditText.setText("");
                die10EditText.setText("");
                die12EditText.setText("");
                die20EditText.setText("");
                die100EditText.setText("");

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

                EditText die4EditText = findViewById(R.id.die4EditText);

                logTextView.setMovementMethod(new ScrollingMovementMethod());

                int result = 0;

                if(!(die4EditText.getText().length() > 0)) {
                    result = d4.roll();

                    resultTextView.setText(result + "");
                    logTextView.append(result + " ");
                    countTextView.setText(1 + "D" + 4);
                } else {
                    List<Integer> results = new ArrayList<>();
                    int repetitions = Integer.parseInt(die4EditText.getText().toString());
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

        // D10
        d10Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Die10 d10 = Die10.getInstance();

                TextView resultTextView = findViewById(R.id.resultTextView);
                TextView logTextView = findViewById(R.id.logTextView);
                TextView countTextView = findViewById(R.id.countTextView);

                EditText die10EditText = findViewById(R.id.die10EditText);

                logTextView.setMovementMethod(new ScrollingMovementMethod());

                int result = 0;

                if(!(die10EditText.getText().length() > 0)) {
                    result = d10.roll();

                    resultTextView.setText(result + "");
                    logTextView.append(result + " ");
                    countTextView.setText(1 + "D" + 10);
                } else {
                    List<Integer> results = new ArrayList<>();
                    int repetitions = Integer.parseInt(die10EditText.getText().toString());
                    for(int i = 1; i <= repetitions; i++) {
                        results.add(d10.roll());
                    }
                    for(int result_ : results) {
                        result += result_;
                    }
                    resultTextView.setText(result + "");
                    logTextView.append(results + " ");
                    countTextView.setText(repetitions + "D" + 10);
                }

            }
        });

        // D12
        d12Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Die12 d12 = Die12.getInstance();

                TextView resultTextView = findViewById(R.id.resultTextView);
                TextView logTextView = findViewById(R.id.logTextView);
                TextView countTextView = findViewById(R.id.countTextView);

                EditText die12EditText = findViewById(R.id.die12EditText);

                logTextView.setMovementMethod(new ScrollingMovementMethod());

                int result = 0;

                if(!(die12EditText.getText().length() > 0)) {
                    result = d12.roll();

                    resultTextView.setText(result + "");
                    logTextView.append(result + " ");
                    countTextView.setText(1 + "D" + 12);
                } else {
                    List<Integer> results = new ArrayList<>();
                    int repetitions = Integer.parseInt(die12EditText.getText().toString());
                    for(int i = 1; i <= repetitions; i++) {
                        results.add(d12.roll());
                    }
                    for(int result_ : results) {
                        result += result_;
                    }
                    resultTextView.setText(result + "");
                    logTextView.append(results + " ");
                    countTextView.setText(repetitions + "D" + 12);
                }

            }
        });

        // D20
        d20Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Die20 d20 = Die20.getInstance();

                TextView resultTextView = findViewById(R.id.resultTextView);
                TextView logTextView = findViewById(R.id.logTextView);
                TextView countTextView = findViewById(R.id.countTextView);

                EditText die20EditText = findViewById(R.id.die20EditText);

                logTextView.setMovementMethod(new ScrollingMovementMethod());

                int result = 0;

                if(!(die20EditText.getText().length() > 0)) {
                    result = d20.roll();

                    resultTextView.setText(result + "");
                    logTextView.append(result + " ");
                    countTextView.setText(1 + "D" + 20);
                } else {
                    List<Integer> results = new ArrayList<>();
                    int repetitions = Integer.parseInt(die20EditText.getText().toString());
                    for(int i = 1; i <= repetitions; i++) {
                        results.add(d20.roll());
                    }
                    for(int result_ : results) {
                        result += result_;
                    }
                    resultTextView.setText(result + "");
                    logTextView.append(results + " ");
                    countTextView.setText(repetitions + "D" + 20);
                }

            }
        });

        // D100
        d100Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Die100 d100 = Die100.getInstance();

                TextView resultTextView = findViewById(R.id.resultTextView);
                TextView logTextView = findViewById(R.id.logTextView);
                TextView countTextView = findViewById(R.id.countTextView);

                EditText die100EditText = findViewById(R.id.die100EditText);

                logTextView.setMovementMethod(new ScrollingMovementMethod());

                int result = 0;

                if(!(die100EditText.getText().length() > 0)) {
                    result = d100.roll();

                    resultTextView.setText(result + "");
                    logTextView.append(result + " ");
                    countTextView.setText(1 + "D" + 100);
                } else {
                    List<Integer> results = new ArrayList<>();
                    int repetitions = Integer.parseInt(die100EditText.getText().toString());
                    for(int i = 1; i <= repetitions; i++) {
                        results.add(d100.roll());
                    }
                    for(int result_ : results) {
                        result += result_;
                    }
                    resultTextView.setText(result + "");
                    logTextView.append(results + " ");
                    countTextView.setText(repetitions + "D" + 100);
                }

            }
        });

    }

    public void hideKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
