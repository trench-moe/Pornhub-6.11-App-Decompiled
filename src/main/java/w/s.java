package w;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import java.util.Iterator;
import java.util.Objects;
import k8.c0;
import k8.r;
import l8.r;
import w6.o0;
import w6.w;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f16357c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f16358f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f16359j;

    public /* synthetic */ s(Object obj, Object obj2, int i10) {
        this.f16357c = i10;
        this.f16358f = obj;
        this.f16359j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.f16357c) {
            case 0:
                androidx.constraintlayout.motion.widget.c cVar = (androidx.constraintlayout.motion.widget.c) this.f16358f;
                View[] viewArr = (View[]) this.f16359j;
                if (cVar.f1506p != -1) {
                    for (View view : viewArr) {
                        view.setTag(cVar.f1506p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (cVar.f1507q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(cVar.f1507q, null);
                    }
                    return;
                }
                return;
            case 1:
                w wVar = (w) this.f16358f;
                o0 o0Var = (o0) this.f16359j;
                Objects.requireNonNull(wVar);
                try {
                    wVar.b(o0Var);
                    return;
                } catch (ExoPlaybackException e10) {
                    k8.a.i("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 2:
                c.a aVar = (c.a) this.f16358f;
                ((com.google.android.exoplayer2.drm.c) this.f16359j).k0(aVar.f6181a, aVar.f6182b);
                return;
            case 3:
                android.support.v4.media.a.n(this.f16358f);
                throw null;
            case 4:
                k8.r rVar = (k8.r) this.f16358f;
                r.b bVar = (r.b) this.f16359j;
                synchronized (rVar.f12003c) {
                    i10 = rVar.d;
                }
                bVar.a(i10);
                return;
            case 5:
                l8.r rVar2 = ((r.a) this.f16358f).f12741b;
                int i11 = c0.f11939a;
                rVar2.H((z6.d) this.f16359j);
                return;
            default:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.f16358f;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f16359j;
                SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.f6748u;
                Surface surface = sphericalGLSurfaceView.f6749w;
                Surface surface2 = new Surface(surfaceTexture);
                sphericalGLSurfaceView.f6748u = surfaceTexture;
                sphericalGLSurfaceView.f6749w = surface2;
                Iterator<SphericalGLSurfaceView.b> it = sphericalGLSurfaceView.f6743c.iterator();
                while (it.hasNext()) {
                    it.next().u(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
        }
    }
}
