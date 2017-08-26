package com.example.user.a3_activityexam;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.user.a3_activityexam.model.Answer;

/**
 * Created by user on 2017-08-26.
 */

public class ResultActivity extends AppCompatActivity {
    //이전화면에서 전달된 데이터
    Answer answer;
    TextView textView;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //Intent에 포함된 내용받기
        Intent fromIntent = getIntent();
        /* Beans객체 추출*/
        //Intent에 포함되는 모든 객체는 Serializable을 상속 받아야 한다
        answer = (Answer) fromIntent.getSerializableExtra("answer");

        //출력할 내용 생성
        String result = String.format("아이디 : %s\n비밀번호 : %s\n이메일 : %s",
                answer.getId(), answer.getPassword(), answer.getEmail());

        textView = (TextView) findViewById(R.id.textView);
        textView.setText(result);
    }
}
