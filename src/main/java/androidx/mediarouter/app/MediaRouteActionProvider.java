package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import j1.l;
import java.lang.ref.WeakReference;
import n0.b;

/* loaded from: classes.dex */
public class MediaRouteActionProvider extends n0.b {
    public final j1.l d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2429e;

    /* renamed from: f  reason: collision with root package name */
    public j1.k f2430f;

    /* renamed from: g  reason: collision with root package name */
    public j f2431g;

    /* renamed from: h  reason: collision with root package name */
    public MediaRouteButton f2432h;

    /* loaded from: classes.dex */
    public static final class a extends l.b {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<MediaRouteActionProvider> f2433a;

        public a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.f2433a = new WeakReference<>(mediaRouteActionProvider);
        }

        @Override // j1.l.b
        public void a(j1.l lVar, l.h hVar) {
            l(lVar);
        }

        @Override // j1.l.b
        public void b(j1.l lVar, l.h hVar) {
            l(lVar);
        }

        @Override // j1.l.b
        public void c(j1.l lVar, l.h hVar) {
            l(lVar);
        }

        @Override // j1.l.b
        public void d(j1.l lVar, l.i iVar) {
            l(lVar);
        }

        @Override // j1.l.b
        public void e(j1.l lVar, l.i iVar) {
            l(lVar);
        }

        @Override // j1.l.b
        public void f(j1.l lVar, l.i iVar) {
            l(lVar);
        }

        public final void l(j1.l lVar) {
            MediaRouteActionProvider mediaRouteActionProvider = this.f2433a.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.j();
            } else {
                lVar.i(this);
            }
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.f2430f = j1.k.f11274c;
        this.f2431g = j.f2542a;
        this.d = j1.l.d(context);
        this.f2429e = new a(this);
    }

    @Override // n0.b
    public boolean b() {
        return this.d.h(this.f2430f, 1);
    }

    @Override // n0.b
    public View c() {
        if (this.f2432h != null) {
            Log.e("MRActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        MediaRouteButton mediaRouteButton = new MediaRouteButton(this.f13097a, null);
        this.f2432h = mediaRouteButton;
        mediaRouteButton.setCheatSheetEnabled(true);
        this.f2432h.setRouteSelector(this.f2430f);
        this.f2432h.setAlwaysVisible(false);
        this.f2432h.setDialogFactory(this.f2431g);
        this.f2432h.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.f2432h;
    }

    @Override // n0.b
    public boolean e() {
        MediaRouteButton mediaRouteButton = this.f2432h;
        if (mediaRouteButton != null) {
            return mediaRouteButton.d();
        }
        return false;
    }

    public void j() {
        if (this.f13099c != null && g()) {
            b.InterfaceC0217b interfaceC0217b = this.f13099c;
            b();
            androidx.appcompat.view.menu.e eVar = androidx.appcompat.view.menu.g.this.n;
            eVar.f648h = true;
            eVar.p(true);
        }
    }
}
