package j1;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import j1.f;
import j1.h;
import j1.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class j0 extends h {

    /* loaded from: classes2.dex */
    public static class a extends d {
        public a(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // j1.j0.d, j1.j0.c, j1.j0.b
        public void B(b.C0163b c0163b, f.a aVar) {
            super.B(c0163b, aVar);
            aVar.f11174a.putInt("deviceType", ((MediaRouter.RouteInfo) c0163b.f11269a).getDeviceType());
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends j0 implements v, y {

        /* renamed from: s  reason: collision with root package name */
        public static final ArrayList<IntentFilter> f11257s;

        /* renamed from: t  reason: collision with root package name */
        public static final ArrayList<IntentFilter> f11258t;

        /* renamed from: i  reason: collision with root package name */
        public final e f11259i;

        /* renamed from: j  reason: collision with root package name */
        public final Object f11260j;

        /* renamed from: k  reason: collision with root package name */
        public final Object f11261k;

        /* renamed from: l  reason: collision with root package name */
        public final Object f11262l;

        /* renamed from: m  reason: collision with root package name */
        public final Object f11263m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f11264o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f11265p;

        /* renamed from: q  reason: collision with root package name */
        public final ArrayList<C0163b> f11266q;

        /* renamed from: r  reason: collision with root package name */
        public final ArrayList<c> f11267r;

        /* loaded from: classes2.dex */
        public static final class a extends h.e {

            /* renamed from: a  reason: collision with root package name */
            public final Object f11268a;

            public a(Object obj) {
                this.f11268a = obj;
            }

            @Override // j1.h.e
            public void f(int i10) {
                ((MediaRouter.RouteInfo) this.f11268a).requestSetVolume(i10);
            }

            @Override // j1.h.e
            public void i(int i10) {
                ((MediaRouter.RouteInfo) this.f11268a).requestUpdateVolume(i10);
            }
        }

        /* renamed from: j1.j0$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0163b {

            /* renamed from: a  reason: collision with root package name */
            public final Object f11269a;

            /* renamed from: b  reason: collision with root package name */
            public final String f11270b;

            /* renamed from: c  reason: collision with root package name */
            public f f11271c;

            public C0163b(Object obj, String str) {
                this.f11269a = obj;
                this.f11270b = str;
            }
        }

        /* loaded from: classes2.dex */
        public static final class c {

            /* renamed from: a  reason: collision with root package name */
            public final l.i f11272a;

            /* renamed from: b  reason: collision with root package name */
            public final Object f11273b;

            public c(l.i iVar, Object obj) {
                this.f11272a = iVar;
                this.f11273b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            f11257s = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            f11258t = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, e eVar) {
            super(context);
            this.f11266q = new ArrayList<>();
            this.f11267r = new ArrayList<>();
            this.f11259i = eVar;
            Object systemService = context.getSystemService("media_router");
            this.f11260j = systemService;
            this.f11261k = new b0((c) this);
            this.f11262l = new z(this);
            this.f11263m = ((MediaRouter) systemService).createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
            G();
        }

        public c A(Object obj) {
            Object tag = ((MediaRouter.RouteInfo) obj).getTag();
            if (tag instanceof c) {
                return (c) tag;
            }
            return null;
        }

        public void B(C0163b c0163b, f.a aVar) {
            int supportedTypes = ((MediaRouter.RouteInfo) c0163b.f11269a).getSupportedTypes();
            if ((supportedTypes & 1) != 0) {
                aVar.a(f11257s);
            }
            if ((supportedTypes & 2) != 0) {
                aVar.a(f11258t);
            }
            aVar.d(((MediaRouter.RouteInfo) c0163b.f11269a).getPlaybackType());
            aVar.f11174a.putInt("playbackStream", ((MediaRouter.RouteInfo) c0163b.f11269a).getPlaybackStream());
            aVar.e(((MediaRouter.RouteInfo) c0163b.f11269a).getVolume());
            aVar.g(((MediaRouter.RouteInfo) c0163b.f11269a).getVolumeMax());
            aVar.f(((MediaRouter.RouteInfo) c0163b.f11269a).getVolumeHandling());
        }

        public void C() {
            int size = this.f11266q.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f11266q.get(i10).f11271c;
                if (fVar == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                } else if (arrayList.contains(fVar)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList.add(fVar);
            }
            p(new j(arrayList, false));
        }

        public void D(Object obj) {
            throw null;
        }

        public void E() {
            throw null;
        }

        public void F(C0163b c0163b) {
            String str = c0163b.f11270b;
            CharSequence name = ((MediaRouter.RouteInfo) c0163b.f11269a).getName(this.f11216a);
            f.a aVar = new f.a(str, name != null ? name.toString() : BuildConfig.FLAVOR);
            B(c0163b, aVar);
            c0163b.f11271c = aVar.b();
        }

        public final void G() {
            E();
            MediaRouter mediaRouter = (MediaRouter) this.f11260j;
            int routeCount = mediaRouter.getRouteCount();
            ArrayList arrayList = new ArrayList(routeCount);
            boolean z10 = false;
            for (int i10 = 0; i10 < routeCount; i10++) {
                arrayList.add(mediaRouter.getRouteAt(i10));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z10 |= v(it.next());
            }
            if (z10) {
                C();
            }
        }

        public void H(c cVar) {
            ((MediaRouter.UserRouteInfo) cVar.f11273b).setName(cVar.f11272a.d);
            ((MediaRouter.UserRouteInfo) cVar.f11273b).setPlaybackType(cVar.f11272a.f11339k);
            ((MediaRouter.UserRouteInfo) cVar.f11273b).setPlaybackStream(cVar.f11272a.f11340l);
            ((MediaRouter.UserRouteInfo) cVar.f11273b).setVolume(cVar.f11272a.f11342o);
            ((MediaRouter.UserRouteInfo) cVar.f11273b).setVolumeMax(cVar.f11272a.f11343p);
            ((MediaRouter.UserRouteInfo) cVar.f11273b).setVolumeHandling(cVar.f11272a.n);
        }

        @Override // j1.v
        public void a(Object obj) {
            int w10;
            if (A(obj) != null || (w10 = w(obj)) < 0) {
                return;
            }
            F(this.f11266q.get(w10));
            C();
        }

        @Override // j1.v
        public void b(int i10, Object obj) {
        }

        @Override // j1.y
        public void c(Object obj, int i10) {
            c A = A(obj);
            if (A != null) {
                A.f11272a.l(i10);
            }
        }

        @Override // j1.v
        public void d(Object obj) {
            int w10;
            if (A(obj) != null || (w10 = w(obj)) < 0) {
                return;
            }
            this.f11266q.remove(w10);
            C();
        }

        @Override // j1.v
        public void e(int i10, Object obj) {
            l.i a10;
            if (obj != ((MediaRouter) this.f11260j).getSelectedRoute(8388611)) {
                return;
            }
            c A = A(obj);
            if (A != null) {
                A.f11272a.m();
                return;
            }
            int w10 = w(obj);
            if (w10 >= 0) {
                e eVar = this.f11259i;
                String str = this.f11266q.get(w10).f11270b;
                l.e eVar2 = (l.e) eVar;
                eVar2.f11292k.removeMessages(262);
                l.h d = eVar2.d(eVar2.f11293l);
                if (d != null && (a10 = d.a(str)) != null) {
                    a10.m();
                }
            }
        }

        @Override // j1.v
        public void g(Object obj, Object obj2) {
        }

        @Override // j1.v
        public void h(Object obj, Object obj2, int i10) {
        }

        @Override // j1.v
        public void i(Object obj) {
            if (v(obj)) {
                C();
            }
        }

        @Override // j1.y
        public void j(Object obj, int i10) {
            c A = A(obj);
            if (A != null) {
                A.f11272a.k(i10);
            }
        }

        @Override // j1.v
        public void k(Object obj) {
            int w10;
            if (A(obj) == null && (w10 = w(obj)) >= 0) {
                C0163b c0163b = this.f11266q.get(w10);
                int volume = ((MediaRouter.RouteInfo) obj).getVolume();
                if (volume != c0163b.f11271c.n()) {
                    f fVar = c0163b.f11271c;
                    if (fVar == null) {
                        throw new IllegalArgumentException("descriptor must not be null");
                    }
                    Bundle bundle = new Bundle(fVar.f11171a);
                    ArrayList<String> arrayList = !fVar.g().isEmpty() ? new ArrayList<>(fVar.g()) : null;
                    fVar.a();
                    ArrayList<? extends Parcelable> arrayList2 = fVar.f11173c.isEmpty() ? null : new ArrayList<>(fVar.f11173c);
                    bundle.putInt("volume", volume);
                    if (arrayList2 != null) {
                        bundle.putParcelableArrayList("controlFilters", arrayList2);
                    }
                    if (arrayList != null) {
                        bundle.putStringArrayList("groupMemberIds", arrayList);
                    }
                    c0163b.f11271c = new f(bundle);
                    C();
                }
            }
        }

        @Override // j1.h
        public h.e m(String str) {
            int x10 = x(str);
            if (x10 >= 0) {
                return new a(this.f11266q.get(x10).f11269a);
            }
            return null;
        }

        @Override // j1.h
        public void o(g gVar) {
            boolean z10;
            int i10 = 0;
            if (gVar != null) {
                gVar.a();
                k kVar = gVar.f11212b;
                kVar.a();
                List<String> list = kVar.f11276b;
                int size = list.size();
                int i11 = 0;
                while (i10 < size) {
                    String str = list.get(i10);
                    i11 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i11 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i11 | 2 : i11 | 8388608;
                    i10++;
                }
                z10 = gVar.b();
                i10 = i11;
            } else {
                z10 = false;
            }
            if (this.n == i10 && this.f11264o == z10) {
                return;
            }
            this.n = i10;
            this.f11264o = z10;
            G();
        }

        @Override // j1.j0
        public void r(l.i iVar) {
            if (iVar.d() == this) {
                int w10 = w(((MediaRouter) this.f11260j).getSelectedRoute(8388611));
                if (w10 < 0 || !this.f11266q.get(w10).f11270b.equals(iVar.f11331b)) {
                    return;
                }
                iVar.m();
                return;
            }
            MediaRouter.UserRouteInfo createUserRoute = ((MediaRouter) this.f11260j).createUserRoute((MediaRouter.RouteCategory) this.f11263m);
            c cVar = new c(iVar, createUserRoute);
            createUserRoute.setTag(cVar);
            x.a(createUserRoute, this.f11262l);
            H(cVar);
            this.f11267r.add(cVar);
            ((MediaRouter) this.f11260j).addUserRoute(createUserRoute);
        }

        @Override // j1.j0
        public void s(l.i iVar) {
            int y;
            if (iVar.d() == this || (y = y(iVar)) < 0) {
                return;
            }
            H(this.f11267r.get(y));
        }

        @Override // j1.j0
        public void t(l.i iVar) {
            int y;
            if (iVar.d() != this && (y = y(iVar)) >= 0) {
                c remove = this.f11267r.remove(y);
                ((MediaRouter.RouteInfo) remove.f11273b).setTag(null);
                x.a(remove.f11273b, null);
                ((MediaRouter) this.f11260j).removeUserRoute((MediaRouter.UserRouteInfo) remove.f11273b);
            }
        }

        @Override // j1.j0
        public void u(l.i iVar) {
            if (iVar.h()) {
                if (iVar.d() != this) {
                    int y = y(iVar);
                    if (y >= 0) {
                        D(this.f11267r.get(y).f11273b);
                        return;
                    }
                    return;
                }
                int x10 = x(iVar.f11331b);
                if (x10 >= 0) {
                    D(this.f11266q.get(x10).f11269a);
                }
            }
        }

        public final boolean v(Object obj) {
            String format;
            String format2;
            if (A(obj) != null || w(obj) >= 0) {
                return false;
            }
            if (z() == obj) {
                format = "DEFAULT_ROUTE";
            } else {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                CharSequence name = ((MediaRouter.RouteInfo) obj).getName(this.f11216a);
                objArr[0] = Integer.valueOf((name != null ? name.toString() : BuildConfig.FLAVOR).hashCode());
                format = String.format(locale, "ROUTE_%08x", objArr);
            }
            if (x(format) >= 0) {
                int i10 = 2;
                while (true) {
                    format2 = String.format(Locale.US, "%s_%d", format, Integer.valueOf(i10));
                    if (x(format2) < 0) {
                        break;
                    }
                    i10++;
                }
                format = format2;
            }
            C0163b c0163b = new C0163b(obj, format);
            F(c0163b);
            this.f11266q.add(c0163b);
            return true;
        }

        public int w(Object obj) {
            int size = this.f11266q.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f11266q.get(i10).f11269a == obj) {
                    return i10;
                }
            }
            return -1;
        }

        public int x(String str) {
            int size = this.f11266q.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f11266q.get(i10).f11270b.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        public int y(l.i iVar) {
            int size = this.f11267r.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f11267r.get(i10).f11272a == iVar) {
                    return i10;
                }
            }
            return -1;
        }

        public Object z() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends b implements a0 {
        public c(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // j1.j0.b
        public void B(b.C0163b c0163b, f.a aVar) {
            Display display;
            super.B(c0163b, aVar);
            if (!((MediaRouter.RouteInfo) c0163b.f11269a).isEnabled()) {
                aVar.f11174a.putBoolean("enabled", false);
            }
            if (I(c0163b)) {
                aVar.c(1);
            }
            try {
                display = ((MediaRouter.RouteInfo) c0163b.f11269a).getPresentationDisplay();
            } catch (NoSuchMethodError e10) {
                Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e10);
                display = null;
            }
            if (display != null) {
                aVar.f11174a.putInt("presentationDisplayId", display.getDisplayId());
            }
        }

        public boolean I(b.C0163b c0163b) {
            throw null;
        }

        @Override // j1.a0
        public void f(Object obj) {
            Display display;
            int w10 = w(obj);
            if (w10 >= 0) {
                b.C0163b c0163b = this.f11266q.get(w10);
                ArrayList<? extends Parcelable> arrayList = null;
                try {
                    display = ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
                } catch (NoSuchMethodError e10) {
                    Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e10);
                    display = null;
                }
                int displayId = display != null ? display.getDisplayId() : -1;
                if (displayId != c0163b.f11271c.m()) {
                    f fVar = c0163b.f11271c;
                    if (fVar == null) {
                        throw new IllegalArgumentException("descriptor must not be null");
                    }
                    Bundle bundle = new Bundle(fVar.f11171a);
                    ArrayList<String> arrayList2 = !fVar.g().isEmpty() ? new ArrayList<>(fVar.g()) : null;
                    fVar.a();
                    if (!fVar.f11173c.isEmpty()) {
                        arrayList = new ArrayList<>(fVar.f11173c);
                    }
                    bundle.putInt("presentationDisplayId", displayId);
                    if (arrayList != null) {
                        bundle.putParcelableArrayList("controlFilters", arrayList);
                    }
                    if (arrayList2 != null) {
                        bundle.putStringArrayList("groupMemberIds", arrayList2);
                    }
                    c0163b.f11271c = new f(bundle);
                    C();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends c {
        public d(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // j1.j0.c, j1.j0.b
        public void B(b.C0163b c0163b, f.a aVar) {
            super.B(c0163b, aVar);
            CharSequence description = ((MediaRouter.RouteInfo) c0163b.f11269a).getDescription();
            if (description != null) {
                aVar.f11174a.putString("status", description.toString());
            }
        }

        @Override // j1.j0.b
        public void D(Object obj) {
            ((MediaRouter) this.f11260j).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
        }

        @Override // j1.j0.b
        public void E() {
            if (this.f11265p) {
                ((MediaRouter) this.f11260j).removeCallback((MediaRouter.Callback) this.f11261k);
            }
            this.f11265p = true;
            Object obj = this.f11260j;
            MediaRouter mediaRouter = (MediaRouter) obj;
            mediaRouter.addCallback(this.n, (MediaRouter.Callback) this.f11261k, (this.f11264o ? 1 : 0) | 2);
        }

        @Override // j1.j0.b
        public void H(b.c cVar) {
            super.H(cVar);
            ((MediaRouter.UserRouteInfo) cVar.f11273b).setDescription(cVar.f11272a.f11333e);
        }

        @Override // j1.j0.c
        public boolean I(b.C0163b c0163b) {
            return ((MediaRouter.RouteInfo) c0163b.f11269a).isConnecting();
        }

        @Override // j1.j0.b
        public Object z() {
            return ((MediaRouter) this.f11260j).getDefaultRoute();
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
    }

    public j0(Context context) {
        super(context, new h.d(new ComponentName("android", j0.class.getName())));
    }

    public void r(l.i iVar) {
    }

    public void s(l.i iVar) {
    }

    public void t(l.i iVar) {
    }

    public void u(l.i iVar) {
    }
}
