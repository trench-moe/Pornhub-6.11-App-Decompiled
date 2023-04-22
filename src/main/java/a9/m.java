package a9;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.internal.zzan;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w8.g;

/* loaded from: classes.dex */
public final class m extends s {

    /* renamed from: x  reason: collision with root package name */
    public static final String f282x;

    /* renamed from: e  reason: collision with root package name */
    public long f283e;

    /* renamed from: f  reason: collision with root package name */
    public u8.o f284f;

    /* renamed from: g  reason: collision with root package name */
    public Long f285g;

    /* renamed from: h  reason: collision with root package name */
    public k f286h;

    /* renamed from: i  reason: collision with root package name */
    public int f287i;

    /* renamed from: j  reason: collision with root package name */
    public final q f288j;

    /* renamed from: k  reason: collision with root package name */
    public final q f289k;

    /* renamed from: l  reason: collision with root package name */
    public final q f290l;

    /* renamed from: m  reason: collision with root package name */
    public final q f291m;
    public final q n;

    /* renamed from: o  reason: collision with root package name */
    public final q f292o;

    /* renamed from: p  reason: collision with root package name */
    public final q f293p;

    /* renamed from: q  reason: collision with root package name */
    public final q f294q;

    /* renamed from: r  reason: collision with root package name */
    public final q f295r;

    /* renamed from: s  reason: collision with root package name */
    public final q f296s;

    /* renamed from: t  reason: collision with root package name */
    public final q f297t;

    /* renamed from: u  reason: collision with root package name */
    public final q f298u;

    /* renamed from: v  reason: collision with root package name */
    public final q f299v;

    /* renamed from: w  reason: collision with root package name */
    public ea.h<u8.p> f300w;

    static {
        Pattern pattern = a.f249a;
        f282x = "urn:x-cast:".concat("com.google.cast.media");
    }

    public m(String str) {
        super(f282x);
        this.f287i = -1;
        q qVar = new q(86400000L);
        this.f288j = qVar;
        q qVar2 = new q(86400000L);
        this.f289k = qVar2;
        q qVar3 = new q(86400000L);
        this.f290l = qVar3;
        q qVar4 = new q(86400000L);
        q qVar5 = new q(10000L);
        this.f291m = qVar5;
        q qVar6 = new q(86400000L);
        this.n = qVar6;
        q qVar7 = new q(86400000L);
        this.f292o = qVar7;
        q qVar8 = new q(86400000L);
        this.f293p = qVar8;
        q qVar9 = new q(86400000L);
        this.f294q = qVar9;
        q qVar10 = new q(86400000L);
        q qVar11 = new q(86400000L);
        q qVar12 = new q(86400000L);
        this.f295r = qVar12;
        q qVar13 = new q(86400000L);
        q qVar14 = new q(86400000L);
        q qVar15 = new q(86400000L);
        this.f296s = qVar15;
        q qVar16 = new q(86400000L);
        this.f298u = qVar16;
        this.f297t = new q(86400000L);
        q qVar17 = new q(86400000L);
        q qVar18 = new q(86400000L);
        q qVar19 = new q(86400000L);
        this.f299v = qVar19;
        this.d.add(qVar);
        this.d.add(qVar2);
        this.d.add(qVar3);
        this.d.add(qVar4);
        this.d.add(qVar5);
        this.d.add(qVar6);
        this.d.add(qVar7);
        this.d.add(qVar8);
        this.d.add(qVar9);
        this.d.add(qVar10);
        this.d.add(qVar11);
        this.d.add(qVar12);
        this.d.add(qVar13);
        this.d.add(qVar14);
        this.d.add(qVar15);
        this.d.add(qVar16);
        this.d.add(qVar16);
        this.d.add(qVar17);
        this.d.add(qVar18);
        this.d.add(qVar19);
        g();
    }

    public static l f(JSONObject jSONObject) {
        MediaError p02 = MediaError.p0(jSONObject);
        l lVar = new l();
        lVar.f280a = jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null;
        lVar.f281b = p02;
        return lVar;
    }

