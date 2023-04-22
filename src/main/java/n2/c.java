package n2;

import a9.c0;
import a9.f;
import android.os.Parcel;
import com.appsflyer.oaid.BuildConfig;
import e9.l;
import ea.h;
import h9.o;
import java.util.ArrayList;
import java.util.List;
import u8.e;
import u8.l0;

/* loaded from: classes2.dex */
public class c implements l {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13275c;

    /* renamed from: f  reason: collision with root package name */
    public Object f13276f;

    /* renamed from: j  reason: collision with root package name */
    public Object f13277j;

    /* renamed from: m  reason: collision with root package name */
    public Object f13278m;

    public c() {
        this.f13275c = 2;
        this.f13276f = new w9.b(BuildConfig.FLAVOR, 0L, null);
        this.f13277j = new w9.b(BuildConfig.FLAVOR, 0L, null);
        this.f13278m = new ArrayList();
    }

    public c(Object obj) {
        this.f13275c = 0;
        this.f13276f = new b();
        this.f13278m = null;
        this.f13278m = obj;
    }

    public /* synthetic */ c(l0 l0Var, e.d dVar, String str) {
        this.f13275c = 1;
        this.f13276f = l0Var;
        this.f13277j = dVar;
        this.f13278m = str;
    }

    public c(w9.b bVar) {
        this.f13275c = 2;
        this.f13276f = bVar;
        this.f13277j = bVar.clone();
        this.f13278m = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object a(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        b bVar = (b) this.f13276f;
        bVar.f13273a = obj;
        bVar.f13274b = obj2;
        return this.f13278m;
    }

    @Override // e9.l
    public void accept(Object obj, Object obj2) {
        e.d dVar = (e.d) this.f13277j;
        String str = (String) this.f13278m;
        c0 c0Var = (c0) obj;
        h hVar = (h) obj2;
        boolean z10 = true;
        if (((l0) this.f13276f).F == 1) {
            z10 = false;
        }
        o.k(z10, "Not active connection");
        if (dVar != null) {
            f fVar = (f) c0Var.getService();
            Parcel a12 = fVar.a1();
            a12.writeString(str);
            fVar.d1(12, a12);
        }
        hVar.f9273a.p(null);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f13275c) {
            case 2:
                c cVar = new c(((w9.b) this.f13276f).clone());
                for (w9.b bVar : (List) this.f13278m) {
                    ((List) cVar.f13278m).add(bVar.clone());
                }
                return cVar;
            default:
                return super.clone();
        }
    }
}
