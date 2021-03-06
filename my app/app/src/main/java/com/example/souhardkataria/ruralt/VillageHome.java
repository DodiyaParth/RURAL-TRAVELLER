package com.example.souhardkataria.ruralt;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class VillageHome extends AppCompatActivity {

    ViewPager viewPager;
    //LinearLayout linearLayout;
    //TextView dotset[];
    static String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toolbar toolbar = findViewById(R.id.ToolbarVillHome);
        setSupportActionBar(toolbar);


        Intent intent = getIntent();
        str = intent.getStringExtra("Village");

        //getSupportActionBar().setTitle(str);


        setContentView(R.layout.activity_village_home);
        viewPager = findViewById(R.id.VillageHomePager);
        PagerAdapt adapt = new PagerAdapt(getSupportFragmentManager());
        viewPager.setAdapter(adapt);

        Button maps  = ( Button )findViewById(R.id.map_button);
        maps.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VillageHome.this, MapsActivity.class);

                try {
                    startActivity(intent);
                }catch (Exception e)
                {
                    Toast.makeText(VillageHome.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    Log.d("Mapsdisplay",e.getMessage());
                }
            }


        });


    }




    public void Cicked(View view) {

        switch(view.getId())
        {
            case R.id.StayButton:
                Intent intent = new Intent(this,StayActivity.class);
                //  intent.putExtra("Village",str);
                startActivity(intent);
                break;
            case R.id.ButtonDecr:
                //Intent intent1 = new Intent(this,)
                startActivity(new Intent(this,DescriptionActivity.class));
                Toast.makeText(this, "Stay", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ButtonPackage:
                Intent intent1=new Intent(this,packages.class);
                intent1.putExtra("Village",str);
                startActivity(intent1);
                break;

            case R.id.Eat:
                Intent i=new Intent(this, Eatactivity.class);
                startActivity(i);
                break;

            case R.id.ButtonVisit:
                startActivity(new Intent(this,VisitReview.class));
                break;

            case R.id.how:
                startActivity(new Intent(this,Visitactivity.class));
                break;

        }
    }
}
