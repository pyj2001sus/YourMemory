package kr.co.tjeit.yourmemory;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends BaseActivity {

    private ImageView homeBtn;
    private ImageView newsfeedBtn;
    private ImageView noticeBtn;
    private ImageView seeMoreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.seeMoreBtn = (ImageView) findViewById(R.id.seeMoreBtn);
        this.noticeBtn = (ImageView) findViewById(R.id.noticeBtn);
        this.newsfeedBtn = (ImageView) findViewById(R.id.newsfeedBtn);
        this.homeBtn = (ImageView) findViewById(R.id.homeBtn);
    }
}
