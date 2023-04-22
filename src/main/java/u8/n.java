package u8;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final long f15733a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15734b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15735c;
    public final JSONObject d;

    public /* synthetic */ n(long j10, int i10, boolean z10, JSONObject jSONObject) {
        this.f15733a = j10;
        this.f15734b = i10;
        this.f15735c = z10;
        this.d = jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f15733a == nVar.f15733a && this.f15734b == nVar.f15734b && this.f15735c == nVar.f15735c && h9.m.a(this.d, nVar.d);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f15733a), Integer.valueOf(this.f15734b), Boolean.valueOf(this.f15735c), this.d});
    }
}
