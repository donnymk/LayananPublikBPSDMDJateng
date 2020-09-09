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
        webviewactivity.putExtra("title", "Statistik Peserta Pelatihan");
        startActivity(webviewactivity);
    }

    public void webview_stat_kelulusan(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://daftar.bpsdmd.jatengprov.go.id/informasi/index.php?halaman=infolulus");
        webviewactivity.putExtra("title", "Statistik Kelulusan Peserta");
        startActivity(webviewactivity);
    }

    public void webview_stat_alumni(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://daftar.bpsdmd.jatengprov.go.id/informasi/index.php?halaman=statistikalumni");
        webviewactivity.putExtra("title", "Statistik Alumni");
        startActivity(webviewactivity);
    }

    public void webview_stat_wi(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://pakwi.bpsdmd.jatengprov.go.id/statistik.php");
        webviewactivity.putExtra("title", "Statistik Widyaiswara");
        startActivity(webviewactivity);
    }

    public void webview_hasil_eval(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://infografis.bpsdmd.jatengprov.go.id/evaluasi-diklat/2018.php");
        webviewactivity.putExtra("title", "Hasil Evaluasi Pelatihan");
        startActivity(webviewactivity);
    }

    public void webview_capaian_anggaran(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://infografis.bpsdmd.jatengprov.go.id/anggaran-realtime/");
        webviewactivity.putExtra("title", "Capaian Anggaran");
        startActivity(webviewactivity);
    }

    public void webview_stat_sdm(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "http://36.89.239.53/fika");
        webviewactivity.putExtra("title", "Statistik SDM");
        startActivity(webviewactivity);
    }

    public void webview_stat_permohonan_informasi(View view) {
        Intent webviewactivity= new Intent(InfoStatistikActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://epublic.bpsdmd.jatengprov.go.id/#/grafik");
        webviewactivity.putExtra("title", "Statistik Permohonan Informasi");
        startActivity(webviewactivity);
    }
}