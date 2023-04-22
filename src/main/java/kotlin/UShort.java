package kotlin;

import com.appsflyer.oaid.BuildConfig;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001tB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\u001b\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u0010J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0013J\u001b\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u0010J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0013J\u001b\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u0013J\u001b\u00107\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010\u001fJ\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u0010J\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0013J\u001b\u0010?\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010\u0010J\u001b\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bJ\u0010\u0013J\u001b\u0010H\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u001fJ\u001b\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0018J\u001b\u0010M\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u0010J\u001b\u0010M\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bO\u0010\u0013J\u001b\u0010M\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u001fJ\u001b\u0010M\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0018J\u0010\u0010R\u001a\u00020SH\u0087\b¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\rH\u0087\b¢\u0006\u0004\b_\u0010-J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\be\u0010\u0005J\u000f\u0010f\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u0016\u0010j\u001a\u00020\u000eH\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bk\u0010UJ\u0016\u0010l\u001a\u00020\u0011H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010-J\u0016\u0010n\u001a\u00020\u0014H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bo\u0010cJ\u0016\u0010p\u001a\u00020\u0000H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bq\u0010\u0005J\u001b\u0010r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bs\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006u"}, d2 = {"Lkotlin/UShort;", BuildConfig.FLAVOR, "data", BuildConfig.FLAVOR, "constructor-impl", "(S)S", "getData$annotations", "()V", "and", "other", "and-xj2QHRw", "(SS)S", "compareTo", BuildConfig.FLAVOR, "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-Mh2AYeg", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "equals-impl", "(SLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(S)I", "inc", "inc-Mh2AYeg", "inv", "inv-Mh2AYeg", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(SB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", BuildConfig.FLAVOR, "toByte-impl", "(S)B", "toDouble", BuildConfig.FLAVOR, "toDouble-impl", "(S)D", "toFloat", BuildConfig.FLAVOR, "toFloat-impl", "(S)F", "toInt", "toInt-impl", "toLong", BuildConfig.FLAVOR, "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", BuildConfig.FLAVOR, "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes2.dex */
public final class UShort implements Comparable<UShort> {
    public static final Companion Companion = new Companion(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UShort$Companion;", BuildConfig.FLAVOR, "()V", "MAX_VALUE", "Lkotlin/UShort;", "S", "MIN_VALUE", "SIZE_BITS", BuildConfig.FLAVOR, "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    private /* synthetic */ UShort(short s10) {
        this.data = s10;
    }

    @InlineOnly
    /* renamed from: and-xj2QHRw */
    private static final short m287andxj2QHRw(short s10, short s11) {
        return m294constructorimpl((short) (s10 & s11));
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ UShort m288boximpl(short s10) {
        return new UShort(s10);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static final int m289compareTo7apg3OU(short s10, byte b10) {
        return Intrinsics.compare(s10 & MAX_VALUE, b10 & UByte.MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static final int m290compareToVKZWuLQ(short s10, long j10) {
        return UnsignedKt.ulongCompare(ULong.m188constructorimpl(s10 & 65535), j10);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m291compareToWZ4Q5Ns(short s10, int i10) {
        return UnsignedKt.uintCompare(UInt.m110constructorimpl(s10 & MAX_VALUE), i10);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private int m292compareToxj2QHRw(short s10) {
        return Intrinsics.compare(m343unboximpl() & MAX_VALUE, s10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static int m293compareToxj2QHRw(short s10, short s11) {
        return Intrinsics.compare(s10 & MAX_VALUE, s11 & MAX_VALUE);
    }

    @PublishedApi
    /* renamed from: constructor-impl */
    public static short m294constructorimpl(short s10) {
        return s10;
    }

    @InlineOnly
    /* renamed from: dec-Mh2AYeg */
    private static final short m295decMh2AYeg(short s10) {
        return m294constructorimpl((short) (s10 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final int m296div7apg3OU(short s10, byte b10) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(s10 & MAX_VALUE), UInt.m110constructorimpl(b10 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m297divVKZWuLQ(short s10, long j10) {
        return UnsignedKt.m365ulongDivideeb3DHEI(ULong.m188constructorimpl(s10 & 65535), j10);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    private static final int m298divWZ4Q5Ns(short s10, int i10) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(s10 & MAX_VALUE), i10);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final int m299divxj2QHRw(short s10, short s11) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(s10 & MAX_VALUE), UInt.m110constructorimpl(s11 & MAX_VALUE));
    }

    /* renamed from: equals-impl */
    public static boolean m300equalsimpl(short s10, Object obj) {
        return (obj instanceof UShort) && s10 == ((UShort) obj).m343unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m301equalsimpl0(short s10, short s11) {
        return s10 == s11;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final int m302floorDiv7apg3OU(short s10, byte b10) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(s10 & MAX_VALUE), UInt.m110constructorimpl(b10 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m303floorDivVKZWuLQ(short s10, long j10) {
        return UnsignedKt.m365ulongDivideeb3DHEI(ULong.m188constructorimpl(s10 & 65535), j10);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    private static final int m304floorDivWZ4Q5Ns(short s10, int i10) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(s10 & MAX_VALUE), i10);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final int m305floorDivxj2QHRw(short s10, short s11) {
        return UnsignedKt.m363uintDivideJ1ME1BU(UInt.m110constructorimpl(s10 & MAX_VALUE), UInt.m110constructorimpl(s11 & MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m306hashCodeimpl(short s10) {
        return s10;
    }

    @InlineOnly
    /* renamed from: inc-Mh2AYeg */
    private static final short m307incMh2AYeg(short s10) {
        return m294constructorimpl((short) (s10 + 1));
    }

    @InlineOnly
    /* renamed from: inv-Mh2AYeg */
    private static final short m308invMh2AYeg(short s10) {
        return m294constructorimpl((short) (~s10));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final int m309minus7apg3OU(short s10, byte b10) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s10 & MAX_VALUE) - UInt.m110constructorimpl(b10 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m310minusVKZWuLQ(short s10, long j10) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(s10 & 65535) - j10);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final int m311minusWZ4Q5Ns(short s10, int i10) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s10 & MAX_VALUE) - i10);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final int m312minusxj2QHRw(short s10, short s11) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s10 & MAX_VALUE) - UInt.m110constructorimpl(s11 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    private static final byte m313mod7apg3OU(short s10, byte b10) {
        return UByte.m34constructorimpl((byte) UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(s10 & MAX_VALUE), UInt.m110constructorimpl(b10 & UByte.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m314modVKZWuLQ(short s10, long j10) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(ULong.m188constructorimpl(s10 & 65535), j10);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    private static final int m315modWZ4Q5Ns(short s10, int i10) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(s10 & MAX_VALUE), i10);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    private static final short m316modxj2QHRw(short s10, short s11) {
        return m294constructorimpl((short) UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(s10 & MAX_VALUE), UInt.m110constructorimpl(s11 & MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: or-xj2QHRw */
    private static final short m317orxj2QHRw(short s10, short s11) {
        return m294constructorimpl((short) (s10 | s11));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final int m318plus7apg3OU(short s10, byte b10) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b10 & UByte.MAX_VALUE) + UInt.m110constructorimpl(s10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m319plusVKZWuLQ(short s10, long j10) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(s10 & 65535) + j10);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final int m320plusWZ4Q5Ns(short s10, int i10) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s10 & MAX_VALUE) + i10);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final int m321plusxj2QHRw(short s10, short s11) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s11 & MAX_VALUE) + UInt.m110constructorimpl(s10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-xj2QHRw */
    private static final UIntRange m322rangeToxj2QHRw(short s10, short s11) {
        return new UIntRange(UInt.m110constructorimpl(s10 & MAX_VALUE), UInt.m110constructorimpl(s11 & MAX_VALUE), null);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final int m323rem7apg3OU(short s10, byte b10) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(s10 & MAX_VALUE), UInt.m110constructorimpl(b10 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m324remVKZWuLQ(short s10, long j10) {
        return UnsignedKt.m366ulongRemaindereb3DHEI(ULong.m188constructorimpl(s10 & 65535), j10);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    private static final int m325remWZ4Q5Ns(short s10, int i10) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(s10 & MAX_VALUE), i10);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final int m326remxj2QHRw(short s10, short s11) {
        return UnsignedKt.m364uintRemainderJ1ME1BU(UInt.m110constructorimpl(s10 & MAX_VALUE), UInt.m110constructorimpl(s11 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final int m327times7apg3OU(short s10, byte b10) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(b10 & UByte.MAX_VALUE) * UInt.m110constructorimpl(s10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m328timesVKZWuLQ(short s10, long j10) {
        return ULong.m188constructorimpl(ULong.m188constructorimpl(s10 & 65535) * j10);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final int m329timesWZ4Q5Ns(short s10, int i10) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s10 & MAX_VALUE) * i10);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final int m330timesxj2QHRw(short s10, short s11) {
        return UInt.m110constructorimpl(UInt.m110constructorimpl(s11 & MAX_VALUE) * UInt.m110constructorimpl(s10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m331toByteimpl(short s10) {
        return (byte) s10;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m332toDoubleimpl(short s10) {
        return s10 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m333toFloatimpl(short s10) {
        return s10 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m334toIntimpl(short s10) {
        return s10 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m335toLongimpl(short s10) {
        return s10 & 65535;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m336toShortimpl(short s10) {
        return s10;
    }

    /* renamed from: toString-impl */
    public static String m337toStringimpl(short s10) {
        return String.valueOf(s10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m338toUBytew2LRezQ(short s10) {
        return UByte.m34constructorimpl((byte) s10);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m339toUIntpVg5ArA(short s10) {
        return UInt.m110constructorimpl(s10 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m340toULongsVKNKU(short s10) {
        return ULong.m188constructorimpl(s10 & 65535);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m341toUShortMh2AYeg(short s10) {
        return s10;
    }

    @InlineOnly
    /* renamed from: xor-xj2QHRw */
    private static final short m342xorxj2QHRw(short s10, short s11) {
        return m294constructorimpl((short) (s10 ^ s11));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(m343unboximpl() & MAX_VALUE, uShort.m343unboximpl() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m300equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m306hashCodeimpl(this.data);
    }

    public String toString() {
        return m337toStringimpl(this.data);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ short m343unboximpl() {
        return this.data;
    }
}
