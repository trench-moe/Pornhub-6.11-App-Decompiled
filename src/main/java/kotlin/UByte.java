package kotlin;

import com.appsflyer.oaid.BuildConfig;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001tB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u000fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0012J\u001b\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u000fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0012J\u001b\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u000fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0012J\u001b\u00102\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u0010\u000bJ\u001b\u00107\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010\u0012J\u001b\u00107\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u001fJ\u001b\u00107\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u000fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0012J\u001b\u0010?\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010\u000fJ\u001b\u0010H\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bJ\u0010\u0012J\u001b\u0010H\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u001fJ\u001b\u0010H\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0018J\u001b\u0010M\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u000fJ\u001b\u0010M\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\nø\u0001\u0000¢\u0006\u0004\bO\u0010\u0012J\u001b\u0010M\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u001fJ\u001b\u0010M\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0018J\u0010\u0010R\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bS\u0010\u0005J\u0010\u0010T\u001a\u00020UH\u0087\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020YH\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\rH\u0087\b¢\u0006\u0004\b]\u0010-J\u0010\u0010^\u001a\u00020_H\u0087\b¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u0016\u0010j\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010\u0005J\u0016\u0010l\u001a\u00020\u0010H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010-J\u0016\u0010n\u001a\u00020\u0013H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010aJ\u0016\u0010p\u001a\u00020\u0016H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bq\u0010eJ\u001b\u0010r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bs\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006u"}, d2 = {"Lkotlin/UByte;", BuildConfig.FLAVOR, "data", BuildConfig.FLAVOR, "constructor-impl", "(B)B", "getData$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", BuildConfig.FLAVOR, "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-w2LRezQ", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "equals-impl", "(BLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(B)I", "inc", "inc-w2LRezQ", "inv", "inv-w2LRezQ", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toDouble", BuildConfig.FLAVOR, "toDouble-impl", "(B)D", "toFloat", BuildConfig.FLAVOR, "toFloat-impl", "(B)F", "toInt", "toInt-impl", "toLong", BuildConfig.FLAVOR, "toLong-impl", "(B)J", "toShort", BuildConfig.FLAVOR, "toShort-impl", "(B)S", "toString", BuildConfig.FLAVOR, "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes2.dex */
public final class UByte implements Comparable<UByte> {
    public static final Companion Companion = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UByte$Companion;", BuildConfig.FLAVOR, "()V", "MAX_VALUE", "Lkotlin/UByte;", "B", "MIN_VALUE", "SIZE_BITS", BuildConfig.FLAVOR, "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    private /* synthetic */ UByte(byte b10) {
        this.data = b10;
    }

    @InlineOnly
    /* renamed from: and-7apg3OU */
    private static final byte m27and7apg3OU(byte b10, byte b11) {
        return m34constructorimpl((byte) (b10 & b11));
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ UByte m28boximpl(byte b10) {
        return new UByte(b10);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private int m29compareTo7apg3OU(byte b10) {
        return Intrinsics.compare(m83unboximpl() & MAX_VALUE, b10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static int m30compareTo7apg3OU(byte b10, byte b11) {
        return Intrinsics.compare(b10 & MAX_VALUE, b11 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static final int m31compareToVKZWuLQ(byte b10, long j10) {
        return UnsignedKt.ulongCompare(ULong.m188constructorimpl(b10 & 255), j10);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m32compareToWZ4Q5Ns(byte b10, int i10) {
        return UnsignedKt.uintCompare(UInt.m110constructorimpl(b10 & MAX_VALUE), i10);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static final int m33compareToxj2QHRw(byte b10, short s10) {
        return Intrinsics.compare(b10 & MAX_VALUE, s10 & UShort.MAX_VALUE);
    }

    @PublishedApi
    /* renamed from: constructor-impl */
    public static byte m34constructorimpl(byte b10) {
        return b10;
    }

    @InlineOnly
    /* renamed from: dec-w2LRezQ */
    private static final byte m35decw2LRezQ(byte b10) {
        return m34constructorimpl((byte) (b10 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final int m36div7apg3OU(byte b10, byte b11) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(b10 & MAX_VALUE), UInt.m110constructorimpl(b11 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m37divVKZWuLQ(byte b10, long j10) {
        return UnsignedKt.m365ulongDivideeb3DHEI(ULong.m188constructorimpl(b10 & 255), j10);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    private static final int m38divWZ4Q5Ns(byte b10, int i10) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(b10 & MAX_VALUE), i10);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final int m39divxj2QHRw(byte b10, short s10) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(b10 & MAX_VALUE), UInt.m110constructorimpl(s10 & UShort.MAX_VALUE));
    }

    /* renamed from: equals-impl */
    public static boolean m40equalsimpl(byte b10, Object obj) {
        return (obj instanceof UByte) && b10 == ((UByte) obj).m83unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m41equalsimpl0(byte b10, byte b11) {
        return b10 == b11;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final int m42floorDiv7apg3OU(byte b10, byte b11) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(b10 & MAX_VALUE), UInt.m110constructorimpl(b11 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m43floorDivVKZWuLQ(byte b10, long j10) {
        return UnsignedKt.m365ulongDivideeb3DHEI(ULong.m188constructorimpl(b10 & 255), j10);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    private static final int m44floorDivWZ4Q5Ns(byte b10, int i10) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(b10 & MAX_VALUE), i10);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final int m45floorDivxj2QHRw(byte b10, short s10) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(b10 & MAX_VALUE), UInt.m110constructorimpl(s10 & UShort.MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m46hashCodeimpl(byte b10) {
        return b10;
    }

    @InlineOnly
    /* renamed from: inc-w2LRezQ */
    private static final byte m47incw2LRezQ(byte b10) {
        return m34constructorimpl((byte) (b10 + 1));
    }

    @InlineOnly
    /* renamed from: inv-w2LRezQ */
    private static final byte m48invw2LRezQ(byte b10) {
        return m34constructorimpl((byte) (~b10));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final int m49minus7apg3OU(byte b10, byte b11) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b10 & MAX_VALUE) - UInt.m110constructorimpl(b11 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m50minusVKZWuLQ(byte b10, long j10) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(b10 & 255) - j10);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final int m51minusWZ4Q5Ns(byte b10, int i10) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b10 & MAX_VALUE) - i10);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final int m52minusxj2QHRw(byte b10, short s10) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b10 & MAX_VALUE) - UInt.m110constructorimpl(s10 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    private static final byte m53mod7apg3OU(byte b10, byte b11) {
        return m34constructorimpl((byte) UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(b10 & MAX_VALUE), UInt.m110constructorimpl(b11 & MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m54modVKZWuLQ(byte b10, long j10) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(ULong.m188constructorimpl(b10 & 255), j10);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    private static final int m55modWZ4Q5Ns(byte b10, int i10) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(b10 & MAX_VALUE), i10);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    private static final short m56modxj2QHRw(byte b10, short s10) {
        return UShort.m294constructorimpl((short) UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(b10 & MAX_VALUE), UInt.m110constructorimpl(s10 & UShort.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: or-7apg3OU */
    private static final byte m57or7apg3OU(byte b10, byte b11) {
        return m34constructorimpl((byte) (b10 | b11));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final int m58plus7apg3OU(byte b10, byte b11) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b11 & MAX_VALUE) + UInt.m110constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m59plusVKZWuLQ(byte b10, long j10) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(b10 & 255) + j10);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final int m60plusWZ4Q5Ns(byte b10, int i10) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b10 & MAX_VALUE) + i10);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final int m61plusxj2QHRw(byte b10, short s10) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s10 & UShort.MAX_VALUE) + UInt.m110constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-7apg3OU */
    private static final UIntRange m62rangeTo7apg3OU(byte b10, byte b11) {
        return new UIntRange(UInt.m110constructorimpl(b10 & MAX_VALUE), UInt.m110constructorimpl(b11 & MAX_VALUE), null);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final int m63rem7apg3OU(byte b10, byte b11) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(b10 & MAX_VALUE), UInt.m110constructorimpl(b11 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m64remVKZWuLQ(byte b10, long j10) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(ULong.m188constructorimpl(b10 & 255), j10);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    private static final int m65remWZ4Q5Ns(byte b10, int i10) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(b10 & MAX_VALUE), i10);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final int m66remxj2QHRw(byte b10, short s10) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(b10 & MAX_VALUE), UInt.m110constructorimpl(s10 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final int m67times7apg3OU(byte b10, byte b11) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b11 & MAX_VALUE) * UInt.m110constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m68timesVKZWuLQ(byte b10, long j10) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(b10 & 255) * j10);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final int m69timesWZ4Q5Ns(byte b10, int i10) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b10 & MAX_VALUE) * i10);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final int m70timesxj2QHRw(byte b10, short s10) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s10 & UShort.MAX_VALUE) * UInt.m110constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m71toByteimpl(byte b10) {
        return b10;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m72toDoubleimpl(byte b10) {
        return b10 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m73toFloatimpl(byte b10) {
        return b10 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m74toIntimpl(byte b10) {
        return b10 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m75toLongimpl(byte b10) {
        return b10 & 255;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m76toShortimpl(byte b10) {
        return (short) (b10 & 255);
    }

    /* renamed from: toString-impl */
    public static String m77toStringimpl(byte b10) {
        return String.valueOf(b10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m78toUBytew2LRezQ(byte b10) {
        return b10;
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m79toUIntpVg5ArA(byte b10) {
        return UInt.m110constructorimpl(b10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m80toULongsVKNKU(byte b10) {
        return ULong.m188constructorimpl(b10 & 255);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m81toUShortMh2AYeg(byte b10) {
        return UShort.m294constructorimpl((short) (b10 & 255));
    }

    @InlineOnly
    /* renamed from: xor-7apg3OU */
    private static final byte m82xor7apg3OU(byte b10, byte b11) {
        return m34constructorimpl((byte) (b10 ^ b11));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(m83unboximpl() & MAX_VALUE, uByte.m83unboximpl() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m40equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m46hashCodeimpl(this.data);
    }

    public String toString() {
        return m77toStringimpl(this.data);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ byte m83unboximpl() {
        return this.data;
    }
}
