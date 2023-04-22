package j2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import b2.l;
import b2.q;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.Layer;
import e2.m;
import e2.o;
import h2.h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class f extends com.airbnb.lottie.model.layer.a {
    public final RectF A;
    public final Matrix B;
    public final Paint C;
    public final Paint D;
    public final Map<g2.c, List<d2.d>> E;
    public final p.d<String> F;
    public final m G;
    public final l H;
    public final b2.f I;
    public e2.a<Integer, Integer> J;
    public e2.a<Integer, Integer> K;
    public e2.a<Integer, Integer> L;
    public e2.a<Integer, Integer> M;
    public e2.a<Float, Float> N;
    public e2.a<Float, Float> O;
    public e2.a<Float, Float> P;
    public e2.a<Float, Float> Q;
    public e2.a<Float, Float> R;

    /* renamed from: z  reason: collision with root package name */
    public final StringBuilder f11368z;

    /* loaded from: classes2.dex */
    public class a extends Paint {
        public a(f fVar, int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends Paint {
        public b(f fVar, int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    public f(l lVar, Layer layer) {
        super(lVar, layer);
        h2.b bVar;
        h2.b bVar2;
        h2.a aVar;
        h2.a aVar2;
        this.f11368z = new StringBuilder(2);
        this.A = new RectF();
        this.B = new Matrix();
        this.C = new a(this, 1);
        this.D = new b(this, 1);
        this.E = new HashMap();
        this.F = new p.d<>(10);
        this.H = lVar;
        this.I = layer.f4190b;
        m mVar = new m((List) layer.f4203q.f10109b);
        this.G = mVar;
        mVar.f8994a.add(this);
        e(mVar);
        h hVar = layer.f4204r;
        if (hVar != null && (aVar2 = (h2.a) hVar.f10097a) != null) {
            e2.a<Integer, Integer> a10 = aVar2.a();
            this.J = a10;
            a10.f8994a.add(this);
            e(this.J);
        }
        if (hVar != null && (aVar = (h2.a) hVar.f10098b) != null) {
            e2.a<Integer, Integer> a11 = aVar.a();
            this.L = a11;
            a11.f8994a.add(this);
            e(this.L);
        }
        if (hVar != null && (bVar2 = (h2.b) hVar.f10099c) != null) {
            e2.a<Float, Float> a12 = bVar2.a();
            this.N = a12;
            a12.f8994a.add(this);
            e(this.N);
        }
        if (hVar == null || (bVar = (h2.b) hVar.d) == null) {
            return;
        }
        e2.a<Float, Float> a13 = bVar.a();
        this.P = a13;
        a13.f8994a.add(this);
        e(this.P);
    }

    @Override // com.airbnb.lottie.model.layer.a, d2.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.I.f3456j.width(), this.I.f3456j.height());
    }

    @Override // com.airbnb.lottie.model.layer.a, g2.e
    public <T> void h(T t2, n2.c cVar) {
        this.f4235v.c(t2, cVar);
        if (t2 == q.f3517a) {
            e2.a<Integer, Integer> aVar = this.K;
            if (aVar != null) {
                this.f4234u.remove(aVar);
            }
            if (cVar == null) {
                this.K = null;
                return;
            }
            o oVar = new o(cVar, null);
            this.K = oVar;
            oVar.f8994a.add(this);
            e(this.K);
        } else if (t2 == q.f3518b) {
            e2.a<Integer, Integer> aVar2 = this.M;
            if (aVar2 != null) {
                this.f4234u.remove(aVar2);
            }
            if (cVar == null) {
                this.M = null;
                return;
            }
            o oVar2 = new o(cVar, null);
            this.M = oVar2;
            oVar2.f8994a.add(this);
            e(this.M);
        } else if (t2 == q.f3531q) {
            e2.a<Float, Float> aVar3 = this.O;
            if (aVar3 != null) {
                this.f4234u.remove(aVar3);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            o oVar3 = new o(cVar, null);
            this.O = oVar3;
            oVar3.f8994a.add(this);
            e(this.O);
        } else if (t2 == q.f3532r) {
            e2.a<Float, Float> aVar4 = this.Q;
            if (aVar4 != null) {
                this.f4234u.remove(aVar4);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            o oVar4 = new o(cVar, null);
            this.Q = oVar4;
            oVar4.f8994a.add(this);
            e(this.Q);
        } else if (t2 == q.D) {
            e2.a<Float, Float> aVar5 = this.R;
            if (aVar5 != null) {
                this.f4234u.remove(aVar5);
            }
            if (cVar == null) {
                this.R = null;
                return;
            }
            o oVar5 = new o(cVar, null);
            this.R = oVar5;
            oVar5.f8994a.add(this);
            e(this.R);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x03db  */
    @Override // com.airbnb.lottie.model.layer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.f.k(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void s(DocumentData.Justification justification, Canvas canvas, float f10) {
        int ordinal = justification.ordinal();
        if (ordinal == 1) {
            canvas.translate(-f10, 0.0f);
        } else if (ordinal != 2) {
        } else {
            canvas.translate((-f10) / 2.0f, 0.0f);
        }
    }

    public final void t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public final void u(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final List<String> v(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }
}
