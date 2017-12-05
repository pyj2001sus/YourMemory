package kr.co.tjeit.yourmemory;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MakeFamilyActivity extends BaseActivity {

    private android.widget.ImageView backBtn;
    private android.widget.TextView okBtn;
    private LinearLayout imgSettingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_family);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        imgSettingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final CharSequence[] items = {"기본 제공 사진", "앨범에서 사진 선택", "사진 찍기"};
                AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                builder.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        switch (i){
                            case 0 :
                                Toast.makeText(mContext, "기본 제공을 선택했습니다.", Toast.LENGTH_SHORT).show();
                                break;
                            case 1 :
                                Intent intent1 = new Intent(Intent.ACTION_PICK);
                                startActivity(intent1);
                                break;
                            case 2 :
                                Intent intent2 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                                startActivity(intent2);
                                break;
                        }
                    }
                });
                builder.show();
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.imgSettingBtn = (LinearLayout) findViewById(R.id.imgSettingBtn);
        this.okBtn = (TextView) findViewById(R.id.okBtn);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);
    }
}
