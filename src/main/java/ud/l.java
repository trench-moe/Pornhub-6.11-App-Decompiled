package ud;

import kotlin.text.Typography;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f15875a;

    /* renamed from: b  reason: collision with root package name */
    public int f15876b;

    public l(int i10, int i11) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.f15875a = i11;
        this.f15876b = i10;
    }

    public boolean a() {
        return this.f15876b >= this.f15875a;
    }

    public void b(int i10) {
        if (i10 >= 0) {
            if (i10 <= this.f15875a) {
                this.f15876b = i10;
                return;
            }
            StringBuilder n = a1.a.n("pos: ", i10, " > upperBound: ");
            n.append(this.f15875a);
            throw new IndexOutOfBoundsException(n.toString());
        }
        throw new IndexOutOfBoundsException("pos: " + i10 + " < lowerBound: 0");
    }

    public String toString() {
        StringBuilder m10 = a0.a.m('[');
        m10.append(Integer.toString(0));
        m10.append(Typography.greater);
        m10.append(Integer.toString(this.f15876b));
        m10.append(Typography.greater);
        m10.append(Integer.toString(this.f15875a));
        m10.append(']');
        return m10.toString();
    }
}
