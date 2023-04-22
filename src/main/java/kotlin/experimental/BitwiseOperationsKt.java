package kotlin.experimental;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0000\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f¨\u0006\u0007"}, d2 = {"and", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "inv", "or", "xor", "kotlin-stdlib"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BitwiseOperationsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte and(byte b10, byte b11) {
        return (byte) (b10 & b11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short and(short s10, short s11) {
        return (short) (s10 & s11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte inv(byte b10) {
        return (byte) (~b10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short inv(short s10) {
        return (short) (~s10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte or(byte b10, byte b11) {
        return (byte) (b10 | b11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short or(short s10, short s11) {
        return (short) (s10 | s11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte xor(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short xor(short s10, short s11) {
        return (short) (s10 ^ s11);
    }
}
