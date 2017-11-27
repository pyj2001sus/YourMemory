package kr.co.tjeit.yourmemory;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends BaseActivity {

    private ImageView homeBtn;
    private ImageView newsfeedBtn;
    private ImageView noticeBtn;
    private ImageView seeMoreBtn;
    private android.widget.FrameLayout homeFragment;
    private android.widget.FrameLayout newsfeedFragment;
    private android.widget.FrameLayout noticeFragment;
    private android.widget.FrameLayout seeMoreFragment;

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

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeFragment.setVisibility(View.VISIBLE);
                newsfeedFragment.setVisibility(View.GONE);
                noticeFragment.setVisibility(View.GONE);
                seeMoreFragment.setVisibility(View.GONE);
            }
        });

        newsfeedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeFragment.setVisibility(View.GONE);
                newsfeedFragment.setVisibility(View.VISIBLE);
                noticeFragment.setVisibility(View.GONE);
                seeMoreFragment.setVisibility(View.GONE);
            }
        });

        noticeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeFragment.setVisibility(View.GONE);
                newsfeedFragment.setVisibility(View.GONE);
                noticeFragment.setVisibility(View.VISIBLE);
                seeMoreFragment.setVisibility(View.GONE);
            }
        });

        seeMoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeFragment.setVisibility(View.GONE);
                newsfeedFragment.setVisibility(View.GONE);
                noticeFragment.setVisibility(View.GONE);
                seeMoreFragment.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.seeMoreFragment = (FrameLayout) findViewById(R.id.seeMoreFragment);
        this.noticeFragment = (FrameLayout) findViewById(R.id.noticeFragment);
        this.newsfeedFragment = (FrameLayout) findViewById(R.id.newsfeedFragment);
        this.homeFragment = (FrameLayout) findViewById(R.id.homeFragment);
        this.seeMoreBtn = (ImageView) findViewById(R.id.seeMoreBtn);
        this.noticeBtn = (ImageView) findViewById(R.id.noticeBtn);
        this.newsfeedBtn = (ImageView) findViewById(R.id.newsfeedBtn);
        this.homeBtn = (ImageView) findViewById(R.id.homeBtn);
    }
}
