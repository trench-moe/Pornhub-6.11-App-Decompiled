package u8;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class c0 implements e9.l {

    /* renamed from: c  reason: collision with root package name */
    public final Object f15647c;

    /* renamed from: f  reason: collision with root package name */
    public final Object f15648f;

    /* renamed from: j  reason: collision with root package name */
    public final Object f15649j;

    public /* synthetic */ c0() {
        this.f15647c = new HashMap();
        this.f15648f = new HashMap();
        this.f15649j = new HashMap();
    }

    public /* synthetic */ c0(l0 l0Var, String str, g gVar) {
        this.f15647c = l0Var;
        this.f15648f = str;
        this.f15649j = gVar;
    }

    public int a(String str) {
        Integer num = (Integer) ((Map) this.f15649j).get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // e9.l
    public void accept(Object obj, Object obj2) {
        l0 l0Var = (l0) this.f15647c;
        l0Var.g();
        a9.f fVar = (a9.f) ((a9.c0) obj).getService();
        Parcel a12 = fVar.a1();
        a12.writeString((String) this.f15648f);
        t9.v.b(a12, (g) this.f15649j);
        fVar.d1(13, a12);
        l0Var.i((ea.h) obj2);
    }

    public c0 b(String str, String str2, int i10) {
        ((Map) this.f15647c).put(str, str2);
        ((Map) this.f15648f).put(str2, str);
        ((Map) this.f15649j).put(str, Integer.valueOf(i10));
        return this;
    }
}
