package com.example.jokemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedra(View view){
        this.opcaoDoUsuario("pedra");
    }
    public void papel(View view){
        this.opcaoDoUsuario("papel");
    }
    public void tesoura(View view){
        this.opcaoDoUsuario("tesoura");
    }
    public void opcaoDoUsuario(String opcaoDoUsusario){

        TextView textResultado = findViewById(R.id.textresult);
        ImageView imagemDoApp = findViewById(R.id.imageDoApp);
        int numero = new Random().nextInt(3);
        String[] opcao = {"pedra","papel","tesoura"};
        String opcaoApp = opcao[numero];

        switch (opcaoApp) {
            case "pedra":
                imagemDoApp.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemDoApp.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemDoApp.setImageResource(R.drawable.tesoura);
                break;
        }
        if (
                        (opcaoApp == "pedra" && opcaoDoUsusario == "tesoura")||
                        (opcaoApp =="tesoura" && opcaoDoUsusario == "papel" )||
                        (opcaoApp =="papel" && opcaoDoUsusario == "pedra")
        ){
            textResultado.setText("Você Perdeu :(");
        } else if (
                         (opcaoApp == "pedra" && opcaoDoUsusario == "papel")||
                         (opcaoApp =="tesoura" && opcaoDoUsusario == "pedra" )||
                         (opcaoApp =="papel" && opcaoDoUsusario == "tesoura")
        ){
            textResultado.setText("Você Ganhou :)");
      }else {

            textResultado.setText("Enpatou :S");
        }


    }



}