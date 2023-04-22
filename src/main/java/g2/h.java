package g2;

import a9.m;
import a9.o;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import androidx.appcompat.widget.p;
import com.bumptech.glide.load.EncodeStrategy;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import j5.i;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import w8.g;
import w9.a0;
import w9.n;
import w9.p6;

/* loaded from: classes.dex */
public class h implements h5.f, x8.a, o, a0 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9719c;

    /* renamed from: f  reason: collision with root package name */
    public Object f9720f;

    /* renamed from: j  reason: collision with root package name */
    public Object f9721j;

    public h(int i10) {
        this.f9719c = i10;
        if (i10 == 1) {
            this.f9720f = new HashMap();
            this.f9721j = new HashMap();
        } else if (i10 == 6) {
            this.f9720f = new TreeMap();
            this.f9721j = new TreeMap();
        } else if (i10 != 7) {
        } else {
            this.f9720f = new LinkedList();
            this.f9721j = new HashMap();
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, int i10) {
        this.f9719c = i10;
        this.f9720f = obj;
        this.f9721j = obj2;
    }

    public /* synthetic */ h(Object obj, Object obj2, int i10, android.support.v4.media.a aVar) {
        this.f9719c = i10;
        this.f9721j = obj;
        this.f9720f = obj2;
    }

    public static final int h(h2.h hVar, n nVar, w9.o oVar) {
        w9.o a10 = nVar.a(hVar, Collections.singletonList(oVar));
        if (a10 instanceof w9.h) {
            return a0.b.m0(a10.zzh().doubleValue());
        }
        return -1;
    }

    @Override // a9.o
    public void a(long j10) {
        o oVar = (o) this.f9720f;
        if (oVar != null) {
            oVar.a(j10);
        }
    }

    @Override // a9.o
    public void b(long j10, int i10, Object obj) {
        if (((o) this.f9720f) != null) {
            if (i10 == 2001) {
                m mVar = (m) this.f9721j;
                a9.b bVar = mVar.f309a;
                Log.w(bVar.f254a, bVar.e("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(mVar.f287i)));
                for (g.a aVar : ((w8.a0) ((m) this.f9721j).f286h).f16953a.f17014h) {
                    aVar.k();
                }
                i10 = 2001;
            }
            ((o) this.f9720f).b(j10, i10, obj);
        }
    }

    @Override // h5.f
    public EncodeStrategy c(h5.d dVar) {
        return ((h5.f) this.f9721j).c(dVar);
    }

    @Override // h5.a
    public boolean d(Object obj, File file, h5.d dVar) {
        return ((h5.f) this.f9721j).d(new q5.d(((BitmapDrawable) ((i) obj).get()).getBitmap(), (k5.c) this.f9720f), file, dVar);
    }

    public Map e(boolean z10) {
        return (Map) (z10 ? this.f9721j : this.f9720f);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f9719c
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            r5 = 1
            boolean r4 = super.equals(r8)
            r8 = r4
            return r8
        Lc:
            boolean r0 = r8 instanceof m0.b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            r6 = 5
            goto L4c
        L14:
            r5 = 4
            m0.b r8 = (m0.b) r8
            F r0 = r8.f12856a
            java.lang.Object r3 = r7.f9720f
            if (r0 == r3) goto L2b
            if (r0 == 0) goto L28
            r5 = 4
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L28
            r5 = 1
            goto L2b
        L28:
            r5 = 3
            r0 = 0
            goto L2c
        L2b:
            r0 = 1
        L2c:
            if (r0 == 0) goto L4c
            r6 = 6
            S r8 = r8.f12857b
            r6 = 6
            java.lang.Object r0 = r7.f9721j
            if (r8 == r0) goto L45
            if (r8 == 0) goto L41
            r6 = 3
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L41
            r5 = 7
            goto L46
        L41:
            r5 = 7
            r4 = 0
            r8 = r4
            goto L48
        L45:
            r5 = 1
        L46:
            r8 = 1
            r5 = 6
        L48:
            if (r8 == 0) goto L4c
            r5 = 2
            goto L4d
        L4c:
            r1 = 0
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.h.equals(java.lang.Object):boolean");
    }

    @Override // w9.a0
    public h2.h f(w9.o oVar) {
        ((h2.h) this.f9720f).e((String) this.f9721j, oVar);
        return (h2.h) this.f9720f;
    }

    public void g(h2.h hVar, n2.c cVar) {
        p6 p6Var = new p6(cVar);
        for (Integer num : ((TreeMap) this.f9720f).keySet()) {
            w9.b clone = ((w9.b) cVar.f13277j).clone();
            int h10 = h(hVar, (n) ((TreeMap) this.f9720f).get(num), p6Var);
            if (h10 != 2 && h10 != -1) {
            }
            cVar.f13277j = clone;
        }
        for (Integer num2 : ((TreeMap) this.f9721j).keySet()) {
            h(hVar, (n) ((TreeMap) this.f9721j).get(num2), p6Var);
        }
    }

    public int hashCode() {
        switch (this.f9719c) {
            case 0:
                Object obj = this.f9720f;
                int hashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.f9721j;
                return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // x8.a
    public void i(Bitmap bitmap) {
        p pVar = (p) this.f9720f;
        pVar.f1053b = bitmap;
        Object obj = this.f9721j;
        ((MediaNotificationService) obj).B = pVar;
        ((MediaNotificationService) obj).c();
    }

    public String toString() {
        switch (this.f9719c) {
            case 0:
                return "Pair{" + String.valueOf(this.f9720f) + " " + String.valueOf(this.f9721j) + "}";
            default:
                return super.toString();
        }
    }
}
