package kr.co.tjeit.yourmemory.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import kr.co.tjeit.yourmemory.R;
import kr.co.tjeit.yourmemory.data.NewsData;

/**
 * Created by the on 2017-11-27.
 */

public class NewsfeedAdapter extends ArrayAdapter<NewsData> {

    Context mContext;
    List<NewsData> mList;
    LayoutInflater inf;

    public NewsfeedAdapter(Context context, List<NewsData> list) {
        super(context, R.layout.news_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.news_list_item, null);
        }

        NewsData data = mList.get(position);


        return row;
    }

}

