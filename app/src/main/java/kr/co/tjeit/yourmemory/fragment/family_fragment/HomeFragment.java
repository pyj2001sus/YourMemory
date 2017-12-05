package kr.co.tjeit.yourmemory.fragment.family_fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import kr.co.tjeit.yourmemory.MainActivity;
import kr.co.tjeit.yourmemory.R;
import kr.co.tjeit.yourmemory.WritingActivity;
import kr.co.tjeit.yourmemory.adapter.NewsfeedAdapter;
import kr.co.tjeit.yourmemory.util.GlobalData;

/**
 * Created by the on 2017-12-05.
 */

public class HomeFragment extends Fragment {

    NewsfeedAdapter mAdapter;
    private android.widget.ImageView backBtn;
    private android.widget.ImageView addNewsBtn;
    private ListView newsListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_family_home, container, false);
        this.newsListView = (ListView) v.findViewById(R.id.newsListView);
        this.addNewsBtn = (ImageView) v.findViewById(R.id.addNewsBtn);
        this.backBtn = (ImageView) v.findViewById(R.id.backBtn);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setValues() {

        mAdapter = new NewsfeedAdapter(getActivity(), GlobalData.newsfeed);
        newsListView.setAdapter(mAdapter);
    }

    private void setupEvents() {

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);

            }
        });

        addNewsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WritingActivity.class);
                startActivity(intent);
            }
        });

    }
}
