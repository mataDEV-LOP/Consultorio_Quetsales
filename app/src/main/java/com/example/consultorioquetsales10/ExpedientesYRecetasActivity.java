package com.example.consultorioquetsales10;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ExpedientesYRecetasActivity extends AppCompatActivity {
    private int selectedTab =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_expedientesyrecetas);
        final LinearLayout ExpedientesYRecetasLayout = findViewById(R.id.ExpedientesYRecetasLayout);
        final LinearLayout ServicesLayout = findViewById(R.id.ServicesLayout);
        final LinearLayout AgendaLayout = findViewById(R.id.AgendaLayout);

        final ImageView ExpedinetesYRecetasImage = findViewById(R.id.ExpedientesYRecetasImage);
        final ImageView ServicesImage = findViewById(R.id.ServicesImage);
        final ImageView AgendaImage = findViewById(R.id.AgendaImage);

        final TextView ExpedientesYRecetasText = findViewById(R.id.ExpedientesYRecetasText);
        final TextView ServicesText = findViewById(R.id.ServicesText);
        final TextView AgendaText = findViewById(R.id.AgendaText);


        ExpedientesYRecetasLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });






    }
}