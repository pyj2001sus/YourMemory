package kr.co.tjeit.yourmemory;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import kr.co.tjeit.yourmemory.adapter.FamilyAdapter;
import kr.co.tjeit.yourmemory.util.GlobalData;

public class SearchActivity extends BaseActivity {

    FamilyAdapter mAdapter;
    private android.widget.EditText searchEdt;
    private android.widget.ListView searchListView;
    private android.widget.ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
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

    }

    @Override
    public void setValues() {
        mAdapter = new FamilyAdapter(mContext, GlobalData.family);
        searchListView.setAdapter(mAdapter);
    }

    @Override
    public void bindViews() {
        this.searchListView = (ListView) findViewById(R.id.searchListView);
        this.searchEdt = (EditText) findViewById(R.id.searchEdt);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);
    }
}
