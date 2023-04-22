package e5;

import android.widget.Toast;
import com.app.pornhub.R;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import kf.a;

/* loaded from: classes.dex */
public class u implements v8.h<v8.d> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ VideoDetailsActivity f9110c;

    public u(VideoDetailsActivity videoDetailsActivity) {
        this.f9110c = videoDetailsActivity;
    }

    @Override // v8.h
    public void a(v8.d dVar, int i10) {
        kf.a.f12078a.e("Cast ::: onSessionSuspended", new Object[0]);
        Toast.makeText(this.f9110c.getBaseContext(), String.format(this.f9110c.getString(R.string.cast_conn_suspended), dVar.k().f6784m), 1).show();
    }

    @Override // v8.h
    public void e(v8.d dVar, int i10) {
        kf.a.f12078a.e("Cast ::: onSessionResumeFailed", new Object[0]);
    }

    @Override // v8.h
    public void f(v8.d dVar, boolean z10) {
        kf.a.f12078a.e("Cast ::: onSessionResumed", new Object[0]);
        Toast.makeText(this.f9110c.getBaseContext(), String.format(this.f9110c.getString(R.string.cast_connected_to), dVar.k().f6784m), 1).show();
    }

    @Override // v8.h
    public void g(v8.d dVar) {
        kf.a.f12078a.e("Cast ::: onSessionEnding", new Object[0]);
    }

    @Override // v8.h
    public void h(v8.d dVar, String str) {
        a.C0174a c0174a = kf.a.f12078a;
        c0174a.e("Cast ::: onSessionStarted", new Object[0]);
        VideoDetailsActivity videoDetailsActivity = this.f9110c;
        if (videoDetailsActivity.T != null) {
            videoDetailsActivity.c0();
        } else {
            c0174a.c("CAST started but video info not loaded yet", new Object[0]);
        }
    }

    @Override // v8.h
    public void j(v8.d dVar, String str) {
        kf.a.f12078a.e("Cast ::: onSessionResuming", new Object[0]);
    }

    @Override // v8.h
    public void k(v8.d dVar) {
        String str = dVar.k().f6784m;
        kf.a.f12078a.e("Cast ::: onSessionStarting, device name: %s", str);
        this.f9110c.R.f4484e.f4851c.setVisibility(0);
        VideoDetailsActivity videoDetailsActivity = this.f9110c;
        videoDetailsActivity.R.f4484e.f4851c.setText(String.format(videoDetailsActivity.getString(R.string.cast_connecting_to), str));
        this.f9110c.f5558s0.C(false);
    }

    @Override // v8.h
    public void l(v8.d dVar, int i10) {
        kf.a.f12078a.e("Cast ::: onSessionStartFailed", new Object[0]);
        VideoDetailsActivity videoDetailsActivity = this.f9110c;
        videoDetailsActivity.f5543d0 = null;
        videoDetailsActivity.E(VideoDetailsActivity.PlaybackTarget.LOCAL);
        Toast.makeText(this.f9110c.getBaseContext(), this.f9110c.getString(R.string.cast_error_connect_to_device), 1).show();
    }

    @Override // v8.h
    public void n(v8.d dVar, int i10) {
        kf.a.f12078a.e("Cast ::: onSessionEnded", new Object[0]);
        VideoDetailsActivity videoDetailsActivity = this.f9110c;
        videoDetailsActivity.f5543d0 = null;
        videoDetailsActivity.E(VideoDetailsActivity.PlaybackTarget.LOCAL);
    }
}
