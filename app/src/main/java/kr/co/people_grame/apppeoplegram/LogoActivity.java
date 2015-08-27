package kr.co.people_grame.apppeoplegram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //상단 타이틀 제거
        //import android.view.Window;
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //View
        setContentView(R.layout.activity_logo);

        //import android.os.Handler;
        //핸들러 이벤트
        Handler hd = new Handler();

        //핸들러 시작 = 3초 후 종료
        hd.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }

        }, 3000);
    }


}
