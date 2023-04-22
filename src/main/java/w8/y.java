package w8;

import com.google.android.gms.cast.internal.zzan;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import w8.g;

/* loaded from: classes2.dex */
public abstract class y extends BasePendingResult<g.c> {

    /* renamed from: a  reason: collision with root package name */
    public a9.o f17050a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17051b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f17052c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(g gVar, boolean z10) {
        super(null);
        this.f17052c = gVar;
        this.f17051b = z10;
    }

    public abstract void a();

    public final a9.o b() {
        if (this.f17050a == null) {
            this.f17050a = new w(this);
        }
        return this.f17050a;
    }

    public final void c() {
        if (!this.f17051b) {
            for (g.b bVar : this.f17052c.f17013g) {
                bVar.d();
            }
            for (g.a aVar : this.f17052c.f17014h) {
                aVar.c();
            }
        }
        try {
            synchronized (this.f17052c.f17008a) {
                a();
            }
        } catch (zzan unused) {
            setResult(new x(new Status(2100, null)));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ g.c createFailedResult(Status status) {
        return new x(status);
    }
}
