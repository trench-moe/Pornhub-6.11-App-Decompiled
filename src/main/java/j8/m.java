package j8;

import android.content.Context;
import j8.f;
import j8.n;

/* loaded from: classes2.dex */
public final class m implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11624a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a f11625b;

    public m(Context context) {
        n.b bVar = new n.b();
        bVar.f11641b = null;
        this.f11624a = context.getApplicationContext();
        this.f11625b = bVar;
    }

    @Override // j8.f.a
    public f a() {
        return new l(this.f11624a, this.f11625b.a());
    }
}
