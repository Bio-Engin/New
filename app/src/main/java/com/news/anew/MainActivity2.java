package com.news.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {
    ImageView one;
    ImageView two;
    ImageView three;
    ImageView four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);

        Picasso.get().load("https://images.unsplash.com/photo-1585320806297-9794b3e4eeae?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8Z2FyZGVufGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60").into(one);
        Picasso.get().load("https://images.unsplash.com/photo-1550948390-6eb7fa773072?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fGdhcmRlbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60").into(two);
        Picasso.get().load("https://images.unsplash.com/photo-1557429287-b2e26467fc2b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fGdhcmRlbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60").into(three);
        Picasso.get().load("https://images.unsplash.com/photo-1490750967868-88aa4486c946?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjN8fGdhcmRlbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60").into(four);



    }
}