package sg.edu.rp.c346.id18015938.demomywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText etUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);
        etUrl = findViewById(R.id.editTextURL);

        wvMyPage.setWebViewClient(new WebViewClient());

        wvMyPage.getSettings().setJavaScriptEnabled(true);
        wvMyPage.getSettings().setAllowFileAccess(false);
        wvMyPage.getSettings().getBuiltInZoomControls();

        btnLoadURL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String url_input = etUrl.getText().toString();

                String url = url_input;
                wvMyPage.loadUrl(url);
            }
        });
    }
}
