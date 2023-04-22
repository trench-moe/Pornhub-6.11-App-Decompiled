package gf;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class o extends p<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f9989a;

    public o(p pVar) {
        this.f9989a = pVar;
    }

    @Override // gf.p
    public void a(r rVar, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f9989a.a(rVar, Array.get(obj, i10));
        }
    }
}
