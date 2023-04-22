package x8;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import u8.n;

/* loaded from: classes2.dex */
public final class j extends MediaSessionCompat.a {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f18074f;

    public j(k kVar) {
        this.f18074f = kVar;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final boolean b(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            if (keyEvent.getKeyCode() != 127) {
                if (keyEvent.getKeyCode() == 126) {
                }
            }
            this.f18074f.y.v();
        }
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void c() {
        this.f18074f.y.v();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void d() {
        this.f18074f.y.v();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void e(long j10) {
        this.f18074f.y.u(new n(j10, 0, false, null));
    }
}
