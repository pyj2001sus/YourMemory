package kr.co.tjeit.yourmemory.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Locale;

import kr.co.tjeit.yourmemory.NewsfeedDetailActivity;
import kr.co.tjeit.yourmemory.R;
import kr.co.tjeit.yourmemory.UserDetailActivity;
import kr.co.tjeit.yourmemory.data.NewsData;
import kr.co.tjeit.yourmemory.util.GlobalData;

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
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.news_list_item, null);
        }

        final NewsData data = mList.get(position);

        TextView title = (TextView) row.findViewById(R.id.title);
        ImageView userProfileImg = (ImageView) row.findViewById(R.id.userProfileImg);
        TextView userName = (TextView) row.findViewById(R.id.userName);
        TextView minuteAgo = (TextView) row.findViewById(R.id.minuteAgo);
        TextView contentTxt = (TextView) row.findViewById(R.id.contentTxt);
        ImageView contentImg = (ImageView) row.findViewById(R.id.contentImg);
        ImageView likeImg = (ImageView) row.findViewById(R.id.likeImg);
        TextView likeCountTxt = (TextView) row.findViewById(R.id.likeCountTxt);
        TextView replyTxt = (TextView) row.findViewById(R.id.replyTxt);
        TextView shareTxt = (TextView) row.findViewById(R.id.shareTxt);
        TextView viewCount = (TextView) row.findViewById(R.id.viewCount);
        LinearLayout likeBtn = (LinearLayout) row.findViewById(R.id.likeBtn);
        LinearLayout shareBtn = (LinearLayout) row.findViewById(R.id.shareBtn);
        LinearLayout newsfeedLayout = (LinearLayout) row.findViewById(R.id.newsfeedLayout);


        title.setText(data.getTitle());
        Glide.with(mContext).load(data.getUserProfileURL()).into(userProfileImg);
        userName.setText(data.getUserName());
        minuteAgo.setText(data.getMinuteAgo()+" 분 전");
        contentTxt.setText(data.getContent());
        Glide.with(mContext).load(data.getNewsImageURL()).into(contentImg);

        likeCountTxt.setText(data.getLikeCount()+"");
        replyTxt.setText("댓글 "+data.getReplyCount());
        shareTxt.setText("공유 "+data.getShareCount());
        viewCount.setText(data.getLookUpCount()+"");

        likeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "회원님이 해당 개시물을 좋아합니다.", Toast.LENGTH_SHORT).show();
            }
        });

        newsfeedLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, NewsfeedDetailActivity.class);
                mContext.startActivity(intent);
            }
        });


        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent msg = new Intent(Intent.ACTION_SEND);
                msg.addCategory(Intent.CATEGORY_DEFAULT);
                msg.putExtra(Intent.EXTRA_SUBJECT, data.getTitle());
                msg.putExtra(Intent.EXTRA_TEXT, data.getContent());
                msg.putExtra(Intent.EXTRA_STREAM, data.getNewsImageURL());
                msg.setType("text/plain");
                mContext.startActivity(Intent.createChooser(msg, "공유하기"));
            }
        });

        userProfileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, UserDetailActivity.class);
                mContext.startActivity(intent);
            }
        });

        userName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, UserDetailActivity.class);
                mContext.startActivity(intent);
            }
        });

        return row;
    }


}

