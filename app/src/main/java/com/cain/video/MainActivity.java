package com.cain.video;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video = (VideoView) findViewById(R.id.main_video);
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED) {
//            video.setVideoPath(new File(Environment.DIRECTORY_DOWNLOADS,"HD.mp4").getAbsolutePath());
//              video.start();
//        }else {
//            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},0);
//        }
        video.setVideoURI(Uri.parse("http://mvvideo1.meitudata.com/5704a8ffdf7b14102.mp4"));
        video.start();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
       if (grantResults[0]==PackageManager.PERMISSION_GRANTED){
           video.setVideoPath(new File(Environment.DIRECTORY_DOCUMENTS,"HD.mp4").getAbsolutePath());
           video.start();
       }else {
           finish();
       }
    }
}






























