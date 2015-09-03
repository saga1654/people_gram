package kr.co.people_grame.apppeoplegram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.content.DialogInterface;
import android.app.AlertDialog;
import android.view.KeyEvent;

import com.loopj.android.http.*;

public class LogoActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //View
        setContentView(R.layout.activity_logo);

        /*
        Handler hd = new Handler();
        //핸들러 시작 = 3초 후 종료
        hd.postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(LogoActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
                finish();
            }

        }, 3000);
        */
    }

    public void btn_memberJoin(View v)
    {
        //Log.d("btn", "회원가입버튼");


        intent = new Intent(LogoActivity.this, MyQuestion_Activity.class);
        startActivity(intent);

    }

    public void btn_memberLogin(View v) {
        //Log.d("btn", "로그인 버튼");

        intent = new Intent(LogoActivity.this, MyQuestion_Activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                new AlertDialog.Builder(this)
                        .setTitle("프로그램 종료")
                        .setMessage("프로그램을 종료 하시겠습니까?")
                        .setPositiveButton("예", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                                moveTaskToBack(true);
                                android.os.Process.killProcess(android.os.Process.myPid());

                                //android.os.Process.killProcess(android.os.Process.myPid());
                            }
                        })
                        .setNegativeButton("아니오", null)
                        .show();

                break;

            default:
                break;
        }

        return super.onKeyDown(keyCode, event);
    }

}