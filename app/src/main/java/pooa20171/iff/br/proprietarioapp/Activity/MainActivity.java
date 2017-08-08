package pooa20171.iff.br.proprietarioapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import io.realm.internal.Context;
import pooa20171.iff.br.proprietarioapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button livroBT = (Button) findViewById(R.id.bt_proprietario);

        livroBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProprietarioActivity.class);
                startActivity(intent);

            }
        });

    }

    private Context getContext(){
        return this;
    }

}
