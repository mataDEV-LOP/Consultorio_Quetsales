package com.example.consultorioquetsales10;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    private int selectedTab =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        final LinearLayout ExpedientesYRecetasLayout = findViewById(R.id.ExpedientesYRecetasLayout);
        final LinearLayout ServicesLayout = findViewById(R.id.ServicesLayout);
        final LinearLayout AgendaLayout = findViewById(R.id.AgendaLayout);
        final LinearLayout top_layout = findViewById(R.id.top_layout);

        final ImageView ExpedientesYRecetasImage = findViewById(R.id.ExpedientesYRecetasImage);
        final ImageView ServicesImage = findViewById(R.id.ServicesImage);
        final ImageView AgendaImage = findViewById(R.id.AgendaImage);
        final ImageView top_layout_image = findViewById(R.id.top_layout_image);

        final TextView ExpedientesYRecetasText = findViewById(R.id.ExpedientesYRecetasText);
        final TextView ServicesText = findViewById(R.id.ServicesText);
        final TextView AgendaText = findViewById(R.id.AgendaText);
        final TextView top_layout_txt = findViewById(R.id.top_layout_txt);



        //Establecer el fragment de Servicios por defecto
        getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragmentContainer, ExpedientesYRecetasFragment.class, null)
                        .commit();

        ExpedientesYRecetasLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Validar si expedientes ya esta seleccionada
                if(selectedTab!=1){

                    //Establecer fragment de ExpedientesYRecetas
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, ExpedientesYRecetasFragment.class, null)
                            .commit();
                    //change top
                    top_layout_txt.setText("Expedientes y Recetas");
                    top_layout_image.setImageResource(R.drawable.baseline_assignment_24_white);

                    //unselect other tabs expect expedientes tab
                    ServicesText.setVisibility(View.GONE);
                    AgendaText.setVisibility(View.GONE);

                    ServicesImage.setImageResource(R.drawable.baseline_assignment_ind_24);
                    AgendaImage.setImageResource(R.drawable.baseline_calendar_month_24);

                    ServicesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    AgendaLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //seleccionar la pestaña expedientes
                    ExpedientesYRecetasText.setVisibility(View.VISIBLE);
                    ExpedientesYRecetasImage.setImageResource(R.drawable.baseline_assignment_24);
                    ExpedientesYRecetasLayout.setBackgroundResource(R.drawable.round_back_expedientes_100);

                    //crear animación
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    ExpedientesYRecetasLayout.startAnimation(scaleAnimation);

                    //establecer la primera pestaña como la seleccion actual
                    selectedTab = 1;

                }

            }
        });

        ServicesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Validar si Servicios ya esta seleccionada
                if(selectedTab!=2){
                    //Establecer fragment de Servicios
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, ServiceFragment.class, null)
                            .commit();
                    //change top
                    top_layout_txt.setText("Servicios");
                    top_layout_image.setImageResource(R.drawable.baseline_assignment_ind_24_white);

                    //unselect other tabs expect servicios tab
                    ExpedientesYRecetasText.setVisibility(View.GONE);
                    AgendaText.setVisibility(View.GONE);

                    ExpedientesYRecetasImage.setImageResource(R.drawable.baseline_assignment_24);
                    AgendaImage.setImageResource(R.drawable.baseline_calendar_month_24);

                    ExpedientesYRecetasLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    AgendaLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //seleccionar la pestaña servicios
                    ServicesText.setVisibility(View.VISIBLE);
                    ServicesImage.setImageResource(R.drawable.baseline_assignment_ind_24);
                    ServicesLayout.setBackgroundResource(R.drawable.round_back_services_100);

                    //crear animación
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    ServicesLayout.startAnimation(scaleAnimation);

                    //establecer la segunda pestaña como la seleccion actual
                    selectedTab = 2;

                }


            }
        });

        AgendaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Validar si Agenda ya esta seleccionada
                if(selectedTab!=3){
                    //Establecer fragment de Agenda
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, AgendaFragment.class, null)
                            .commit();

                    //change top
                    top_layout_txt.setText("Agenda");
                    top_layout_image.setImageResource(R.drawable.baseline_calendar_month_24_white);

                    //unselect other tabs expect agenda tab
                    ExpedientesYRecetasText.setVisibility(View.GONE);
                    ServicesText.setVisibility(View.GONE);

                    ExpedientesYRecetasImage.setImageResource(R.drawable.baseline_assignment_24);
                    ServicesImage.setImageResource(R.drawable.baseline_assignment_ind_24);

                    ExpedientesYRecetasLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    ServicesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //seleccionar la pestaña agenda
                    AgendaText.setVisibility(View.VISIBLE);
                    AgendaImage.setImageResource(R.drawable.baseline_calendar_month_24);
                    AgendaLayout.setBackgroundResource(R.drawable.round_back_agenda_100);

                    //crear animación
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    AgendaLayout.startAnimation(scaleAnimation);

                    //establecer la tercer pestaña como la seleccion actual
                    selectedTab = 3;
                }
            }
        });
    }
}