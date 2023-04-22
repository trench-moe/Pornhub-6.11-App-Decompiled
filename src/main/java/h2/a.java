package h2;

import java.util.List;

/* loaded from: classes2.dex */
public class a extends k {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(List list, int i10) {
        super(list, 0);
        this.f10093c = i10;
    }

    @Override // h2.j
    public e2.a a() {
        switch (this.f10093c) {
            case 0:
                return new e2.b((List) this.f10109b);
            default:
                return new e2.k((List) this.f10109b);
        }
    }
}
