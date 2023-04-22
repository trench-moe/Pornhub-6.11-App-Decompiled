package com.app.pornhub.view.offline;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.q0;
import androidx.emoji2.text.l;
import com.app.pornhub.databinding.ActivityOfflineVideoPlayerBinding;
import com.app.pornhub.view.offline.OfflineVideoPlayerActivity;
import com.app.pornhub.view.offline.a;
import f3.o;
import f4.c;
import fr.maxcom.http.FileDataSource;
import fr.maxcom.http.a;
import io.realm.Case;
import io.realm.RealmQuery;
import io.realm.p;
import io.realm.v;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import kf.a;
import r3.d;
import t3.e;
import t3.k;
import w6.c0;
import w6.n0;
import w6.v0;
import x4.g;
import x4.h;

/* loaded from: classes.dex */
public class OfflineVideoPlayerActivity extends v3.b implements a.InterfaceC0057a {
    public static final /* synthetic */ int T = 0;
    public o K;
    public ActivityOfflineVideoPlayerBinding L;
    public fr.maxcom.http.b M;
    public Timer N;
    public Timer O;
    public final Handler P = new Handler();
    public boolean Q;
    public n0 R;
    public int S;

    /* loaded from: classes.dex */
    public class a extends TimerTask {
        public a(g gVar) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            OfflineVideoPlayerActivity.this.P.post(new q0(this, 8));
        }
    }

    /* loaded from: classes.dex */
    public class b extends TimerTask {
        public b(g gVar) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            OfflineVideoPlayerActivity.this.P.post(new l(this, 1));
        }
    }

    public static void C(OfflineVideoPlayerActivity offlineVideoPlayerActivity) {
        offlineVideoPlayerActivity.H();
        Timer timer = new Timer();
        offlineVideoPlayerActivity.N = timer;
        timer.scheduleAtFixedRate(new b(null), 100L, 1000L);
        kf.a.f12078a.e("Restarted TrickPlay Timer", new Object[0]);
    }

    public static void D(OfflineVideoPlayerActivity offlineVideoPlayerActivity, boolean z10) {
        offlineVideoPlayerActivity.Q = z10;
        offlineVideoPlayerActivity.L.f4435b.setVisibility(z10 ? 0 : 4);
    }

    public final void E(boolean z10) {
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        if (z10) {
            getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility | 4102);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility & (-4103));
        }
    }

    public void F(boolean z10) {
        int i10 = 4;
        this.L.f4437e.setVisibility(z10 ? 4 : 0);
        ProgressBar progressBar = this.L.f4438f;
        if (z10) {
            i10 = 0;
        }
        progressBar.setVisibility(i10);
    }

    public final void G() {
        Timer timer = this.O;
        if (timer != null) {
            timer.cancel();
        }
    }

    public final void H() {
        kf.a.f12078a.e("Stopped TrickPlay Timer", new Object[0]);
        Timer timer = this.N;
        if (timer != null) {
            timer.cancel();
        }
    }

    public void I(int i10, int i11) {
        this.L.f4439g.setProgress(i10);
        this.L.f4439g.setMax(i11);
        this.L.f4440h.setText(t3.o.e(i10));
        this.L.f4436c.setText(t3.o.e(i11));
    }

    @Override // com.app.pornhub.view.offline.a.InterfaceC0057a
    public void f() {
        finish();
    }

    @Override // v3.b, y4.a
    public void i() {
    }

    @Override // com.app.pornhub.view.offline.a.InterfaceC0057a
    public void k() {
        finish();
    }

    @Override // e.g, androidx.fragment.app.o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        E(configuration.orientation == 2);
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityOfflineVideoPlayerBinding inflate = ActivityOfflineVideoPlayerBinding.inflate(getLayoutInflater());
        this.L = inflate;
        setContentView(inflate.f4434a);
        this.L.f4437e.setOnClickListener(new u3.a(this, 15));
        this.L.d.setOnClickListener(new b4.b(this, 13));
        v0 a10 = new v0.b(this).a();
        this.R = a10;
        this.L.f4441i.setPlayer(a10);
        setVolumeControlStream(3);
        this.R.o(new h(this));
        this.L.f4434a.setOnTouchListener(new View.OnTouchListener() { // from class: x4.f
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                OfflineVideoPlayerActivity offlineVideoPlayerActivity = OfflineVideoPlayerActivity.this;
                int i10 = OfflineVideoPlayerActivity.T;
                Objects.requireNonNull(offlineVideoPlayerActivity);
                if (motionEvent.getAction() != 0 || offlineVideoPlayerActivity.Q) {
                    return false;
                }
                offlineVideoPlayerActivity.Q = true;
                offlineVideoPlayerActivity.L.f4435b.setVisibility(0);
                offlineVideoPlayerActivity.G();
                Timer timer = new Timer();
                offlineVideoPlayerActivity.O = timer;
                timer.schedule(new OfflineVideoPlayerActivity.a(null), 3000L);
                return true;
            }
        });
        this.L.f4439g.setOnSeekBarChangeListener(new g(this));
        String stringExtra = getIntent().getStringExtra("vkey");
        if (!TextUtils.isEmpty(stringExtra)) {
            p t2 = p.t();
            RealmQuery h10 = a0.a.h(t2, t2, d.class);
            Case r42 = Case.SENSITIVE;
            h10.f10812a.e();
            h10.c("vkey", stringExtra, r42);
            d dVar = (d) h10.e();
            if (dVar == null || !v.w(dVar)) {
                kf.a.f12078a.a("No local video file found with this vkey %s", stringExtra);
            } else if (dVar.x()) {
                Object[] objArr = {dVar.t()};
                a.C0174a c0174a = kf.a.f12078a;
                c0174a.a("Found this video on the device, using the local file uri: %s", objArr);
                c0174a.e("Setting local video URI %s", dVar.t());
                int c10 = dVar.c() * 1000;
                this.S = c10;
                I(0, c10);
                try {
                    File file = new File(dVar.t());
                    if (file.exists()) {
                        this.M = new fr.maxcom.http.b();
                        k kVar = new k();
                        kVar.f15119a = e.b(this);
                        fr.maxcom.http.b bVar = this.M;
                        ((FileDataSource) bVar.f9638e).f9592f = kVar;
                        Thread thread = new Thread(new a.c(null));
                        bVar.f9639f = thread;
                        thread.start();
                        this.R.y(c0.b(this.M.a(file.getPath())));
                        this.R.f();
                        this.R.C(true);
                    } else {
                        String p10 = dVar.p();
                        String str = com.app.pornhub.view.offline.a.E0;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("vkey", p10);
                        com.app.pornhub.view.offline.a aVar = new com.app.pornhub.view.offline.a();
                        aVar.A0(bundle2);
                        aVar.Q0(u(), com.app.pornhub.view.offline.a.E0);
                    }
                } catch (IOException e10) {
                    kf.a.f12078a.d(e10, "Failed to set local video URI %s", dVar.t());
                    e10.printStackTrace();
                }
                t2.close();
            }
            t2.close();
        }
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new c(this, 1));
        if (!this.K.a().isAutoRotateEnabled()) {
            setRequestedOrientation(1);
        }
    }

    @Override // y4.b, androidx.fragment.app.o, android.app.Activity
    public void onPause() {
        super.onPause();
        H();
        G();
        this.R.pause();
        fr.maxcom.http.b bVar = this.M;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // y4.b, androidx.fragment.app.o, android.app.Activity
    public void onResume() {
        E(getResources().getConfiguration().orientation == 2);
        super.onResume();
    }
}
