package com.example.app;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity{
    ImageView imageView;
    Animation anim1,anim2;
    int count=0;
    LinearLayout screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        anim1 = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim2 = AnimationUtils.loadAnimation(this, R.anim.translate_1);
        screen.setOnClickListener(o);
    }
    View.OnClickListener o = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(count%2==0){
                animation();
            }
            if(count%2==1){
                animation_2();
            }
        }
    };
    public void animation(){
        imageView.startAnimation(anim1);
        anim1.setAnimationListener(new AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }
            @Override
            public void onAnimationEnd(Animation animation) {
                count = count+1;
            }
            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
   }
   public void animation_2(){
     imageView.startAnimation(anim2);
        anim2.setAnimationListener(new AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }
            @Override
            public void onAnimationEnd(Animation animation) {
                count = count+1;
            }
            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }
}