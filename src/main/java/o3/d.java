package o3;

import a9.m;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import b3.o;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import q5.p;
import v8.c0;

/* loaded from: classes2.dex */
public class d implements v5.b, ea.c {

    /* renamed from: c  reason: collision with root package name */
    public Object f13543c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(int i10) {
        this(5, 5L, TimeUnit.MINUTES);
        if (i10 != 5) {
            if (i10 != 8) {
                this.f13543c = new ArrayList();
            }
        }
    }

    public /* synthetic */ d(int i10, long j10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        te.g delegate = new te.g(se.d.f15017h, i10, j10, timeUnit);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f13543c = delegate;
    }

    public d(Context context, Collection collection) {
        TreeSet treeSet = new TreeSet();
        this.f13543c = treeSet;
        treeSet.clear();
        HashSet hashSet = new HashSet();
        hashSet.addAll(collection);
        hashSet.add(context.getApplicationContext().getPackageName());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = ((TreeSet) this.f13543c).iterator();
            boolean z10 = true;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                if (str.startsWith(str2)) {
                    z10 = false;
                } else if (str2.startsWith(str)) {
                    ((TreeSet) this.f13543c).remove(str2);
                }
            }
            if (z10) {
                ((TreeSet) this.f13543c).add(str);
            }
        }
    }

    public d(Resources resources) {
        this.f13543c = resources;
    }

    public /* synthetic */ d(Bundle bundle) {
        this.f13543c = p0.a(bundle, "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES");
    }

    public /* synthetic */ d(o videosRepository) {
        Intrinsics.checkNotNullParameter(videosRepository, "videosRepository");
        this.f13543c = videosRepository;
    }

    @Override // v5.b
    public j5.i a(j5.i iVar, h5.d dVar) {
        return p.e((Resources) this.f13543c, iVar);
    }

    public int b() {
        w8.g gVar = (w8.g) this.f13543c;
        if (gVar != null && gVar.j()) {
            w8.g gVar2 = (w8.g) this.f13543c;
            if (gVar2.l() || !gVar2.m()) {
                int c10 = (int) (gVar2.c() - f());
                if (gVar2.A()) {
                    c10 = a9.a.f(c10, e(), d());
                }
                return a9.a.f(c10, 0, c());
            }
            return 0;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c() {
        /*
            r12 = this;
            r8 = r12
            java.lang.Object r0 = r8.f13543c
            r10 = 4
            w8.g r0 = (w8.g) r0
            r11 = 7
            r1 = 1
            r10 = 6
            if (r0 == 0) goto Lb0
            boolean r0 = r0.j()
            if (r0 != 0) goto L15
            r11 = 7
            goto Lb0
        L15:
            r11 = 3
            java.lang.Object r0 = r8.f13543c
            r10 = 4
            w8.g r0 = (w8.g) r0
            r10 = 1
            boolean r11 = r0.l()
            r3 = r11
            if (r3 != 0) goto L47
            boolean r10 = r0.m()
            r3 = r10
            if (r3 == 0) goto L3d
            r10 = 5
            u8.m r0 = r0.e()
            if (r0 == 0) goto Lb0
            com.google.android.gms.cast.MediaInfo r0 = r0.f15726c
            if (r0 == 0) goto Lb0
            long r3 = r0.n
            r10 = 6
            long r1 = java.lang.Math.max(r3, r1)
            goto Lb0
        L3d:
            r10 = 6
            long r3 = r0.i()
            long r1 = java.lang.Math.max(r3, r1)
            goto Lb0
        L47:
            r11 = 3
            java.lang.Object r3 = r8.f13543c
            w8.g r3 = (w8.g) r3
            r11 = 0
            r4 = r11
            if (r3 == 0) goto L93
            boolean r3 = r3.j()
            if (r3 == 0) goto L93
            java.lang.Object r3 = r8.f13543c
            r10 = 7
            w8.g r3 = (w8.g) r3
            r10 = 5
            boolean r3 = r3.l()
            if (r3 != 0) goto L64
            r10 = 2
            goto L94
        L64:
            u8.j r3 = r8.k()
            if (r3 == 0) goto L93
            android.os.Bundle r5 = r3.f15694f
            java.lang.String r6 = "com.google.android.gms.cast.metadata.SECTION_DURATION"
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto L93
            r11 = 1
            java.lang.Long r10 = r8.j()
            r5 = r10
            if (r5 == 0) goto L93
            r10 = 6
            long r4 = r5.longValue()
            r10 = 5
            r7 = r10
            u8.j.s0(r6, r7)
            android.os.Bundle r3 = r3.f15694f
            r10 = 3
            long r6 = r3.getLong(r6)
            long r6 = r6 + r4
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            r4 = r10
        L93:
            r10 = 2
        L94:
            if (r4 == 0) goto L9b
            long r1 = r4.longValue()
            goto Lb0
        L9b:
            r11 = 4
            java.lang.Long r10 = r8.h()
            r3 = r10
            if (r3 == 0) goto La8
            long r1 = r3.longValue()
            goto Lb0
        La8:
            long r3 = r0.c()
            long r1 = java.lang.Math.max(r3, r1)
        Lb0:
            long r3 = r8.f()
            long r1 = r1 - r3
            int r0 = (int) r1
            r10 = 4
            r1 = 1
            r11 = 6
            int r11 = java.lang.Math.max(r0, r1)
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.d.c():int");
    }

    public int d() {
        w8.g gVar = (w8.g) this.f13543c;
        if (gVar != null && gVar.j() && ((w8.g) this.f13543c).l()) {
            if (((w8.g) this.f13543c).A()) {
                Long h10 = h();
                Objects.requireNonNull(h10, "null reference");
                return a9.a.f((int) (h10.longValue() - f()), 0, c());
            }
            return 0;
        }
        return c();
    }

    public int e() {
        w8.g gVar = (w8.g) this.f13543c;
        if (gVar != null && gVar.j() && ((w8.g) this.f13543c).l()) {
            if (((w8.g) this.f13543c).A()) {
                Long i10 = i();
                Objects.requireNonNull(i10, "null reference");
                return a9.a.f((int) (i10.longValue() - f()), 0, c());
            }
        }
        return 0;
    }

    public long f() {
        w8.g gVar = (w8.g) this.f13543c;
        if (gVar != null && gVar.j()) {
            if (((w8.g) this.f13543c).l()) {
                w8.g gVar2 = (w8.g) this.f13543c;
                Long j10 = j();
                if (j10 != null) {
                    return j10.longValue();
                }
                Long i10 = i();
                return i10 != null ? i10.longValue() : gVar2.c();
            }
        }
        return 0L;
    }

    @Override // ea.c
    public void g(ea.g gVar) {
        v8.d.p(((c0) this.f13543c).f16078a, "launchApplication", gVar);
    }

    /* JADX WARN: Finally extract failed */
    public Long h() {
        w8.g gVar;
        u8.o g10;
        long o10;
        w8.g gVar2 = (w8.g) this.f13543c;
        if (gVar2 == null || !gVar2.j() || !((w8.g) this.f13543c).l() || !((w8.g) this.f13543c).A() || (g10 = (gVar = (w8.g) this.f13543c).g()) == null || g10.K == null) {
            return null;
        }
        synchronized (gVar.f17008a) {
            try {
                h9.o.d("Must be called from the main thread.");
                o10 = gVar.f17010c.o();
            } catch (Throwable th) {
                throw th;
            }
        }
        return Long.valueOf(o10);
    }

    public Long i() {
        w8.g gVar;
        u8.o g10;
        long j10;
        u8.h hVar;
        w8.g gVar2 = (w8.g) this.f13543c;
        if (gVar2 != null && gVar2.j() && ((w8.g) this.f13543c).l() && ((w8.g) this.f13543c).A() && (g10 = (gVar = (w8.g) this.f13543c).g()) != null && g10.K != null) {
            synchronized (gVar.f17008a) {
                h9.o.d("Must be called from the main thread.");
                m mVar = gVar.f17010c;
                u8.o oVar = mVar.f284f;
                j10 = 0;
                if (oVar != null && (hVar = oVar.K) != null) {
                    long j11 = hVar.f15675c;
                    j10 = hVar.f15677j ? mVar.e(1.0d, j11, -1L) : j11;
                    if (hVar.f15678m) {
                        j10 = Math.min(j10, hVar.f15676f);
                    }
                }
            }
            return Long.valueOf(j10);
        }
        return null;
    }

    public Long j() {
        w8.g gVar = (w8.g) this.f13543c;
        if (gVar != null && gVar.j()) {
            if (((w8.g) this.f13543c).l()) {
                w8.g gVar2 = (w8.g) this.f13543c;
                MediaInfo f10 = gVar2.f();
                u8.j k10 = k();
                if (f10 != null && k10 != null && k10.f15694f.containsKey("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA") && (k10.f15694f.containsKey("com.google.android.gms.cast.metadata.SECTION_DURATION") || gVar2.A())) {
                    u8.j.s0("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", 5);
                    return Long.valueOf(k10.f15694f.getLong("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"));
                }
            }
            return null;
        }
        return null;
    }

    public u8.j k() {
        MediaInfo f10;
        w8.g gVar = (w8.g) this.f13543c;
        if (gVar == null || !gVar.j() || (f10 = ((w8.g) this.f13543c).f()) == null) {
            return null;
        }
        return f10.f6797m;
    }
}
