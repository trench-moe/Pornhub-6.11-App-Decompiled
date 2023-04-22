package kotlin;

import com.appsflyer.oaid.BuildConfig;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 |2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001|B\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001dJ\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u001fJ\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010\u000bJ\u001b\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010\u0005J\u0016\u00102\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u0010\u0005J\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001dJ\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u001fJ\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b7\u0010\u000bJ\u001b\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\b8\u0010\"J\u001b\u00109\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001b\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010\u0013J\u001b\u00109\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010\u000bJ\u001b\u00109\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bA\u0010\u000bJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u001dJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bD\u0010\u001fJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bE\u0010\u000bJ\u001b\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010\"J\u001b\u0010G\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u001b\u0010K\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u001dJ\u001b\u0010K\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bM\u0010\u001fJ\u001b\u0010K\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u000bJ\u001b\u0010K\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bO\u0010\"J\u001e\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\rH\u0087\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010\u001fJ\u001e\u0010S\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\rH\u0087\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010\u001fJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bV\u0010\u001dJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bW\u0010\u001fJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bX\u0010\u000bJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\nø\u0001\u0000¢\u0006\u0004\bY\u0010\"J\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020_H\u0087\b¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\rH\u0087\b¢\u0006\u0004\bg\u0010/J\u0010\u0010h\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bi\u0010\u0005J\u0010\u0010j\u001a\u00020kH\u0087\b¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020oH\u0016¢\u0006\u0004\bp\u0010qJ\u0016\u0010r\u001a\u00020\u000eH\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bs\u0010]J\u0016\u0010t\u001a\u00020\u0011H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bu\u0010/J\u0016\u0010v\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bw\u0010\u0005J\u0016\u0010x\u001a\u00020\u0016H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\by\u0010mJ\u001b\u0010z\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b{\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006}"}, d2 = {"Lkotlin/ULong;", BuildConfig.FLAVOR, "data", BuildConfig.FLAVOR, "constructor-impl", "(J)J", "getData$annotations", "()V", "and", "other", "and-VKZWuLQ", "(JJ)J", "compareTo", BuildConfig.FLAVOR, "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-s-VKNKU", "div", "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "equals-impl", "(JLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(J)I", "inc", "inc-s-VKNKU", "inv", "inv-s-VKNKU", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(JB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(JS)S", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", BuildConfig.FLAVOR, "toByte-impl", "(J)B", "toDouble", BuildConfig.FLAVOR, "toDouble-impl", "(J)D", "toFloat", BuildConfig.FLAVOR, "toFloat-impl", "(J)F", "toInt", "toInt-impl", "toLong", "toLong-impl", "toShort", BuildConfig.FLAVOR, "toShort-impl", "(J)S", "toString", BuildConfig.FLAVOR, "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes2.dex */
public final class ULong implements Comparable<ULong> {
    public static final Companion Companion = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/ULong$Companion;", BuildConfig.FLAVOR, "()V", "MAX_VALUE", "Lkotlin/ULong;", "J", "MIN_VALUE", "SIZE_BITS", BuildConfig.FLAVOR, "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    private /* synthetic */ ULong(long j10) {
        this.data = j10;
    }

    @InlineOnly
    /* renamed from: and-VKZWuLQ */
    private static final long m181andVKZWuLQ(long j10, long j11) {
        return m188constructorimpl(j10 & j11);
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ ULong m182boximpl(long j10) {
        return new ULong(j10);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static final int m183compareTo7apg3OU(long j10, byte b10) {
        return UnsignedKt.ulongCompare(j10, m188constructorimpl(b10 & 255));
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private int m184compareToVKZWuLQ(long j10) {
        return UnsignedKt.ulongCompare(m239unboximpl(), j10);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static int m185compareToVKZWuLQ(long j10, long j11) {
        return UnsignedKt.ulongCompare(j10, j11);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m186compareToWZ4Q5Ns(long j10, int i10) {
        return UnsignedKt.ulongCompare(j10, m188constructorimpl(i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static final int m187compareToxj2QHRw(long j10, short s10) {
        return UnsignedKt.ulongCompare(j10, m188constructorimpl(s10 & 65535));
    }

    @PublishedApi
    /* renamed from: constructor-impl */
    public static long m188constructorimpl(long j10) {
        return j10;
    }

    @InlineOnly
    /* renamed from: dec-s-VKNKU */
    private static final long m189decsVKNKU(long j10) {
        return m188constructorimpl(j10 - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final long m190div7apg3OU(long j10, byte b10) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j10, m188constructorimpl(b10 & 255));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m191divVKZWuLQ(long j10, long j11) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j10, j11);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    private static final long m192divWZ4Q5Ns(long j10, int i10) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j10, m188constructorimpl(i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final long m193divxj2QHRw(long j10, short s10) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j10, m188constructorimpl(s10 & 65535));
    }

    /* renamed from: equals-impl */
    public static boolean m194equalsimpl(long j10, Object obj) {
        return (obj instanceof ULong) && j10 == ((ULong) obj).m239unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m195equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final long m196floorDiv7apg3OU(long j10, byte b10) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j10, m188constructorimpl(b10 & 255));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m197floorDivVKZWuLQ(long j10, long j11) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j10, j11);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    private static final long m198floorDivWZ4Q5Ns(long j10, int i10) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j10, m188constructorimpl(i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final long m199floorDivxj2QHRw(long j10, short s10) {
        return UnsignedKt.m365ulongDivideeb3DHEI(j10, m188constructorimpl(s10 & 65535));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m200hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    @InlineOnly
    /* renamed from: inc-s-VKNKU */
    private static final long m201incsVKNKU(long j10) {
        return m188constructorimpl(j10 + 1);
    }

    @InlineOnly
    /* renamed from: inv-s-VKNKU */
    private static final long m202invsVKNKU(long j10) {
        return m188constructorimpl(~j10);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final long m203minus7apg3OU(long j10, byte b10) {
        return m188constructorimpl(j10 - m188constructorimpl(b10 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m204minusVKZWuLQ(long j10, long j11) {
        return m188constructorimpl(j10 - j11);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final long m205minusWZ4Q5Ns(long j10, int i10) {
        return m188constructorimpl(j10 - m188constructorimpl(i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final long m206minusxj2QHRw(long j10, short s10) {
        return m188constructorimpl(j10 - m188constructorimpl(s10 & 65535));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    private static final byte m207mod7apg3OU(long j10, byte b10) {
        return UByte.m34constructorimpl((byte) UnsignedKt.m366ulongRemaindereb3DHEI(j10, m188constructorimpl(b10 & 255)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m208modVKZWuLQ(long j10, long j11) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(j10, j11);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    private static final int m209modWZ4Q5Ns(long j10, int i10) {
        return UInt.m110constructorimpl((int) UnsignedKt.m366ulongRemaindereb3DHEI(j10, m188constructorimpl(i10 & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    private static final short m210modxj2QHRw(long j10, short s10) {
        return UShort.m294constructorimpl((short) UnsignedKt.m366ulongRemaindereb3DHEI(j10, m188constructorimpl(s10 & 65535)));
    }

    @InlineOnly
    /* renamed from: or-VKZWuLQ */
    private static final long m211orVKZWuLQ(long j10, long j11) {
        return m188constructorimpl(j10 | j11);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final long m212plus7apg3OU(long j10, byte b10) {
        return m188constructorimpl(m188constructorimpl(b10 & 255) + j10);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m213plusVKZWuLQ(long j10, long j11) {
        return m188constructorimpl(j10 + j11);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final long m214plusWZ4Q5Ns(long j10, int i10) {
        return m188constructorimpl(m188constructorimpl(i10 & 4294967295L) + j10);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final long m215plusxj2QHRw(long j10, short s10) {
        return m188constructorimpl(m188constructorimpl(s10 & 65535) + j10);
    }

    @InlineOnly
    /* renamed from: rangeTo-VKZWuLQ */
    private static final ULongRange m216rangeToVKZWuLQ(long j10, long j11) {
        return new ULongRange(j10, j11, null);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final long m217rem7apg3OU(long j10, byte b10) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(j10, m188constructorimpl(b10 & 255));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m218remVKZWuLQ(long j10, long j11) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(j10, j11);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    private static final long m219remWZ4Q5Ns(long j10, int i10) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(j10, m188constructorimpl(i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final long m220remxj2QHRw(long j10, short s10) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(j10, m188constructorimpl(s10 & 65535));
    }

    @InlineOnly
    /* renamed from: shl-s-VKNKU */
    private static final long m221shlsVKNKU(long j10, int i10) {
        return m188constructorimpl(j10 << i10);
    }

    @InlineOnly
    /* renamed from: shr-s-VKNKU */
    private static final long m222shrsVKNKU(long j10, int i10) {
        return m188constructorimpl(j10 >>> i10);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final long m223times7apg3OU(long j10, byte b10) {
        return m188constructorimpl(m188constructorimpl(b10 & 255) * j10);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m224timesVKZWuLQ(long j10, long j11) {
        return m188constructorimpl(j10 * j11);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final long m225timesWZ4Q5Ns(long j10, int i10) {
        return m188constructorimpl(m188constructorimpl(i10 & 4294967295L) * j10);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final long m226timesxj2QHRw(long j10, short s10) {
        return m188constructorimpl(m188constructorimpl(s10 & 65535) * j10);
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m227toByteimpl(long j10) {
        return (byte) j10;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m228toDoubleimpl(long j10) {
        return UnsignedKt.ulongToDouble(j10);
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m229toFloatimpl(long j10) {
        return (float) UnsignedKt.ulongToDouble(j10);
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m230toIntimpl(long j10) {
        return (int) j10;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m231toLongimpl(long j10) {
        return j10;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m232toShortimpl(long j10) {
        return (short) j10;
    }

    /* renamed from: toString-impl */
    public static String m233toStringimpl(long j10) {
        return UnsignedKt.ulongToString(j10);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m234toUBytew2LRezQ(long j10) {
        return UByte.m34constructorimpl((byte) j10);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m235toUIntpVg5ArA(long j10) {
        return UInt.m110constructorimpl((int) j10);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m236toULongsVKNKU(long j10) {
        return j10;
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m237toUShortMh2AYeg(long j10) {
        return UShort.m294constructorimpl((short) j10);
    }

    @InlineOnly
    /* renamed from: xor-VKZWuLQ */
    private static final long m238xorVKZWuLQ(long j10, long j11) {
        return m188constructorimpl(j10 ^ j11);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(m239unboximpl(), uLong.m239unboximpl());
    }

    public boolean equals(Object obj) {
        return m194equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m200hashCodeimpl(this.data);
    }

    public String toString() {
        return m233toStringimpl(this.data);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m239unboximpl() {
        return this.data;
    }
}
