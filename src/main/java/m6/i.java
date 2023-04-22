package m6;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class i implements d {

    /* renamed from: a  reason: collision with root package name */
    public final a f12922a;

    /* renamed from: b  reason: collision with root package name */
    public final g f12923b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, k> f12924c;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f12925a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f12926b = null;

        public a(Context context) {
            this.f12925a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public m6.c a(java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m6.i.a.a(java.lang.String):m6.c");
        }
    }

    public i(Context context, g gVar) {
        a aVar = new a(context);
        this.f12924c = new HashMap();
        this.f12922a = aVar;
        this.f12923b = gVar;
    }

    @Override // m6.d
    public synchronized k get(String str) {
        try {
            if (this.f12924c.containsKey(str)) {
                return this.f12924c.get(str);
            }
            c a10 = this.f12922a.a(str);
            if (a10 == null) {
                return null;
            }
            g gVar = this.f12923b;
            k create = a10.create(new b(gVar.f12916a, gVar.f12917b, gVar.f12918c, str));
            this.f12924c.put(str, create);
            return create;
        } catch (Throwable th) {
            throw th;
        }
    }
}
