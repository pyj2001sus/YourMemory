package kr.co.tjeit.yourmemory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import kr.co.tjeit.yourmemory.util.ContextUtil;
import kr.co.tjeit.yourmemory.util.ServerUtil;

public class LoginActivity extends BaseActivity {

    private android.widget.TextView findPwTxt;
    private TextView textView;
    private android.widget.Button loginBtn;
    private Button signupBtn;
    private android.widget.EditText emailEdt;
    private android.widget.EditText pwEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String loginId = emailEdt.getText().toString();
                final String loginPw = pwEdt.getText().toString();

                ServerUtil.login(mContext, loginId, loginPw, new ServerUtil.JsonResponseHandler() {
                    @Override
                    public void onResponse(JSONObject json) {
                        try {

                            if (json.getBoolean("result")) {
                                if (loginId.equals(json.getJSONObject("user").getString("email")) && loginPw.equals(json.getJSONObject("user").getString("password"))) {
                                    Toast.makeText(mContext, "로그인에 성공했습니다.", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(mContext, MainActivity.class);
                                    startActivity(intent);
                                } else {
                                    if (loginId.equals("")){
                                        Toast.makeText(mContext, "이메일을 입력하세요.", Toast.LENGTH_SHORT).show();
                                    }
                                    if (loginPw.equals("")){
                                        Toast.makeText(mContext, "비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show();
                                    }
                                    if (!loginId.equals(json.getJSONObject("user").getString("email"))){
                                        Toast.makeText(mContext, "일치하는 이메일이 없습니다.", Toast.LENGTH_SHORT).show();
                                    }
                                    if (!loginPw.equals(json.getJSONObject("password"))){
                                        Toast.makeText(mContext, "비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                });
            }
        });

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Dialog dialog = new Dialog(mContext);
//                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
//                dialog.setContentView(R.layout.activity_sign_up);
//                WindowManager.LayoutParams params = dialog.getWindow().getAttributes();
//
//                getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//                params.width = WindowManager.LayoutParams.MATCH_PARENT;
//                params.height = WindowManager.LayoutParams.MATCH_PARENT;
//                dialog.show();
                Intent intent = new Intent(mContext, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.signupBtn = (Button) findViewById(R.id.signupBtn);
        this.findPwTxt = (TextView) findViewById(R.id.findPwTxt);
        this.loginBtn = (Button) findViewById(R.id.loginBtn);
        this.pwEdt = (EditText) findViewById(R.id.pwEdt);
        this.emailEdt = (EditText) findViewById(R.id.emailEdt);
        this.textView = (TextView) findViewById(R.id.textView);
    }
}
