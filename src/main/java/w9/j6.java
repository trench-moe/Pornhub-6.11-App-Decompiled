package w9;

/* loaded from: classes2.dex */
public final class j6 implements q6 {

    /* renamed from: a  reason: collision with root package name */
    public final q6[] f17204a;

    public j6(q6... q6VarArr) {
        this.f17204a = q6VarArr;
    }

    @Override // w9.q6
    public final o6 a(Class cls) {
        q6[] q6VarArr = this.f17204a;
        for (int i10 = 0; i10 < 2; i10++) {
            q6 q6Var = q6VarArr[i10];
            if (q6Var.b(cls)) {
                return q6Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // w9.q6
    public final boolean b(Class cls) {
        q6[] q6VarArr = this.f17204a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (q6VarArr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
