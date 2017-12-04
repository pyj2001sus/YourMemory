package kr.co.tjeit.yourmemory;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class WritingActivity extends BaseActivity {

    private android.widget.ImageView backBtn;
    private android.widget.TextView okBtn;
    private android.widget.ImageView pictureBtn;
    private android.widget.ImageView motionPictureBtn;
    private android.widget.ImageView cameraBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });

        pictureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                startActivity(intent);
            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.cameraBtn = (ImageView) findViewById(R.id.cameraBtn);
        this.motionPictureBtn = (ImageView) findViewById(R.id.motionPictureBtn);
        this.pictureBtn = (ImageView) findViewById(R.id.pictureBtn);
        this.okBtn = (TextView) findViewById(R.id.okBtn);
        this.backBtn = (ImageView) findViewById(R.id.backBtn);
    }
}
