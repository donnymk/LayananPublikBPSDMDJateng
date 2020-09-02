package id.go.jatengprov.bpsdmd.layananpublik;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;

//import id.go.jatengprov.bpsdmd.layananpublik.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }*/
    }

    public void activityLayananInformasi(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, LayananInformasiActivity.class);
        startActivity(webviewactivity);
    }

    public void activityInfoStatistik(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, InfoStatistikActivity.class);
        startActivity(webviewactivity);
    }

    public void webviewportal(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id");
        startActivity(webviewactivity);
    }

    public void webviewppid(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/v2/ppid");
        startActivity(webviewactivity);
    }

    public void webviewdaftaronline(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://daftar.bpsdmd.jatengprov.go.id/");
        startActivity(webviewactivity);
    }

    public void webviewrwytdiklat(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/infografis/riwayatdiklat/");
        startActivity(webviewactivity);
    }

    public void webviewopendata(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "http://data.jatengprov.go.id/organization/badan-pengembangan-sumber-daya-manusia-provinsi-jawa-tengah");
        startActivity(webviewactivity);
    }

    public void webviewepublik(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/epublic/");
        startActivity(webviewactivity);
    }

    public void webviewinfosewa(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/infosewa/");
        startActivity(webviewactivity);
    }

    public void webviewagenda(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/siagnes/");
        startActivity(webviewactivity);
    }

}