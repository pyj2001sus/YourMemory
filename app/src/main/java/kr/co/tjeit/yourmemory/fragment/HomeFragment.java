package kr.co.tjeit.yourmemory.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import kr.co.tjeit.yourmemory.FamilyActivity;
import kr.co.tjeit.yourmemory.MakeFamilyActivity;
import kr.co.tjeit.yourmemory.R;
import kr.co.tjeit.yourmemory.SearchActivity;

/**
 * Created by the on 2017-11-23.
 */

public class HomeFragment extends Fragment {


    private android.widget.ImageView familyBtn;
    private android.widget.LinearLayout makeFamilyLayout;
    private android.widget.LinearLayout searchFamilyLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        this.searchFamilyLayout = (LinearLayout) v.findViewById(R.id.searchFamilyLayout);
        this.makeFamilyLayout = (LinearLayout) v.findViewById(R.id.makeFamilyLayout);
        this.familyBtn = (ImageView) v.findViewById(R.id.familyBtn);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setupEvents();
        setValues();
    }


    private void setupEvents() {
        familyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FamilyActivity.class);
                startActivity(intent);
            }
        });

        searchFamilyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
            }
        });

        makeFamilyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MakeFamilyActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setValues() {


    }
}
