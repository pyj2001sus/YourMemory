package kr.co.tjeit.yourmemory;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class UserDetailActivity extends BaseActivity {

    private android.widget.TextView userNameTxt;
    private android.widget.TextView userBirthdayTxt;
    private android.widget.TextView userEmailTxt;
    private android.widget.TextView userPhoneTxt;
    private android.widget.ImageView callBtn;
    private ImageView sendEmailBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:01099201087");
                Intent it = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(it);
            }
        });

        sendEmailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("mailto:xxx@abc.com");
                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                startActivity(it);
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.callBtn = (ImageView) findViewById(R.id.callBtn);
        this.userPhoneTxt = (TextView) findViewById(R.id.userPhoneTxt);
        this.sendEmailBtn = (ImageView) findViewById(R.id.sendEmailBtn);
        this.userEmailTxt = (TextView) findViewById(R.id.userEmailTxt);
        this.userBirthdayTxt = (TextView) findViewById(R.id.userBirthdayTxt);
        this.userNameTxt = (TextView) findViewById(R.id.userNameTxt);
    }
}