    public static int[] m(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            iArr[i10] = jSONArray.getInt(i10);
        }
        return iArr;
    }

    public final long c(o oVar, int i10, long j10, u8.m[] mVarArr, int i11, boolean z10, Integer num, JSONObject jSONObject) {
        int i12 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        if (i12 != 0 && j10 < 0) {
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("playPosition cannot be negative: ");
            sb2.append(j10);
            throw new IllegalArgumentException(sb2.toString());
        }
        JSONObject jSONObject2 = new JSONObject();
        long a10 = a();
        try {
            jSONObject2.put("requestId", a10);
            jSONObject2.put("type", "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", q());
            if (i10 != 0) {
                jSONObject2.put("currentItemId", i10);
            }
            if (i11 != 0) {
                jSONObject2.put("jump", i11);
            }
            if (z10) {
                jSONObject2.put("shuffle", true);
            }
            String C = t3.a.C(null);
            if (C != null) {
                jSONObject2.put("repeatMode", C);
            }
            if (i12 != 0) {
                jSONObject2.put("currentTime", a.b(j10));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            int i13 = this.f287i;
            if (i13 != -1) {
                jSONObject2.put("sequenceNumber", i13);
            }
        } catch (JSONException unused) {
        }
        b(jSONObject2.toString(), a10, null);
        this.f295r.a(a10, new g2.h(this, oVar, 4, null));
        return a10;
    }

    public final MediaInfo d() {
        u8.o oVar = this.f284f;
        if (oVar == null) {
            return null;
        }
        return oVar.f15736c;
    }

    public final long e(double d, long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f283e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j10;
        }
        long j12 = j10 + ((long) (elapsedRealtime * d));
        if (j11 <= 0 || j12 <= j11) {
            if (j12 >= 0) {
                return j12;
            }
            return 0L;
        }
        return j11;
    }

    public final void g() {
        this.f283e = 0L;
        this.f284f = null;
        for (q qVar : this.d) {
            qVar.f(2002, null);
        }
    }

    public final void h(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.f287i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.f309a.d(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    public final void i() {
        k kVar = this.f286h;
        if (kVar != null) {
            w8.a0 a0Var = (w8.a0) kVar;
            Objects.requireNonNull(a0Var.f16953a);
            for (g.b bVar : a0Var.f16953a.f17013g) {
                bVar.b();
            }
            for (g.a aVar : a0Var.f16953a.f17014h) {
                aVar.a();
            }
        }
    }

    public final void j() {
        k kVar = this.f286h;
        if (kVar != null) {
            w8.a0 a0Var = (w8.a0) kVar;
            for (g.b bVar : a0Var.f16953a.f17013g) {
                bVar.i();
            }
            for (g.a aVar : a0Var.f16953a.f17014h) {
                aVar.b();
            }
        }
    }

    public final void k() {
        k kVar = this.f286h;
        if (kVar != null) {
            w8.a0 a0Var = (w8.a0) kVar;
            for (g.b bVar : a0Var.f16953a.f17013g) {
                bVar.c();
            }
            for (g.a aVar : a0Var.f16953a.f17014h) {
                Objects.requireNonNull(aVar);
            }
        }
    }

    public final void l() {
        k kVar = this.f286h;
        if (kVar != null) {
            w8.a0 a0Var = (w8.a0) kVar;
            Objects.requireNonNull(a0Var.f16953a);
            w8.g gVar = a0Var.f16953a;
            loop0: while (true) {
                for (w8.c0 c0Var : gVar.f17016j.values()) {
                    if (gVar.j() && !c0Var.d) {
                        c0Var.a();
                    } else if (!gVar.j() && c0Var.d) {
                        c0Var.f16962e.f17009b.removeCallbacks(c0Var.f16961c);
                        c0Var.d = false;
                    }
                    if (!c0Var.d || (!gVar.k() && !gVar.z() && !gVar.n() && !gVar.m())) {
                    }
                    gVar.B(c0Var.f16959a);
                }
                break loop0;
            }
            for (g.b bVar : a0Var.f16953a.f17013g) {
                bVar.m();
            }
            for (g.a aVar : a0Var.f16953a.f17014h) {
                aVar.d();
            }
        }
    }

    public final void n() {
        synchronized (this.d) {
            try {
                for (q qVar : this.d) {
                    qVar.f(2002, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
    }

    public final long o() {
        u8.h hVar;
        u8.o oVar = this.f284f;
        if (oVar == null || (hVar = oVar.K) == null) {
            return 0L;
        }
        long j10 = hVar.f15676f;
        return !hVar.f15678m ? e(1.0d, j10, -1L) : j10;
    }

    public final long p() {
        u8.o oVar;
        MediaInfo d = d();
        if (d != null && (oVar = this.f284f) != null) {
            Long l10 = this.f285g;
            if (l10 == null) {
                if (this.f283e == 0) {
                    return 0L;
                }
                double d10 = oVar.f15739m;
                long j10 = oVar.f15741u;
                return (d10 == 0.0d || oVar.n != 2) ? j10 : e(d10, j10, d.n);
            }
            if (l10.equals(4294967296000L)) {
                if (this.f284f.K != null) {
                    return Math.min(l10.longValue(), o());
                }
                if (r() >= 0) {
                    return Math.min(l10.longValue(), r());
                }
            }
            return l10.longValue();
        }
        return 0L;
    }

    public final long q() {
        u8.o oVar = this.f284f;
        if (oVar != null) {
            return oVar.f15737f;
        }
        throw new zzan();
    }

    public final long r() {
        MediaInfo d = d();
        if (d != null) {
            return d.n;
        }
        return 0L;
    }
}
