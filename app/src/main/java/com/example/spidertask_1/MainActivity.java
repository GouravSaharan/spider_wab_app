package com.example.spidertask_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private Button convertBtn,checkBtn;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        convertBtn=findViewById(R.id.convertBtn);
        convertBtn.setOnClickListener(this);
        checkBtn=findViewById(R.id.checkbtn);
        checkBtn.setOnClickListener(this);

        fragmentManager=getSupportFragmentManager();


        UnitConversionsFragment unitConversionsFragment=new UnitConversionsFragment();
        fragmentManager.beginTransaction().replace(R.id.frame_layout,unitConversionsFragment).addToBackStack("home").commit();

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.convertBtn:

                UnitConversionsFragment unitConversionsFragment=new UnitConversionsFragment();
                fragmentManager.beginTransaction().replace(R.id.frame_layout,unitConversionsFragment).addToBackStack("home").commit();

                break;

            case R.id.checkbtn:

               ConversionsCheckFragment conversionsCheckFragment=new ConversionsCheckFragment();
                fragmentManager.beginTransaction().replace(R.id.frame_layout,conversionsCheckFragment).addToBackStack("home").commit();


                break;
        }

    }
}