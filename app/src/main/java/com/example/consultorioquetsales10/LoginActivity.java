package com.example.consultorioquetsales10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText login_username;
    EditText login_password;
    Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_username = findViewById(R.id.login_username);
        login_password = findViewById(R.id.login_password);
        login_button = findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (!validateUsername() | !validatePassword()){

                }else{
                    if(login_username.getText().toString().trim().equals("Doctor") && login_password.getText().toString().trim().equals("12345")){
                        Toast.makeText(LoginActivity.this,"Bienvenido!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, ServiceActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(LoginActivity.this,"Acceso Incorrecto!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public Boolean validateUsername() {
        String val= login_username.getText().toString();
        if (val.isEmpty()){
            login_username.setError("El Username no debe estar vacío");
            return false;
        }else {
            login_username.setError(null);
            return true;
        }
    }
    public Boolean validatePassword(){
        String val = login_password.getText().toString();
        if (val.isEmpty()){
            login_password.setError("La contraseña no debe estar vacía");
            return false;
        }else{
            login_password.setError(null);
            return true;
        }
    }
}