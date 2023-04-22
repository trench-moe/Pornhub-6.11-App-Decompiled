package v1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import e0.d;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class g extends v1.f {

    /* renamed from: z  reason: collision with root package name */
    public static final PorterDuff.Mode f15938z = PorterDuff.Mode.SRC_IN;

    /* renamed from: f  reason: collision with root package name */
    public h f15939f;

    /* renamed from: j  reason: collision with root package name */
    public PorterDuffColorFilter f15940j;

    /* renamed from: m  reason: collision with root package name */
    public ColorFilter f15941m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public boolean f15942t;

    /* renamed from: u  reason: collision with root package name */
    public final float[] f15943u;

    /* renamed from: w  reason: collision with root package name */
    public final Matrix f15944w;
    public final Rect y;

    /* loaded from: classes2.dex */
    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public int[] f15945e;

        /* renamed from: f  reason: collision with root package name */
        public d0.c f15946f;

        /* renamed from: g  reason: collision with root package name */
        public float f15947g;

        /* renamed from: h  reason: collision with root package name */
        public d0.c f15948h;

        /* renamed from: i  reason: collision with root package name */
        public float f15949i;

        /* renamed from: j  reason: collision with root package name */
        public float f15950j;

        /* renamed from: k  reason: collision with root package name */
        public float f15951k;

        /* renamed from: l  reason: collision with root package name */
        public float f15952l;

        /* renamed from: m  reason: collision with root package name */
        public float f15953m;
        public Paint.Cap n;

        /* renamed from: o  reason: collision with root package name */
        public Paint.Join f15954o;

        /* renamed from: p  reason: collision with root package name */
        public float f15955p;

        public c() {
            this.f15947g = 0.0f;
            this.f15949i = 1.0f;
            this.f15950j = 1.0f;
            this.f15951k = 0.0f;
            this.f15952l = 1.0f;
            this.f15953m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.f15954o = Paint.Join.MITER;
            this.f15955p = 4.0f;
        }

        public c(c cVar) {
            super(cVar);
            this.f15947g = 0.0f;
            this.f15949i = 1.0f;
            this.f15950j = 1.0f;
            this.f15951k = 0.0f;
            this.f15952l = 1.0f;
            this.f15953m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.f15954o = Paint.Join.MITER;
            this.f15955p = 4.0f;
            this.f15945e = cVar.f15945e;
            this.f15946f = cVar.f15946f;
            this.f15947g = cVar.f15947g;
            this.f15949i = cVar.f15949i;
            this.f15948h = cVar.f15948h;
            this.f15970c = cVar.f15970c;
            this.f15950j = cVar.f15950j;
            this.f15951k = cVar.f15951k;
            this.f15952l = cVar.f15952l;
            this.f15953m = cVar.f15953m;
            this.n = cVar.n;
            this.f15954o = cVar.f15954o;
            this.f15955p = cVar.f15955p;
        }

        @Override // v1.g.e
        public boolean a() {
            return this.f15948h.c() || this.f15946f.c();
        }

        @Override // v1.g.e
        public boolean b(int[] iArr) {
            return this.f15946f.d(iArr) | this.f15948h.d(iArr);
        }

        public float getFillAlpha() {
            return this.f15950j;
        }

        public int getFillColor() {
            return this.f15948h.f8595c;
        }

        public float getStrokeAlpha() {
            return this.f15949i;
        }

        public int getStrokeColor() {
            return this.f15946f.f8595c;
        }

        public float getStrokeWidth() {
            return this.f15947g;
        }

        public float getTrimPathEnd() {
            return this.f15952l;
        }

        public float getTrimPathOffset() {
            return this.f15953m;
        }

        public float getTrimPathStart() {
            return this.f15951k;
        }

        public void setFillAlpha(float f10) {
            this.f15950j = f10;
        }

        public void setFillColor(int i10) {
            this.f15948h.f8595c = i10;
        }

        public void setStrokeAlpha(float f10) {
            this.f15949i = f10;
        }

        public void setStrokeColor(int i10) {
            this.f15946f.f8595c = i10;
        }

        public void setStrokeWidth(float f10) {
            this.f15947g = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f15952l = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f15953m = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f15951k = f10;
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f15956a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<e> f15957b;

        /* renamed from: c  reason: collision with root package name */
        public float f15958c;
        public float d;

        /* renamed from: e  reason: collision with root package name */
        public float f15959e;

        /* renamed from: f  reason: collision with root package name */
        public float f15960f;

        /* renamed from: g  reason: collision with root package name */
        public float f15961g;

        /* renamed from: h  reason: collision with root package name */
        public float f15962h;

        /* renamed from: i  reason: collision with root package name */
        public float f15963i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f15964j;

        /* renamed from: k  reason: collision with root package name */
        public int f15965k;

        /* renamed from: l  reason: collision with root package name */
        public int[] f15966l;

        /* renamed from: m  reason: collision with root package name */
        public String f15967m;

        public d() {
            super(null);
            this.f15956a = new Matrix();
            this.f15957b = new ArrayList<>();
            this.f15958c = 0.0f;
            this.d = 0.0f;
            this.f15959e = 0.0f;
            this.f15960f = 1.0f;
            this.f15961g = 1.0f;
            this.f15962h = 0.0f;
            this.f15963i = 0.0f;
            this.f15964j = new Matrix();
            this.f15967m = null;
        }

        public d(d dVar, p.a<String, Object> aVar) {
            super(null);
            f bVar;
            this.f15956a = new Matrix();
            this.f15957b = new ArrayList<>();
            this.f15958c = 0.0f;
            this.d = 0.0f;
            this.f15959e = 0.0f;
            this.f15960f = 1.0f;
            this.f15961g = 1.0f;
            this.f15962h = 0.0f;
            this.f15963i = 0.0f;
            Matrix matrix = new Matrix();
            this.f15964j = matrix;
            this.f15967m = null;
            this.f15958c = dVar.f15958c;
            this.d = dVar.d;
            this.f15959e = dVar.f15959e;
            this.f15960f = dVar.f15960f;
            this.f15961g = dVar.f15961g;
            this.f15962h = dVar.f15962h;
            this.f15963i = dVar.f15963i;
            this.f15966l = dVar.f15966l;
            String str = dVar.f15967m;
            this.f15967m = str;
            this.f15965k = dVar.f15965k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f15964j);
            ArrayList<e> arrayList = dVar.f15957b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f15957b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (!(eVar instanceof b)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        bVar = new b((b) eVar);
                    }
                    this.f15957b.add(bVar);
                    String str2 = bVar.f15969b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        @Override // v1.g.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f15957b.size(); i10++) {
                if (this.f15957b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // v1.g.e
        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f15957b.size(); i10++) {
                z10 |= this.f15957b.get(i10).b(iArr);
            }
            return z10;
        }

        public final void c() {
            this.f15964j.reset();
            this.f15964j.postTranslate(-this.d, -this.f15959e);
            this.f15964j.postScale(this.f15960f, this.f15961g);
            this.f15964j.postRotate(this.f15958c, 0.0f, 0.0f);
            this.f15964j.postTranslate(this.f15962h + this.d, this.f15963i + this.f15959e);
        }

        public String getGroupName() {
            return this.f15967m;
        }

        public Matrix getLocalMatrix() {
            return this.f15964j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.f15959e;
        }

        public float getRotation() {
            return this.f15958c;
        }

        public float getScaleX() {
            return this.f15960f;
        }

        public float getScaleY() {
            return this.f15961g;
        }

        public float getTranslateX() {
            return this.f15962h;
        }

        public float getTranslateY() {
            return this.f15963i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.d) {
                this.d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f15959e) {
                this.f15959e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f15958c) {
                this.f15958c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f15960f) {
                this.f15960f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f15961g) {
                this.f15961g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f15962h) {
                this.f15962h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f15963i) {
                this.f15963i = f10;
                c();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e {
        public e() {
        }

        public e(a aVar) {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        public d.a[] f15968a;

        /* renamed from: b  reason: collision with root package name */
        public String f15969b;

        /* renamed from: c  reason: collision with root package name */
        public int f15970c;
        public int d;

        public f() {
            super(null);
            this.f15968a = null;
            this.f15970c = 0;
        }

        public f(f fVar) {
            super(null);
            this.f15968a = null;
            this.f15970c = 0;
            this.f15969b = fVar.f15969b;
            this.d = fVar.d;
            this.f15968a = e0.d.e(fVar.f15968a);
        }

        public d.a[] getPathData() {
            return this.f15968a;
        }

        public String getPathName() {
            return this.f15969b;
        }

        public void setPathData(d.a[] aVarArr) {
            if (!e0.d.a(this.f15968a, aVarArr)) {
                this.f15968a = e0.d.e(aVarArr);
                return;
            }
            d.a[] aVarArr2 = this.f15968a;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                aVarArr2[i10].f8971a = aVarArr[i10].f8971a;
                for (int i11 = 0; i11 < aVarArr[i10].f8972b.length; i11++) {
                    aVarArr2[i10].f8972b[i11] = aVarArr[i10].f8972b[i11];
                }
            }
        }
    }

    /* renamed from: v1.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0279g {

        /* renamed from: q  reason: collision with root package name */
        public static final Matrix f15971q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f15972a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f15973b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f15974c;
        public Paint d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f15975e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f15976f;

        /* renamed from: g  reason: collision with root package name */
        public int f15977g;

        /* renamed from: h  reason: collision with root package name */
        public final d f15978h;

        /* renamed from: i  reason: collision with root package name */
        public float f15979i;

        /* renamed from: j  reason: collision with root package name */
        public float f15980j;

        /* renamed from: k  reason: collision with root package name */
        public float f15981k;

        /* renamed from: l  reason: collision with root package name */
        public float f15982l;

        /* renamed from: m  reason: collision with root package name */
        public int f15983m;
        public String n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f15984o;

        /* renamed from: p  reason: collision with root package name */
        public final p.a<String, Object> f15985p;

        public C0279g() {
            this.f15974c = new Matrix();
            this.f15979i = 0.0f;
            this.f15980j = 0.0f;
            this.f15981k = 0.0f;
            this.f15982l = 0.0f;
            this.f15983m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.n = null;
            this.f15984o = null;
            this.f15985p = new p.a<>();
            this.f15978h = new d();
            this.f15972a = new Path();
            this.f15973b = new Path();
        }

        public C0279g(C0279g c0279g) {
            this.f15974c = new Matrix();
            this.f15979i = 0.0f;
            this.f15980j = 0.0f;
            this.f15981k = 0.0f;
            this.f15982l = 0.0f;
            this.f15983m = KotlinVersion.MAX_COMPONENT_VALUE;
            this.n = null;
            this.f15984o = null;
            p.a<String, Object> aVar = new p.a<>();
            this.f15985p = aVar;
            this.f15978h = new d(c0279g.f15978h, aVar);
            this.f15972a = new Path(c0279g.f15972a);
            this.f15973b = new Path(c0279g.f15973b);
            this.f15979i = c0279g.f15979i;
            this.f15980j = c0279g.f15980j;
            this.f15981k = c0279g.f15981k;
            this.f15982l = c0279g.f15982l;
            this.f15977g = c0279g.f15977g;
            this.f15983m = c0279g.f15983m;
            this.n = c0279g.n;
            String str = c0279g.n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f15984o = c0279g.f15984o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v19 */
        public final void a(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            C0279g c0279g;
            C0279g c0279g2 = this;
            dVar.f15956a.set(matrix);
            dVar.f15956a.preConcat(dVar.f15964j);
            canvas.save();
            ?? r11 = 0;
            int i12 = 0;
            while (i12 < dVar.f15957b.size()) {
                e eVar = dVar.f15957b.get(i12);
                if (eVar instanceof d) {
                    a((d) eVar, dVar.f15956a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    f fVar = (f) eVar;
                    float f10 = i10 / c0279g2.f15981k;
                    float f11 = i11 / c0279g2.f15982l;
                    float min = Math.min(f10, f11);
                    Matrix matrix2 = dVar.f15956a;
                    c0279g2.f15974c.set(matrix2);
                    c0279g2.f15974c.postScale(f10, f11);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f12 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot(fArr[r11], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f12) / max : 0.0f;
                    if (abs == 0.0f) {
                        c0279g = this;
                    } else {
                        c0279g = this;
                        Path path = c0279g.f15972a;
                        Objects.requireNonNull(fVar);
                        path.reset();
                        d.a[] aVarArr = fVar.f15968a;
                        if (aVarArr != null) {
                            d.a.b(aVarArr, path);
                        }
                        Path path2 = c0279g.f15972a;
                        c0279g.f15973b.reset();
                        if (fVar instanceof b) {
                            c0279g.f15973b.setFillType(fVar.f15970c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            c0279g.f15973b.addPath(path2, c0279g.f15974c);
                            canvas.clipPath(c0279g.f15973b);
                        } else {
                            c cVar = (c) fVar;
                            float f13 = cVar.f15951k;
                            if (f13 != 0.0f || cVar.f15952l != 1.0f) {
                                float f14 = cVar.f15953m;
                                float f15 = (f13 + f14) % 1.0f;
                                float f16 = (cVar.f15952l + f14) % 1.0f;
                                if (c0279g.f15976f == null) {
                                    c0279g.f15976f = new PathMeasure();
                                }
                                c0279g.f15976f.setPath(c0279g.f15972a, r11);
                                float length = c0279g.f15976f.getLength();
                                float f17 = f15 * length;
                                float f18 = f16 * length;
                                path2.reset();
                                if (f17 > f18) {
                                    c0279g.f15976f.getSegment(f17, length, path2, true);
                                    c0279g.f15976f.getSegment(0.0f, f18, path2, true);
                                } else {
                                    c0279g.f15976f.getSegment(f17, f18, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            c0279g.f15973b.addPath(path2, c0279g.f15974c);
                            d0.c cVar2 = cVar.f15948h;
                            if (cVar2.b() || cVar2.f8595c != 0) {
                                d0.c cVar3 = cVar.f15948h;
                                if (c0279g.f15975e == null) {
                                    Paint paint = new Paint(1);
                                    c0279g.f15975e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = c0279g.f15975e;
                                if (cVar3.b()) {
                                    Shader shader = cVar3.f8593a;
                                    shader.setLocalMatrix(c0279g.f15974c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(cVar.f15950j * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                    int i13 = cVar3.f8595c;
                                    float f19 = cVar.f15950j;
                                    PorterDuff.Mode mode = g.f15938z;
                                    paint2.setColor((i13 & 16777215) | (((int) (Color.alpha(i13) * f19)) << 24));
                                }
                                paint2.setColorFilter(colorFilter);
                                c0279g.f15973b.setFillType(cVar.f15970c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(c0279g.f15973b, paint2);
                            }
                            d0.c cVar4 = cVar.f15946f;
                            if (cVar4.b() || cVar4.f8595c != 0) {
                                d0.c cVar5 = cVar.f15946f;
                                if (c0279g.d == null) {
                                    Paint paint3 = new Paint(1);
                                    c0279g.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = c0279g.d;
                                Paint.Join join = cVar.f15954o;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = cVar.n;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(cVar.f15955p);
                                if (cVar5.b()) {
                                    Shader shader2 = cVar5.f8593a;
                                    shader2.setLocalMatrix(c0279g.f15974c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(cVar.f15949i * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                                    int i14 = cVar5.f8595c;
                                    float f20 = cVar.f15949i;
                                    PorterDuff.Mode mode2 = g.f15938z;
                                    paint4.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f20)) << 24));
                                }
                                paint4.setColorFilter(colorFilter);
                                paint4.setStrokeWidth(cVar.f15947g * abs * min);
                                canvas.drawPath(c0279g.f15973b, paint4);
                            }
                        }
                    }
                    i12++;
                    c0279g2 = c0279g;
                    r11 = 0;
                }
                c0279g = c0279g2;
                i12++;
                c0279g2 = c0279g;
                r11 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f15983m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f15983m = i10;
        }
    }

    /* loaded from: classes2.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f15986a;

        /* renamed from: b  reason: collision with root package name */
        public C0279g f15987b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f15988c;
        public PorterDuff.Mode d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f15989e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f15990f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f15991g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f15992h;

        /* renamed from: i  reason: collision with root package name */
        public int f15993i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f15994j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f15995k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f15996l;

        public h() {
            this.f15988c = null;
            this.d = g.f15938z;
            this.f15987b = new C0279g();
        }

        public h(h hVar) {
            this.f15988c = null;
            this.d = g.f15938z;
            if (hVar != null) {
                this.f15986a = hVar.f15986a;
                C0279g c0279g = new C0279g(hVar.f15987b);
                this.f15987b = c0279g;
                if (hVar.f15987b.f15975e != null) {
                    c0279g.f15975e = new Paint(hVar.f15987b.f15975e);
                }
                if (hVar.f15987b.d != null) {
                    this.f15987b.d = new Paint(hVar.f15987b.d);
                }
                this.f15988c = hVar.f15988c;
                this.d = hVar.d;
                this.f15989e = hVar.f15989e;
            }
        }

        public boolean a() {
            C0279g c0279g = this.f15987b;
            if (c0279g.f15984o == null) {
                c0279g.f15984o = Boolean.valueOf(c0279g.f15978h.a());
            }
            return c0279g.f15984o.booleanValue();
        }

        public void b(int i10, int i11) {
            this.f15990f.eraseColor(0);
            Canvas canvas = new Canvas(this.f15990f);
            C0279g c0279g = this.f15987b;
            c0279g.a(c0279g.f15978h, C0279g.f15971q, canvas, i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f15986a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    /* loaded from: classes2.dex */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f15997a;

        public i(Drawable.ConstantState constantState) {
            this.f15997a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f15997a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f15997a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f15937c = (VectorDrawable) this.f15997a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f15937c = (VectorDrawable) this.f15997a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f15937c = (VectorDrawable) this.f15997a.newDrawable(resources, theme);
            return gVar;
        }
    }

    public g() {
        this.f15942t = true;
        this.f15943u = new float[9];
        this.f15944w = new Matrix();
        this.y = new Rect();
        this.f15939f = new h();
    }

    public g(h hVar) {
        this.f15942t = true;
        this.f15943u = new float[9];
        this.f15944w = new Matrix();
        this.y = new Rect();
        this.f15939f = hVar;
        this.f15940j = b(hVar.f15988c, hVar.d);
    }

    public static g a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    public PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.canApplyTheme();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x010d, code lost:
        if ((r10 == r7.getWidth() && r10 == r6.f15990f.getHeight()) == false) goto L68;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.g.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getAlpha() : this.f15939f.f15987b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f15939f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getColorFilter() : this.f15941m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f15937c == null || Build.VERSION.SDK_INT < 24) {
            this.f15939f.f15986a = getChangingConfigurations();
            return this.f15939f;
        }
        return new i(this.f15937c.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f15939f.f15987b.f15980j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f15939f.f15987b.f15979i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void inflate(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.g.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.isAutoMirrored() : this.f15939f.f15989e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful() && ((hVar = this.f15939f) == null || (!hVar.a() && ((colorStateList = this.f15939f.f15988c) == null || !colorStateList.isStateful())))) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.n && super.mutate() == this) {
            this.f15939f = new h(this.f15939f);
            this.n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        h hVar = this.f15939f;
        ColorStateList colorStateList = hVar.f15988c;
        if (colorStateList != null && (mode = hVar.d) != null) {
            this.f15940j = b(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (hVar.a()) {
            boolean b10 = hVar.f15987b.f15978h.b(iArr);
            hVar.f15995k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setAlpha(i10);
            return;
        }
        if (this.f15939f.f15987b.getRootAlpha() != i10) {
            this.f15939f.f15987b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f15939f.f15989e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f15941m = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            f0.a.d(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            f0.a.e(drawable, colorStateList);
            return;
        }
        h hVar = this.f15939f;
        if (hVar.f15988c != colorStateList) {
            hVar.f15988c = colorStateList;
            this.f15940j = b(colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            f0.a.f(drawable, mode);
            return;
        }
        h hVar = this.f15939f;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.f15940j = b(hVar.f15988c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
