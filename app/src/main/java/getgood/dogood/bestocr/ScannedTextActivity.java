package getgood.dogood.bestocr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sourav on 2/14/2018.
 */


public class ScannedTextActivity extends Activity {

    private ImageView mImageviewBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capture_and_scan_layout);

        String scannedText = getIntent().getStringExtra("scannedText");
        TextView textView = (TextView) findViewById(R.id.error_textView);


        mImageviewBack = (ImageView) findViewById(R.id.back_image);
        mImageviewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();
            }
        });
        textView.setText(scannedText);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(ScannedTextActivity.this, RecorgnizeTextActivity.class);
        startActivity(intent);
    }
}
