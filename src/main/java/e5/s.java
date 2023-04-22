package e5;

import com.app.pornhub.R;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes.dex */
public class s implements io.realm.r<io.realm.y<r3.d>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoDetailsActivity f9108a;

    public s(VideoDetailsActivity videoDetailsActivity) {
        this.f9108a = videoDetailsActivity;
    }

    @Override // io.realm.r
    public void a(io.realm.y<r3.d> yVar) {
        io.realm.y<r3.d> yVar2 = yVar;
        kf.a.f12078a.a("RealmVideoResults has triggered a change listener: %s, \nINSTANCE ::: %s VKEY ::: %s", yVar2, this, this.f9108a.T.getVkey());
        if (yVar2.f10977m.g()) {
            if (yVar2.isEmpty()) {
                this.f9108a.V = null;
            } else {
                r3.d b10 = yVar2.b(true, null);
                if (b10 != null && io.realm.v.w(b10)) {
                    r3.d dVar = this.f9108a.V;
                    if (dVar != null && dVar.p().equals(b10.p())) {
                        return;
                    }
                    VideoDetailsActivity videoDetailsActivity = this.f9108a;
                    if (videoDetailsActivity.V == null) {
                        videoDetailsActivity.V = b10;
                        Snackbar k10 = Snackbar.k(videoDetailsActivity.R.f4490k, R.string.video_added_to_lib, 0);
                        k10.m(R.string.undo, new x3.a(this, 13));
                        k10.n();
                    }
                }
            }
        }
        this.f9108a.invalidateOptionsMenu();
    }
}
