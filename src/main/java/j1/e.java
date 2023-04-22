package j1;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import j1.h;
import j1.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class e extends h {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f11145r = 0;

    /* renamed from: i  reason: collision with root package name */
    public final MediaRouter2 f11146i;

    /* renamed from: j  reason: collision with root package name */
    public final a f11147j;

    /* renamed from: k  reason: collision with root package name */
    public final Map<MediaRouter2.RoutingController, c> f11148k;

    /* renamed from: l  reason: collision with root package name */
    public final MediaRouter2.RouteCallback f11149l;

    /* renamed from: m  reason: collision with root package name */
    public final MediaRouter2.TransferCallback f11150m;
    public final MediaRouter2.ControllerCallback n;

    /* renamed from: o  reason: collision with root package name */
    public final Executor f11151o;

    /* renamed from: p  reason: collision with root package name */
    public List<MediaRoute2Info> f11152p;

    /* renamed from: q  reason: collision with root package name */
    public Map<String, String> f11153q;

    /* loaded from: classes2.dex */
    public static abstract class a {
    }

    /* loaded from: classes2.dex */
    public class b extends MediaRouter2.ControllerCallback {
        public b() {
        }

        @Override // android.media.MediaRouter2.ControllerCallback
        public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
            e.this.t(routingController);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends h.b {

        /* renamed from: f  reason: collision with root package name */
        public final String f11155f;

        /* renamed from: g  reason: collision with root package name */
        public final MediaRouter2.RoutingController f11156g;

        /* renamed from: h  reason: collision with root package name */
        public final Messenger f11157h;

        /* renamed from: i  reason: collision with root package name */
        public final Messenger f11158i;

        /* renamed from: k  reason: collision with root package name */
        public final Handler f11160k;

        /* renamed from: o  reason: collision with root package name */
        public j1.f f11163o;

        /* renamed from: j  reason: collision with root package name */
        public final SparseArray<l.d> f11159j = new SparseArray<>();

        /* renamed from: l  reason: collision with root package name */
        public AtomicInteger f11161l = new AtomicInteger(1);

        /* renamed from: m  reason: collision with root package name */
        public final Runnable f11162m = new androidx.emoji2.text.k(this, 1);
        public int n = -1;

        /* loaded from: classes2.dex */
        public class a extends Handler {
            public a() {
                super(Looper.getMainLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i10 = message.what;
                int i11 = message.arg1;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                l.d dVar = c.this.f11159j.get(i11);
                if (dVar == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                c.this.f11159j.remove(i11);
                if (i10 == 3) {
                    dVar.b((Bundle) obj);
                } else if (i10 != 4) {
                } else {
                    dVar.a(peekData == null ? null : peekData.getString("error"), (Bundle) obj);
                }
            }
        }

        public c(MediaRouter2.RoutingController routingController, String str) {
            this.f11156g = routingController;
            this.f11155f = str;
            int i10 = e.f11145r;
            Bundle controlHints = routingController.getControlHints();
            Messenger messenger = controlHints == null ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
            this.f11157h = messenger;
            this.f11158i = messenger != null ? new Messenger(new a()) : null;
            this.f11160k = new Handler(Looper.getMainLooper());
        }

        @Override // j1.h.e
        public void d() {
            this.f11156g.release();
        }

        @Override // j1.h.e
        public void f(int i10) {
            MediaRouter2.RoutingController routingController = this.f11156g;
            if (routingController == null) {
                return;
            }
            routingController.setVolume(i10);
            this.n = i10;
            this.f11160k.removeCallbacks(this.f11162m);
            this.f11160k.postDelayed(this.f11162m, 1000L);
        }

        @Override // j1.h.e
        public void i(int i10) {
            MediaRouter2.RoutingController routingController = this.f11156g;
            if (routingController == null) {
                return;
            }
            int i11 = this.n;
            if (i11 < 0) {
                i11 = routingController.getVolume();
            }
            int max = Math.max(0, Math.min(i11 + i10, this.f11156g.getVolumeMax()));
            this.n = max;
            this.f11156g.setVolume(max);
            this.f11160k.removeCallbacks(this.f11162m);
            this.f11160k.postDelayed(this.f11162m, 1000L);
        }

        @Override // j1.h.b
        public void m(String str) {
            if (str != null && !str.isEmpty()) {
                MediaRoute2Info r10 = e.this.r(str);
                if (r10 != null) {
                    this.f11156g.selectRoute(r10);
                    return;
                }
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=" + str);
                return;
            }
            Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
        }

        @Override // j1.h.b
        public void n(String str) {
            if (str != null && !str.isEmpty()) {
                MediaRoute2Info r10 = e.this.r(str);
                if (r10 != null) {
                    this.f11156g.deselectRoute(r10);
                    return;
                }
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=" + str);
                return;
            }
            Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
        }

        @Override // j1.h.b
        public void o(List<String> list) {
            if (list != null && !list.isEmpty()) {
                String str = list.get(0);
                MediaRoute2Info r10 = e.this.r(str);
                if (r10 != null) {
                    e.this.f11146i.transferTo(r10);
                    return;
                }
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
        }
    }

    /* loaded from: classes2.dex */
    public class d extends h.e {

        /* renamed from: a  reason: collision with root package name */
        public final String f11166a;

        /* renamed from: b  reason: collision with root package name */
        public final c f11167b;

        public d(e eVar, String str, c cVar) {
            this.f11166a = str;
            this.f11167b = cVar;
        }

        @Override // j1.h.e
        public void f(int i10) {
            String str = this.f11166a;
            if (str != null) {
                c cVar = this.f11167b;
                if (cVar == null) {
                    return;
                }
                MediaRouter2.RoutingController routingController = cVar.f11156g;
                if (routingController != null && !routingController.isReleased()) {
                    if (cVar.f11157h == null) {
                        return;
                    }
                    int andIncrement = cVar.f11161l.getAndIncrement();
                    Message obtain = Message.obtain();
                    obtain.what = 7;
                    obtain.arg1 = andIncrement;
                    Bundle bundle = new Bundle();
                    bundle.putInt("volume", i10);
                    bundle.putString("routeId", str);
                    obtain.setData(bundle);
                    obtain.replyTo = cVar.f11158i;
                    try {
                        cVar.f11157h.send(obtain);
                    } catch (DeadObjectException unused) {
                    } catch (RemoteException e10) {
                        Log.e("MR2Provider", "Could not send control request to service.", e10);
                    }
                }
            }
        }

        @Override // j1.h.e
        public void i(int i10) {
            String str = this.f11166a;
            if (str != null) {
                c cVar = this.f11167b;
                if (cVar == null) {
                    return;
                }
                MediaRouter2.RoutingController routingController = cVar.f11156g;
                if (routingController != null && !routingController.isReleased()) {
                    if (cVar.f11157h == null) {
                        return;
                    }
                    int andIncrement = cVar.f11161l.getAndIncrement();
                    Message obtain = Message.obtain();
                    obtain.what = 8;
                    obtain.arg1 = andIncrement;
                    Bundle bundle = new Bundle();
                    bundle.putInt("volume", i10);
                    bundle.putString("routeId", str);
                    obtain.setData(bundle);
                    obtain.replyTo = cVar.f11158i;
                    try {
                        cVar.f11157h.send(obtain);
                    } catch (DeadObjectException unused) {
                    } catch (RemoteException e10) {
                        Log.e("MR2Provider", "Could not send control request to service.", e10);
                    }
                }
            }
        }
    }

    /* renamed from: j1.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0160e extends MediaRouter2.RouteCallback {
        public C0160e() {
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public void onRoutesAdded(List<MediaRoute2Info> list) {
            e.this.s();
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public void onRoutesChanged(List<MediaRoute2Info> list) {
            e.this.s();
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public void onRoutesRemoved(List<MediaRoute2Info> list) {
            e.this.s();
        }
    }

    /* loaded from: classes2.dex */
    public class f extends MediaRouter2.TransferCallback {
        public f() {
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public void onStop(MediaRouter2.RoutingController routingController) {
            c remove = e.this.f11148k.remove(routingController);
            if (remove == null) {
                Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
                return;
            }
            l.e.C0164e c0164e = (l.e.C0164e) e.this.f11147j;
            l.e eVar = l.e.this;
            if (remove == eVar.f11298r) {
                l.i c10 = eVar.c();
                if (l.e.this.g() != c10) {
                    l.e.this.l(c10, 2);
                }
            } else if (l.f11277c) {
                Log.d("MediaRouter", "A RouteController unrelated to the selected route is released. controller=" + remove);
            }
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
            l.i iVar;
            e.this.f11148k.remove(routingController);
            if (routingController2 == e.this.f11146i.getSystemController()) {
                l.e.C0164e c0164e = (l.e.C0164e) e.this.f11147j;
                l.i c10 = l.e.this.c();
                if (l.e.this.g() != c10) {
                    l.e.this.l(c10, 3);
                }
            } else {
                List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
                if (selectedRoutes.isEmpty()) {
                    Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
                    return;
                }
                String id2 = selectedRoutes.get(0).getId();
                e.this.f11148k.put(routingController2, new c(routingController2, id2));
                l.e.C0164e c0164e2 = (l.e.C0164e) e.this.f11147j;
                Iterator<l.i> it = l.e.this.f11286e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        iVar = null;
                        break;
                    }
                    iVar = it.next();
                    if (iVar.d() == l.e.this.f11285c && TextUtils.equals(id2, iVar.f11331b)) {
                        break;
                    }
                }
                if (iVar == null) {
                    Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id2);
                } else {
                    l.e.this.l(iVar, 3);
                }
                e.this.t(routingController2);
            }
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
            Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
        }
    }

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public e(Context context, a aVar) {
        super(context, null);
        this.f11148k = new ArrayMap();
        this.f11149l = new C0160e();
        this.f11150m = new f();
        this.n = new b();
        this.f11152p = new ArrayList();
        this.f11153q = new ArrayMap();
        this.f11146i = MediaRouter2.getInstance(context);
        this.f11147j = aVar;
        this.f11151o = new j1.a(new Handler(Looper.getMainLooper()));
    }

    @Override // j1.h
    public h.b l(String str) {
        for (Map.Entry<MediaRouter2.RoutingController, c> entry : this.f11148k.entrySet()) {
            c value = entry.getValue();
            if (TextUtils.equals(str, value.f11155f)) {
                return value;
            }
        }
        return null;
    }

    @Override // j1.h
    public h.e m(String str) {
        return new d(this, this.f11153q.get(str), null);
    }

    @Override // j1.h
    public h.e n(String str, String str2) {
        String str3 = this.f11153q.get(str);
        for (c cVar : this.f11148k.values()) {
            j1.f fVar = cVar.f11163o;
            if (TextUtils.equals(str2, fVar != null ? fVar.i() : cVar.f11156g.getId())) {
                return new d(this, str3, cVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new d(this, str3, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // j1.h
    public void o(j1.g r12) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.e.o(j1.g):void");
    }

    public MediaRoute2Info r(String str) {
        if (str == null) {
            return null;
        }
        for (MediaRoute2Info mediaRoute2Info : this.f11152p) {
            if (TextUtils.equals(mediaRoute2Info.getId(), str)) {
                return mediaRoute2Info;
            }
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void s() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.e.s():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(android.media.MediaRouter2.RoutingController r15) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.e.t(android.media.MediaRouter2$RoutingController):void");
    }
}
