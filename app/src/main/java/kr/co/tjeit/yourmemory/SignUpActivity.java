package kr.co.tjeit.yourmemory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends BaseActivity {

    private android.widget.TextView textView2;
    private android.widget.Button signupBtn;
    private Button checkDuplBtn;
    private Button test;

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
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.test = (Button) findViewById(R.id.test);
        this.textView2 = (TextView) findViewById(R.id.textView2);
        this.checkDuplBtn = (Button) findViewById(R.id.checkDuplBtn);
    }
}
