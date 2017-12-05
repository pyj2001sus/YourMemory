package kr.co.tjeit.yourmemory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;

import kr.co.tjeit.yourmemory.adapter.NewsfeedAdapter;
import kr.co.tjeit.yourmemory.fragment.NewsfeedFragment;
import kr.co.tjeit.yourmemory.util.GlobalData;

public class FamilyActivity extends BaseActivity {

    NewsfeedAdapter mAdapter;
    private android.widget.ImageView backBtn;
    private android.widget.ImageView newsfeedBtn;
    private android.widget.ListView newsListView;
    private ImageView addNewsBtn;
    private ImageView calendarBtn;
    private ImageView accountBtn;
    private ImageView seeMoreBtn;
    private android.widget.FrameLayout homeFragment;
    private android.widget.FrameLayout calendarFragment;
    private android.widget.FrameLayout accountFragment;
    private android.widget.FrameLayout seeMoreFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        newsfeedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeFragment.setVisibility(View.VISIBLE);
                calendarFragment.setVisibility(View.GONE);
                accountFragment.setVisibility(View.GONE);
                seeMoreFragment.setVisibility(View.GONE);
            }
        });

        calendarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeFragment.setVisibility(View.GONE);
                calendarFragment.setVisibility(View.VISIBLE);
                accountFragment.setVisibility(View.GONE);
                seeMoreFragment.setVisibility(View.GONE);
            }
        });


        accountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeFragment.setVisibility(View.GONE);
                calendarFragment.setVisibility(View.GONE);
                accountFragment.setVisibility(View.VISIBLE);
                seeMoreFragment.setVisibility(View.GONE);
            }
        });


        seeMoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeFragment.setVisibility(View.GONE);
                calendarFragment.setVisibility(View.GONE);
                accountFragment.setVisibility(View.GONE);
                seeMoreFragment.setVisibility(View.VISIBLE);
            }
        });



    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.seeMoreBtn = (ImageView) findViewById(R.id.seeMoreBtn);
        this.accountBtn = (ImageView) findViewById(R.id.accountBtn);
        this.calendarBtn = (ImageView) findViewById(R.id.calendarBtn);
        this.newsfeedBtn = (ImageView) findViewById(R.id.newsfeedBtn);
        this.seeMoreFragment = (FrameLayout) findViewById(R.id.seeMoreFragment);
        this.accountFragment = (FrameLayout) findViewById(R.id.accountFragment);
        this.calendarFragment = (FrameLayout) findViewById(R.id.calendarFragment);
        this.homeFragment = (FrameLayout) findViewById(R.id.homeFragment);
    }
}
