package com.example.tel_eventandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import lombok.*;

/**
 * Description:
 *
 * @author Vladimir Krasnov
 */
public class Adrenaline extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_result);

        // Получаем текст из Intent
        String resultText = getIntent().getStringExtra("resultText");

        // Находим TextView в макете

        // Устанавливаем текст в TextView

        // Находим Toolbar в макете
        Toolbar toolbar = findViewById(R.id.toolbar);

        // Находим кнопку "назад" в Toolbar
        ImageButton backButton = toolbar.findViewById(R.id.backButton);

        // Устанавливаем слушатель для кнопки "назад"
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Adrenaline.this, MainActivity.class);
                // Выполнение перехода к новому Activity
                startActivity(intent);
                finish();
            }
        });
    }
}
