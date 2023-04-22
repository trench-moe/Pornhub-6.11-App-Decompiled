package retrofit2;

import gf.t;
import java.util.Objects;
import pe.y;

/* loaded from: classes3.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(t<?> tVar) {
        super("HTTP " + tVar.f10076a.f14065m + " " + tVar.f10076a.f14064j);
        Objects.requireNonNull(tVar, "response == null");
        y yVar = tVar.f10076a;
        this.code = yVar.f14065m;
        this.message = yVar.f14064j;
    }

    public int a() {
        return this.code;
    }

    public String b() {
        return this.message;
    }
}
