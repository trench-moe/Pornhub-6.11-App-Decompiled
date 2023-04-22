package p000if;

import bf.h;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.g;
import gf.f;
import okio.ByteString;
import pe.a0;

/* renamed from: if.c  reason: invalid package */
/* loaded from: classes2.dex */
public final class c<T> implements f<a0, T> {

    /* renamed from: b  reason: collision with root package name */
    public static final ByteString f10708b = ByteString.f13728m.b("EFBBBF");

    /* renamed from: a  reason: collision with root package name */
    public final com.squareup.moshi.f<T> f10709a;

    public c(com.squareup.moshi.f<T> fVar) {
        this.f10709a = fVar;
    }

    @Override // gf.f
    public Object a(a0 a0Var) {
        a0 a0Var2 = a0Var;
        h f10 = a0Var2.f();
        try {
            ByteString byteString = f10708b;
            if (f10.Q(0L, byteString)) {
                f10.l(byteString.f());
            }
            g gVar = new g(f10);
            T fromJson = this.f10709a.fromJson(gVar);
            if (gVar.v() == JsonReader.Token.END_DOCUMENT) {
                return fromJson;
            }
            throw new JsonDataException("JSON document was not fully consumed.");
        } finally {
            a0Var2.close();
        }
    }
}
