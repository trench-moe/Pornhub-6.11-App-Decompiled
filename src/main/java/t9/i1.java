package t9;

/* loaded from: classes2.dex */
public final class i1 implements i2 {

    /* renamed from: a  reason: collision with root package name */
    public static final i1 f15248a = new i1();

    @Override // t9.i2
    public final h2 a(Class<?> cls) {
        if (!com.google.android.gms.internal.cast.l1.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (h2) com.google.android.gms.internal.cast.l1.j(cls.asSubclass(com.google.android.gms.internal.cast.l1.class)).e(3, null, null);
        } catch (Exception e10) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
        }
    }

    @Override // t9.i2
    public final boolean b(Class<?> cls) {
        return com.google.android.gms.internal.cast.l1.class.isAssignableFrom(cls);
    }
}
