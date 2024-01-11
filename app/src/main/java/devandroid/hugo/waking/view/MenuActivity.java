package devandroid.hugo.waking.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.hugo.waking.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    //Button para a activity Finanças
    public void buttonMenuToFinancas(View view) {
        Intent intent = new Intent(MenuActivity.this, FinancasActivity.class);
        startActivity(intent);
    }
}
