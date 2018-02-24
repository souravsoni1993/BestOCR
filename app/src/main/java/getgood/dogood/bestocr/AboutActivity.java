package getgood.dogood.bestocr;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sourav on 2/21/2018.
 */

public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_layout);

        ImageView back_imageView=(ImageView)findViewById(R.id.back_image);

        TextView textView=(TextView)findViewById(R.id.title_of_bar);
        textView.setText("About");
        back_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();
            }
        });

    }

    public void onclick(View view)
    {
        if(R.id.textView_linkedin== view.getId())
        {
            String url = "https://www.linkedin.com/in/sourav-soni-b4875793?trk=nav_responsive_tab_profile_pic";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        if(R.id.textView_facebook== view.getId())
        {
            String url = "https://www.facebook.com/sourav.soni.77";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }


        if(R.id.textView_twitter== view.getId())
        {
            String url = "https://twitter.com/souravsonirjit9";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }


        if(R.id.textView_playstore== view.getId())
        {
            final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
            }
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent=new Intent(AboutActivity.this,RecorgnizeTextActivity.class);
        startActivity(intent);
        finish();
    }
}

