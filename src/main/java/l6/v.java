package l6;

import android.content.Context;
import androidx.appcompat.widget.q0;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import l6.i;
import l6.q;

/* loaded from: classes2.dex */
public class v implements u {

    /* renamed from: e  reason: collision with root package name */
    public static volatile w f12324e;

    /* renamed from: a  reason: collision with root package name */
    public final u6.a f12325a;

    /* renamed from: b  reason: collision with root package name */
    public final u6.a f12326b;

    /* renamed from: c  reason: collision with root package name */
    public final q6.e f12327c;
    public final r6.i d;

    public v(u6.a aVar, u6.a aVar2, q6.e eVar, r6.i iVar, r6.k kVar) {
        this.f12325a = aVar;
        this.f12326b = aVar2;
        this.f12327c = eVar;
        this.d = iVar;
        kVar.f14718a.execute(new q0(kVar, 9));
    }

    public static v a() {
        w wVar = f12324e;
        if (wVar != null) {
            return ((j) wVar).C.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f12324e == null) {
            synchronized (v.class) {
                if (f12324e == null) {
                    Objects.requireNonNull(context);
                    f12324e = new j(context, null);
                }
            }
        }
    }

    public r c(k kVar) {
        Set singleton;
        if (kVar instanceof k) {
            Objects.requireNonNull((j6.a) kVar);
            singleton = Collections.unmodifiableSet(j6.a.d);
        } else {
            singleton = Collections.singleton(new i6.b("proto"));
        }
        q.a a10 = q.a();
        Objects.requireNonNull(kVar);
        a10.b("cct");
        i.b bVar = (i.b) a10;
        bVar.f12293b = ((j6.a) kVar).b();
        return new r(singleton, bVar.a(), this);
    }
}
