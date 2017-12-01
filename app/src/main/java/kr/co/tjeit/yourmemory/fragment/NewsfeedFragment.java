package kr.co.tjeit.yourmemory.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import kr.co.tjeit.yourmemory.R;
import kr.co.tjeit.yourmemory.adapter.NewsfeedAdapter;
import kr.co.tjeit.yourmemory.util.GlobalData;

/**
 * Created by the on 2017-11-23.
 */

public class NewsfeedFragment extends Fragment {

    NewsfeedAdapter mAdapter;
    private android.widget.ListView newsListView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_news_feed, container, false);
        this.newsListView = (ListView) v.findViewById(R.id.newsListView);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }


    private void setupEvents() {

    }

    private void setValues() {

        mAdapter = new NewsfeedAdapter(getActivity(), GlobalData.newsfeed);
        newsListView.setAdapter(mAdapter);

    }

}
