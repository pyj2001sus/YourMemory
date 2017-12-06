package kr.co.tjeit.yourmemory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONObject;

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

                ServerUtil.login(mContext, emailEdt.getText().toString(), pwEdt.getText().toString(), new ServerUtil.JsonResponseHandler() {
                    @Override
                    public void onResponse(JSONObject json) {
                        Intent intent = new Intent(mContext, MainActivity.class);
                        startActivity(intent);
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
