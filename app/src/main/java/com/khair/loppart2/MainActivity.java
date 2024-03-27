package com.khair.loppart2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextText,editTextText2;
    Button button;
    TextView textView;

    int b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText=findViewById(R.id.editTextText);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        editTextText2=findViewById(R.id.editTextText2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringtext=editTextText.getText().toString();
                String string=editTextText2.getText().toString();

                if (editTextText.length()>0&&editTextText2.length()>0){

                    int khair=Integer.parseInt(stringtext);
                    int ke=Integer.parseInt(string);

                  if (khair<2){
                      Toast.makeText(MainActivity.this, "hhh", Toast.LENGTH_SHORT).show();
                  }else {
                      for (int a=+khair; a<+ke; a++) {


                          for (int x=2; x<a; x++) {
                              if (a%x==0) {
                                 break;
                              } else {
                                 b=a;
                                 if (x==a-1){
                                     textView.append(" "+b);
                                 }

                              }
                          }

                      }
                  }






















                }else {
                    editTextText.setError("Please enter a number ");
                    editTextText2.setError("Please enter a number ");
                }








            }
        });






    }
}