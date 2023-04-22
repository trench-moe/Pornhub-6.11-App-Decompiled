package j1;

import android.media.MediaRouter;
import j1.v;

/* loaded from: classes2.dex */
public class w<T extends v> extends MediaRouter.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final T f11362a;

    public w(T t2) {
        this.f11362a = t2;
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f11362a.i(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f11362a.a(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
        this.f11362a.h(routeInfo, routeGroup, i10);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f11362a.d(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        this.f11362a.e(i10, routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f11362a.g(routeInfo, routeGroup);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteUnselected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        this.f11362a.b(i10, routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f11362a.k(routeInfo);
    }
}
