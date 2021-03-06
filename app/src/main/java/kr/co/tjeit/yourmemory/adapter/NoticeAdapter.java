package kr.co.tjeit.yourmemory.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import kr.co.tjeit.yourmemory.R;
import kr.co.tjeit.yourmemory.data.NewsData;
import kr.co.tjeit.yourmemory.data.NoticeData;

/**
 * Created by the on 2017-11-28.
 */

public class NoticeAdapter extends ArrayAdapter<NoticeData> {

    Context mContext;
    List<NoticeData> mList;
    LayoutInflater inf;

    public NoticeAdapter(Context context, List<NoticeData> list) {
        super(context, R.layout.notice_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.notice_list_item, null);
        }

        NoticeData data = mList.get(position);


        return row;
    }
}
