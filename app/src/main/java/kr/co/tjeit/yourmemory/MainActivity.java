package kr.co.tjeit.yourmemory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private ImageView homeBtn;
    private ImageView newsfeedBtn;
    private ImageView noticeBtn;
    private ImageView seeMoreBtn;
    private android.widget.FrameLayout homeFragment;
    private android.widget.FrameLayout newsfeedFragment;
    private android.widget.FrameLayout noticeFragment;
    private android.widget.FrameLayout seeMoreFragment;
    private ImageView mainBtn;
    private android.widget.TextView mainTxt;
    private ImageView imageBtn1;
    private ImageView imageBtn2;
    private ImageView imageBtn3;
    private ImageView searchBtn;
    private ImageView plusBtn;
    private ImageView writingBtn;
    private ImageView settingBtn;

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

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, SearchActivity.class);
                startActivity(intent);
            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MakeFamilyActivity.class);
                startActivity(intent);
            }
        });

        writingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, WritingActivity.class);
                startActivity(intent);
            }
        });

        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchBtn.setVisibility(View.VISIBLE);
                plusBtn.setVisibility(View.VISIBLE);
                writingBtn.setVisibility(View.GONE);
                mainTxt.setVisibility(View.GONE);
                homeFragment.setVisibility(View.VISIBLE);
                newsfeedFragment.setVisibility(View.GONE);
                noticeFragment.setVisibility(View.GONE);
                seeMoreFragment.setVisibility(View.GONE);
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchBtn.setVisibility(View.VISIBLE);
                plusBtn.setVisibility(View.VISIBLE);
                writingBtn.setVisibility(View.GONE);
                mainTxt.setVisibility(View.GONE);
                homeFragment.setVisibility(View.VISIBLE);
                newsfeedFragment.setVisibility(View.GONE);
                noticeFragment.setVisibility(View.GONE);
                seeMoreFragment.setVisibility(View.GONE);
            }
        });

        newsfeedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchBtn.setVisibility(View.VISIBLE);
                plusBtn.setVisibility(View.GONE);
                writingBtn.setVisibility(View.VISIBLE);
                mainTxt.setVisibility(View.VISIBLE);
                mainTxt.setText("새소식");
                homeFragment.setVisibility(View.GONE);
                newsfeedFragment.setVisibility(View.VISIBLE);
                noticeFragment.setVisibility(View.GONE);
                seeMoreFragment.setVisibility(View.GONE);
            }
        });

        noticeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchBtn.setVisibility(View.GONE);
                plusBtn.setVisibility(View.GONE);
                writingBtn.setVisibility(View.GONE);
                mainTxt.setVisibility(View.VISIBLE);
                mainTxt.setVisibility(View.VISIBLE);
                mainTxt.setText("알림");
                homeFragment.setVisibility(View.GONE);
                newsfeedFragment.setVisibility(View.GONE);
                noticeFragment.setVisibility(View.VISIBLE);
                seeMoreFragment.setVisibility(View.GONE);
            }
        });

        seeMoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchBtn.setVisibility(View.GONE);
                plusBtn.setVisibility(View.GONE);
                writingBtn.setVisibility(View.GONE);
                mainTxt.setVisibility(View.VISIBLE);
                mainTxt.setVisibility(View.VISIBLE);
                mainTxt.setText("더 보기");
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
        this.writingBtn = (ImageView) findViewById(R.id.writingBtn);
        this.plusBtn = (ImageView) findViewById(R.id.plusBtn);
        this.searchBtn = (ImageView) findViewById(R.id.searchBtn);
        this.mainTxt = (TextView) findViewById(R.id.mainTxt);
        this.mainBtn = (ImageView) findViewById(R.id.mainBtn);
    }
}
