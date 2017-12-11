package kr.co.tjeit.yourmemory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONObject;

import kr.co.tjeit.yourmemory.util.ServerUtil;

public class SignUpActivity extends BaseActivity {

    private android.widget.TextView textView2;
    private android.widget.Button signupBtn;
    private Button checkDuplBtn;
    private Button test;
    private android.widget.EditText emailEdt;
    private android.widget.EditText passEdt;
    private android.widget.EditText passChkEdt;
    private android.widget.EditText nameEdt;
    private EditText phoneEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServerUtil.sign_up(mContext, emailEdt.getText().toString(), passEdt.getText().toString(), nameEdt.getText().toString(), phoneEdt.getText().toString()
                        , new ServerUtil.JsonResponseHandler() {
                            @Override
                            public void onResponse(JSONObject json) {

                                Toast.makeText(mContext, "회원가입에 성공했습니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(mContext, MainActivity.class);
                                startActivity(intent);
                            }
                        });

            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.signupBtn = (Button) findViewById(R.id.signupBtn);
        this.phoneEdt = (EditText) findViewById(R.id.phoneEdt);
        this.nameEdt = (EditText) findViewById(R.id.nameEdt);
        this.passChkEdt = (EditText) findViewById(R.id.passChkEdt);
        this.passEdt = (EditText) findViewById(R.id.passEdt);
        this.checkDuplBtn = (Button) findViewById(R.id.checkDuplBtn);
        this.emailEdt = (EditText) findViewById(R.id.emailEdt);
    }
}
