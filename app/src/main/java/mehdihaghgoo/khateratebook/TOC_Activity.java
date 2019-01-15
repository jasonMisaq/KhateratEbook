package mehdihaghgoo.khateratebook;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

public class TOC_Activity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "mehdihaghgoo.khateratebook.MESSAGE";
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showCover(View view) {
        intent=new Intent(this, BookViewActivity.class);
        intent.putExtra(EXTRA_MESSAGE,R.id.btn_cover_id);
        startActivity(intent);

    }

    public void showPreface(View view) {
        intent=new Intent(this, BookViewActivity.class);
        intent.putExtra(EXTRA_MESSAGE,R.id.btn_intro_id);
        startActivity(intent);
    }

    public void showCh01(View view) {
        intent=new Intent(this, BookViewActivity.class);
        intent.putExtra(EXTRA_MESSAGE,R.id.btn_ch01_id);
        startActivity(intent);
    }
    public void showCh02(View view) {
        intent=new Intent(this, BookViewActivity.class);
        intent.putExtra(EXTRA_MESSAGE,R.id.btn_ch02_id);
        startActivity(intent);
    }
    public void showCh03(View view) {
        intent=new Intent(this, BookViewActivity.class);
        intent.putExtra(EXTRA_MESSAGE,R.id.btn_ch03_id);
        startActivity(intent);
    }
    public void showCh04(View view) {
        intent=new Intent(this, BookViewActivity.class);
        intent.putExtra(EXTRA_MESSAGE,R.id.btn_ch04_id);
        startActivity(intent);
    }
    public void showCh05(View view) {
        intent=new Intent(this, BookViewActivity.class);
        intent.putExtra(EXTRA_MESSAGE,R.id.btn_ch05_id);
        startActivity(intent);
    }
    public void showAboutMe(View view){
        intent=new Intent(this, BookViewActivity.class);
        intent.putExtra(EXTRA_MESSAGE,R.id.btn_about_me_id);
        startActivity(intent);

    }

    public void showAboutApp(View view) {
        intent=new Intent(this, BookViewActivity.class);
        intent.putExtra(EXTRA_MESSAGE,R.id.btn_about_app_id);
        startActivity(intent);
    }
}