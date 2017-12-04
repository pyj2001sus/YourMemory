package kr.co.tjeit.yourmemory.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

import kr.co.tjeit.yourmemory.NewsfeedDetailActivity;
import kr.co.tjeit.yourmemory.R;
import kr.co.tjeit.yourmemory.UserDetailActivity;
import kr.co.tjeit.yourmemory.data.FamilyData;
import kr.co.tjeit.yourmemory.data.NewsData;

/**
 * Created by the on 2017-12-04.
 */

public class FamilyAdapter  extends ArrayAdapter<FamilyData> {

    Context mContext;
    List<FamilyData> mList;
    LayoutInflater inf;

    public FamilyAdapter(Context context, List<FamilyData> list) {
        super(context, R.layout.search_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.search_list_item, null);
        }

        final FamilyData data = mList.get(position);


        return row;
    }


}
