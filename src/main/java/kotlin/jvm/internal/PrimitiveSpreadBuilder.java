package kotlin.jvm.internal;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u001d\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0004*\u00028\u0000H$¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bX\u0082\u0004¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "T", BuildConfig.FLAVOR, "size", BuildConfig.FLAVOR, "(I)V", "position", "getPosition", "()I", "setPosition", "spreads", BuildConfig.FLAVOR, "getSpreads$annotations", "()V", "[Ljava/lang/Object;", "addSpread", BuildConfig.FLAVOR, "spreadArgument", "(Ljava/lang/Object;)V", "toArray", "values", "result", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getSize", "(Ljava/lang/Object;)I", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;
    private final T[] spreads;

    public PrimitiveSpreadBuilder(int i10) {
        this.size = i10;
        this.spreads = (T[]) new Object[i10];
    }

    private static /* synthetic */ void getSpreads$annotations() {
    }

    public final void addSpread(T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        T[] tArr = this.spreads;
        int i10 = this.position;
        this.position = i10 + 1;
        tArr[i10] = spreadArgument;
    }

    public final int getPosition() {
        return this.position;
    }

    public abstract int getSize(T t2);

    public final void setPosition(int i10) {
        this.position = i10;
    }

    public final int size() {
        int i10 = this.size - 1;
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        int i12 = 0;
        while (true) {
            int i13 = i11 + 1;
            T t2 = this.spreads[i11];
            i12 += t2 == null ? 1 : getSize(t2);
            if (i11 == i10) {
                return i12;
            }
            i11 = i13;
        }
    }

    public final T toArray(T values, T result) {
        int i10;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        int i11 = this.size - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int i13 = 0;
            int i14 = 0;
            i10 = 0;
            while (true) {
                int i15 = i13 + 1;
                T t2 = this.spreads[i13];
                if (t2 != null) {
                    if (i14 < i13) {
                        int i16 = i13 - i14;
                        System.arraycopy(values, i14, result, i10, i16);
                        i10 += i16;
                    }
                    int size = getSize(t2);
                    System.arraycopy(t2, 0, result, i10, size);
                    i10 += size;
                    i14 = i15;
                }
                if (i13 == i11) {
                    break;
                }
                i13 = i15;
            }
            i12 = i14;
        } else {
            i10 = 0;
        }
        int i17 = this.size;
        if (i12 < i17) {
            System.arraycopy(values, i12, result, i10, i17 - i12);
        }
        return result;
    }
}
