package com.example.spidertask_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class UnitConversionsFragment extends Fragment {

    private EditText tempInput,tempOutput,speedInput,speedOutput,lenthInput,lengthOutput,weightInput,weightOutput;
    private Button tempBtn,lengthBtn,speedBtn,weightBtn;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view= inflater.inflate(R.layout.fragment_unit_conversions, container, false);

        tempInput=view.findViewById(R.id.tempInput);
        tempOutput=view.findViewById(R.id.tempOutput);
        tempBtn=view.findViewById(R.id.tempBtn);
        speedInput=view.findViewById(R.id.speedInput);
        speedOutput=view.findViewById(R.id.speedoutput);
        speedBtn=view.findViewById(R.id.speedBtn);
        lenthInput=view.findViewById(R.id.lengthInput);
        lengthOutput=view.findViewById(R.id.lengthOutput);
        lengthBtn=view.findViewById(R.id.lengthBtn);
        weightInput=view.findViewById(R.id.weightInput);
        weightOutput=view.findViewById(R.id.weightOutput);
        weightBtn=view.findViewById(R.id.weightBtn);


        tempBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!tempInput.getText().toString().isEmpty()  && tempOutput.getText().toString().isEmpty()){
                    Float temperateInput;
                    temperateInput = Float.valueOf(tempInput.getText().toString().trim());
                 tempOutput.setText(  String.valueOf (((Float)temperateInput * 9)/5  +32));
                    tempInput.setError(null);
                    tempOutput.setError(null);


                }
               else  if(tempInput.getText().toString().isEmpty()  && !tempOutput.getText().toString().isEmpty()){
                    Float temperateInput;
                    temperateInput = Float.valueOf(tempOutput.getText().toString().trim());

                    tempInput.setText(String.valueOf(((temperateInput-32f)*5)/9));

                    tempInput.setError(null);
                    tempOutput.setError(null);
                }
                else  if(tempInput.getText().toString().isEmpty()  && tempOutput.getText().toString().isEmpty()){
                   tempInput.setError("Enter value");
                   tempOutput.setError("Enter value");
                }
                else{
                    tempInput.setError("Enter only one unit ");
                    tempOutput.setError("Enter only one unit");
                }
            }
        });

        lengthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!lenthInput.getText().toString().isEmpty() && lengthOutput.getText().toString().isEmpty()){


                    Float lengthInput0;
                    lengthInput0 = Float.valueOf(lenthInput.getText().toString().trim());
                    lengthOutput.setText(  String.valueOf (lengthInput0/100));
                    lenthInput.setError(null);
                    lengthOutput.setError(null);
                }
               else  if(lenthInput.getText().toString().isEmpty() && !lengthOutput.getText().toString().isEmpty()){

                    Float lengthInput0;
                    lengthInput0 = Float.valueOf(lengthOutput.getText().toString().trim());
                    lenthInput.setText(  String.valueOf (lengthInput0*100));
                    lenthInput.setError(null);
                    lengthOutput.setError(null);
                }
                else  if(lenthInput.getText().toString().isEmpty() && lengthOutput.getText().toString().isEmpty()){

                    lengthOutput.setError("Enter value ");
                    lenthInput.setError("Enter value");

                }
                else  {

                    lenthInput.setError("Enter only one unit ");
                    lengthOutput.setError("Enter only one unit");
                }
            }
        });

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!weightInput.getText().toString().isEmpty() && weightOutput.getText().toString().isEmpty()){

                    Float input;
                     input = Float.valueOf(weightInput.getText().toString().trim());
                    weightOutput.setText(  String.valueOf (input*2.20462));
                    weightInput.setError(null);
                    weightOutput.setError(null);
                }

                else if(weightInput.getText().toString().isEmpty() && !weightOutput.getText().toString().isEmpty()){

                    Float input;
                    input = Float.valueOf(weightOutput.getText().toString().trim());
                    weightInput.setText(  String.valueOf (input*2.20462));
                    weightInput.setError(null);
                    weightOutput.setError(null);
                }
              else if(weightInput.getText().toString().isEmpty() && weightOutput.getText().toString().isEmpty()){

                    weightInput.setError("enter value");
                    weightOutput.setError("enter value");


                }
                else{
                    weightInput.setError("please enter only one unit");
                    weightOutput.setError("please enter only one unit");
                }
            }
        });

        speedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!speedInput.getText().toString().isEmpty() && speedOutput.getText().toString().isEmpty()){


                    Float speedInput0;
                    speedInput0 = Float.valueOf(speedInput.getText().toString().trim());

                    speedOutput.setText(String.valueOf((speedInput0*3.6)));

                    speedOutput.setError(null);
                    speedInput.setError(null);
                }
                else if(!speedInput.getText().toString().isEmpty() && speedOutput.getText().toString().isEmpty()){

                    Float speedInput0;
                    speedInput0 = Float.valueOf(speedOutput.getText().toString().trim());

                    speedInput.setText(String.valueOf((speedInput0/3.6)));


                    speedOutput.setError(null);
                    speedInput.setError(null);
                }
                else if(!speedInput.getText().toString().isEmpty() && !speedOutput.getText().toString().isEmpty()){
                    speedOutput.setError("please enter only one unit");
                    speedInput.setError("please enter only one unit");
                }
                else{
                    speedOutput.setError("please enter value");
                    speedInput.setError("please enter value");
                }
            }
        });


        return view;
    }
}