package t9;

/* loaded from: classes2.dex */
public final class b2 implements i2 {

    /* renamed from: a  reason: collision with root package name */
    public final i2[] f15181a;

    public b2(i2... i2VarArr) {
        this.f15181a = i2VarArr;
    }

    @Override // t9.i2
    public final h2 a(Class<?> cls) {
        i2[] i2VarArr = this.f15181a;
        for (int i10 = 0; i10 < 2; i10++) {
            i2 i2Var = i2VarArr[i10];
            if (i2Var.b(cls)) {
                return i2Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // t9.i2
    public final boolean b(Class<?> cls) {
        i2[] i2VarArr = this.f15181a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i2VarArr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
