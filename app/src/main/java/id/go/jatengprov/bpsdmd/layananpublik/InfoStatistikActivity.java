package id.go.jatengprov.bpsdmd.layananpublik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class InfoStatistikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_statistik);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // todo: goto back activity from here

                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void webview_stat_peserta(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://daftar.bpsdmd.jatengprov.go.id/informasi/index.php?halaman=rekappeserta");
        startActivity(webviewactivity);
    }

    public void webview_stat_kelulusan(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://daftar.bpsdmd.jatengprov.go.id/informasi/index.php?halaman=infolulus");
        startActivity(webviewactivity);
    }

    public void webview_stat_alumni(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://daftar.bpsdmd.jatengprov.go.id/informasi/index.php?halaman=statistikalumni");
        startActivity(webviewactivity);
    }

    public void webview_stat_wi(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://pakwi.bpsdmd.jatengprov.go.id/statistik.php");
        startActivity(webviewactivity);
    }

    public void webview_hasil_eval(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://infografis.bpsdmd.jatengprov.go.id/evaluasi-diklat/2018.php");
        startActivity(webviewactivity);
    }

    public void webview_capaian_anggaran(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://infografis.bpsdmd.jatengprov.go.id/anggaran-realtime/");
        startActivity(webviewactivity);
    }

    public void webview_stat_sdm(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "http://36.89.239.53/fika");
        startActivity(webviewactivity);
    }

    public void webview_stat_permohonan_informasi(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://epublic.bpsdmd.jatengprov.go.id/#/grafik");
        startActivity(webviewactivity);
    }
}