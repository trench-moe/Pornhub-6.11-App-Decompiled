package w9;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class k6 implements d7 {

    /* renamed from: b  reason: collision with root package name */
    public static final q6 f17213b = new i6();

    /* renamed from: a  reason: collision with root package name */
    public final q6 f17214a;

    public k6() {
        q6 q6Var;
        q6[] q6VarArr = new q6[2];
        q6VarArr[0] = q5.f17290a;
        try {
            q6Var = (q6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            q6Var = f17213b;
        }
        q6VarArr[1] = q6Var;
        j6 j6Var = new j6(q6VarArr);
        Charset charset = b6.f17081a;
        this.f17214a = j6Var;
    }
}
