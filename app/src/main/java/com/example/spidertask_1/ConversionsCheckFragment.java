package com.example.spidertask_1;

import android.graphics.Color;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class ConversionsCheckFragment extends Fragment {

    private EditText tempInputCheck,tempOutputCheck,speedInputCheck,speedOutputCheck,lenthInputCheck,lengthOutputCheck,weightInputCheck,weightOutputCheck;
    private Button tempCheckBtn,lengthCheckBtn,speedCheckBtn,weightCheckBtn;
    private ConstraintLayout tempConst,speedConst,weightConst,lengthConst;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_conversions_check, container, false);


        tempInputCheck=view.findViewById(R.id.tempInputcheck);
        tempOutputCheck=view.findViewById(R.id.tempOutputcheck);
        tempCheckBtn=view.findViewById(R.id.tempCheckBtn);
        speedInputCheck=view.findViewById(R.id.speedInputcheck);
        speedOutputCheck=view.findViewById(R.id.speedoutputcheck);
        speedCheckBtn=view.findViewById(R.id.speedCheckBtn);
        lenthInputCheck=view.findViewById(R.id.lengthInputcheck);
        lengthOutputCheck=view.findViewById(R.id.lengthOutputcheck);
        lengthCheckBtn=view.findViewById(R.id.lengthCheckBtn);
        weightInputCheck=view.findViewById(R.id.weightInputcheck);
        weightOutputCheck=view.findViewById(R.id.weightOutputcheck);
        weightCheckBtn=view.findViewById(R.id.weightCheckBtn);

        tempConst=view.findViewById(R.id.tempConst);
        speedConst=view.findViewById(R.id.speedConst);
        weightConst=view.findViewById(R.id.weightConst);
        lengthConst=view.findViewById(R.id.lengthConst);


        tempCheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tempInputCheck.getText().toString().isEmpty()  || tempOutputCheck.getText().toString().isEmpty()){


                    if(tempInputCheck.getText().toString().isEmpty()){
                        tempInputCheck.setError("enter value");
                    }
                    else if(tempOutputCheck.getText().toString().isEmpty()){
                        tempOutputCheck.setError("enter value");
                    }
                    else{
                        tempInputCheck.setError("enter value");
                        tempOutputCheck.setError("enter value");
                    }
                }
                else{
                    Float input,output;
                    input = (Float.valueOf(tempInputCheck.getText().toString().trim())*9)/5+32;
                    output = Float.valueOf(tempOutputCheck.getText().toString().trim());

                    if(checkCondation(input,output)){

                        String green="#03D832";
                        tempConst.setBackgroundColor(Color.parseColor(green));


                    }
                    else{
                        String red="#EC2107";
                        tempConst.setBackgroundColor(Color.parseColor(red));

                        tempOutputCheck.setError(String.valueOf((Float.valueOf((tempInputCheck.getText().toString().trim()))*9)/5+32));
                    }
                }
            }
        });

        lengthCheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(lenthInputCheck.getText().toString().isEmpty()  || lengthOutputCheck.getText().toString().isEmpty()){


                    if(lenthInputCheck.getText().toString().isEmpty()){
                        lenthInputCheck.setError("enter value");
                    }
                    else if(lengthOutputCheck.getText().toString().isEmpty()){
                        lengthOutputCheck.setError("enter value");
                    }
                    else{
                        lenthInputCheck.setError("enter value");
                        lengthOutputCheck.setError("enter value");

                    }
                }
                else{
                    Float input,output;
                    input = (Float.valueOf(lenthInputCheck.getText().toString().trim()));
                    output = Float.valueOf(lengthOutputCheck.getText().toString().trim())*100;

                    if(checkCondation(input,output)){

                        String green="#03D832";
                        lengthConst.setBackgroundColor(Color.parseColor(green));


                    }
                    else{
                        String red="#EC2107";
                        lengthConst.setBackgroundColor(Color.parseColor(red));

                        lengthOutputCheck.setError(String.valueOf( input/100));
                    }
                }
            }
        });

        weightCheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(weightInputCheck.getText().toString().isEmpty()  || weightOutputCheck.getText().toString().isEmpty()){


                    if(weightInputCheck.getText().toString().isEmpty()){
                        weightInputCheck.setError("enter value");
                    }
                    else if(weightOutputCheck.getText().toString().isEmpty()){
                        weightOutputCheck.setError("enter value");
                    }
                    else{
                        weightInputCheck.setError("enter value");
                        weightOutputCheck.setError("enter value");

                    }
                }
                else{
                    Float input,output;
                    input = (Float.valueOf(weightInputCheck.getText().toString().trim()));
                    output = Float.valueOf((float) (Double.valueOf(weightOutputCheck.getText().toString().trim())*2.20462));

                    if(checkCondation(input,output)){

                        String green="#03D832";
                        weightConst.setBackgroundColor(Color.parseColor(green));


                    }
                    else{
                        String red="#EC2107";
                        weightConst.setBackgroundColor(Color.parseColor(red));
                        weightOutputCheck.setError(String.valueOf( input*2.20462));
                    }
                }
            }
        });

        speedCheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(speedInputCheck.getText().toString().isEmpty()  || speedOutputCheck.getText().toString().isEmpty()){


                    if(speedInputCheck.getText().toString().isEmpty()){
                        speedInputCheck.setError("enter value");
                    }
                    else if(speedOutputCheck.getText().toString().isEmpty()){
                        speedOutputCheck.setError("enter value");
                    }
                    else{
                        speedOutputCheck.setError("enter value");
                        speedInputCheck.setError("enter value");

                    }
                }
                else{
                    Float input,output;
                    input = (Float.valueOf(speedInputCheck.getText().toString().trim()));
                    output = Float.valueOf((float) (Double.valueOf(weightOutputCheck.getText().toString().trim())*3.6));

                    if(checkCondation(input,output)){

                        String green="#03D832";
                        speedConst.setBackgroundColor(Color.parseColor(green));


                    }
                    else{
                        String red="#EC2107";
                        speedConst.setBackgroundColor(Color.parseColor(red));
                        speedOutputCheck.setError(String.valueOf( input*3.6));
                    }
                }
            }
        });



        return view ;
    }

    private boolean checkCondation(float a,float b){
        if(a<b  || b<a){
            return false;
        }
        else
            return true;
    }
}