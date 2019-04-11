package br.com.etecia.marvel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MarvelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marvel_layout);
    }

    public void AbrirHeroi(View view) {
        switch (view.getId()) {
            case R.id.idAmerica:
                Intent capitao = new Intent(MarvelActivity.this, CapitaoActivity.class);
                startActivity(capitao);
                break;

//            case R.id.idAranha:
//                Intent aranha = new Intent(MarvelActivity.this, AranhaActivity.class);
//                startActivity(aranha);
//                break;


            case R.id.idDaredevil:
                Intent daredevil = new Intent(MarvelActivity.this, DareDevilActivity.class);
                startActivity(daredevil);
                break;


//            case R.id.idFerro:
//                Intent ferro = new Intent(MarvelActivity.this, FerroActivity.class);
//                startActivity(ferro);
//                break;


            case R.id.idGroot:
                Intent groot = new Intent(MarvelActivity.this, GrootActivity.class);
                startActivity(groot);
                break;


            case R.id.idLogan:
                Intent logan = new Intent(MarvelActivity.this, LoganActivity.class);
                startActivity(logan);
                break;


//            case R.id.idMagneto:
//                Intent magneto = new Intent(MarvelActivity.this, MagnetoActivity.class);
//                startActivity(magneto);
//                break;
//
//            case R.id.idProfessor:
//                Intent professor = new Intent(MarvelActivity.this, ProfessorActivity.class);
//                startActivity(professor);
//                break;

            case R.id.idThor:
                Intent thor = new Intent(MarvelActivity.this, ThorActivity.class);
                startActivity(thor);
                break;
        }


    }
}
