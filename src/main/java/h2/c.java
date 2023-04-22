package h2;

import e2.m;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends k {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(List list, int i10) {
        super(list, 0);
        this.f10094c = i10;
    }

    @Override // h2.j
    public e2.a a() {
        switch (this.f10094c) {
            case 0:
                return new e2.d((List) this.f10109b);
            default:
                return new m((List) this.f10109b);
        }
    }
}
