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
import kr.co.tjeit.yourmemory.data.NoticeData;
import kr.co.tjeit.yourmemory.data.UserData;

/**
 * Created by the on 2017-11-30.
 */

public class UserAdapter extends ArrayAdapter<UserData>{

    Context mContext;
    List<UserData> mList;
    LayoutInflater inf;

    public UserAdapter(Context context, List<UserData> list) {
        super(context, R.layout.activity_user_detail, list);

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

        UserData data = mList.get(position);

        return row;
    }
}
