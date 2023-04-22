package j1;

import android.media.MediaRouter;
import j1.y;

/* loaded from: classes2.dex */
public class z<T extends y> extends MediaRouter.VolumeCallback {

    /* renamed from: a  reason: collision with root package name */
    public final T f11363a;

    public z(T t2) {
        this.f11363a = t2;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f11363a.j(routeInfo, i10);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i10) {
        this.f11363a.c(routeInfo, i10);
    }
}
