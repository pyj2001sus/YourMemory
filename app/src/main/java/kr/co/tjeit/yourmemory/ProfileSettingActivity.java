package kr.co.tjeit.yourmemory;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import kr.co.tjeit.yourmemory.adapter.NewsfeedAdapter;
import kr.co.tjeit.yourmemory.adapter.UserAdapter;
import kr.co.tjeit.yourmemory.data.UserData;
import kr.co.tjeit.yourmemory.util.GlobalData;

public class ProfileSettingActivity extends BaseActivity {

    UserAdapter mAdapter;

    private android.widget.ImageView backBtn;
    private android.widget.TextView okBtn;
    private com.mikhaellopez.circularimageview.CircularImageView userProfileImg;
    private android.widget.TextView userNameTxt;
    private android.widget.TextView userBirthdayTxt;
    private android.widget.TextView userEmailTxt;
    private android.widget.TextView userPhoneTxt;
    private android.widget.LinearLayout userInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_setting);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void setValues() {


        mAdapter = new UserAdapter(mContext, GlobalData.user);
    }

    @Override
    public void bindViews() {
        this.userInfo = (LinearLayout) findViewById(R.id.userInfo);
        this.userPhoneTxt = (TextView) findViewById(R.id.userPhoneTxt);
        this.userEmailTxt = (TextView) findViewById(R.id.userEmailTxt);
        this.userBirthdayTxt = (TextView) findViewById(R.id.userBirthdayTxt);
        this.userNameTxt = (TextView) findViewById(R.id.userNameTxt);
        this.userProfileImg = (CircularImageView) findViewById(R.id.userProfileImg);
        this.okBtn = (TextView) findViewById(R.id.okBtn);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);
    }
}
