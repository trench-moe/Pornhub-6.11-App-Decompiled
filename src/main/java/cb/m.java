package cb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import cb.n;
import java.util.List;

/* loaded from: classes.dex */
public class m extends n.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f3994b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Matrix f3995c;

    public m(n nVar, List list, Matrix matrix) {
        this.f3994b = list;
        this.f3995c = matrix;
    }

    @Override // cb.n.f
    public void a(Matrix matrix, bb.a aVar, int i10, Canvas canvas) {
        for (n.f fVar : this.f3994b) {
            fVar.a(this.f3995c, aVar, i10, canvas);
        }
    }
}
