package kr.co.tjeit.yourmemory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class FamilyActivity extends BaseActivity {

    private android.widget.ImageView backBtn;
    private android.widget.ImageView newsfeedBtn;
    private android.widget.ListView newsListView;

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
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        newsfeedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, WritingActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.newsListView = (ListView) findViewById(R.id.newsListView);
        this.newsfeedBtn = (ImageView) findViewById(R.id.newsfeedBtn);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);
    }
}
