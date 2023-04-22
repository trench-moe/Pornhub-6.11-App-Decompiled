package kotlin.time;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.SinceKotlin;

@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", BuildConfig.FLAVOR, "overflow", BuildConfig.FLAVOR, "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalTime
/* loaded from: classes3.dex */
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
    }

    /* renamed from: overflow-LRDsOJo  reason: not valid java name */
    private final void m1450overflowLRDsOJo(long j10) {
        StringBuilder m10 = a.m("TestTimeSource will overflow if its reading ");
        m10.append(this.reading);
        m10.append("ns is advanced by ");
        m10.append((Object) Duration.m1372toStringimpl(j10));
        m10.append('.');
        throw new IllegalStateException(m10.toString());
    }

    /* renamed from: plusAssign-LRDsOJo  reason: not valid java name */
    public final void m1451plusAssignLRDsOJo(long j10) {
        long j11;
        long m1369toLongimpl = Duration.m1369toLongimpl(j10, getUnit());
        if (m1369toLongimpl == Long.MIN_VALUE || m1369toLongimpl == Long.MAX_VALUE) {
            double m1366toDoubleimpl = this.reading + Duration.m1366toDoubleimpl(j10, getUnit());
            if (m1366toDoubleimpl > 9.223372036854776E18d || m1366toDoubleimpl < -9.223372036854776E18d) {
                m1450overflowLRDsOJo(j10);
            }
            j11 = (long) m1366toDoubleimpl;
        } else {
            long j12 = this.reading;
            j11 = j12 + m1369toLongimpl;
            if ((m1369toLongimpl ^ j12) >= 0 && (j12 ^ j11) < 0) {
                m1450overflowLRDsOJo(j10);
            }
        }
        this.reading = j11;
    }

    @Override // kotlin.time.AbstractLongTimeSource
    public long read() {
        return this.reading;
    }
}
