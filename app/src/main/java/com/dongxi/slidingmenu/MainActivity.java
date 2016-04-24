package com.dongxi.slidingmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dongxi.slidingmenu.view.SlideMenu;

public class MainActivity extends AppCompatActivity {

    private ImageView btn_back;
    private SlideMenu slideMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_back = (ImageView) findViewById(R.id.btn_back);
        slideMenu = (SlideMenu) findViewById(R.id.slideMenu);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击切换开关
                slideMenu.switchMenu();
            }
        });

    }
}
