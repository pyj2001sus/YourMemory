package kr.co.tjeit.yourmemory.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import kr.co.tjeit.yourmemory.ProfileSettingActivity;
import kr.co.tjeit.yourmemory.R;

/**
 * Created by the on 2017-11-23.
 */

public class SeeMoreFragment extends Fragment{

    private android.widget.ImageView backBtn;
    private android.widget.ImageView okBtn;
    private com.mikhaellopez.circularimageview.CircularImageView userProfileImg;
    private android.widget.LinearLayout userInfo;
    private TextView userNameTxt;
    private TextView userBirthdayTxt;
    private TextView userEmailTxt;
    private TextView userPhoneTxt;
    private android.widget.Button profileSettingBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_see_more, container, false);
        this.profileSettingBtn = (Button) v.findViewById(R.id.profileSettingBtn);
        this.userInfo = (LinearLayout) v.findViewById(R.id.userInfo);
        this.userPhoneTxt = (TextView) v.findViewById(R.id.userPhoneTxt);
        this.userEmailTxt = (TextView) v.findViewById(R.id.userEmailTxt);
        this.userBirthdayTxt = (TextView) v.findViewById(R.id.userBirthdayTxt);
        this.userNameTxt = (TextView) v.findViewById(R.id.userNameTxt);
        this.userProfileImg = (CircularImageView) v.findViewById(R.id.userProfileImg);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }

    private void setupEvents() {

        profileSettingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProfileSettingActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setValues() {
    }
}
