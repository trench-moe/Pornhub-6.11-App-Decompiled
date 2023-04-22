package nd;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.BitSet;
import md.b;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final BitSet f13427a;

    /* renamed from: b  reason: collision with root package name */
    public static final BitSet f13428b;

    /* renamed from: c  reason: collision with root package name */
    public static final BitSet f13429c;
    public static final BitSet d;

    /* renamed from: e  reason: collision with root package name */
    public static final BitSet f13430e;

    /* renamed from: f  reason: collision with root package name */
    public static final BitSet f13431f;

    /* renamed from: g  reason: collision with root package name */
    public static final BitSet f13432g;

    /* renamed from: h  reason: collision with root package name */
    public static final BitSet f13433h;

    static {
        new BitSet(256).set(47);
        f13427a = new BitSet(256);
        f13428b = new BitSet(256);
        f13429c = new BitSet(256);
        d = new BitSet(256);
        f13430e = new BitSet(256);
        f13431f = new BitSet(256);
        f13432g = new BitSet(256);
        f13433h = new BitSet(256);
        for (int i10 = 97; i10 <= 122; i10++) {
            f13427a.set(i10);
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            f13427a.set(i11);
        }
        for (int i12 = 48; i12 <= 57; i12++) {
            f13427a.set(i12);
        }
        BitSet bitSet = f13427a;
        bitSet.set(95);
        bitSet.set(45);
        bitSet.set(46);
        bitSet.set(42);
        f13432g.or(bitSet);
        bitSet.set(33);
        bitSet.set(126);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        BitSet bitSet2 = f13428b;
        bitSet2.set(44);
        bitSet2.set(59);
        bitSet2.set(58);
        bitSet2.set(36);
        bitSet2.set(38);
        bitSet2.set(43);
        bitSet2.set(61);
        BitSet bitSet3 = f13429c;
        bitSet3.or(bitSet);
        bitSet3.or(bitSet2);
        BitSet bitSet4 = d;
        bitSet4.or(bitSet);
        bitSet4.set(59);
        bitSet4.set(58);
        bitSet4.set(64);
        bitSet4.set(38);
        bitSet4.set(61);
        bitSet4.set(43);
        bitSet4.set(36);
        bitSet4.set(44);
        BitSet bitSet5 = f13433h;
        bitSet5.or(bitSet4);
        bitSet5.set(47);
        BitSet bitSet6 = f13431f;
        bitSet6.set(59);
        bitSet6.set(47);
        bitSet6.set(63);
        bitSet6.set(58);
        bitSet6.set(64);
        bitSet6.set(38);
        bitSet6.set(61);
        bitSet6.set(43);
        bitSet6.set(36);
        bitSet6.set(44);
        bitSet6.set(91);
        bitSet6.set(93);
        BitSet bitSet7 = f13430e;
        bitSet7.or(bitSet6);
        bitSet7.or(bitSet);
    }

    public static String a(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = b.f13083a;
        }
        ByteBuffer allocate = ByteBuffer.allocate(str.length());
        CharBuffer wrap = CharBuffer.wrap(str);
        while (wrap.hasRemaining()) {
            char c10 = wrap.get();
            if (c10 == '%' && wrap.remaining() >= 2) {
                char c11 = wrap.get();
                char c12 = wrap.get();
                int digit = Character.digit(c11, 16);
                int digit2 = Character.digit(c12, 16);
                if (digit == -1 || digit2 == -1) {
                    allocate.put((byte) 37);
                    allocate.put((byte) c11);
                    allocate.put((byte) c12);
                } else {
                    allocate.put((byte) ((digit << 4) + digit2));
                }
            } else if (c10 == '+') {
                allocate.put((byte) 32);
            } else {
                allocate.put((byte) c10);
            }
        }
        allocate.flip();
        return charset.decode(allocate).toString();
    }
}
