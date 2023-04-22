package d2;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes.dex */
public class l implements m, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f8698a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f8699b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f8700c = new Path();
    public final List<m> d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final MergePaths f8701e;

    public l(MergePaths mergePaths) {
        this.f8701e = mergePaths;
    }

    @TargetApi(19)
    public final void a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.f8699b.reset();
        this.f8698a.reset();
        for (int size = this.d.size() - 1; size >= 1; size--) {
            m mVar = this.d.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> e10 = dVar.e();
                for (int size2 = e10.size() - 1; size2 >= 0; size2--) {
                    Path g10 = e10.get(size2).g();
                    e2.n nVar = dVar.f8655k;
                    if (nVar != null) {
                        matrix2 = nVar.e();
                    } else {
                        dVar.f8648c.reset();
                        matrix2 = dVar.f8648c;
                    }
                    g10.transform(matrix2);
                    this.f8699b.addPath(g10);
                }
            } else {
                this.f8699b.addPath(mVar.g());
            }
        }
        m mVar2 = this.d.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> e11 = dVar2.e();
            for (int i10 = 0; i10 < e11.size(); i10++) {
                Path g11 = e11.get(i10).g();
                e2.n nVar2 = dVar2.f8655k;
                if (nVar2 != null) {
                    matrix = nVar2.e();
                } else {
                    dVar2.f8648c.reset();
                    matrix = dVar2.f8648c;
                }
                g11.transform(matrix);
                this.f8698a.addPath(g11);
            }
        } else {
            this.f8698a.set(mVar2.g());
        }
        this.f8700c.op(this.f8698a, this.f8699b, op);
    }

    @Override // d2.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < this.d.size(); i10++) {
            this.d.get(i10).b(list, list2);
        }
    }

    @Override // d2.j
    public void e(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof m) {
                this.d.add((m) previous);
                listIterator.remove();
            }
        }
    }

    @Override // d2.m
    public Path g() {
        this.f8700c.reset();
        MergePaths mergePaths = this.f8701e;
        if (mergePaths.f4141c) {
            return this.f8700c;
        }
        int ordinal = mergePaths.f4140b.ordinal();
        if (ordinal == 0) {
            for (int i10 = 0; i10 < this.d.size(); i10++) {
                this.f8700c.addPath(this.d.get(i10).g());
            }
        } else if (ordinal == 1) {
            a(Path.Op.UNION);
        } else if (ordinal == 2) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (ordinal == 3) {
            a(Path.Op.INTERSECT);
        } else if (ordinal == 4) {
            a(Path.Op.XOR);
        }
        return this.f8700c;
    }
}
