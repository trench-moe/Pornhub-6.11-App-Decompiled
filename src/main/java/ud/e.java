package ud;

import cz.msebera.android.httpclient.HttpVersion;
import cz.msebera.android.httpclient.ProtocolVersion;
import cz.msebera.android.httpclient.message.BasicRequestLine;
import md.q;

/* loaded from: classes2.dex */
public class e extends a implements md.i {

    /* renamed from: b  reason: collision with root package name */
    public final String f15857b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15858c;
    public q d;

    public e(q qVar) {
        l9.e.l(qVar, "Request line");
        this.d = qVar;
        this.f15857b = qVar.b();
        this.f15858c = qVar.c();
    }

    @Override // md.h
    public ProtocolVersion a() {
        return j().a();
    }

    @Override // md.i
    public q j() {
        if (this.d == null) {
            this.d = new BasicRequestLine(this.f15857b, this.f15858c, HttpVersion.f8582j);
        }
        return this.d;
    }

    public String toString() {
        return this.f15857b + ' ' + this.f15858c + ' ' + this.f15849a;
    }
}
