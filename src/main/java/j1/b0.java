package j1;

import android.media.MediaRouter;
import j1.a0;

/* loaded from: classes2.dex */
public class b0<T extends a0> extends w<T> {
    public b0(T t2) {
        super(t2);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        ((a0) this.f11362a).f(routeInfo);
    }
}
