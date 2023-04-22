package t9;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class c2 implements u2 {

    /* renamed from: b  reason: collision with root package name */
    public static final i2 f15193b = new a2();

    /* renamed from: a  reason: collision with root package name */
    public final i2 f15194a;

    public c2() {
        i2 i2Var;
        i2[] i2VarArr = new i2[2];
        i2VarArr[0] = i1.f15248a;
        try {
            i2Var = (i2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            i2Var = f15193b;
        }
        i2VarArr[1] = i2Var;
        b2 b2Var = new b2(i2VarArr);
        Charset charset = t1.f15353a;
        this.f15194a = b2Var;
    }
}
