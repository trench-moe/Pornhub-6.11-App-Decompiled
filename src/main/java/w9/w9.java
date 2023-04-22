package w9;

import java.util.List;

/* loaded from: classes2.dex */
public final class w9 extends i {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f17361j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(int i10) {
        super("unmonitored");
        this.f17361j = i10;
        if (i10 != 1) {
        } else {
            super("getVersion");
        }
    }

    @Override // w9.i
    public final o a(h2.h hVar, List list) {
        switch (this.f17361j) {
            case 0:
                return this;
            default:
                return new h(Double.valueOf(0.0d));
        }
    }
}
