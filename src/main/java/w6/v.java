package w6;

import w6.q0;

/* loaded from: classes2.dex */
public class v implements q0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f16749a;

    public v(w wVar) {
        this.f16749a = wVar;
    }

    @Override // w6.q0.a
    public void a() {
        this.f16749a.f16803u.e(2);
    }

    @Override // w6.q0.a
    public void b(long j10) {
        if (j10 >= 2000) {
            this.f16749a.W = true;
        }
    }
}
