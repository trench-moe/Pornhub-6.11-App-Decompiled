package h2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import w9.o;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10097a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10098b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10099c;
    public final Object d;

    public /* synthetic */ h(a aVar, a aVar2, b bVar, b bVar2) {
        this.f10097a = aVar;
        this.f10098b = aVar2;
        this.f10099c = bVar;
        this.d = bVar2;
    }

    public /* synthetic */ h(h hVar, y5.c cVar) {
        this.f10099c = new HashMap();
        this.d = new HashMap();
        this.f10097a = hVar;
        this.f10098b = cVar;
    }

    public h a() {
        return new h(this, (y5.c) this.f10098b);
    }

    public o b(o oVar) {
        return ((y5.c) this.f10098b).d(this, oVar);
    }

    public o c(w9.e eVar) {
        o oVar = o.f17256k;
        Iterator q10 = eVar.q();
        while (q10.hasNext()) {
            oVar = ((y5.c) this.f10098b).d(this, eVar.o(((Integer) q10.next()).intValue()));
            if (oVar instanceof w9.g) {
                break;
            }
        }
        return oVar;
    }

    public o d(String str) {
        if (((Map) this.f10099c).containsKey(str)) {
            return (o) ((Map) this.f10099c).get(str);
        }
        h hVar = (h) this.f10097a;
        if (hVar != null) {
            return hVar.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public void e(String str, o oVar) {
        if (((Map) this.d).containsKey(str)) {
            return;
        }
        if (oVar == null) {
            ((Map) this.f10099c).remove(str);
        } else {
            ((Map) this.f10099c).put(str, oVar);
        }
    }

    public void f(String str, o oVar) {
        h hVar;
        if (!((Map) this.f10099c).containsKey(str) && (hVar = (h) this.f10097a) != null) {
            if (hVar.g(str)) {
                ((h) this.f10097a).f(str, oVar);
                return;
            }
        }
        if (((Map) this.d).containsKey(str)) {
            return;
        }
        if (oVar == null) {
            ((Map) this.f10099c).remove(str);
        } else {
            ((Map) this.f10099c).put(str, oVar);
        }
    }

    public boolean g(String str) {
        if (((Map) this.f10099c).containsKey(str)) {
            return true;
        }
        h hVar = (h) this.f10097a;
        if (hVar != null) {
            return hVar.g(str);
        }
        return false;
    }
}
